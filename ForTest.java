
/*
    FileName : ForTest.java
    1. for(초기값; 조건; 변화값)문을 이용 , 주로 반복횟수 알고 있을 때 사용한다.
    2. while(조건)문과 do..while(조건)문과의 차이점 및 활용확인
*/

public class ForTest {
    
    ///main method
    public static void main(String[] args){

        int j = 5;
        System.out.println(j+"단을 출력합니다.");

        //for문은 while문과는 달리 초기화를 for문 내부에서 한다. 
        for(int i=1; i<10; i++){
            System.out.println(j +" * "+i+" = "+j*i);
        }

        //반복문 for / while 사용과 차이점 이해 
        int k=1;
        while(k<10){
            System.out.println("5 * "+k+" = "+5*k);
            k++;
        }

        System.out.println("i의 최종변경 값 : "+i); //==> for문 밖!! - error 
        System.out.println("k의 최종변경 값 : "+k);

        //==> 무한루프와 무한루프후단의 실행문에서 compile error를 이해하면 ??
        // for(;;){
        //     System.out.println("여기는 반복문내부의 무한루프");
        // }
        //==> 아래 주석을 풀면 compile error가 발생!! 이유는??
        //System.out.println("error가 발생한다. 이유는??") ==> for문 밖이기 때문에 
    }
}
