package com.testingclasses;

import com.mainclasses.ArrayOperation;
import com.mainclasses.ArrayOperations;
import com.mainclasses.BankAccount;
import com.mainclasses.LibraryItems;

public class TestingClasses {

    void creatingBankAccount() {

        BankAccount myAcount = BankAccount.createBankAccount(12343, "Umair Tariq", 3456);

        myAcount.depositMoney(234);
        myAcount.withdrawMoney(3000);
        myAcount.withdrawMoney(3000);

    }

    void creatingBook() {

        Book newBook = new Book("1234321", "Becoming The Master", "Umair Tariq");
        newBook.checkoutItem();
        newBook.returnitem();
    }

    void arrayOperations(int[] inputArray) {

        ArrayOperation.setArray(inputArray);

        ArrayOperation.Statistics.mean();

    }

    void arrayOperation(int[] inputArray) {

        ArrayOperations newArray = new ArrayOperations(new int[]{1, 2, 3, 4, 5});
        ArrayOperations.Statistics arrayops = newArray.new Statistics();
        arrayops.mean();

    }

    static void main(String[] args) {

        TestingClasses createTesting = new TestingClasses();

//        createTesting.creatingBankAccount();
//        createTesting.creatingBook();
//            createTesting.arrayOperations(new int[] {1,2,3,4,5});
//            createTesting.arrayOperation(new int[]{1,2,3,4,5});
        BankAccount umairAccount = new UmairAccount();
        umairAccount.bankName();

    }

    static class UmairAccount extends BankAccount{

        @Override
        public void bankName() {
            super.bankName();
            System.out.print("\nWELLCOME TO THE SUB BRANCH UMAIRS BANK");
        }
    }


    class Book extends LibraryItems {

        String id;

        Book(String id, String title, String auther) {
            this.id = id;
            this.setTitle(title);
            this.setAuther(auther);

        }


    }

}
