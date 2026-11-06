package start.loop;

public class Nested1 {
    public static void main(String[] args){
        for(int i = 0; i<2; i++){
            System.out.println("외부 for 시작 i:"+i);
            for(int j = 0; j<3; j++){
                System.out.println("-> 내부 for "+ i + "-" + j);
                for(int z = 0; z<3; z++){
                    System.out.println("--> 내내부 for "+i+"-"+j+"-"+z);
                }
                System.out.println("-> 내부 for 종료 j:"+j);
            }
            System.out.println("외부 for 종료 i:"+i);
            System.out.println();
        }
    }
}
