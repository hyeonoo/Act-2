
/*
    FileName : BreakTest.java

    //==> keyword : break ==> 자신이 속한 반복문은 종료

    //==> break문을 이용하여 입력받은 수까지의 합 구해보기
    //==> 10 인자값으로 ==> 1 ~ 10 더해서 55 출력해보기
*/
public class BreakTest {

    ///main method
    public static void main(String[] args){

        //입력 받은 data를 int로 변환
        int inputData = Integer.parseInt(args[0]);

        //while문의 초기화변수 선언
        int i = 0;

        //더한 값을 저장하기 위한 변수 선언
        int sum = 0;

        while(true){
            i++;
            sum = sum + i; // ==> 좀 더 익숙해지면 sum += i;로 

            if(i==inputData){
                break;
            }
        }// end of while

        System.out.println("0 ~ "+inputData+" 까지의 합은 : "+sum+"입니다.");

        //break문은 주로 if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어난다.
    }
    
}
