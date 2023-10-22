package com.engento.guest;

import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String surName;
    private LocalDate dateOfBirth;


    //region Konstruktory

    public Guest(String firstName, String surName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }

    //endregion


    //region  Get/Set

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //endregion


    @Override
    public String toString() {
        return "Host:" +
                  firstName + " "
                  + surName +
                " - (datum narození:" +  dateOfBirth + ")";
    }
}
