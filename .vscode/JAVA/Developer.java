
/*
    FileNmae : Developer.java   // ==> Bean Class 구현

    # Class => 두가지로 
        1. Bean Class : 현실세계를 구현하는 Class, Field와 Method를 가지고 있다.
        2. Application Class : 실행시키는 Class, Main Method를 가지고 있다. 

    # 만들고 싶은 객체 => 그 목적에 맞는 view Point를 가지고 추상화를 시작한다. 
        Ex. 회사 안의 사원을 객체로 !!
            => 두 가지로 특징을 구분 
                명사 : 직급, 입사일, 연봉, 업무 => Static Modeling(정적인 모델링)
                등사 : 일하기 => Dynamic Modeling(동적인 모델링)

            # Object Modeling = Static Modeling + Dynamic Modeling을 구현

            ==> 이를 구현하는 class ------>  Bean Class!!

    :: 강의 활동과 개발을 병행하는 홍길동을 Object Modeling
    1. 홍길동의 명사화가 가능한 것 : attribute ==> Field
    2. 행위에 해당하는 사항 : behavior ==> Method
    이를 java Language로 구현
*/

public class Developer {

    ///Field ==> 특성, 속성(attribute) 표현
    String name = "홍길동";
    String job = "개발자";
    int avgIncome = 100;
    int projectCareer;  //<== Field 선언만 한 경우(변수를 선언만 한 경우) 초기화 유무는?

    ///Method ==> 기능,행위(behavior) 표현
    /*
        project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
        1. income을 1증가 
        2. projectCareer를 1증가
        행위
    */
    public void participateProject(){
        System.out.println("program개발로 수입증가, 경력쌓음"); // Method가 실행됬음을 알려주는 출력문을 써주자 !!
        avgIncome++;
        projectCareer++;    //==> 행위로 인한 상태변화
    }
    /*
        강의를 통해 수입의 증가
        1. income을 1증가 
        행위
    */
    public void instruct(){
        System.out.println("강의를 통한 수입증가"); // Method가 실행됬음을 알려주는 출력문을 써주자 !!
        avgIncome++;
    }

}
