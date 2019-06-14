public class UsedCar {

    private int vinNumber;
    private String make;
    private int year;
    private int mileage;
    private double price;

    public UsedCar(int vinNumber, String make, int year, int mileage, double price) throws UsedCarException{

        //not 4 digits
        if(vinNumber < 1000 || vinNumber > 9999)
            throw new UsedCarException("Error: VIN is not 4 digits");

        if(!("Ford".equals(make) ||
                "Honda".equals(make) ||
                "Toyota".equals(make) ||
                "Chrysler".equals(make) ||
                "Other".equals(make)))
            throw new UsedCarException("Error: Make");

        //between 1997 and 2017
        if(year < 1997 || year > 2017)
            throw new UsedCarException("Error: Year");

        //not negative
        if(mileage < 0)
            throw new UsedCarException("Error: Mileage must be > 0");

        //not negative
        if(price < 0)
            throw new UsedCarException("Error: Price must be > 0");

        this.vinNumber = vinNumber;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return vinNumber + "; " + make + "; " + year + "; " + mileage + "; " + price;
    }
}
