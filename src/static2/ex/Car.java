package static2.ex;

public class Car {

    String name;
    static int total;

    public Car(String name){
        this.name = name;
        total++;
        System.out.println("차량 구입, 이름:"+name);
    }

    static void showTotalCars(){
        System.out.println("구매한 차량 수: "+total);
    }
}
