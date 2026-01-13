package com.testingclasses;

import com.mainclasses.BankAccount;
import com.mainclasses.LibraryItems;

public class TestingClasses {

    void creatingBankAccount(){

        BankAccount myAcount = BankAccount.createBankAccount(12343,"Umair Tariq",3456);

        myAcount.depositMoney(234);
        myAcount.withdrawMoney(3000);
        myAcount.withdrawMoney(3000);

    }

    void creatingBook(){

        Book newBook = new Book("1234321","Becoming The Master","Umair Tariq");
        newBook.checkoutItem();
        newBook.returnitem();
    }

    static void main(String[] args) {

        TestingClasses createTesting = new TestingClasses();

//        createTesting.creatingBankAccount();
        createTesting.creatingBook();

    }


    class Book extends LibraryItems {

        String id ;

        Book(String id , String title , String auther ) {
            this.id = id;
            this.setTitle(title);
            this.setAuther(auther);

        }


    }

}
