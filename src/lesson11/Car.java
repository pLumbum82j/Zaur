package lesson11;

public class Car {
    public String color;
    public String motor;
    public int door;

    public Car(String color, String motor, int door) {
        this.color = color;
        this.motor = motor;
        this.door = door;
    }
}

class CarTest {

    public void changeDoor(Car c, int door) {
        c.door = door;
    }

    public static void changeColor(Car c1, Car c2) {
        String color3 = c1.color;
        c1.color = c2.color;
        c2.color = color3;
    }

    public static void main(String[] args) {
        Car c1 = new Car("red", "v6", 4);
        Car c2 = new Car("black", "v8", 2);
        CarTest ct = new CarTest();
        ct.changeDoor(c1,2);
        System.out.println(c1.door);

                changeColor(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);


    }
}
