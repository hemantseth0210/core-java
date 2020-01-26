package com.sethjava.lambda;

import java.util.function.Supplier;

public class OtpExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            String otp = "";
            for(int i = 0; i<6; i++){
                otp = otp + (int) (Math.random()*10);
            }
            return otp;
        };
        System.out.println("OTP is " + supplier.get());
    }
}
