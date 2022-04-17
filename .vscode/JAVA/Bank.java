
/*
    FileName : Bank.java

    1. abstract class는 interface(기능의 정의)와 달리 일반 공유 method와 Field를 갖을 수 있다.
*/

public abstract class Bank {

    ///Field
    private String name;

    ///Constructor
    public Bank(){
    }
    public Bank(String name){
        this.name=name;
    }

    ///Method
    //은행명을 출력하는 display method를 추상 Method로 정의
    public abstract void display();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
}//end of class
