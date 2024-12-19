abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    public abstract double calculateRentalCost(int days);

    public boolean isAvailableForRental() {
        return isAvailable;
    }

    // Getters and setters with validation
    public String getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
    public double getBaseRentalRate() { return baseRentalRate; }
    
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}