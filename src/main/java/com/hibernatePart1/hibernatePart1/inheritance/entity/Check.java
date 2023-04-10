package com.hibernatePart1.hibernatePart1.inheritance.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("ch")
//@Table(name="bankcheck")
@PrimaryKeyJoinColumn(name="id")
public class Check extends Payment{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
