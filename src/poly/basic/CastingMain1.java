package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //자식 기능은 호출할 수 없다.

        Child child = (Child) poly;
        child.childMethod();
    }
}
