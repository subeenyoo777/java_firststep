package com.example.java_firststep;

public class Arguments {

    public static void main(String[] args) {

        if (args.length >= 0) {

            System.out.println("전달받은 매개변수");

            for (int i = 0; i < args.length; i++) {
                System.out.println(i + "" + args[i]);
            }
        } else {
            System.out.println("인자가 부족합니다.");
        }

    }

}
