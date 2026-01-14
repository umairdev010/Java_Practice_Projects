package com.mainclasses;

public class BankAccount {
    private int accountNo;
    private String AccountHolderName;
    private int accountBalance;

    public BankAccount(){

    }

    BankAccount(int accountNo, String accountHolderName, int accountBalance) {
        this.accountNo = accountNo;
        this.AccountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void bankName(){
        System.out.print("WELLCOME TO THE BANK OF JAVA.");
    }

    public static BankAccount createBankAccount(int accountNo, String accountHolderName, int accountBalance){
        return new BankAccount( accountNo, accountHolderName, accountBalance);
    }

    public void depositMoney(int money){
        accountBalance += money;
        System.out.println("THE ACCOUNT IS SUCCESSFULLY DEPOSIT TO YOUR ACCOUNT.");
    }

    public void withdrawMoney(int amount){
        if (accountBalance < amount) {
            System.out.println("PLEASE DEPOSIT FIRST AND WITHDRAW LESS AMOUNT. YOU NOT HAVE ENOUGH CASH IN ACCOUNT.");
            return;
        }
        accountBalance -= amount;
        System.out.println("THE AMOUNT IS SUCCESSFULY WITHDRAW AND AMOUNT DEDUCTED FROM ACCOUNT");
    }

}
