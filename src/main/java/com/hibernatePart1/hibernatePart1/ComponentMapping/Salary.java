package com.hibernatePart1.hibernatePart1.ComponentMapping;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {
    //  id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary

    private int basicSalary;
    private int bonusSalary;
    private int taxSalary;
    private int specialAllowanceSalary;

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getTaxSalary() {
        return taxSalary;
    }

    public void setTaxSalary(int taxSalary) {
        this.taxSalary = taxSalary;
    }

    public int getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(int specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
