class Motorcycle extends Vehicle implements Rentable {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.85; // 15% discount for motorcycles
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println("Motorcycle " + getVehicleId() + " rented to " + customer.getName() + 
                             " for " + days + " days");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle " + getVehicleId() + " has been returned");
    }
}
