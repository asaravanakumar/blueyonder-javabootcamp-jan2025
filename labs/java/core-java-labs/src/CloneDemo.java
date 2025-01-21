public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        RaceCar car1 = new RaceCar();
        car1.id = 100;
        car1.color = "White";

        RaceCar car2 = (RaceCar) car1.clone();
//        RaceCar car2 = car1;
        System.out.println(car2.id);
        System.out.println(car2.color);

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        RaceCar car3 = new RaceCar();
        car3.id = 101;
        car3.color = "Black";

        System.out.println(car1 == car3); // false
        System.out.println(car1.equals(car3)); // false

        System.out.println(car3.hashCode());
    }
}
