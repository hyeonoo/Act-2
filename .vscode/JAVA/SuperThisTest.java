
/*
    FileName : SuperThisTest.java
    ==> 상위의 Method, Field 호출 할 수 있는 예약어(Keyword) super
    ==> 하위의 Methid, Field 호출 할 수 있는 예약어(Keyword) this

    # super와 this -> 참조값을 가지고 있기 때문에 reference로 부르는게 정확하다. 
    (field, method -> 식별성을 가지고 불러와야한다.)

    # 부모 class의 name, 자식 class의 name 동시에 존재한다면??
    => 자식 class의 name출력 (값이 덮어 씌여졌기 때문에)
    but 부모 class의 name값을 가져오고 싶다?
        -> 부모의 class의 Instance 역할을 하는 "super" 사용하여 super.name 입력하면 된다. 
*/

class JuniorHighSchool {
    ///Field
    String name = "대한민국중학교";

    ///Constructor
    public JuniorHighSchool(){
    }

    ///Method
    public void schoolName(){
        System.out.println("중학교 이름 : "+name);
    }
}

class HighSchool extends JuniorHighSchool{
    ///Field
    String name = "대한민국고등학교";

    ///Constructor
    public HighSchool(){
    }

    //Constructor O/R
    public HighSchool(String str){
        name=str;
    }
    //==> 위의 생성자와 아래의 생성자를 readability 측면에서 살펴보면...
    //public HighSchool(String name){
    // this.name = name;    // ==> 결과는 name=str과 같지만 가독성이 더 좋아진다.!! 
                            // 왜?? (this.)name 처럼 this가 생략된 것이기때문에 
    //}

    ///Method
    public void schoolName(){
        System.out.println("중학교 이름 :"+super.name);
        System.out.println("고등학교 이름 :"+this.name);
        System.out.println("고등학교 이름 :"+name);
        // 여기서 this.name == name 같은 결과 --> 정확한 표기방식은 this.name 이지만 this.이 생략되어 name으로 쓰는것 뿐.
    }
}

public class SuperThisTest{

    ///Main Method
    public static void main(String[] args){

        HighSchool hs01 = new HighSchool();
        hs01.schoolName();

        System.out.println("========================");

        HighSchool hs02 = new HighSchool("서울고등학교");
        hs02.schoolName();
    }
}
