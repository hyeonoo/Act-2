
/*
    FileName : Deposit.java

    1. 금융업무를 하는 곳이라면 입금업무(기능)는 필수 기능
    2. 은행, 금고, 증권 등 어느곳이나 공통된 업무인 입금업무(기능)를 interface 정의

    ## interface 장점 
    1. 재사용이 가능하다(모듈화 가능)
    2. java는 단일상속 지원, 이를 보완하기 위해 다중 interface 사용 가능하다.
*/
public interface Deposit {

    //interface Field (member variable) ==> public static final 특성을 갖는다.
    String deposit = "입금";    // public static final 생략되어있다.

    //interface method ==> public abstract 특성을 갖는다.
    void deposit(int money);    //public abstract 생략되어있다.
    
}
