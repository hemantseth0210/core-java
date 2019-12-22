package com.sethjava;

public class Main {

    public static void main(String[] args) {
        Currency currency = Currency.of("USD");
        Money money = new Money(234.45, currency);
        System.out.println(money);
        
    }
}
