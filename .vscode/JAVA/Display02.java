
/*
    FileName : Display02.java
    1. BusCharge.class으ㅣ charge() Method 사용유무는...?
    2. 하위 클래스(Student, Adult, Old)에서 charge() Method가 OverRiding 않된다면??
    /////////////////////////////////////////////////////////////////////////
    
    ==> abstract Method / abstract class의 필요성 및 이해
    - abstract Method
        : 구체적일 필요가 없는 Method
        : 하위클래스에서 구체적으로 재정의(OverRiding)해야하는 강제성을 갖는 Mehthod
    - abstract class
        : 구체적이지 않은 abstract Method가 정의된 class
        : 일반화의 관계중 공통적, 일반적 행위와 속성을 공유를 목적으로 정의된 class
        ==>> abstract class는 instance 생성 할 수 없다 :: 중요!! <<==
    ////////////////////////////////////////////////////////////////////////

    # OverRiding : 부모 class가 가지고 있는 method를 재정의하여 사용하는 것 
    # abstract 사용시 
        - 부모 class의 OverRiding 당하는 Method를 구체적으로 써주지 않아도 된다. 
        - but 부모 class를 상속받는 자식 class들은 abstract method를 반드시 구현해야만 compile이 가능하다. 
        - abstract method를 가지고 있는 class는 abstract class가 되고 Instance화가 불가능하다. 
        - but date type선언은 가능하다.
*/
abstract class BusCharge{
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

    //==> 사용되지 않으며, 하위클래스에 OverRiding을 강제하는 추상메서드 정의
//  public void charge(){
//      System.out.println("Student:300, Adult:500, Old:free");
//  }
    public abstract void charge();
}//end of class

//abstract class 상속시 abstract method 필히 재정의(OverRiding)해야함 <== 강제성
// ## abstract class의 abstract method()를 자식 class들이 extends 받아 구현하였다.
class Student extends BusCharge{
    public Student(){
        super("Student");
    }
    //==> 아래의 Method 주석처리하고 compile시 compile error 확인해보기.
    public void charge(){
        System.out.println("300원");
    }
}//end of class

//abstract class 상속시 abstract method 필히 재정의 (OverRiding)해야함 <== 강제성
class Adult extends BusCharge{
    public Adult(){
        super("Adult");
    }
    public void charge(){
        System.out.println("500원");
    }
}//end of class

//abstract class 상속시 abstract method 필히 재정의(OverRiding) 해야함 <== 강제성
class Old extends BusCharge{
    public Old(){
        super("Old");
    }
    public void charge(){
        System.out.println("free");
    }
}//end of class

public class Display02 {

    ///main method
    public static void main(String[] args){

        //상위 reference로 하위 Instance를 참조가능(묵시적 형변환 / ~ is a ~ Relation)
        // abstract class는 객체 생성불가 그러나 type선언은?? 
        BusCharge bc1 = new Student();      //Student s = new Student();
        BusCharge bc2 = new Adult();        //Adult a = new Adult();
        BusCharge bc3 = new Old();          //Old o = new Old();
        // instance는 부모 type의 변수에 자식 class의 참조값 넣었다.(부모 type의 변수가 자식 type의 instance 주소값을 담을수 있다.)
        //==> Polymorphism : 하나의 interface로 접근 및 다양한 활용

        bc1.information();
        System.out.println(bc1.section);
        bc1.charge(); //어떤 class의 Method가 호출되었는지 확인하자

        bc2.information();
        System.out.println(bc2.section);
        bc2.charge(); //어떤 class의 Method가 호출되었는지 확인!!

        bc3.information();
        System.out.println(bc3.section);
        bc3.charge(); //어떤 class의 Method가 호출되었는지 확인 !!

        //==> 아래의 주석을 차례로 풀어 compile error 확인
        //==> 1. abstract class는 객체 생성 불가 
        //BusCharge bc01 = new BusCharge(); //--> error - 인스턴스화 불가 

        //==> 2. 객체생성은 불가능하나, 변수의 선언(Data Type)은 가능하다. 
        //BusCharge bc02;   //-> 에러 안남
    }
    
}
