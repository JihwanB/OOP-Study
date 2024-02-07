package com.encore.workshop.workshop4.grade.view;

import com.encore.workshop.workshop4.grade.entity.Student;

public class GradeManager {

    public static void main(String[] args) {

        Student[] student = new Student[]{
                new Student("kim", "10000", 22, 100, 100, 100),
                new Student("lee", "10001", 23, 20, 20, 20),
                new Student("park", "10002", 24, 30, 30, 30),
                new Student("choi", "10003", 25, 40, 40, 40),
                new Student("steve", "10004", 26, 50, 50, 50)
        };

        int oracleTotal = 0, javaTotal = 0, servletTotal = 0;
        for (int i = 0; i < student.length; i++) {
            oracleTotal += student[i].getOracle();
            javaTotal += student[i].getJava();
            servletTotal += student[i].getServlet();
        }

        System.out.println("번호 이름 오라클 자바 서블릿 총점 평균");
        System.out.println("===============================");
        for (int i = 0; i < student.length; i++) {
            System.out.println((i + 1) + " " + student[i]);
        }
        System.out.println("===============================");
        System.out.printf("총점(오라클,자바,서블릿):%d %d %d%n", oracleTotal, javaTotal, servletTotal);

    }

}
