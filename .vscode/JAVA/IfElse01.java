
/*
    FileName : IfElse01.java

    1. 비교연산자 연습
    2. 분기문 if - else 연습

    If-Else문 : 주어진 결과에 따라 실행문장을 달리하여 전혀 다른 결과를 얻기 위해 사용하는 제어문 중 하나 
    # IF문 - boolean형의 결과를 가지는 조건식이 있어야 한다.
        *조건식 : 어떤 식의 결과로 수행하는 문장을 결정하는 제어문 
           - 단순 if, 단일 if - else, 다중 if 문이 있다.
           
    # 단순 if - if(조건식){ 조건에 만족할 때 수행되는 문장 
               } ==> 반드시 boolean 결과를 반환해야한다. 

    # 단일 if - else문 - if(조건식){ 조건에 만족할 떄 수행할 문장 
                        }else{ 조건에 만족하지 않을 때 수행될 문장 
                        }
                      - 조건을 만족할 때, 그렇지 않을 때 각각 서로 다른 수행 문장을 부여한다.( 프로그램의 명확성을 높일 필요가 있을 때 사용 )

    # 다중 if 문 - if(조건문 1){ 조건문 1에 만족할 때 수행할 문장
                  }else if(조건문 2){ 조건문 2에 만족할 때 수행할 문장
                  }else {
                  }
                - 조건 비교가 한 가지로 충분하지 않을 때 사용, 여러개의 조건 비교가 필요할 경우!!
*/
public class IfElse01 {

    ///main method
    public static void main(String[] args){

        //논리형 변수의 선언과 값의 대입
        boolean b1 = true;
        boolean b2;     // boolean의 default값을 false!!

        // ! 반전연산자 사용
        b2 = !b1;
        int x = 1;
        int y = 2;

        // if-else가 같이 쓰이는 경우
        if(x<y){
        //if(0){    //==> 주석풀고 compile error 확인해보기 why?? (0) => boolean data type이 아니기때문이다. 
            System.out.println("x = "+x+", y = "+y+", y가 크다");    
        }else{
            System.out.println("x = "+x+", y = "+y+", x가 크다");
        }

        //if문 단독으로 쓰이는 경우
        if(x==y){
        //if(x=y){  //==> 주석풀고 compile error 확인해 보자 why?? '=' -> '==' 이렇게 나타내주어야 한다. }
        // '=' -> 대입 연산자이다. // 같다는 표시는 '=='으로!!
            System.out.println("x = "+x+", y = "+y+", x,y는 같다");
        }   //==> x와 y 값이 같지 않기 떄문에 출력되지 않는다!!

        //if-else if가 쓰인 경우
        if(b2){
            System.out.println("if의 조건문이 b2 = false입니다");
        }else if(b1){
            System.out.println("if의 조건문이 b1 = true입니다.");
        }
    }
    
}
