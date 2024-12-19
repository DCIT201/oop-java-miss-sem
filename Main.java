public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create rental agency
        RentalAgency agency = new RentalAgency();

        // Create vehicles
        Car car = new Car("C001", "Toyota Camry", 50.0, "Sedan");
        Motorcycle motorcycle = new Motorcycle("M001", "Honda CBR", 30.0);

        // Create customer
        Customer customer = new Customer("CUST001", "John Doe", "L12345");

        // Add vehicles and customer to agency
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addCustomer(customer);

        // Test rental operations
        System.out.println("Testing Vehicle Rental System:");
        System.out.println("------------------------------");

        // Rent a car
        agency.rentVehicle(car, customer, 3);
        
        // Return the car
        car.returnVehicle();

        // Rent a motorcycle
        agency.rentVehicle(motorcycle, customer, 2);
        
        // Return the motorcycle
        motorcycle.returnVehicle();
    }
}