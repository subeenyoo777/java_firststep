package com.example.java_firststep;

public class Student {
    int socre; // 인스턴스 변수
    static int studentCount = 0; // 클래스 변수

    void setSocre(int s) { // 지역변수 s, 반드시 초기화 해야 함!
        socre = s;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setSocre(95);

        System.out.println(st1.socre);
        // System.out.println(Student.studentCount);
    }

    int a = 10;
    long b = a; // 묵시적 형변환(int > long)
    double c = b;

    double d = 9.8;
    int e = (int) d; // 명시적 형변환(dounble > int )
}
