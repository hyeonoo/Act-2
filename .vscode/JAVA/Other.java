
/*
    FileName : Other.java

    1. Encapsulation(information hiding)을 지원하는 Access Modifier 이해
    2. public / protected / (default) / private의 사용 및 이해

    - Other는 Father와 같은 package에 존재
    - 주석을 풀고
        ==> Compile시 error를 확인하고,  error의 의미 이해
        ==> 각 Access Modifier의 접근범위를 확인
*/
public class Other {

    ///Field
    String name = "홍길동";
    String job = new String("개발자");
    //==> 위의 String Data Type의 name, job 상태값을 정의한 것을 이해한다면...
    //==> Other.class Has A String.class ( ~~ Has A ~~ : Association Relation)
    //==> 아래의 Father Data Type과 Other.class간의 관계는...

    Father owner = new Father();    // ==> Father Instance 생성

    ///Constructor
    public Other(){
        System.out.println(this.owner.name);    //==> public String name ="홍길동";
        System.out.println(owner.bank);         //==> protected String bank = "한양은행";
        System.out.println(owner.branch);       //==> String branch = "역삼동지점";
        //System.out.println(f.password);       //==> private int password = 1234;
    
        //==> Field(상태정보)는 Method(행위)를 이용 접근
        System.out.println("은행 비밀번호 : "+this.owner.getPassword(0));
    }
}

/*
    1. private을 사용하여 다른 class로부터 상태 정보 은익
    2. method를 통해(행위를 통해) 정보은익 여부를 제어
*/
