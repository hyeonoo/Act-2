
/*
    FileName : ModifierTest02.java

    ==> TopSecret01.class 문제점
        : secretNo는 중요한 Attribute이다. 그러나 누구나 접근 및 변경이 가능
    ==> Access Modifier를 통한 information hiding과 Method(행위)를 통한 접근
*/
class TopSecret02{

    ///Field
    //==> access modifier를 활용한 information hiding
    //==> private 접근제어를 사용, 직접 접근할 수 없도록 하고 getter Method를 통해 접근
    private int secretNo = 7777;

    ///Constructor
    public TopSecret02(){
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
}
public class ModifierTest02 {
    
    ///main method
    public static void main(String[] args){

        TopSecret02 topSecret = new TopSecret02();
        
        //==> private Field는 information hiding되어 있어 접근 및 변경이 불가
        //==> Method를 통해 접근만 가능하며 변경불가
        //System.out.println(topSecret.secretNo);   //private로 선언되어 에러난다!
        //topSecret.secretNo = 1234;    //private로 선언되어 변경이 불가하다!!

        System.out.println(topSecret.getSecretNo(0));
    }
}
