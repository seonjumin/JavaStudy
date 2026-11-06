package start.variable;

public class Var8 {

    public static void main(String[] args){
        //정수
        byte b = 127; //-128 ~ 127 (1byte) 파일전송, 파일복사 등에 주로 사용.
        short s = 32767; // -32,768 ~ 32,767 (2byte)
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억) (4byte)
        long l = 9223372036854775807L;
        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte)
        long z = 2147483648L;  //큰곳에 작은 숫자 넣을 수 있음.

        //실수
        float f = 10.0f; //(4byte)
        double d = 10.0; //(8byte)
    }
}
