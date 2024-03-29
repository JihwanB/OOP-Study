package com.encore.loop;

import lombok.NoArgsConstructor;

@NoArgsConstructor
/*
 반복구문 (for, while, do ~ while)
 for - 반복 횟수가 정의되어 있을 때 사용
 while, do ~ while - 반복 횟수가 정의되어 있는 것이 아니라 어떤 상황이 올 때까지 반복하고자 할 때

 break, continue
 for(초기식 ; 조건식 ; 증감식) {

 }
 */

public class LoopDemo {

    public void LoopMethod01() {
        for (int idx = 1; idx <= 10; idx++) {
            System.out.println("idx value = " + idx);
        }
    }

    public void sumOneToTen() {
        int sum = 0;

        for (int idx = 1; idx <= 10; idx++) {
            System.out.println("idx = " + idx);
            sum += idx;
        }

        System.out.println("1 ~ 10 합 = " + sum);
    }

    public void sumStartToEnd(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.printf("%d ~ %d 합 = %d", start, end, sum);
    }

    // 윤년인지 아닌지를 판단
    // 윤년은 4의 배수이고, 100의 배수가 아니거나, 400의 배수일 때
    public String leapYear(int year) {
        String msg = null;

        // case01
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//            msg = "윤년";
//        else
//            msg = "평년";

        // case02
        msg = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "윤년" : "평년";

        return msg;
    }

    public void leapYearStartToEnd(int start, int end) {

        int count = 0;

        for (int i = start; i <= end; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count++;
                System.out.print(i + " ");

                if (count % 5 == 0)
                    System.out.println();
            }
        }
    }
}
