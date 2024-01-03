package dev.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "income_table")
public class Income {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank
    @Column(name = "username")
    private String username;

    @NotNull
    @Column(name = "basic_pay")
    private Double basicPay;

    @NotNull
    @Column(name = "house_rent_allowance")
    private Double houseRentAllowance;

    @NotNull
    @Column(name = "conveyance_allowance")
    private Double conveyanceAllowance;

    @NotNull
    @Column(name = "medical_allowance")
    private Double medicalAllowance;

    @NotNull
    @Column(name = "other_allowance")
    private Double otherAllowance;

    @NotNull
    @Column(name = "deduction_amount")
    private Double deductionAmount;

    @Column(name = "tax")
    private Double tax;

    public Income(int id, String username, Double basicPay, Double houseRentAllowance,
                  Double conveyanceAllowance, Double medicalAllowance, Double otherAllowance, Double deductionAmount) {
        this.id = id;
        this.username = username;
        this.basicPay = basicPay;
        this.houseRentAllowance = houseRentAllowance;
        this.conveyanceAllowance = conveyanceAllowance;
        this.medicalAllowance = medicalAllowance;
        this.otherAllowance = otherAllowance;
        this.deductionAmount = deductionAmount;
        this.tax = tax;

    }


    public Income() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(Double basicPay) {
        this.basicPay = basicPay;
    }

    public Double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public void setHouseRentAllowance(Double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    public Double getConveyanceAllowance() {
        return conveyanceAllowance;
    }

    public void setConveyanceAllowance(Double conveyanceAllowance) {
        this.conveyanceAllowance = conveyanceAllowance;
    }

    public Double getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(Double medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public Double getOtherAllowance() {
        return otherAllowance;
    }

    public void setOtherAllowance(Double otherAllowance) {
        this.otherAllowance = otherAllowance;
    }

    public Double getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(Double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
