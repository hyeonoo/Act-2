
/*
    FileName : CastingTest.java

    1. primitive data type의 형변환     :   묵시적 형변환 / 명시적 형변환
    2. reference data type의 형변환     :   묵시적 형변환 / 명시적 형변환 
*/

public class CastingTest {

    ///main method
    public static void main(String[] args){

        byte b1 = 100;
        byte b2 = 20;

        //byte b3 = b1 + b2;
        //System.out.println(b3); ==> compile error ! Why?? type이 맞지 않다. 
        // 정수형 계산은 int return!

        //casting 연산자를 이용한 형변환 ==> 명시적 형변환
        byte b4 = (byte)(b1+b2);
        System.out.println("b4=(b1+b2) :"+b4);

        byte b5 = (byte)(b1+b4);
        //쓰레기값 출력( 출력 확인 )    ==> why?? byte의 범위는 '-128~127'이며, b1+b4='220'이 더 크기에 값을 담지 못하기 때문이다.
        System.out.println("b5=(b1+b4) :"+b5);

        //==> 묵시적 형변환
        int i1 = b1+b2;         //int -> 4byte = 32bit (1byte=8bit)이며, 범위 : -2^31 ~ 2^31-1(대략 20억?)
        System.out.println(i1);
        int i2 = b1+b4;
        System.out.println(i2);

        //다른 data type 연산 ==> data type이 큰쪽!!으로 묵시적!! 형변환이 일어난다. 
        double test01 = 100 + 0.5;
        System.out.println(test01);     
        //int test02 = 100 + 0.5; ==> compile error, why?? -> 0.5는 실수형!! float or double type이기때문이다. 

        //실수를 정수형에 대입하면 결과는 ??
        int i3 = 201/2;
        System.out.println("i3=(201/2) :"+i3); //==> 정확한 값은 100.5이지만 int type이기때문에 100으로 출력!

        //정수 int Data Type 201을 실수 double Data Type으로 명시적 형변환 후 
        //계산 결과를 double Data Type으로 받으면 출력 결과는 ?? 
        double d2 = (double)201/2;
        System.out.println("d2=(201/2) :"+d2);  //==> 정확히 소수점자리 값까지 출력!
        
    }   
    
}
