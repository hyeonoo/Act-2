
/*
    FileName : ObjectTest.java

    ==> static modifier 이해
    1. 상태와 무관한 상태값 (?)
    2. 상태와 무관한 행위 (?)

    ==> ObjectTest.class 실행시 출력결과를 예측 실행 비교
    ==> static : 클래스로 생성된 인스턴스들이 모두 공유하는 속성, 행위
                : ClassName.~~ 접근 가능
    
    ## Static - 클래스의 , 공통적인  [멤버변수, 메서드, 초기화 블럭에서 사용가능]
        : 객체지향의 대명제를 무시하는 keyword, 객체는 서로 다른 상태를 가진다가 아닐수도 있는 경우를 구현한다. (상태와 무관하다.)
        : 인스턴스 변수는 하나의 class로부터 생성되었더라도 각기 다른 값을 유지하지만, 클래스변수(static멤버변수)는 인스턴스에 관계없이 
          같은 값을 갖는다!! ==> 하나의 변수를 모든 인스턴스가 공유하기 때문에!!
        1. Static Field는 공유의 개념
        2. 객체지향의 대명제. method는 field를 건드린다. but!! 이것도 건드리지 않을수 있다.
           ex. Math class의 abs()는 절대값을 return하는데 Math class에 있는 field값을 건드리지 않는다. 인자로 받은 것만 절대값으로 바꾸고 
               return하기 때문에 상태만 건드리지 않고 기능만 수행하는 것. 서로 다른 객체를 건드리지 않으니 static으로 표현 가능.
*/
public class ObjectTest {

    ///Field
    int i;
    static int j;

    ///Static Block
    static{
        System.out.println("A> : j = "+j);
        j=1;
        System.out.println("B> : j = "+j);
    }

    ///constructor
    public ObjectTest(){
        System.out.println("ObjectTest default Constructor :: C> : i ="+i);
    }

    ///method(instance method)
    public void printInstanceInt(){
        System.out.println("D> : i ="+i);
    }
    ///static method (OR class method)
    public static void printClassInt(){
        System.out.println("E> : j = "+j);
    }

    ///main method
    public static void main(String[] args){

        System.out.println("|=================|");
        ObjectTest obj1 = new ObjectTest();
        obj1.printInstanceInt();
        obj1.printClassInt();
        System.out.println("|=================|");
        ObjectTest.printClassInt();

        //==> 위의 출력결과를 이해한다면 아래를 주석풀고 실행하고 결과 예측해보기 
        
        System.out.println("|===================|");
        ObjectTest obj2 = new ObjectTest();
        obj2.i = 100;
        System.out.println("obj2.i = "+obj2.i+" : obj1.i = "+obj1.i);

        System.out.println("|======================|");
        obj2.j = 3333;
        System.out.println("obj2.j = "+obj2.j+ " : obj1.j = "+obj1.j);
        System.out.println("ObjectTest.j = "+ObjectTest.j);
    
        // i는 초기화를 해주지 않았기 때문에 그대로 0이 출력되고
        /* j는 1로 초기화를 해주었고,  j의 제어자가 static으로 선언되었기 떄문에
           j는 obj1이든 obj2이든 '똑같은 상태'라는 점에서 
          obj2.j에서 3333이 j에 저장되었기 때문에 obj1.j가 3333이 출력된것같다.
        */
    }
    
}
