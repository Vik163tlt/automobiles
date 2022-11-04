public class Bus extends Car implements Competing{
    public enum Capacity{
        EXTRA_SMALL(0, 10),
        SMALL(11, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);
        int minCapacity;
        int maxCapacity;

        Capacity(int minCapacity, int maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        public int getMinCapacity() {
            return minCapacity;
        }

        public int getMaxCapacity() {
            return maxCapacity;
        }
    }
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolumeL,Capacity capacity) {
        super(brand, model, engineVolumeL);
        this.capacity = capacity;
    }
    public void start(){
        System.out.println("Начать движение.");
    }
    public void end(){
        System.out.println("Закончить движение.");
    }
    @Override
    public void pitStop() {
        System.out.println("Заезд на пит-стоп автобуса");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобуса");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скоростьость автобуса");
    }
    public void printCapacity() {
        if (capacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + " составляет от " + capacity.getMinCapacity() + " до " + capacity.getMaxCapacity() + " человек");
        }
    }
}
