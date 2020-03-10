package com.CrudJava;

public class Cliente {
    private String name;
    private String surname;
    private double purchaseAmount;
    private Adress adress;


    public Cliente(String name, String surname, double purchaseAmount, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.purchaseAmount = purchaseAmount;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
