package dev.controller;

// Imports...

import dev.domain.Income;
import dev.service.TaxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaxController {


    private TaxService taxService;

    @GetMapping("/tax")
    public String showTaxForm(Model model) {
        model.addAttribute("income", new Income());
        return "tax";
    }

    @PostMapping("/calculateTax")
    public String calculateTax(@ModelAttribute Income income) {
        // Calculate tax based on the income details
        double tax = calculateTaxLogic(income);
        income.setTax(tax);

        // Save income details to the database
        taxService.saveIncome(income);

        // Redirect to a success page or display the tax amount
        return "redirect:/success";
    }

    private double calculateTaxLogic(Income income) {
        double taxableIncome = calculateTaxableIncome(income);

        // Apply tax rates based on the tax brackets
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
            return 0.30 * taxableIncome; // Change this rate based on your requirement
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
