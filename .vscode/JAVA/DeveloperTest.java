
/*
    FileName : DeveloperTest.java   ==> Application Class
    :: Developer.class Instance 생성, 사용하는 class 정의 : Application class
*/
public class DeveloperTest {

    ///Field
    ///Method
    ///Main Method
    public static void main(String[] args){

        //Developer.class를 instance화 함(keyword new 사용)
        //developer라는 변수를 만들고 그 안에 Developer Class를 Instance화 
        //여기서 Developer Class를 불러올 수 있는 이유는 class path 설정 떄문!! 
        Developer developer = new Developer();

        // developer 식별성을 갖는 instance. 연산자를 통해 사용
        System.out.println("이름 :"+developer.name);
        System.out.println("직업 :"+developer.job);
        System.out.println("평균수입 :"+developer.avgIncome);
        System.out.println("PJT경력 :"+developer.projectCareer);

        System.out.println("========================");

        //project에 참여
        developer.participateProject(); // participateProject method가 상태에 영향을 미침으로 (from Developer Bean Class)
        System.out.println("평균수입 :"+developer.avgIncome);
        System.out.println("project 참여 경력 :"+developer.projectCareer);  //==> 1 출력 (from Developer Bean Class)

        System.out.println("========================");

        //1개 과목을 강의 
        developer.instruct();
        System.out.println("평균수입은 :"+developer.avgIncome);
    }
    
}
