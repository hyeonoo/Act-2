
/*
    FileName : Display03.java
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

public class Display03 {

    ///main method
    public static void main(String[] args){

        Student s = new Student();
        Adult a = new Adult();
        Old o = new Old();

        s.information();
        System.out.println(s.section);
        s.charge(); //어떤 class의 Method가 호출되었는지 확인하자

        a.information();
        System.out.println(a.section);
        a.charge(); //어떤 class의 Method가 호출되었는지 확인!!

        o.information();
        System.out.println(o.section);
        o.charge(); //어떤 class의 Method가 호출되었는지 확인 !!

       //==> 위의 coding과 아래의 coding 비교해보기..
       //==> 1. 반복된 부분은 있을까 없을까?
       //==> 2. 같은 Data type 묶음(배열 : Array)을 이용하여 일괄적으로 관리할 수 없을까?
       BusCharge[] bc = new BusCharge[3];
       bc[0] = new Student();   //BusCharge bc1 = new Student(); //Student s = new Student();
       bc[1] = new Adult();     //BusCharge bc2 = new Adult();  //Adult a = new Adult();
       bc[2] = new Old();       //BusCharge bc3 = new Old();    //Old o = new Old();
       
       for(int i=0; i<bc.length; i++){
           bc[i].information();
           System.out.print(bc[i].section);
           bc[i].charge();
       }
    }
    
}
