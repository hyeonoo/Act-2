
/*
    FileName : IfElse02.java

    1. 조건연산자 연습
    2. 분기문 if - else 연습
    3. AND : & , && 연산자
    4. OR : | , || 연산자
*/
public class IfElse02 {
    
    ///main method
    public static void main(String[] args){
        
        int x = 1;
        int y = 2;

        // & ==> and 연산자
        if(x==3 & y==2){
            System.out.println("x = 1 이고 y = 2 입니다.");
        }

        // | ==> or 연산자
        if(x==1 | y==3){
            System.out.println("x = 1 이고 y = 3 입니다.");
        }

        // && ==> and 연산자
        if(x==3 && y==2){
            System.out.println("x = 1 이고 y = 2 입니다.");
        }

        // || ==> or 연산자
        if(x==1 || y==3){
            System.out.println("x = 1 이거나 y = 3 입니다.");
        }

        /*
            1. && 와 & , || 와 | 는 수행결과는 같으나 
            2. 내부적으로는 수행방법은 엄격히 다르다.
                ==> & 과 | 은 : 전부 수행
                ==> && 과 || 은 : 전자가 결과를 예측 가능할 경우 일부를 수행하지 않는다.

                (1) (3) (2)             (1) (3) (2)             (1) (2) (3)          (1) (2) (3)
                 T   &   T  => T         T   |   T  => T         T   &&  T  => T      T   ||   T  => T
                 T   &   F  => F         T   |   F  => T         T   &&  F  => F      T   ||   F  => T
                 F   &   T  => F         F   |   T  => T         F   &&  T  => F      F   ||   T  => T
                 F   &   T  => F         F   |   F  => F         F   &&  F  => F      F   ||   F  => F 
        */ 
    }
}
