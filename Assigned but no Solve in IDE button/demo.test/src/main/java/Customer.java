class Customer {
    private final String name;
    private final String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}