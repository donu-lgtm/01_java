package main.java.com.ohgiraffers.section01.array;

public class Question {
    public static void main(String[] args) {
        
        // 트럼프 카드를 랜덤으로 한장 출력해보자

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] number = {"ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};

        int shapesNumber = (int)(Math.random() * shapes.length);
        int chNumber = (int)(Math.random() * number.length);

        System.out.println(shapes[shapesNumber] + number[chNumber]);


    }
}
