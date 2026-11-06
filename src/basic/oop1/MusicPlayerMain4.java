package basic.oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args){
        //객체지향 프로그래밍 사용하기.
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();
    }
}
