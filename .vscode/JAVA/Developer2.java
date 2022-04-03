
/*
    FileName : Developer2.java

    :: 강의활동과, 개발을 병행하는 홍길동을 Object Modeling
    1. 홍길동의 명사화 가능한 것    : attribute ==> Field
    2. 행위에 해당하는 사항        : behavior ==> Method
    3. 참여한 project의 name을 표기 할 수 있는 행위 추가 
    4. 강의 수에 따른 income의 정도를 명시 할 수 있는 행위 추가 
    ==================================================
    추가적인 사항
        1. Field 정보를 return하는 행위를 행하는 getter method 정의
            (객체의 attribute는 information hiding(Encapsulation)되어 있으며,
             행위를 통해서 information hiding 되어 있는 정보에 접근할 수 있다.)

    OOP의 information hiding 중 정보은익의 개념에서 getter method의 의미를 확인
    ==> 추후 information hiding 지원하는 access Modifier 다시 정리 할 것 
*/
public class Developer2 {
    
    ///Field==> 특성, 속성(attribute) 표현
    //private String name = "홍길동";
    String name = "홍길동";
    String job = "개발자";
    int avgIncome = 100;
    int projectCareer;  //<== Field 선언만 한 경우(변수를 선언만 한 경우)초기화 유무는 ??

    ///Method ==> 기능, 행위(behavior) 표현
    /*
        project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
        1. income을 1 증가 
        2. projectCareer를 1 증가 
        행위
    */
    public void participateProject(){
        System.out.println("program개발로 수입증가, 경력쌓음");
        avgIncome++;
        projectCareer++;
    }
    /*  ======================= 추가된 method(OverLoading Method) =======================
        project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
        1. income을 1 증가 
        2. projectCareerr를 1 증가 
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
        System.out.println("강의를 통한 수입증가");
        avgIncome++;
    }
    /*  ====================== 추가된 method(OverLoading Method) ==========================
        강의를 통해 수입의 증가
        1. 강의수에 따라 income을 증가
        행위
    */
    public void instruct(int lectureCount){
        System.out.println(lectureCount+" : 개 강의를 통한 수입증가");
        avgIncome += lectureCount;
    }

    /////////////////////////// 추 가 된 부 분 ////////////////////////////////////
    /*
        상태값을 return하는 행위 (getter method)를 정의
        ==> 객체의 모든 정보는 Encapsulation 되어 있으며
        ==> 행위를 통해 Encapsulation 되어 있는 상태값에 접근할 수 있다. 
        
        Encapsulation(캡슐화)
            : Field선언시 그냥 선언만 하면 누구나 class를 Instance화 해서 Field의 정보를 가져갈 수 있다. 
            but Id나 password같은 중요한 개인정보가 Field에 담겨있다면 정보유출에 큰 문제가 된다. 
                    ==> 따라서 get method와 private(접근제어자)가 필요!!
    */
    public String getName(){
        System.out.println("getName() method");
        return name;
    }
    public String getJob(){
        System.out.println("getJob() method");
        return job;
    }
    public int getAvgIncone(){
        System.out.println("getAvgIncome() method");
        return avgIncome;
    }
    public int getProjectCareer(){
        System.out.println("getProjectCareer() method");
        return projectCareer;
    }
}

