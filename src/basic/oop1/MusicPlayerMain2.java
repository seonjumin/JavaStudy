package basic.oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args){
        //절차지향 프로그래밍이지만 데이터를 따로 뽑아 클래스를 만듦
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        data.isOn = true; //속성(데이터)가 따로 분리되어 불러와서 사용하므로 더이상 '자신'의 데이터가 아니다. ->data.을 붙여야한다.
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+ data.volume);

        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+ data.volume);

        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨: "+data.volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨:"+ data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }

        //음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
