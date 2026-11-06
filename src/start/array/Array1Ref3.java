 package start.array;

public class Array1Ref3 {
    public static void main(String[] args){
        int[] students = new int[]{90,80,70,60,50}; //(방5개짜리) 배열 생성과 초기화
        //int[] students = new int[5]{90,80,70,60,50};
        //int[] students = {90,80,70,60,50};
        //변수 값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

        //변수 값 사용
                    // i < students.length;
        for(int i=0; i<=4; i++){
            System.out.println("학생"+ (i+1) + " 점수:"+ students[i]);
            //                    학생 + i + 1 => 문자 + 숫자는 숫자를 문자취급해서 학생11이라고 출력됨.
        }
    }
}
