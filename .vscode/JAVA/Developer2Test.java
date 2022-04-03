
/*
    FileName : Developer2Test.java
    ==> Developer2.class를 Instance 생성 사용하는 class 정의 :: Application class 정의
*/
public class Developer2Test {
    ///Field
    ///Method
    ///Main Method
    public static void main(String[] args){

        // Developer2.class를 Instance 생성
        Developer2 developer = new Developer2();

        // developer 식별성을 갖는 Instance .연산자를 통해 사용
        System.out.println("이름은 : "+developer.name); //developer2 에서 name을 private로 해놓으면 error
        System.out.println("직업은 : "+developer.job);
        System.out.println("평균수입은 : "+developer.avgIncome);
        System.out.println("PJT경력은 : "+developer.projectCareer);

        System.out.println("========================");

        //method를 호출하여 행위를 통해 상태값 받아 출력하면??
        String name = developer.getName();
        String job = developer.getJob();
        int avgIncome = developer.getAvgIncone();
        System.out.println("이름은 : "+name);
        System.out.println("직업은 : "+job);
        System.out.println("평균수입은 : "+avgIncome);
        //아래의 내용 이해해보기 
        System.out.println("PJT경력은 : "+developer.getProjectCareer());
    }
    
}
