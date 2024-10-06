package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
       MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        data.volumn++;
        System.out.println("음악 플레이어 볼륨: "+data.volumn);

        data.volumn++;
        System.out.println("음악 플레이어 볼륨: "+data.volumn);

        data.volumn--;
        System.out.println("음악 플레이어 볼륨: "+data.volumn);

        System.out.println("음악 플레이어 상태 확인");

        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" +data.volumn);
        }else {
            System.out.println("음악 플레이어 OFF");
        }
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
