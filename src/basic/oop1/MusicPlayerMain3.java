package basic.oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args){
        //절차지향 프로그래밍이지만 "내부에" 메서드를 만들어 모듈화시킴.
        // *장점*
        // 로직 중복 제거 / 기능 수정시 해당 메서드 내부만 변경하면 됨
        // 메서드 이름을 통해 코드를 쉽게 이해가능.
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);

    }
    static void on(MusicPlayerData data){ //외부에 있는 데이터를 가져와서 사용하므로 파라미터가 필요함
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+ data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨: "+ data.volume);
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨:"+ data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}

//절차지향의 한계
// 데이터(클래스 안에)와 기능(메서드)가 분리되어있다.
// 유지보수 시에 두곳을 수정해야 함.
