
/*
    FileName : ArrayTest01.java
    1. Array(배열) : 같은 Data Type의 묶음
    2. Reference Data Type의 이해 
    3. new / . keyword 사용
*/

/*
    # Call by Value #
    "값을 다룬다"
    ex. int i = 10;
        int j = i; 일때 
        ==> 변수 i에 10 저장 -> i와 j가 같은 type!!!이기때문에 j =10이 된다. 같은 type!!!! => call by value
*/

/*
    # Call by reference # 
    "주소값을 다룬다"
    ex. int[] a = new int[3];
        int[] b = a; 일때
        ==> 변수 a에 int[3] 배열의 주소값이 저장 -> 같은 정수 배열 type!!! 을 담는 변수 b에도 또한 같은 주소값이 담긴다.
            즉, a,b 둘다 같은 주소값을 가진다. => call by reference
*/

public class ArrayTest01 {

    ///main method
    public static void main(String[] args){

        //1. int Data Type array 선언 ==> int[] intArray; or int intArray[]
        //2. 9개의 int를 저장(관리)할 수 있는 공간을 갖는 array 생성 ==> new int[9];
        //3. 대입연산자 '='를 이용 대입 변수에 9개 공간의 위치 정보 대입 i = new int[9];
        //4. array 선언, 생성, 위치정보 대입을 동시에!!!
        int[] intArray = new int[9];
        //5. 각각의 방에 value 대입
        intArray[0]=1;
        intArray[1]=2;
        intArray[2]=3;
        intArray[3]=4;
        intArray[4]=5;
        intArray[5]=6;
        intArray[6]=7;
        intArray[7]=8;
        intArray[8]=9;

        //==> array 선언, 생성, 위치정보, value 대입을 동시에 하는 다른 방법들
        // int[] intArray = {1,2,3,4,5,6,7,8,9};
        // int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
        
        // 배열의 index를 이용 각각의 value에 접근
        for(int j=0; j<9; j++){
            System.out.println("intArray["+j+"] 값은 :"+intArray[j]);
        }

        // 각각의 값을 이용하여 5단을 출력해보자. intArray.length
        // '.' Operator와 'length' keyword 사용
        System.out.println("============================");
        for(int k=0; k<intArray.length; k++){
            System.out.println("5 X "+intArray[k]+" = "+5*intArray[k]);
        }

        //==> 아래의 출력내용을 이해하자!! (primitive int i=0; 과 비교 이해하면??)
        int[] j = intArray;
        System.out.println("===========================");
        System.out.println("j[0]의 값은 : "+j[0]);
        System.out.println("j[5]의 값은 : "+j[5]);
        // primitive int i=0; ==>ㅂ 변수 i의 저장공간에 0을 저장해두는 것!!!
        /* 반면 int[] a = new int[3]; ==> 1. 'int[]'(int type 배열인 변수명 a 선언) / 'new int[3]'(int type 3개의 저장공간을 가진 배열 생성)
                                     ==> 2. a[0], a[1], a[2] 총 3개의 공간이 생성되며 ---> ## a.length : 공간의 길이(=개수)!!
                                     ==> 3. 각각 10, 20, 30을 저장해두면
                                     ==> 4. a[0] = 10;  a[1] = 20;  a[2] = 30; 
        */
        //==>위의 출력을 이해하였다면 아래의 주석 풀고 출력결과를 확인해보기!!
        j[5] = 1234;
        System.out.println("f[5]==> "+j[5]);
        System.out.println("i[5]==> "+intArray[5]);
    }
    
}
