package com.example.java_firststep;

class Grade {

    int e; // 영어 성적
    int m; // 수학 성적

    // 점수 입력받는 메서드
    void input_grade(int a, int b) {
        e = a; // (메서드 활용해서) 영어성적을 입력
        m = b; // 수학 성적 저장
    }

    // 총점을 출력하는 메서드
    void output_grade() {
        System.out.println(e + m); // 성적의 합을 출력
    }

    // 평균(총점/2) 구하기
    void output_average() {
        System.out.println((e + m) / 2.0);
    }

}
