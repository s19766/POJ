public class UsedCar {

    private int vinNumber;
    private String make;
    private int year;
    private int mileage;
    private double price;

    public UsedCar(int vinNumber, String make, int year, int mileage, double price) throws UsedCarException{

        //not 4 digits
        setVinNumber(vinNumber);
        if(vinNumber < 1000 || vinNumber > 9999)
            throw(new UsedCarException());

        setMake(make);
        if(!("Ford".equals(make) ||
                "Honda".equals(make) ||
                "Toyota".equals(make) ||
                "Chrysler".equals(make) ||
                "Other".equals(make)))
            throw(new UsedCarException());

        //between 1997 and 2017
        setYear(year);
        if(year < 1997 || year > 2017)
            throw(new UsedCarException());

        //not negative
        setMileage(mileage);
        if(mileage < 0)
            throw(new UsedCarException());

        //not negative
        setPrice(price);
        if(price < 0)
            throw(new UsedCarException());
    }

    public void setVinNumber(int vinNumber){
        this.vinNumber = vinNumber;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getVinNumber(){
        return vinNumber;
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public double getPrice(){
        return price;
    }
}