public class Car {
//    Fields
    private String brand;
    private String model;
    private int year;

//    Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

//    Getter
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

//    Display method
    public void displayCarInfo() {
        System.out.println("This car is a: ");
        System.out.println(brand + " " + model + " " + year);
    }


}