package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
       Child child = new Child();
       Parent parent1 = (Parent) child;
       Parent parent2 = child; //생략해서 써야함

       parent1.parentMethod();
       parent2.parentMethod();
    }
}
