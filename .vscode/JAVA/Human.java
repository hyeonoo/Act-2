
/*
    FileName : Human.java
    - 추상화수준이 높은, 일반적인 사항을 Modeling Class

    # Inheritance(상속)
    - class들을 Specialization(구체화) 시키면 hierarchy(계층화)가 되어서
      올라갈수록 Generalization(일반화), 내려갈수록 Specailization(구체화) 된다. 
    - hierarchy가 되면 공유라는 객체지향의 개념이 나타나고, 이를 지원하는 java의 keyword ==> extends !!
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
