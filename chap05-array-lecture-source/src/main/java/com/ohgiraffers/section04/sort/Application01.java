package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args) {

        // 변수와 / 배열의 값을 바꾸는 방법

        // 변수의 두 값 변경하기
        int num1 = 10;
        int num2 = 20;

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
        
        
        // 배열의 인덱스 값 서로 변경하기
        int[] arr = {2,1,3};

        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
