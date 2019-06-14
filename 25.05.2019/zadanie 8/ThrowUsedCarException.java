import java.util.ArrayList;

public class ThrowUsedCarException {

    public static void main(String[] args) {

        try{
            UsedCar[] cars = new UsedCar[7];

            cars[0] = new UsedCar(1111, "Honda", 1997, 10000, 1000.00);
            cars[1] = new UsedCar(2222, "Ford", 1998, 20000, 2000.00);
            cars[2] = new UsedCar(3333, "Toyota", 1999, 30000, 3000.33);
            cars[3] = new UsedCar(4444, "Chrysler", 2000, 40000, 4000.44);
            cars[4] = new UsedCar(5555, "Other", 2001, 50000, 5555.55);
            cars[5] = new UsedCar(6666, "Other", 2002, 60000, 6000.00);
            cars[6] = new UsedCar(7777, "Other", 2003, 70000, 7000.69);

            for (int i = 0; i < cars.length; i++){
                System.out.println(cars[i]);
            }
        }
        catch(UsedCarException error){
            System.out.println(error.getMessage());
        }
    }

}