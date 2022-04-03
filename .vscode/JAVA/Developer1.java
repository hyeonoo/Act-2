
/*
    FileName : Developer1.java

    :: 강의활동과 개발을 병행하는 홍길동을 Object Modeling
    1. 홍길동의 명사화 가능한 것 : attribute ==> Field
    2. 행위에 해당하는 사항 : behavior ==> Method
    ===================================================
    :: 추가적인 사항 (Polymorphism 지원 ==> Method OverLoading)
    3. 참여한 project의 name을 표기 할 수 있는 행위 추가 
    4. 강의 수에 따른 income의 정도를 명시 할 수 있는 행위 추가 

    # Method OverLoading ?? (= Overloading)
        : 한 class내에 같은 이름의 method를 여러개 정의하는 것 
          하나의 Method 이름으로 여러 기능을 구현
          
          *조건
            1. method 이름이 같아야 한다. 
            2. 매개변수의 개수 또는 type이 달라야 한다. 
            (Method의 이름이 같다 하더라도 매개변수가 다르면 서로 구분될 수 있기 때문에 overloading 가능!!)

*/
public class Developer1 {

    ///Field ==> 특성, 속성(attribute) 표현
    String name = "홍길동";
    String job = "개발자";
    int avgIncome = 100;
    int projectCareer;  // <== Field 선언만 한 경우(변수를 선언만 한 경우) 초기화 유무는 ??

    ///Method ==> 기능, 행위(behavior) 표현
    /*
        project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
        1. income을 1 증가 
        2. projectCareer를 1증가 
        행위
    */
    public void participateProject(){
        System.out.println("program개발로 수입증가, 경력쌓음");
        avgIncome++;
        projectCareer++;
    }
    /*  ================= 추가된 method(OverLoading Method)=======================
        project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
        1. income을 1증가 
        2. projectCareer를 1증가 
        행위 및 참여 project의 name을 디스플레이하는 행위
    */
    public void participateProject(String project){
        System.out.println(project+"==> project 참여로 수입증가, 경력쌓음");
        avgIncome++;
        projectCareer++;
    }
    /*
        강의를 통해 수입의 증가 
        1. income을 1증가 
        행위
    */
    public void instruct(){
        System.out.println("강의를 통한 수입 증가 ");
        avgIncome++;
    }
    /*  ================= 추가된 method(OverLoading Method)=======================
        강의를 통해 수입의 증가 
        1. 강의수에 따라 income을 증가 
        행위
    */
    public void instruct(int lectureCount){
        System.out.println(lectureCount+": 개 강의를 통한 수입증가");
        avgIncome += lectureCount;
    }
    
}
