
/*
    FileName : ModifierTest03.java

    1. TopSecret02.class가 중요한 class라면 modifier를 통해 상속할수 없도록 했으며,
    2. secretNo를 readOnly를 명확히 하였다. 
        또한 중요한 class라면 객체 생성을 불가능하게 한다. 
        ==> 아래의 coding을 이해하자! Constructor를 외부에서 접근하지 못하게 private 선언.
            (예> java.lang.System.class의 source와 API를 통해 확인!!)
    3. static method를 통해 Instance를 return할 수 있도록 한다. 
*/

//final -> class, method, 멤버변수, 지역변수 사용가능

//final modifier : 상속불가 
final class TopSecret03{        // class를 더이상 확장하고 싶지 않을때, 그냥 이 class자체만 사용하게 하고 싶을 때 사용

    ///Field
    //==> access modifier를 활용한 information hiding
    //==> final modifier를 활용한 수정불가
    private final int secretNo = 7777;      // 변수 고정시켜서 아무도 바꾸지 못하게 하고 싶을 때
                                            // private 사용시 외부에서 Instance 생성 x 

    ///Constructor
    //==> Access modifier를 통한 객체생성불가 (private Constructor를 사용한 이유 이해하자)
    private TopSecret03(){      // 같은 class 내부에서는 private 이용해 생성자 사용 o 
    }

    ///Method
    //getter Method
    //==> method를 통해 조건을 충족할 경우만 secretNo를 return
    public int getSecretNo(int pwd){
        if(pwd == 0){
            return secretNo;
        }else{
            return 0;
        }
    }

    //static method를 이용한 instance return 하게하여 다른 class에서 사용가능하게 함.
    public static TopSecret03 getInstance(){
        //getInstance method -> Instance생성 방식이며, 최초에 할당된 하나의 메모리를 계속 쓰는 방식이다. 
        TopSecret03 topSecret = new TopSecret03();  //최초 한번만 new연산자 통해 메모리에 할당된다. 
        return topSecret;
        //return new TopSecret03();
    }
}
public class ModifierTest03 {

    ///main method
    public static void main(String[] args){

        // Constructor가 private로 instance 생성(Constructor 호출) 불가능
        // TopSecret topSecret = new TopSecret();
        // instance 생성을 불가로 static method를 통해 객체를 return 받는다.
        TopSecret03 topSecret = TopSecret03.getInstance();
        System.out.println(topSecret.getSecretNo(0));
    }
    
}
