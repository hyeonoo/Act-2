
/*
    FileName : User02.java

    :: Constructor 의미 이해
    1. 인스턴스 생성시 new A()의 의미의 이해
        -> new A() : Constructor Method이고 A를 호출하여 실행시킨다,
    2. new와 같이 사용되는 특수한 행위를 하는 method 이해 
    3. Constructor 주 작업, 용도는?
        -> 변수를 초기화하는 method
    ========================================
    ==> 생성자는 인스턴스 생성시 호출된다. 
    ==> 주 작업은 Field variable 초기화 작업(상태값 설정)
    ==> 생성시 상태를 갖는 인스턴스 생성

    # Constructor는 Method이다. 
      다만 return값이 없고, class 명과 같을 뿐이지 Method와 같은 기능을 가지고 있다. 
        --> polymorphism을 가진다. 
*/
public class User02 {
    ///Field
    String name;
    int javaLevel;

    ///Constructor
    public User02(){
        System.out.println("Constructor Method");
        name = "홍길동";
        javaLevel = 0;
    }

    //Method
    // getter Method definition
    public String getName(){
        return name;
    }
    public int getJavaLevel(){
        return javaLevel;
    }

    ///Main Method
    public static void main(String[] args){

        System.out.println("===================");
        User02 user = new User02(); // User02 호출시켜 실행문 실행 시킨다.
        System.out.println("===================");

        System.out.println("name : "+user.getName());
        System.out.println("javaLevel : "+user.getJavaLevel());
    }
    
}
