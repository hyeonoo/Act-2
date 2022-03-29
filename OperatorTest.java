
/*
    FileName : OperatorTest.java

    1. ++ , -- : 증가, 감소연산자
    2. %       : 나머지 연산자
    3. 3항 연산자
*/

public class OperatorTest {
    
    ///main method
    public static void main(String[] args){

        int value = 1;

        //증감연산자의 사용
        value++;    //value++ 의미 : 자기자신 1증가 
        System.out.println("value++ :"+value);  //==> 2
        ++value;    //++value 의미 : 자기자신 1증가
        System.out.println("++value :"+value);  //==> 3

        value--;    //value-- 의미 : 자기자신 1감소
        System.out.println("value-- :"+value);  //==> 2
        --value;    //--value 의미 : 자기자신 1감소
        System.out.println("--value :"+value);  //==> 1

        //증가감소연산자 사용 //==> 주석을 풀면서 출력결과를 확인해보자(먼저 예상해보고 확인해보자)
        int temp = value++;   //=>temp: 1, value: 2     //temp = value++ 의미 : value 값을 1).temp에 대입 후 / 2).자가자신 1증가 (후 증가 < ++(=후) 위치!!>)
        //int temp = value--;   //=>temp: 1, value: 0     //temp = value-- 의미 : value 값을 1).temp에 대입 후 / 2).자기자신 1감소
        //int temp = ++value;   //=>temp: 2, value: 2     //temp = ++value 의미 : 1).value 자기자신에 1증가 후 / 2).그 값 temp에 대입
        //int temp = --value;   //=>temp: 0, value: 0     //temp = --value 의미 : 1).value 자기자신에 1감소 후 / 2).그 값 temp에 대입
        System.out.println("temp :"+temp);
        System.out.println("value :"+value);

        //나머지 연산자 사용하기 
        int temp01 = 5%2;
        int temp02 = 5%3;
        System.out.println("나머지 연산자 : 5%2 ==>"+temp01);   //==> temp01 : 1
        System.out.println("나머지 연산자 : 5%3 ==>"+temp02);   //==> temp02 : 2

        //삼항연산자 :: (조건) ? 조건이 true이면 : 조건이 false이면;
        int temp03 = ( 1 <= 2) ? 3 : 4;  //==> temp03 = 3
        System.out.println("삼항연산자 : (1 <= 2) ? 3 : 4 ==> "+temp03);
        
        //int temp04 = ( 1 =< 2 ) ? 3 : 4;  ==> compile error!! WHY ?? =<(부등호)가 잘못됨 
        
    }
}
