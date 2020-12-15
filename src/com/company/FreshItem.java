package com.company;

public class FreshItem  extends Item{


    String BestBeforeDate;
    public FreshItem(String name, long price, int weigth, String BestBeforeDate) {
        super(name, price, weigth);
        this.BestBeforeDate = BestBeforeDate;
    }


    @Override
    public String toString() {
        return "BDD: " + this.BestBeforeDate + " " + this.getName() + ": " + this.getPrice() +" €";
    }
}
