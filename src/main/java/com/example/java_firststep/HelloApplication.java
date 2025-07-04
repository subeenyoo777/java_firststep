package com.example.java_firststep;

public class HelloApplication {

    static String szMsg = "안녕!"; // 클래스 변수 선언

    public static void main(String[] args) {
        int nTest = 75; // 지역변수 선언, 선언된 메서드 안에서만 쓸 수 있다.
        System.out.println(szMsg); // 클래스 변수 출력, sout = 콘솔 출력
        System.out.println(nTest);
    }
}