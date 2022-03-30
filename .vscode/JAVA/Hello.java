
/*
*   FileName : Hello.java
*/

public class Hello{

    // ==> 1줄 주석 : compile시 주석문은 compile시 제외된다. 
    // java 실행에 필요한 method : main method

    public static void main(String[] args){
        
        System.out.println("Hello JAVA :: 안녕 자바");
    }//end of main 
}//end of class 

/* ==> 다줄문 주석 : compile시 제외 

    << 주의사항 및 약속사항 >> 
    1. class name과 file name은 동일해야 한다!! 
        ex. public class Hello 라면 ==> Hello.java (File Name)
    2. 대소문자를 구별해야한다. 
    3. 실행시 public static void main(String[] args) 필요하다.
    4. System.out.println( ~~~ ) : '~~~' 을 console에 출력한다. 
    5. Hello.java compile 후 Hello.class(ByteCode) 생성된다. (확인해보기)
    
    << Console(DOS 화면)에서 compile & run >>
    1. File save
     # FileName : Hello.java ==> FileName과 ClassName은 동일하다. 
    2. Compile
     1) file 저장 후 directory로 이동 후 compile ==> javac 확장자 포함 FileName
        c:\work>javac Hello.java 입력시 compile 된다.
         ( work file은 학원에서 사용했던 파일 )
     2) classFile 생성 확인 ==> byte code 생성확인(Hello.class)
        c:\work>dir
    3. Run(실행)
      1) run ==> java 확장자를 제외한 FileName
        c:\work>java Hello
*/