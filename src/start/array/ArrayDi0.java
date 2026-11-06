package start.array;

public class ArrayDi0 {
    public static void main(String[] args){
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //행2, 열3 (row, column)

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][2] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        //arr[0][3] = 7; // 오류는 안 뜸. but 작동시 예외뜸.
        // 배열의 순서는 상관없고 갯수만 맞으면 작동한다.

        System.out.print(arr[0][0]+" ");
        System.out.print(arr[0][1]+" ");
        System.out.print(arr[0][2]);
        System.out.println();
        System.out.print(arr[1][0]+" ");
        System.out.print(arr[1][1]+" ");
        System.out.print(arr[1][2]);
    }
}
