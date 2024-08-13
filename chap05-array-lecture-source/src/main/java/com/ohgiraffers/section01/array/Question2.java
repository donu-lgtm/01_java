package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
         *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
         *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. // (잘하면 두번째로 큰 값도)
         *  만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번쨰로 큰 수를 찾을 수 없습니다." 출력
         * */

        Scanner scr = new Scanner(System.in);

        //배열의 길이 입력 받기
        System.out.println("배열의 길이를 입력 해주세요 : ");
        int length = scr.nextInt();

        // 1보다 짧을 때 처리
        if(length <= 1){
            System.out.println("1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없음.");
            return;
        }
        // 배열 생성 및 요소 입력 받기
        int[] arr = new int[length];
        System.out.println("배열의 요소를 입력 해주세요 : ");
        for (int i = 0; i < length; i++) {
            arr[i] = scr.nextInt();
        }

        //최댓값과 두 번째로 큰 값을 위한 변수
        int max = arr[0];
        int secondMax = arr[0];

/*        for (int i = 1; i < length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        */


        // 반복문을 이용해 값 찾기
        for (int i = 1; i < length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax || secondMax == max){
                secondMax = arr[i];
            }
        }

        // 모두 같은 값이 입력되면
        if(max == secondMax){
            System.out.println("두번째로 큰 값을 찾을 수 없습니다.");
            return;
        }

        // 결과 출력
        System.out.println("제일 큰 값 : " + max);
        System.out.println("두 번째로 큰 값 : " + secondMax);







    }
}
