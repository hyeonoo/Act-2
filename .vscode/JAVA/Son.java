
/*
    FileName : Son.java
    - Iam.class와 일반화 관계
    - Iam.class와 속성과 행위를 공유하며, 추가적, 구체적인 속성, 행위를 갖는다. 

    # Son class --> Human, Iam, Son 모든 Field, method 사용가능하다. 
        ==> Son class에서 찾고 없으면 Iam class로 가서 찾고 거기에도 없으면 Human class로 올라가서 찾는다.
*/
public class Son extends Iam{

    ///Field
    String school;

    ///Constructor
    public Son(){
        System.out.println("Son class default Constructor");
    }

    ///Method(setter method)
    public void setSchool(String str){
        school=str;
    }

    //getter method
    public String getSchool(){
        return school;
    }

    public static void main(String[] args){
        //1. 아래의 Instance 생성시 출력결과를 확인, 이해
        //2. OOP의 일반화관계인 공유(속성, 행위)를 OOPL에서 어떻게 지원하는지를 이해
        //3. 아래의 주석을 풀고 속성, 행위의 공유를 확인한다.
        Son son = new Son();        // 실행시 Son의 Constructor method가 바로 실행되지 않는다. -> 부모 생성자 먼저 생성!!
                                    // Human Constructor -> Iam Constructor -> Son Constructor 순으로 생성자 실행
                                    // - 계층화 구조로 되어 있으면 가장 상위의 Constructor class부터 생성시켜 메모리에 적재시킨다.
                                    // - 계층화되어 있지 않으면 다형성을 사용할 수 없다, 상속 불가!

      
        son.setName("홍길동아들");          //Name, Age, Job --> 속성 공유!!!
        son.setAge(50);
        son.setJob("개발자준비중");
        son.setSchool("아이티교육센터");
        
        System.out.println("이름 : "+son.getName());
        System.out.println("나이 : "+son.getAge());
        System.out.println("직업 : "+son.getJob());
        System.out.println("학교 : "+son.getSchool());
    
    }
    
}
