package basic.oop1;

public class MusicPlayer {
        //객체지향 프로그래밍 작성하기(캡슐화)
        // 흩어져있던 속성과 기능을 한곳에 모아 객체를 만든다. 음악플레이어 자체가 되는 것.
    // *****어떤 속성(데이터)를 가지고 어떤 기능(메서드)를 제공하는지 이 부분에 초점을 맞추어야한다.

        //*음악플레이어*
        // 속성 : volume, isOn
        // 기능 : on(), off(), volumeUp(), volumeDown(), showStatus()

        int volume = 0;
        boolean isOn = false;

    void on(){  //static이 없네??(차이점은 나중에)
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){ //파라미터에 아무것도 없다. 그 이유는 자기 자신의 데이터를 사용하기 때문
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨: "+ volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨: "+ volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨:"+ volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }

}
