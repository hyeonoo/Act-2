
/*
    FileName : MethodSyntaxTestApp.java
    - Bean(POJO)인 MethodSyntax.class를 사용하는 Application class

    # POJO ??
        - Plain Old Java Object : 오래된 방식의 간단한 자바 오브젝트, 
        - java EE 등의 중량 framework들을 사용하게 되면서 해당 framework에 종속된 '무거운' 객체를 만들게 된 것에 반발해서 사용하게 된 용어!!
        ==> 특정 JAVA model이나 기능 framework 등을 따르지 않는 java object를 지칭하는 말로 사용.
        (간단히 정리만..)
*/
public class MethodSyntaxTestApp {
    ///Field
    ///Method
    ///Main
    public static void main(String[] args){

        //MethodSyntax.class를 사용(Instance 생성 :: new 연산자 사용)
        MethodSyntax methodSyntax = new MethodSyntax();

        // methodSyntax 식별성을 갖는 Instance의 method를 . 연산자로 접근 사용
        System.out.println("\n==========================");
        methodSyntax.browserOn();

        System.out.println("\n==========================");
        boolean result = methodSyntax.documentWork();
        System.out.println("doc작업유무 : "+result);

        System.out.println("\n==========================");
        int value = methodSyntax.sum(1,1);
        System.out.println("계산 결과값 : "+value);
        //==> 위의 두라인을 아래와 같이 표현했다. 주석풀고 출력결과 확인해보기
        //System.out.println("계산 결과값 : "+methodSyntax.sum(1,1));

        System.out.println("\n==========================");
        String name = methodSyntax.getName();
        System.out.println("Field정보 name : "+name);
        //==> 위의 두라인을 아래와 같이 표현했다. 주석풀고 출력결과를 확인하면?? 
        //System.out.println("Field 정보 name : "+methodSyntax.getName());

        System.out.println("\n==========================");
        String add = methodSyntax.getAdd();
        System.out.println("Field 정보 add : "+add);
        //System.out.println("Field 정보 add :"+methodSyntax.getAdd());

        System.out.println("\n==========================");
        String[] info = methodSyntax.getAllInformation();
        System.out.println("Field 정보 모두 출력");

        for(int i=0; i<info.length; i++){
        //for(int i=0; i<2; i++){   // info.length의 사용과 2의 차이점은??
            //==> 같은 결과 (info.length == info[0],info[1] ->2개)
            System.out.println((i+1)+" 번째 정보 : "+info[i]);
        }
    }
    
}
