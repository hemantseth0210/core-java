package com.sethjava.java8;

interface Left{
    default void show(){
        System.out.println("This is Left interface default method");
    }
}

interface Right{
    default void show(){
        System.out.println("This is Right interface default method");
    }
}

public class MultipleInheritenceDefaultMethod implements Left, Right{

    // 1st way
    /*@Override
    public void show() {
        System.out.println("This is Overidden default method");
    }*/

    // 2nd way
    @Override
    public void show() {
        Left.super.show();
    }

    public static void main(String[] args) {
        MultipleInheritenceDefaultMethod demo = new MultipleInheritenceDefaultMethod();
        demo.show();
    }


}
