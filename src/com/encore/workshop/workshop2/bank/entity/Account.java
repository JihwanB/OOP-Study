package com.encore.workshop.workshop2.bank.entity;

public class Account {
    private String custId;
    private String custName;
    private String accountNumber;
    private int balance;

    public Account() {
    }

    public Account(String custId, String custName, String accountNumber, int balance) {
        this.custId = custId;
        this.custName = custName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addBalance(int amount) {
        System.out.println(amount + "원을 입금합니다");
        balance += amount;
        System.out.println("증가 후 잔액 : " + balance + "원");
    }

    public void subtractBalance(int amount) {
        System.out.println(amount + "원을 출금합니다");
        balance -= amount;
        System.out.println("감소 후 잔액 : " + balance + "원");
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
