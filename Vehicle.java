import java.util.ArrayList;
public abstract class  Vehicle {
    protected final String MAKE = "Ford";
    protected   String model;
    protected  String vin;
    protected int horsepower;

    public Vehicle(String model, String vin, int horsepower) {
        this.model = model;
        this.vin = vin;
        this.horsepower = horsepower;
    }

    public String getMAKE() {
        return MAKE;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "MAKE='" + MAKE + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}
