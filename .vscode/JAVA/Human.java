
/*
    FileName : Human.java
    - 추상화수준이 높은, 일반적인 사항을 Modeling Class

    # Inheritance(상속)
    - class들을 Specialization(구체화) 시키면 hierarchy(계층화)가 되어서
      올라갈수록 Generalization(일반화), 내려갈수록 Specailization(구체화) 된다. 
    - hierarchy가 되면 공유라는 객체지향의 개념이 나타나고, 이를 지원하는 java의 keyword ==> extends !!
    - 기존의 class 재사용하여 새로운 class 작성
    - 적은 양의 코드로 새로운 class 작성 가능!, 코트를 공통적으로 관리할 수 있기 때문에 코드의 추가 및 변경이 매우 용이하다. 
    - 코드의 재사용성 높이고, 코드이 중복 제거, 프로그램의 생산성과 유지보수에 크게 기여!!

    # 상속관계 : '~은 ~이다(is - a)'
      포함관계 : '~은 ~을 가지고 있다(has - a)' // class name을 가지고 자연스러운 문장을 만들어 비교해보기
      
*/
public class Human {

    ///Field
    String name;
    int age;

    ///Constructor
    public Human(){
        System.out.println("Human class default Constructor");
    }
    public Human(String str){
        System.out.println("Human class의 name을 받는 Constructor");
        name = str;
    }

    ///Method
    //setter method
    public void setName(String str){
        name = str;
    }
    public void setAge(int b){
        age = b;
    }

    //getter method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}
