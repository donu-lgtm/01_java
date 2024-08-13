package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application {
    // 프로그램 실행부!!
    public static void main(String[] args) {
        /*
        * 여러 명의 회원정보를 한번에 등록!
        * 전체 회원 조회 시 여러명의 회원 정보를 한번에 반환.!!
        *
        * MemberRepository- static 필드로 회원 정보들을 저장!!( 최대 10명까지!!)
        * */

        Scanner sc4 = new Scanner(System.in);  // 사용자의 입력을 받기 위한 정보.

        MemberService memberService = new MemberService();
        //메소드를 실행할 준비!
        while(true){
            System.out.println("=== 회원 관리 프로그램 ====");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료!");
            System.out.println("메뉴 선택 :");
            int no= sc4.nextInt();
            switch(no){
                case 1: memberService.signUpMEMBERS(); break; //service 에게 내릴 1번 명령
                case 2:  memberService.showallMEMBERS();  break;
                case 9:
                    System.out.println("프로그램을 종료합니다!");
                    return;
                    default:
                    System.out.println("잘못된 번호입니다!"); break;
            }


        }

    }
}
