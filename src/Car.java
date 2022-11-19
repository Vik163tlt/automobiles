import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car {
    private String brand;
    private String model;
    private double engineVolumeL;
    private final List <Driver<?>> drivers = new ArrayList<>();
    private final List <Mechanic<?>> mechanics = new ArrayList<>();
    private final List <Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, double engineVolumeL) {
        this.brand = validOrDefault.validOrDefault(brand, "default");
        this.model = validOrDefault.validOrDefault(model, "default");
        this.setEngineVolumeL(engineVolumeL);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolumeL() {
        return engineVolumeL;
    }

    public Car setEngineVolumeL(double engineVolumeL) {
        this.engineVolumeL = engineVolumeL > 0.0f ? engineVolumeL : 1.5f;
        return this;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void start();

    public abstract void end();
    public abstract boolean passDiagnostic();
    

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + engineVolumeL;
    }

    public abstract void repair();
}

