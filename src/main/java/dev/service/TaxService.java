package dev.service;

import dev.domain.Income;
import dev.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxService {

    private final TaxRepository taxRepository;

    @Autowired
    public TaxService(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    public void saveIncome(Income income) {
        // Save income details to the database
        taxRepository.saveIncome(income);
    }

    public double calculateTax(Income income) {
        double taxableIncome = calculateTaxableIncome(income);

        if (taxableIncome <= 300000) {
            return 0.05 * taxableIncome;
        } else if (taxableIncome <= 400000) {
            return 0.1 * taxableIncome;
        } else if (taxableIncome <= 700000) {
            return 0.15 * taxableIncome;
        } else if (taxableIncome <= 1100000) {
            return 0.20 * taxableIncome;
        } else if (taxableIncome <= 1600000) {
            return 0.25 * taxableIncome;
        } else {
            return 0.30 * taxableIncome;
        }
    }

    private double calculateTaxableIncome(Income income) {
        // Calculate taxable income based on the provided income details
        double totalIncome = income.getBasicPay() + income.getHouseRentAllowance() +
                income.getConveyanceAllowance() + income.getMedicalAllowance() +
                income.getOtherAllowance();

        return totalIncome - income.getDeductionAmount();
    }
}
