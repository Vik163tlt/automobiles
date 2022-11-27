public class DriverCategoryD extends Driver<Bus>{
    public DriverCategoryD(String name,boolean haveDriverIsLicense, int drivingExperience) {
        super(name,haveDriverIsLicense,drivingExperience);
    }

    @Override
    public void driveCar(Bus car) {
        System.out.println("Водитель " + getName() + " водит машину " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void end() {
        System.out.println("Остановиться");
    }

    @Override
    public void refillCar() {
        System.out.println("Заправить авто");
    }
}
