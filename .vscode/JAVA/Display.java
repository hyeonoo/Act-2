
/*
    FileName : Display.java
    
    # Overriding
        - 부모 class로부터 상속받는 method 중 method의 내용을 변경하고 싶은 것 재정의하여 사용
        조건(자손 클래스에서 overriding하는 method는 조상클래스의 메서드와)
        1. 이름이 같아야 한다. 
        2. 매개 변수가 같아야 한다. 
        3. 리턴 타입이 같아야 한다. 
        조건(조상클래스의 메서드를 자손클래스에서 overriding할 때)
        1. 접근 제어자를 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.
        2. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다. 
        3. Instance method를 static method로 또는 그 반대로 변경할 수 없다. 

    # Overloading vs Overriding
        Overloading : 기존에 없는 새로운 method를 정의하는 것(new)
        OVerriding : 상속받은 method의 내용을 변경하는 것(change, modify)xs
*/
class BusCharge {
    ///Field
    String section;
    ///Constructor
    public BusCharge(){
    }
    public BusCharge(String str){
        section = str;
    }
    ///method
    public void information(){
        System.out.println("버스요금안내");
    }
    public void charge(){
        System.out.println("학생:300, 일반인:500, 어르신:공짜");
    }
}
/*
    BusCharge class의 charge() method -> Student, Adult, Old 모두 가지고 있다. 
    but  Student, Adult, Old 각각 운임요금이 다르기 떄문에 charge() method 재정의!!
    ==> 자신의 Interface 이용하여 호출하여 사용
*/

class Student extends BusCharge{
    public Student(){
        super("학생");
    }
    public void charge(){
        System.out.println("::300원\n");
    }
}

class Adult extends BusCharge{
    public Adult(){
        super("일반인");
    }
    public void charge(){
        System.out.println("::500원\n");
    }
}

class Old extends BusCharge{
    public Old(){
        super("어르신");
    }
    public void charge(){
        System.out.println("::공짜\n");
    }
}

public class Display{
    ///Main Method
    public static void main(String[] args){
        Student b1 = new Student();
        Adult b2 = new Adult();
        Old b3 = new Old();

        b1.information();
        System.out.print(b1.section);
        b1.charge();    //어떤 클래스의 method 호출되었는지 확인해보기

        b2.information();
        System.out.print(b2.section);
        b2.charge();    //어떤 클래스의 Method 호출되었는지 확인해보기

        b3.information();
        System.out.println(b3.section);
        b3.charge();    //어떤 클래스의 Method 호출되었는지 확인해보기
    }
}
