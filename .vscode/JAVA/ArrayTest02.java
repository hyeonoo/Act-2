
/*
    FileName : ArrayTest02.java
    1. 2차원 Array(? : 배열의 배열!!) ==> 1차원(?), 2차원(?) 배열의 사용
*/
public class ArrayTest02 {

    ///main method
    public static void main(String[] args){

        //int Data Type의 배열의 배열(2차원 배열)을 생성
        int[][] value = new int[9][9];

        //index를 이용 value의 값 접근 및 대입
        for(int i=0; i<9; i++){
            value[0][i] = 1*(i+1);
        }

        //입력된 값을 출력
        //==> value.length / value[j].length의 의미를 이해
        //==> value[0][0]~value[0][9]까지의 출력값을 확인
        //==> 그 이외 값들은 ? (<== 배열은 생성시 자동 초기화됨을 확인)
        for(int j=0; j<value.length; j++){
            
            System.out.println("=======================");

            for(int k=0;k<value[j].length; k++){
                System.out.println("value["+j+"]["+k+"] = "+value[j][k]);
            }
        }

        /*
            Ex. int[][] c = new int[2][3]; 일때
                c.length = 2가 되고, c[0].length=3, c[1].length=3이 된다.(그림으로 그려서 생각하면 이해가 잘된다.)
            #가변배열 : 아직 정해지지않아 변할수 있는 배열
                    Ex. int[][] c = new int[2][];
                        c.length = 2;이고
                        c[0] = new int[1], c[1] = new int[4] 처럼 두번째 []은 정해재지 않았기에 배열을 부여할수 있다.

            # camal case : 대소문자를 구분하는 ==> 첫 알파벳이 대문자인지 소문자인지 구분한다면 class인지 variable인지 구분이 가능하다.
        */
    }
    
}
