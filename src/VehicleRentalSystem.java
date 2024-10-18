public class VehicleRentalSystem {
    public static void main (String[] args) {

        Sedan sedan = new Sedan ("NAHOM321", 150);
        SportBike sportBike = new SportBike("PRINCE12", 30);

        Customer nahcustomer = new Customer("Nahom Hailu", 26, "1000356");

        sedan.printVehicleDetails();
        sedan.rentVehicle(nahcustomer);

        Customer nahcustomer2 = new Customer("Prince", 28, "1006");
        sportBike.printVehicleDetails();
        sportBike.getRentalPrice();
        sportBike.getRentalPrice();

    }
}
