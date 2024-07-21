import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int carDays = scanner.nextInt();
                    scanner.nextLine();
                    Car car = new Car(carModel, carDays);
                    rentedVehicles.add(car);
                    car.displayDetails();
                    break;
                case 2:
                    System.out.println("enter bike brand");
                    String bikeBrand = scanner.nextLine();
                    System.out.println("Enter hourly rental ");
                    int rent_hours = scanner.nextInt();
                    Bike bike = new Bike(bikeBrand, rent_hours);
                    rentedVehicles.add(bike);
                    bike.displayDetails();

                case 3:
                    System.out.println("enter the truck type  ");
                    String truck_brand= scanner.nextLine();
                    System.out.println("enter weekly rental  ");
                    int rent_week=scanner.nextInt();
                    Truck truck=new Truck(truck_brand,rent_week);
                    rentedVehicles.add(truck);
                    truck.displayDetails();
                case 4:
                    System.out.println("rented vehicles:");
                    for (Vehicle v : rentedVehicles) {
                        v.displayDetails();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("thank you for using the vehicle rental system");
                    return;
                default:
                    System.out.println("invalid choice please try again");
                    break;
            }
        }
    }
}







