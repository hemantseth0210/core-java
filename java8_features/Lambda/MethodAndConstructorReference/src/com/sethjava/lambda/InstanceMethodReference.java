package com.sethjava.lambda;

public class InstanceMethodReference {
    public static void main(String[] args) {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        // Instance Method Reference
        Interf interf = instanceMethodReference::sum;
        interf.add(10,20);
    }

    private int sum(int x, int y){
        System.out.println("The sum is "+ (x + y));
        return 20;
    }
}

interface Interf{
    public void add (int a, int b);
}
