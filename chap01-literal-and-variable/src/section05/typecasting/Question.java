package section05.typecasting;

public class Question {
    public static void main(String[] args) {

        /*
        * 5명의 반 학생이 있으며 키는 각각
        * 178.5/ 170.3/ 190.7/ 188.67/ 160.8이다.
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다.
        * 소수자리는 절삭한다.
        *
        * */

        double dnum1= 160.8;
        double dnum2= 188.67;
        double dnum3= 190.7;
        double dnum4= 170.3;
        double dnum5= 178.5;

       int inum1= (int) dnum1;
       int inum2= (int) dnum2;
       int inum3= (int) dnum3;
       int inum4= (int) dnum4;
       int inum5= (int) dnum5;


        System.out.println((inum1+inum2+inum3+inum4+inum5)/5);


        /*
        *
        * 사업을 시작한 홍길동은 이번 달 매출에서 부가세를 제외한 소득을 알고싶다.
        *
        * 매출은 다음과 같다.
        * 150400원
        * 1400원
        * 25000원
        * 30000원
        * 홍길동의 총 매출은 --원 입니다.
        * 부가세 제외 소득은 --원이고 부가세는 --원입니다.
        * */
        int psum= 150400+ 1400+ 25000+ 30000;
        System.out.println("홍길동의 총매출은 "+ psum + " 원 입니다.");
        int vsum= (int)(psum*10/11);
        System.out.println(vsum);
    }
}
