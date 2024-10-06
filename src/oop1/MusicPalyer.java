package oop1;

public class MusicPalyer {

    int volumn = 0;
    boolean isOn = false;

   void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

   void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

   void volumnUp() {
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);
    }

   void volumnDown() {
        volumn--;
        System.out.println("음악 플레이어 볼륨: " + volumn);
    }

    void showStatus( ){
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volumn);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
