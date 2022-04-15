
/*
    FileName : ModifierTest01.java

    1. ModifierTest01, ModifierTest02, ModifierTest03, ModifierTest04를 통해
        class 구현시 Modifier / Access Modifier 어떻게 활용, 응용되는지 살펴보자
    2. TopSecret01.class를 Access Modifier, Modifier로 어떻게 변경시키는지를 이해해보자.
*/

class TopSecret01{

    ///Field
    int secretNo = 7777;

    ///Constructor 
    public TopSecret01(){
    }

    ///Method
    //getter Method
    public int getSecretNo(){
        return secretNo;
    }
}


public class ModifierTest01 {

    ///main Method
    public static void main(String[] args){

        TopSecret01 topSecret = new TopSecret01();
        System.out.println(topSecret.secretNo);

        //==> secretNo 변경하면...
        topSecret.secretNo = 1234;
        System.out.println(topSecret.getSecretNo());
    }
}

/*
    TopSecret.class 문제점
        : secretNo는 중요한 attribute이다. 그러나 누구나 접근 및 변경이 가능??? 
*/
