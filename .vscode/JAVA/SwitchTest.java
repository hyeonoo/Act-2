
/*
    FileName : SwitchTest.java
    1. 분기문 : switch 연습
*/

public class SwitchTest {
    
    ///main method
    public static void main(String[] args){

        int inputData = Integer.parseInt(args[0]);

        // switch 문은 ()내부의 값과 case의 상수와 같으면 case 내부의 실행문을 수행한다.
        // break문 만날때까지 진행된다.
        // switch(변수) : 변수는 반드시 정수형일것!! (byte, short, int, long, char : 5EA)

        switch(inputData){

            case 1:
                System.out.println("입력하신 값은 1입니다.");
                break;
            case 2:
                System.out.println("입력하신 값은 2입니다.");
                break;
            case 3:
                System.out.println("입력하신 값은 3입니다.");
                break;
            case 4:
                System.out.println("입력하신 값은 4입니다.");
                break;
            case 5:
                System.out.println("입력하신 값은 5입니다.");
                break;
            default :   // 조건식 결과와 일치하는 case문이 없을때 수행된다.
                System.out.println("case문을 다 통과 (동일상수가 없을 경우)");
                System.out.println(" dafault가 수행된다.. 입력하신 수는 "+inputData+"입니다.");
                break;
        
        }//end of switch    
        
    }//end of main

}//end of calss

/*
    case 1: 의 break를 주석처리하고 실행해본다면?? 어떤결과 나오는지 확인해보기 ( ==> break의 역할 확인)
    ==> break 주석을 풀면 다음 break문이 나올때까지 모든 값 출력
*/