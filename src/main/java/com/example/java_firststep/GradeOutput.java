package com.example.java_firststep;

public class GradeOutput {

    public static void main(String[] args) {

        Grade g1 = new Grade();// 첫번째 학생 성적 객체 생성
        Grade g2 = new Grade(); // 객체 생성

        // 점수 입력
        g1.input_grade(90, 85);
        g2.input_grade(80, 80);

        // 점수 출력
        g1.output_grade();
        g2.output_grade();
        g1.output_average();

    }

}
