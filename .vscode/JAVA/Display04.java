
/*
    FileName : Display04.java
    
    <<<< Interface >>>>
        : abstract method 집합 (기능만 정의한 class / pure abstract class)
          기능(method)만 정의 하위(구현)class에서 O/R 강제
        : Instance 생성불가 (추상클래스는 Instance 생성불가와 같은 의미)
          SPEC.은 사용방법을 정의한 것이며, 실질적 사용은 SPEC.을 구현한 구현체(하위 객체)를 사용
    
    
*/
class BusCharge{
    ///Field
    String section;
    ///Constructor
    public BusCharge(){
    }
    public BusCharge(String section){
        this.section=section;
    }
    ///method
    public void information(){
        System.out.println("버스요금안내");
    }
}//end of class

// charge()를 정의한 interface
//==> 기능의 정의(기능만 도출하여 정의한다면...) : 지하철, 항공, 택시 요금에도 사용 가능.
interface Fee{
    public void charge();
}//end of class

//interface 구현시 abstract method 필히 재정의(OverRiding) 해야함 <== 강제성
class Student extends BusCharge implements Fee{
    public Student(){
        super("Student");
    }
    //==> 아래의 Method 주석처리하고 compile시 compile error 확인해보기.
    public void charge(){
        System.out.println("300원");
    }
}//end of class

//abstract class 상속시 abstract method 필히 재정의 (OverRiding)해야함 <== 강제성
class Adult extends BusCharge implements Fee{
    public Adult(){
        super("Adult");
    }
    public void charge(){
        System.out.println("500원");
    }
}//end of class

//abstract class 상속시 abstract method 필히 재정의(OverRiding) 해야함 <== 강제성
class Old extends BusCharge implements Fee{
    public Old(){
        super("Old");
    }
    public void charge(){
        System.out.println("free");
    }
}//end of class

public class Display04 {

    ///main method
    public static void main(String[] args){
/*    <<구현 1>> 아래의 구현은 문제 없이 출력된다.
        Student s = new Student();
        Adult a = new Adult();
        Old o = new Old();

        s.information();
        System.out.println(s.section);
        s.charge(); 

        a.information();
        System.out.println(a.section);
        a.charge(); 

        o.information();
        System.out.println(o.section);
        o.charge(); 
//*/

///* <<구현 2>> 아래의 구현에서 문제 발생 : compile시 error
       // 1. 문젝가 발생한 이유?
       // 2. 문제를 해결하여 출력이 될 수 있도록 구현을 수정해보자
       //==> Hint! -> CastingComplete.java의 세번째를 이해하자 / casting 연산자를 사용한 이유는??

       Fee[] fee = new Fee[3];
       fee[0] = new Student();   
       fee[1] = new Adult();    
       fee[2] = new Old();       
       
       for(int i=0; i<fee.length; i++){
           fee[i].information();
           System.out.print(fee[i].section);
           fee[i].charge();
       }
    */

    }//end of main
    
}// end of class
