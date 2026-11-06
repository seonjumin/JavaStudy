package start.array;

public class ArrayDi1 {
    public static void main(String[] args){
        // 3x3 2차원 배열을 만든다.
        int[][] arr = {
                    //new int[][] =>생략가능.
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; //행3, 열3 (row, column)

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
