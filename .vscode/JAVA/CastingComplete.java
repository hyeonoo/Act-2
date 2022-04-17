
/*
    FileName : CastingComplete.java
    1. Primitive type 형변환(묵시적/명시적) : data의 크기
    2. Reference type 형변한(묵시적/명시적) : 개념의 크기(추상화 정도)
        : 중요 : 객체의 형변환 조건 : ~ is a ~ Relationship
*/

// 상위 class Super 정의 
class Super{
    //Method
    public void a(){
        System.out.println("Super : a()");
    }
}// end of class

// 상위 class Super를 상속 받는 하위 class Sub 정의
class Sub extends Super{
    ///Method
    public void a(){
        System.out.println("overriding된 Sub : a()");
    }
    public void b(){
        System.out.println("sub : b()");
    }
}//end of class

public class CastingComplete {

    ///main method
    public static void main(String[] args){

        //1. 상위 class Instance 생성(Data type == Instance의 경우)
        System.out.println("\n여기는 Super s1 = new Super() 부분");
        Super s1 = new Super();
        s1.a();

        //2. 하위 class Instance 생성(Data type == Instance의 경우)
        System.out.println("\n여기는 Sub s2 = new Sub() 부분");
        Sub s2 = new Sub();
        s2.a();
        s2.b();

        //3. 상위 data type으로 하위 Instance 생성(Data type != Instance)
        System.out.println("\n여기는 Super s3 = new Sub() 부분" );
        Super s3 = new Sub(); //<== 묵시적 형변환
            // 자식class instance 화
            // but 변수 type이 부모라서 자식에게만 있는 메소드는 사용 불가(부모 class가 자식만 가지고 있는 method를 가지고 있지 않기 때문이다.)
            // 다만 자식이 overriding한 method는 사용 가능하다.
        s3.a();
        //아래의 사항은 error가 발생한다. s3는 b()을 참조할수 없다 (왜?? 이해하기!!)
        //s3.b();
        //s3.a()를 사용하려면 ==> casting 연산자 (명시적 형변환 이용) 사용(즉 자신의 원상태 복귀(??))
        System.out.println("\n s3는 b()에 접근 불가하다.");
        System.out.println("casting 연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
        Sub sub = (Sub)s3;      //<== casting 연산자 이용 명시적 형변환
        sub.b();

        //4. 하위 data type으로 상위 Instance 생성(Data type != Instance)
        //error 부위(하위referenc 변수는 상위 Instance를 reference 할 수 없다.)
        //Sub s4 = new Super();
    }
}
