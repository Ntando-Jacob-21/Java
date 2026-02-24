public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes Benz", "C250", 2015);


        car.setMake("Toyota");
        car.setModel("C300");
        car.setYear(2018);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}