package com.sethjava.lambda;

public class ConstructorReference {
    public static void main(String[] args) {
        FuncInterf funcInterf = Sample::new;
        funcInterf.get();

        FuncInterface funcInterface = Sample::new;
        funcInterface.get("Seth");
    }
}

interface FuncInterf{
    public Sample get();
}

interface FuncInterface {
    public Sample get(String s);
}
class Sample{
    Sample(){
        System.out.println("Sample Class constructor execution...");
    }

    Sample(String s){
        System.out.println("Sample Class constructor execution with argument: "+ s);
    }
}
