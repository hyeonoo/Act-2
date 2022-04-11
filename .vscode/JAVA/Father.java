
/*
    FileName : Father.java
    
    1. Encapsulation(information hiding)을 지원하는 Access Modifier 이해
    2. public / protected / (default) / private의 사용 및 이해

    # public - 공용
             - 누구나 사용 가능
             - field, method, class(주로 public 사용) 

    # protected - 나가 사는 아들
                - 같은 package, 상속관계 접근가능
                - field, method
    
    # (default) - 같은 집
                - 같은 package 접근가능
                - field, method, class

    # private   - 개인 방
                - class 내부에서만 접근가능
                - field, method
*/
public class Father {

    ///Field
    public String name = "홍길동";       // public : 누구나 접근가능하다.
    protected String bank = "한양은행";  // protected : 상속관계, 같은 package에서 접근가능하다.
    String branch = "역삼동지점";        // (default) : 같은 package에서 접근가능하다.
    private int password = 1234;      // private : 자신만 접근가능하다. 

    ///Constructor
    public Father(){
    }

    ///Method
    /*
        각각의 Field(상태값) 아래의 Method(행위)를 통해 접근이 가능
        아래의 각각의 getter Method의 의미를 이해
    */
    public String getBank(int pwd){
        if(pwd != 7777){
            return "key값을 정확히 입력해주세요";
        }else{
            return this.bank;
        }
    }
    //은행비밀번호를 알기위한 key를 알고 있으면 password를 return
    public int getPassword(int key){
        if(key != 7777){
            return 0;
        }else{
            return this.password;
        }
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
}
