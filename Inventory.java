import java.util.ArrayList;
public class Inventory < T extends Vehicle> {
    private ArrayList<T> inventory;
    public Inventory(){
        inventory = new ArrayList<>();
    }
    public ArrayList<T> getInventory() {
        return inventory;
    }
    public void addToInventory(T vehicle){
        inventory.add(vehicle);
    }public void  removeFromInventory(int vin){
        inventory.removeIf(vehicle ->vehicle.getVin().equals(vin) );
    }
}