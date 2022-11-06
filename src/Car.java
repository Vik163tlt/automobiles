public abstract class Car {
    private String brand;
    private String model;
    private double engineVolumeL;

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

    public abstract void start();

    public abstract void end();
    public abstract boolean passDiagnostic();
    

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + engineVolumeL;
    }
}

