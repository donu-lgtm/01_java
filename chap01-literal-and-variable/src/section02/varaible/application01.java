package section02.varaible;

public class application01 {
    public static void main(String[] args) {
        /*
        * 변수의 사용 목적
        *
        *
        *
        * */

        System.out.println("-__________값에 의미 부여 테스트_______");
        System.out.println("첫달 김과장님 보너스를 포함한 급여: "+ (100+20)+ "만원");
        System.out.println("둘째달 김과장님 보너스를 제외한 급여: " +100 + "만원");


    //값을 재사용하기 위한 목적
        int salary= 100;
    int bonus=20;
        System.out.println("첫달 김과장님 보너스를 포함한 급여: " + (salary+bonus) + "만원");
        //손으로 쓰는 사람의 휴먼에러를 방지할 수 있음.
        //시간에 따라 변경되는 값을 저장하고 사용할 수 있다.
        String name= "김쿠팡";
    int point= 100;
        System.out.println("은 쇼핑몰 중독이다. \n 지난달"
    +name + "의 쿠팡의 보너스 포인트는 "+point+ "였다");

    point +=100;
        System.out.println("이번달"+ name +"의 보너스 포인트는 "+point+"이다.");
        /*아무거나
        *
        * */
/*수정을 더하자*/

    }

                         }
