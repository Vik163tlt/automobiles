public abstract class Car {
    private String brand;
    private String model;
    private double enginVolumeL;

    public Car(String brand, String model, double enginVolumeL) {
        this.brand = validOrDefault.validOrDefault(brand,"default");
        this.model = validOrDefault.validOrDefault(model,"default");
        this.setEnginVolumeL(enginVolumeL);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEnginVolumeL() {
        return enginVolumeL;
    }

    public Car setEnginVolumeL(double enginVolumeL) {
        this.enginVolumeL = enginVolumeL > 0.0f ? enginVolumeL : 1.5f;
        return this;
    }
    public abstract void start();
    public abstract void end();

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + enginVolumeL;
    }
}
