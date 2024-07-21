public class Car implements Vehicle {

    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return 50*days;
    }

    @Override
    public void displayDetails() {
        System.out.println("car model :"+model);
        System.out.println("daily rental : 50$");
        System.out.println("rental cost :" + calculateRentalCost());
    }
}
