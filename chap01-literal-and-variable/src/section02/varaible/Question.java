package section02.varaible;

public class Question {
    public static void main(String[] args) {


        /*
        * 김경리가 4명의 직원의 월급을 입금해줘야 하는 날이다.
        * 각각 직책은 대리 / 과장/ 차장/ 부낭이며,
        * 대리는 100만원 과장은 120만원 차장은 130만원, 부장은 150만원의 월급을 받는다.
        * ㅂㅗ너스는 각 월급 *0.5만큼 주어야 한다.
        *
        *
        * 화면에 다음과 같이 출력되게 해주세요
        * ex) 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금 되었습니다.
        *
        *
        * 4명 다 출력.
        *
        * */
        int 대리= 1000000;
        int bonus= 500000;

        System.out.println("김대리의 월급은 100만원 + 보너스  50만원으로 총 150만원 입금 되었습니다"+ (대리 + bonus));
        int a= (int)(100 *0.5);



        int 이과장 = 1200000;

        int b= (int)(1200000 *0.5);

        System.out.println("이과장의 월급은 120만원 + 보너스 60만원으로 총 180만원 입금 되었습니다"+ (이과장 +b ));


        int 차차장= 1300000;

        int c= (int)(1300000 *0.5);
        System.out.println("차차장의 월급은 130만원 + 보너스 65만원으로 총 195만원 입급 되었습니다"+ (차차장 + c));

        int 개부장= 1500000;

        int d= (int)(1500000 *0.5);
        System.out.println("개부장의 월급은 150만원 + 보너스 75만원으로 총 225만원 입금 되었습니다"   + (개부장 + d));


        /*
        *
        * 각각의 성씨는 임의적으로 구성하였다.
        * 개부장이 인상적이다 ㅎ.ㅎ
        *
        * */

        int salary1= 100;
        int salary2= 200;
        int salary3= 300;
        int salary4= 400;

        int bonus1= (int)(salary1*0.5);
        int bonus2= (int)(salary2*0.5);
        int bonus3= (int)(salary3*0.5);
        int bonus4= (int)(salary4*0.5);
        System.out.println(salary1 + bonus1);
        System.out.println(salary2+ bonus2);
        System.out.println(salary3 + bonus3);
        System.out.println(salary4+ bonus4);
        System.out.println(salary2/2);











        // 한글로 변수명을 짓는 것은 가능하지만 권장하지 않는다.
        int 나이;

        // 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
        String s;
        String name;

        // 전형적인 변수 이름이 있다면 가급적 사용한다.
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 0;

        // 명사형으로 작성할 수 있도록 한다.
        String goHome;  // 가능
        String home;

        // boolean 형은 가급적 긍정형태로 작성한다.
        boolean isAlive = true;
        boolean isDead = false;






    }
}
