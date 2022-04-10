
/*
    FileName : Manager.java
    1. 상속(일반화관계)과 생성자와의 관계
    2. 생성자를 명시적으로 호출하는 this(), super() method 이해
    3. 아래의 예제 실행을 통해 super(), this() / super.this 역할 및 의미를 이해
*/
public class Manager01 extends Employee01{
    ///Field
    int salary;

    ///Constructor
    public Manager01(){
        System.out.println("Manager01의 default Constructor");
    }
    public Manager01(String name){
        super(name);
        System.out.println("Manager01의 name을 받는 Constructor");
    }
    public Manager01(String name, String part){
        this(name);
        this.part = part;
        System.out.println("Manager01의 name, part을 받는 Constructor");
    }
    public Manager01(String name, String part, int age){
        super(name,part);
        this.age = age;
        System.out.println("Manager01의 name, part, age를 받는 Constructor");
    }
    public Manager01(String name, String part, int age, int salary){
        this(name, part, age);
        this.salary = salary;
        System.out.println("Manager01의 name, part, age, salary를 받는 Constructor");
    }
    //Method
    public int salary(){
        System.out.println("Manager01의 salary method");
        baseSalary = 200;
        return baseSalary;
    }
    public void callSalary(){
        System.out.println("Employee01의 기본급은 : "+super.salary());
        System.out.println("Manager01의 기본금은 1 : "+this.salary());
        System.out.println("Manager01의 기본급은 2 : "+salary());
    }

    ///Main Method
    public static void main(String[] args){
        /*
        Manager01 m1 = new Manager01("홍길동");
        
        Manager01 m2 = new Manager01("홍길동","EJB");

        Manager01 m3 = new Manager01("홍길동","EJB",25);
        */
        Manager01 m4 = new Manager01("홍길동","EJB",25,300);
        
        System.out.println("\n");

        System.out.println("overriding된 salary 호출 : "+m4.salary());
        m4.callSalary();
        
    }
    
}
