package main.java.com.ohgiraffers.section01.extend;


    public class Car {

        private boolean runningStatus;

        public Car() {
            System.out.println("car 클래스의 기본 생성자 호출됨.");

        }

        public void run() {
            runningStatus = true;
            System.out.println("자동차가 달립니다~");

        }

        public void soundHorn() {


        }


    public boolean isRunningStatus() {
        return runningStatus;

    }
    public void Stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다!");
    }
}



