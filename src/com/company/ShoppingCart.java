package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> cart = new ArrayList<Item>();
    private static int ID = 0;

    public ShoppingCart(){
        ID++;
    }

    public int getId(){
        return ID;
    }
    public void addItem(Item item){
        if (item.getWeigth() < 10000){
            this.cart.add(item);
        }else{
            throw  new IllegalStateException();
        }
    }

    public boolean removeItem(Item item) {
        boolean res= true;
        for(int i = 0;i<this.cart.size(); i++){
            if(this.cart.get(i).getName() == item.getName()){
                this.cart.remove(i);
                res = true ;
            }else{
                res = false;
            }
        }
        return res;
    }

    public int itemCount(){
        return this.cart.size();
    }

    public int totalPrice(){
        int sum = 0;
        for(int i = 0; i<this.cart.size(); i++){
            sum += this.cart.get(i).getPrice();
        }
        return sum;
    }

    public String toString(){
        String articles = "";
        int nb_articles = this.itemCount();

        for(int i = 0; i<this.cart.size(); i++){
            articles += "" + this.cart.get(i).getName() + ": " + this.cart.get(i).getPrice() + " € \n" ;
        }



        return " panier " + this.getId() + "[" + nb_articles + "article(s) ]" + articles +"" ;


    }






}
