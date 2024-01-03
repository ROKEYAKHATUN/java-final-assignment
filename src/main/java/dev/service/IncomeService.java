package dev.service;

import dev.domain.Income;
import dev.repository.IncomeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IncomeService {

    private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public void createIncome(Income income) {
        incomeRepository.create(income);
    }

    public void editIncome(Income income) {
        incomeRepository.edit(income);
    }

    public void deleteIncome(int id) {
        incomeRepository.delete(id);
    }

    public List<Income> getAllIncomes() {
        return incomeRepository.getAll();
    }

    public Income getIncome(int id) {
        return incomeRepository.get(id);
    }
}
