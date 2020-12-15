package com.company;

public class Main {

    public static void main(String[] args) {
        Item tin = new Item("sardine", 500, 500);
        FreshItem fresh = new FreshItem("sardine", 500, 500, "2012-04-11");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(fresh);
        cart.removeItem(tin);
        System.out.println(cart); // affiche: panier 1 [1 article(s)]
        //            BBD: 2012-04-11 sardine: 5.00 €


    }
}
