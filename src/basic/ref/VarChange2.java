package basic.ref;

public class VarChange2 {

    public static void main(String[] args){
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값="+dataA);
        System.out.println("dataB 참조값="+dataB);
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        dataA.value = 20;
        System.out.println("변경 dataA.value =20");
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        dataB.value = 30;
        //dataB는 여전히 dataA의 주소값을 복사하고 있음.
        //그러므로 value의 값을 바꾼 행위는 dataA.value의 값을 바꾼것과 같음.
        System.out.println("변경 dataB.value =30");
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        //dataB가 dataA의 참조값(주소)를 복사하고 있으므로
        // 두개가 가리키고 있는 인스턴스는 현재 정의된 value의 값 단 하나이고
        //그 하나를 dataA와 dataB가 출력하고 있는것이다.
        //그러므로 하나의 value의 값이 바뀌어도 두개의 value값이 바뀐것처럼 보이는 것이다.

    }
}
