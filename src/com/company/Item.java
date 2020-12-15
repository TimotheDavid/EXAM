package com.company;

public class Item {

    private String name;
    private long price;
    private int weigth;


    public Item(String name, long price, int weigth) {
        this.name = name;
        this.price = price;
        this.weigth = weigth;
    }

    public String toString(){
        String formatage = String.format("%d.%02d",this.price,2);

        return ""+ this.name+ ": "+ formatage + "";


    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
