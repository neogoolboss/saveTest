package com.ohgiraffers;

import java.util.Random;
import java.util.Scanner;

public class NumberQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // 숫자 범위의 최소값
        int upperBound = 100; // 숫자 범위의 최대값
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("숫자 맞추기 게임을 시작합니다! " + lowerBound + "부터 " + upperBound + " 사이의 숫자를 맞혀보세요.");

        while (!guessedCorrectly) {
            System.out.print("숫자를 입력하세요: ");
            while (!sc.hasNextInt()) {
                System.out.println("유효한 숫자를 입력하세요.");
                sc.next();
            }
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("축하합니다! 숫자를 맞췄습니다.");
                System.out.println("시도한 횟수: " + attempts);
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("더 큰 숫자를 입력하세요.");
            } else {
                System.out.println("더 작은 숫자를 입력하세요.");
            }
        }

        sc.close();
    }

}
