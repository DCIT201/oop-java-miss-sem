class Customer {
    private String customerId;
    private String name;
    private String licenseNumber;

    public Customer(String customerId, String name, String licenseNumber) {
        this.customerId = customerId;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() { return name; }
}