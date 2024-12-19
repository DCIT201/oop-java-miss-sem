class Car extends Vehicle implements Rentable {
    private String type; // sedan, SUV, etc.

    public Car(String vehicleId, String model, double baseRentalRate, String type) {
        super(vehicleId, model, baseRentalRate);
        this.type = type;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println("Car " + getVehicleId() + " rented to " + customer.getName() + 
                             " for " + days + " days");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car " + getVehicleId() + " has been returned");
    }
}