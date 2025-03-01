package VariableStudy;

import java.util.Scanner;

//int 문을 그대로 출력, 증감연산자를 활용하여 출력 할 에정
//입력한 값이 unicode로 어떤 알파벳인지 확인하기 (소문자 한정)

public class variable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int spelling = in.nextInt();

        char unicode = (char) spelling;
        System.out.println("너가 입력한 값은!!! : " + unicode);

        // // int age = 22;
        // // // System.out.println("Age = " + Age);

        // // age = age + 10;
        // // // System.out.println("10년후 Age = " + Age);

        // // int number = 5;
        // // int result = ++number;
        // // // System.out.println("result = " + result);

        // // long length = 15L;

        // // int sum = (int)length + age;

        // // System.out.println("나이 = " + age);
        // // System.out.println("길이 = " + length);
        // // System.out.println("나이 + 길이 = " + sum);

        // // double sumsum = length + age;
        // // System.out.println("나이 + 길이 = " + sumsum);

        // char power = 'p';
        // System.out.println("power의 줄임말 = " + power);

        // int unicode = power;
        // System.out.println("p는 숫자로? = " + unicode);

    }
}
