
/*
    FileName : WhileTest.java
    1. while(조건)
    2. do..while(조건)
    활용 및 차이점을 확인.
*/

public class WhileTest {

    ///main method
    public static void main(String[] args){

        //while문 
        int i=0;        //#1. 순환문의 조건을 주기위한 int i 초기화
        while(i<10){    //#2. 조건(boolean data type)
        //while(0) {    //==> compile error (error를 확인하면.. -> boolean type이 아니기때문에 )  
            System.out.println("여기는 while문 내부안임 i= "+i);
            i++;        //#3. 증감식
        }

        //do-while문 
        int j=0;        //#1. 순환문의 조건을 주기위한 int j 초기화
        do{
            System.out.println("\n\t여기는 do문 내부임 j= "+j);
            j++;        //#2. 증감식
        }while(j<1);    //#3. 조건(boolean data type)

        System.out.println("\n================================\n");

        //while 문을 이용하여 5단을 출력하는 프로그램
        int k=1;
        while(k<10){
            System.out.println("5 * "+k+" = "+5*k);
            k++;
        }

        //==> 무한루프와 무한루프후단의 실행문에서 compile error 이해 
        while(true){
            System.out.println("여기는 반복문내부의 무한루프");
        } 

        //==> 아래의 주석을 풀어 compile error가 발생하는 이유를 알아보기 ...
        //System.out.println("error가 발생하는 이유는?"); => while문안에 들어있지 않기떄문에 error!
    }
    
}
