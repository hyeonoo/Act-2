
/*
    FileName : IfElseETC.java

    1. 문자를 int DataType으로 변경하는 Integer.parseInt() 사용
    2. 특수문자 사용하기 ( \t , \n , \")

    * 인자값 넣어보기 
*/
public class IfElseETC {

    ///main method
    public static void main(String[] args){
        //==> \" 사용확인
        System.out.println("입력하신 \"1번쨰인수\"는 : "+args[0]);
        System.out.println("입력하신 \"2번째인수\"는 : "+args[1]);

        System.out.println("===================================");

        //입력한 문자를 int DataType으로 변경하는 Integer.parseInt() 사용
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        //i , j 변수에 값을 확인하자 
        System.out.println("i="+i+"\t j="+j);   //<== 특수문자 \t 사용 : 출력결과 확인해보기 -> 'tab'만큼 띄우기!!
        System.out.println("한줄 처리\n");        //<== 특수문자 \n 사용 : 출력결과 확인해보기 -> 줄바꿈 처리, enter?? 기능??
        System.out.println("=====================================");

        if(i>j){
            System.out.println("i가 j보다 큽니다.");
        }else if(i==j){
            System.out.println("i와 j는 같습니다.");
        }else if(i<j){
            System.out.println("i보다 j가 큽니다.");
        }
    }
    
}
