import java.util.Objects;

public abstract class Driver <T extends Car> {
    private String name;
    private boolean haveDriverIsLicense;
    private int drivingExperience;

    public Driver(String name, boolean haveDriverIsLicense, int drivingExperience) {
        setName(name);
        this.haveDriverIsLicense = haveDriverIsLicense;
        setDrivingExperience(drivingExperience);
    }

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Driver setName(String name) {
        this.name = validOrDefault.validOrDefault(name, "default");
        return this;
    }

    public boolean isHaveDriverIsLicense() {
        return haveDriverIsLicense;
    }

    public Driver setHaveDriverIsLicense(boolean haveDriverIsLicense) {
        this.haveDriverIsLicense = haveDriverIsLicense;
        return this;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public Driver setDrivingExperience(int drivingExperience) {
        this.drivingExperience = Math.max(drivingExperience,1);
        return this;
    }
    public abstract void driveCar(T car);

    public abstract void start();

    public abstract void end();

    public abstract void refillCar();

    @Override
    public String toString() {
        return name+", стаж вождения: "+drivingExperience+" лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return haveDriverIsLicense == driver.haveDriverIsLicense && drivingExperience == driver.drivingExperience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, haveDriverIsLicense, drivingExperience);
    }
}

