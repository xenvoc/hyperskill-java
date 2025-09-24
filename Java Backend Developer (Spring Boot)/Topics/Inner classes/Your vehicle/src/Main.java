class EnjoyVehicle {

    public static void startVehicle() {
        // start your vehicle
        Vehicle myVehicle = new Vehicle();
        Vehicle.Engine myEngine = new Vehicle().new Engine();
        myEngine.start();
    }
}