package static2;

import static static2.DecoData.*;
public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData data3 = new DecoData();
        data3.staticCall(); //좋지 않음. 왜냐면 스태틱 메서드인데 인스턴스 소속 메서드인거 같음

        DecoData.staticCall();

    }
}
