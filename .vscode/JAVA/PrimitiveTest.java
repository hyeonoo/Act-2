
/*
*   FileName : PrimitiveTest.java
*
*   1. Java에서 제공되는 8EA의 Primitive Data Type의 이해
*   2. Varialbe declaration(변수선언)과 Variable Assignment(값의 대입)
*/

public class PrimitiveTest {

    //main method 
    public static void main(String[] args){
    //java application이 실행되면 제일먼저 main method를 실행한다.
    //public - 접근제어자(어느곳에서든 해당 객체를 참조할수 있다.)
    //static
    //void - return값 x
        
        //논리형
        boolean boo = true;

        //문자형
        char c = '홍';

        //정수형
        byte b = 127;
        //범위를 넘어서는 수를 담을 경우 ==> compile error 발생
        //byte b1 = 128;

        short s = 1000;
        int i = 1000;
        long l = 1000L;     //<== long의 경우 000l or 000L로 int와 구별 

        //실수형
        float f = 1000.5F;  //<== float의 경우 000F or 000f로 double과 구별한다.
        double d = 1000.5;

        // print()와 println() Difference (run 확인해보기)
        System.out.print("Type(int, float, double etc에 구애받지 않는 문자를 그대로 출력하고싶을때 / enter입력시 buffer에 \n(개행문자) 포함 x / 줄바꿈 필요 없을때 사용");
        /* print => 줄바꿈하고 싶을땐 '\n' 사용
                 => + 기호 역할 
                    - 숫자끼리 실제 덧셈 연산 수행
                    - 서로 다른 type의 data끼리는 단순 연결만 해서 출력 
        */
        System.out.println("Type에 구애받지 않는 문자 그대로 출력 / enter 입력시 buffer에 \n가 같이 들어간다. ");
        // print => 자동 줄바꿈
        System.out.printf("Type을 신경써야 할 때 사용(출력 형식 지정 가능) / enter입력시 buffer에 \n(개행문자) 포함 x ");
        /* printf => 줄바꿈하고 싶을땐 '\n' or '%n' 사용 
                    - 같은 값이라도 다른 형식으로 출력하고 싶을때 (ex. 소수점 둘째자리까지만 출력하고 싶을때)
                    - 지시자 사용하여 변수의 값을 여러가지 형식으로 변환하여 출력하는 기능을 가진다. 
                    - 지시자 : %b(boolean type), %d(decimal(10진수) type), %o(octal(8진수) type), %x,%X(hexa-decimal(16진수) type) <API-formatter class (java.util)참고>
                              %f(float-point(부동 소수점) type), %e,%E(exponent(지수) type), %c(character(문자) type), %s(string(문자열) type)
                                System.out.printf("age:%d year:%d", age, year);
                            ->  System.out.printf("age:%d year:%d", 30, 2021);  ==> "age:30 year:2021"이 출력된다. 
                                (출력하려는 값 2개라면 지시자도 2개를 사용해야하며 순서 또한 일치해야한다. 개수제한 없음)
        */
        // + 연산자의 의미 ( 문자와 '+'연산자가 사용되면 append )
        System.out.println("논리형 :"+boo);
        System.out.println("문자형 :"+c);
        System.out.println("정수형 byte :"+b);
        System.out.println("정수형 short :"+s);
        System.out.println("정수형 int :"+i);
        System.out.println("정수형 long :"+l);
        System.out.println("실수형 float :"+f);
        System.out.println("실수형 double :"+d);
   
    }// end of main

}// end of class
