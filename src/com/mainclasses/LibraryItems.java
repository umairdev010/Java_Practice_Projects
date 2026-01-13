package com.mainclasses;

public class LibraryItems {

    private boolean instate;
    private String title;
    private String auther;


    protected void setTitle(String title){
        this.title = title;
    }

    protected void setAuther(String auther){
        this.auther = auther;
    }

    public void checkoutItem(){
        instate = false;
        System.out.println("YOUR ITEM IS SUCCESSFULLY OUT DEPOSIT IN TWO WEEKS");
    }

    public void returnitem(){
        instate = true;
        System.out.println("THANKS FOR GIVING ITEM BACK ON TIME");
    }

}
