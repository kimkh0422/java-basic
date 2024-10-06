package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car K3Car = new K3Car();
        driver.setCar(K3Car);
        driver.drive();

        Car Model3Car = new Model3Car();
        driver.setCar(Model3Car);
        driver.drive();
    }
}
