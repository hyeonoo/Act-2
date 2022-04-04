
/*
    FileName : MethodSyntax.java
    1. OOP  : Message
    2. OOPL : Method
    - 객체간의 행위를 정의하는 Method 문법
    - OOP에서 Message(Method)란 객체간 data를 전달 또는 받을 수 있는 수단
    - OOP는 객체간 Message 전송으로 필요한 데이터를 넘기거나 결과 데이터를 받을 수 있다. 
    - OOP는 객체와 객체간 통신은 method 호출
*/
public class MethodSyntax {

    ///Field
    String name = "홍길동";
    String add = "한양";

    ///Method
    //==> 브라우저를 켜는 행위 정의
    public void browserOn(){                    // 1. void ==> Method를 실행해도 return값이 없다.
        System.out.println("browser를 켜다.");
    }    
    //==> 작업을 하고 작업유무를 boolean type으로 return하는 행위
    public boolean documentWork(){              // 2. Data Type의 return값 있는 경우 -> method 실행시 값이 변환된다.
        System.out.println("document작업을 하고 작업완성 유무를 boolean return");
        return true;
    }       // 모든 값은 Data Type을 가지기 때문에 그 type에 맞춰 method에 data type을 써주고 그 값을 호출하는 method도 같은 data type의 변수를 이용해 받는다. 
    //==> 두개의 정수를 받아 합을 return하는 행위
    public int sum(int i, int j){
        System.out.println("<<"+i+">> 와 <<"+j+">> 값을 받아 합 return");
        return(i+j);
    }

    /*
    # get, set Method
        - class에는 Field가 담겨있고, 이 Field는 캡슐화되어있어 우리가 알 수 없다. 
        ===> get, set 통해 알아내야 한다. 
        - 모든 bean class에는 Field가 있으면 그에 상응하는 get, set method가 존재한다. 
        - get method 단점 : 값을 하나씩 밖에 못불러오기때문에 -> getAllInformation(모든 정보 담는다) 활용
    */

    //==> 이름을 return하는 행위
    public String getName(){
        System.out.println("이름을 전달합니다.");
        return name;
    }
    // 주소를 return하는 행위
    public String getAdd(){
        System.out.println("주소를 전달합니다.");
        return add;
    }
    //==> 이름, 주소 두가지 정보(상태값)를 Array DataType return하는 행위
    public String[] getAllInformation(){            // 3. method에 전달되는 인자 여러개라면 ??? ==> getAllInformation method이용하여 인자 여러개 전달가능 
        String[] str = {name, add};
        //String[] str = {"홍길동", "한양"};
        return str;
    }
    
}
