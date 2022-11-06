public class Truck extends Car implements Competing{
    public enum LiftingCapacity {
        N1(0, 3.5),
        N2(3.5,12),
        N3(12,Double.MAX_VALUE);

        double minLiftingCapacity;
        double maxLiftingCapacity;

        LiftingCapacity(double minLiftingCapacity, double maxLiftingCapacity) {
            this.minLiftingCapacity = minLiftingCapacity;
            this.maxLiftingCapacity = maxLiftingCapacity;;
        }

        public double getMinLiftingCapacity() {
            return minLiftingCapacity;
        }
        public double getMaxLiftingCapacity() {
            return maxLiftingCapacity;
        }
    }
    private LiftingCapacity liftingCapacity;

    public Truck(String brand, String model, double engineVolumeL,LiftingCapacity liftingCapacity) {
        super(brand, model, engineVolumeL);
        this.liftingCapacity = liftingCapacity;
    }
    public void start(){
        System.out.println("Начать движение.");
    }
    public void end(){
        System.out.println("Закончить движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Заезд на пит-стоп грузового автомобиля");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузового автомобиля");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скоростьость грузового автомобиля");
    }
    public void printLiftingCapacity() {
        if (liftingCapacity == null) {
            System.out.println("Данных недостаточно");
        } else if (liftingCapacity == LiftingCapacity.N3) {
            System.out.println("Грузоподъемность " + getBrand() + " " + getModel() + " составляет от " + liftingCapacity.getMinLiftingCapacity() + " тонн");
        } else {
            System.out.println("Грузоподъемность " + getBrand()+" "+getModel()+" составляет от "+ liftingCapacity.getMinLiftingCapacity()+" до "+liftingCapacity.getMaxLiftingCapacity()+" тонн");
        }
    }
    public boolean passDiagnostic() {
        return Math.random() >0.4;
    }
}
