
/*
    FileName : User01.java

    :: Constructor 의미 이해
        - Constructor는 객체지향의 큰 그림을 지원한다. 
        -객체지향의 대전제 중 "객체는 서로 다른 상태를 갖는다"라는 개념을 지원
    
        1. 인스턴스 생성시 new A()의 의미의 이해
           - Instance 생성시 호출되는 'Instance 초기화 Method'이다. ==> 따라서 Instance 변수의 초기화 작업에 주로 사용
           - Instance 생성시에 실행되어야 할 작업을 위해서도 사용된다.  
        2. new와 같이 사용되는 특수한 행위를 하는 method 이해
            - 연산자 new가 Instance를 생성하는 것이지 Constructor가 Instance를 생성하는 것이 아니다. 
        3. Constructor 주 작업, 용도는 ??
            - 단지 Constructor는 Instance 변수들의 초기화에 사용되는 조금 특별한 Method일 뿐!!
*/
public class User01 {

    ///Field
    String name = "홍길동";
    int javaLevel = 0;

    /// default Constructor
    /*      : Class에는 반드시 하나 이상의 Constructor가 필요하지만 지금까지 Constructor 없이 Instance 생성할 수 있었던 이유는 
               Compiler가 제공하는 default Constructor 덕분!!(Constructor가 ##하나도 정의되지 않은 경우(주의, 중요!!)## Compiler가 자동적으로 default Constructor 추가하여 compile한다.)
        ==> 1. ClassName == MethodName
        ==> 2. return Typedl 없다. + 모든 class는 반드시 생성자를 가져야 한다. 
          (모든 Constructor가 return값이 없기떄문에 void 생략 가능하게 됨!!)
    */
    /*
        Class 이름(Type 변수명, Type 변수명, ...){
            // Instance 생성시 수행될 code
            // 주로 Instance 변수의 초기화 code를 적는다.
        }
        Ex. Class Card{
                Card(){ ==>  매개변수 없는 생성자
                    ...
                }  
                Card(String k, int num){ ==> 매개변수 있는 생성자
                    ...
                }
                ...
        }
    */
    public User01(){
        System.out.println("Constructor Method");
    }

    ///Method
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
        User01 user = new User01();     // 위의 User01의 System.out.println() 호출한다. // new User01의 User01 --> Constructor Method(User01안 메서드안의 모든 실행문 실행)
        System.out.println("===================");

        //출력결과를 확인하고 아래의 주석을 풀어 다시 확인해보자 
    /*
        System.out.println("===================");
        User01 user;
        System.out.println("===================");
        user = new User01();    //==> "Constructor Method(sysout)" 호출
        System.out.println("===================");
        new User01();           //==> "Constructor Method(sysout)" 호출 한다.
        System.out.println("===================");
    */

    System.out.println("name : "+user.getName());
    System.out.println("javaLevel : "+user.getJavaLevel());

    }
    
}
