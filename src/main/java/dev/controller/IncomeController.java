package dev.controller;

import dev.domain.Income;
import dev.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/incomes")
public class IncomeController {

    private final IncomeService incomeService;


    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @GetMapping
    public String listIncomes(Model model) {
        List<Income> incomes = incomeService.getAllIncomes();
        model.addAttribute("incomes", incomes);
        return "income/list";
    }

    @GetMapping("/{id}")
    public String showIncome(@PathVariable int id, Model model) {
        Income income = incomeService.getIncome(id);
        model.addAttribute("income", income);
        return "income/show";
    }

    @GetMapping("/create")
    public String createIncomeForm(Model model) {
        model.addAttribute("income", new Income());
        return "income/create";
    }

    @PostMapping("/create")
    public String createIncome(@ModelAttribute Income income) {
        incomeService.createIncome(income);
        return "redirect:/incomes";
    }

    @GetMapping("/edit/{id}")
    public String editIncomeForm(@PathVariable int id, Model model) {
        Income income = incomeService.getIncome(id);
        model.addAttribute("income", income);
        return "income/edit";
    }

    @PostMapping("/edit/{id}")
    public String editIncome(@PathVariable int id, @ModelAttribute Income income) {
        income.setId(id);
        incomeService.editIncome(income);
        return "redirect:/incomes";
    }

    @GetMapping("/delete/{id}")
    public String deleteIncome(@PathVariable int id) {
        incomeService.deleteIncome(id);
        return "redirect:/incomes";
    }
}
