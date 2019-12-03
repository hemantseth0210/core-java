package com.sethjava;

public class Demo {
    public static void main(String[] args) {
        Telephone timsPhone = new DeskPhone(123456789);
        timsPhone.powerOn();
        timsPhone.callPhone(123456789);
        timsPhone.answer();

        Telephone johnPhone = new MobilePhone(345353653);
        johnPhone.powerOn();
        johnPhone.callPhone(345353653);
        johnPhone.answer();
    }
}
