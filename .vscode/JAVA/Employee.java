
/*
    FileName : Employee.java
    1. 상속(일반화관계)과 생성자와의 관계
    2. 생성자를 명시적으로 호출하는 this(), super() method 이해
    ==> 아래의 예제 실행을 통해 super(), this()의 역할 및 의미를 이해

    # 생성자 super(), this() Method
        하위 Constructor를 호출하면 Hierachy를 따라서 가장 상위 Constructor부터 생성하면서 내려온다. 
        but, 자동적으로 생성해주지는 않는다. 
        자식 class의 모든 Constructor들이 super()를 자동적으로 생성하여 조상Constructor를 불러온다. 
        
    # super() -> 상위 class의 Constructor를 호출하는 기능을 가지고 있다. 
              -> 상위 class의 기본 Constructor 호출, super("String")은 상위 class의 문자열을 인자로 받는 생성자를 호출한다. 

    # this()  -> 같은 class에 있는 Constructor를 호출하는 기능
              -> 같은 class의 기본 Constructor 호출, this("String")은 같은 class의 문자열을 인자로 받는 생성자를 호출한다. 
              
    # class 내에 생성자가 하나도 없다면 JRE가 default 생성자를 만들어주지만 생성자가 이미 있다면 만들어주지 않는다. 

    # super(), this()를 사용한다는 것 --> 직접 생성자를 관리한다는 의미를 가진다 
    # super(), this() --> 한 생성자에 하나만 사용이 가능하다. 
*/
public class Employee {

    ///Field
    String part, name;
    int age, baseSalary;

    //Constructor
    public Employee(){
        System.out.println("Emp의 default Constructor");
    }
    public Employee(String str){
        name = str;
        System.out.println("Emp의 name을 받는 Constructor");
    }
    public Employee(String str1, String str2){
        this(str1);
        part=str2;
        System.out.println("Emp의 name, part을 받는 Constructor");
    }
    public Employee(String str1, String str2, int i){
        this(str1, str2);
        age = i;
        System.out.println("Emp의 name, part, age을 받는 Constructor");
    }

    //Method
    public int salary(){
        System.out.println("Emp의 salary() method");
        baseSalary = 100;
        return baseSalary;
    }
    
}
