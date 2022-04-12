
/*
    FileName : Son.java

    1. Encapsulation(information hiding)을 지원하는 Access Modifier 이해
    2. public / protected / (default) / private의 사용 및 이해

    - Son01은 Father와 같은 package에 존재하며, 상속관계이다. 
    - 주석을 풀고 
        ==> Compile 시 error를 확인하고, error의 의미 이해
        ==> 각 Access Modifier의 접근 법위를 확인
*/

public class Son01 extends Father{

    ///Field

    ///Constructor
    public Son01(){
        System.out.println(this.name);      //==> public String name = "홍길동";
        System.out.println(bank);           //==> protected String bank = "한양은행";
        System.out.println(branch);         //==> String branch = "역삼동지점";
        //System.out.println(password);     //==> private int password = 1234;

        //==> Field(상태정보)는 Method(행위)를 이용 접근
        System.out.println("은행 비밀번호 : "+this.getPassword(0));

        // password의 접근자가 private였기떄문에 get method를 사용하여 가져와야한다. 
    }
}

/*
    1. private을 사용하여 다른 class로부터 상태 정보은익
    2. method를 통해(행위를 통해) 정보은익 여부를 제어
*/
