public class CalculationTest {

    ///main method
    public static void main(String[] args){     
    // 이 main method는 java application 실행시 제일먼저 동작하고 어느 객체에서든 접근할수 있고 java가 compile되는 순간 정의되는        돌려주는값이 없는 함수구나 !
       
        /* main method??
            main method는 program을 run하게 되면 main method의 {}내부가 가장 빠르게 먼저 실행되는 지점이며,
            반드시 한개의 main method가 존재해야한다. (한개 이상 x)
            
            <처음접하면 이해가 안되니 간단히 >
            #public - 접근제어자(외부에서 접근할 수 있는 일종의 제약)
                    - 어느곳에서든 해당 객체를 참조할수 있다. 
            
            #static - 정적 함수(??) -> 가만히 있어도 되는??
                    - static으로 함수 또는 class를 선언했을 경우 해당 객체는 java가 compile되는 순간 정의가 된다. 
                       그리고 이후 static이 아닌 객체가 정의가 되는데 --> static객체에서 static이 아닌 객체를 호출하는것을 불가능!!

            # void  - '단순히 실행한다..' 
                    - 별도로 return(돌려주는)값을 만들지 않고 실행만하고 끝난다.
                    - ex. void자리에 int 넣을경우 어떠한 처리를 실행한 후 int type data를 돌려보내겠다, String일 경우 String type data를 돌려보내겠다는 의미.
            
            # String[] - String -> 문자열 의미, " "안에 들어가는 문자들의 집합 즉! "Hello World"와 같은 data type을 String이라는 class변수로 정의하겠다는 의미!
                       - [] -> 배열!, 연속적인 data를 하나의 변수에 넣고싶을때 즉 배열에는 index가 있고 [0], [1], [2]와 같이 index로 구분되는 공간에 data를 넣겠다는 의미!
                       
            # args - 단순 변수명

            args = new String[3]; // 3개의 저장공간을 가진 배열 초기화
            args[0] = "Hello";    // 배열의 첫번째 공간에 data입력
            args[1] = "World";    // 배열의 두번째 공간에 data입력
            args[2] = "JAVA";     // 배열의 세번째 공간에 data입력

            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        */

        int a;      // int data type variable 'a' declaration
        a = 0;      // int data type variable 'a'에  value값 대입
        int b = 1;  // int data type variable 'b' declaration과 동시에 value값 대입
        int c = 2;

        //변수의 값을 출력 (문자 '+'연산자 사용 ==> append)
        int sum = a+b+c;
        System.out.println("sum ="+sum);
        System.out.println("a+b+c ="+(a+b+c)); //아래 실행문과 출력 비교
        System.out.println("a+b+c ="+a+b+c);

        c = c+10;
        System.out.println("c=(c+10) :"+c);

        //연산후 대입연산자(+=)사용 < 'c=c+10'과 동일한 의미 >
        c += 10;
        System.out.println("c+=10 = "+c);

        //논리반전연산자
        boolean boo1 = true;
        boolean boo2 = ! boo1;

        System.out.println("boo1 :"+boo1);
        System.out.println("boo2 :"+boo2);
    
    }
    
}
