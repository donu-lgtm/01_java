package section01.literal;

public class Application02 {
    public static void main(String[] args) {

        // 정수 리터럴 연산 형식의 값을 연산 한다.

        /*
        *123+123
        * 123-456
        * 123*456
        * 4/10
        * 10%2
        *
         **/
        System.out.println(123+123);
        System.out.println(123-456);
        System.out.println(123*100);
        System.out.println(12*12);
        System.out.println(8%3);
        System.out.println(10000*10000);

        System.out.println("__________________________");


        //실수와 정수 연산
        System.out.println(1+0.5);
        System.out.println(1-0.5);
        System.out.println(1%0.5);


        //문자와 문자의 연산
        //컴퓨터는 문자를 인식하지 못하기 대문에 대응되는 숫자들이 있다
        // (아스키코드(영어), 유니코드(전세계언어))
        System.out.println('a' +'b');
        System.out.println('ㄱ' + 'ㄴ');

        //문자열은 + 연산만 가능하다.
        //데이터 값이 다를 때는 자동 형변환을 통해 최상위 타입으로 변경된다.
        //(문자열이 최상위 타입)


        System.out.println("____________ 문자열과 다른형태의 값 연산__________");

        System.out.println("hello"   + 1004);
        System.out.println("hello"  + true);


        System.out.println("hello"+ (123 + 456) + "true");



}}