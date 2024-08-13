package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    @Override
    public void Stop() {
        System.out.println("레이싱카가 전속력으로 질주합니다.");
    }

    @Override
    public void run() {
        super.run();
    }

    public RacingCar() {
        System.out.println("Racingcar의 기본생성자 호출");


    }

    @Override
    public void soundHorn() {
        super.soundHorn();
    }
}
