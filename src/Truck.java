public class Truck implements Vehicle{

  private String type;
  private int week;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDays() {
        return week;
    }

    public void setDays(int days) {
        this.week = days;
    }

    @Override
    public double calculateRentalCost() {
        return 500*week;
    }

    public Truck(String model, int days) {
        this.type = model;
        this.week = days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type :" + type);
        System.out.println("weekly rental :500");
        System.out.println("rental cost :" + calculateRentalCost());

    }

    }

