public class Main {
    public static void main(String[] args) {
        // create the instances of cars car object and truks
        Car car = new Car("Honda", "1234" , 480);
        Truck trucks = new Truck("Toyota","4356",
                560);
        // create an iventory
        Inventory<Vehicle> inventory =new Inventory<>();

        // add vehicles to the inventory
        inventory.addToInventory(car);
        inventory.addToInventory(trucks);

        // showcase the the cars or trucks that we have in the inventory

        System.out.println("\nInventory:");
        for(Vehicle vehicle: inventory.getInventory()){
            System.out.println(inventory);
        }
        //
        inventory.removeFromInventory(1233345);
//   .. after the removal of the inventory
        System.out.println("\nInventory after removal:");
        for (Vehicle vehicle : inventory.getInventory()) {
            System.out.println(vehicle);
        }
    }
}
