package start.array;

public class ArrayDi2 {
    public static void main(String[] args){
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3];

        //값 넣기.
        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++; // 값을 먼저 대입한 다음에 증가한다.
            }
        }

        //값 출력하기.
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
