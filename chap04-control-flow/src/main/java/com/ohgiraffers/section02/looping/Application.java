package main.java.com.ohgiraffers.section02.looping;



public class Application {
    public static void main(String[] args) {

        A_for a = new A_for();
        // a.testSimpleForStatement();
        //a.testForExample();
        //a.printGugudan();
        // a.testForExample2();

        B_nestedFor b = new B_nestedFor();
        // b.printGugudanFromTwoToNine();
        // b.printUpgradeGugudan();
        // b.printStars();

        C_while c = new C_while();
        // c.testSimpleWhileStatement();
        // c.testWhileExample1();
        //c.testWhileExample3();

        D_doWhile d = new D_doWhile();
        // d.testSimpleDoWhileStatement();
        d.testDoWhileExample();
    }
}
