public class Main {
    public static void main(String[] args) {

        Passenger lada = new Passenger("Lada", "Granta", 1.7, Passenger.BodyType.SEDAN);
        Passenger audi = new Passenger("Audi","A8 50 L TDI quattro",1.8,Passenger.BodyType.HATCHBACK);
        Passenger hyundai = new Passenger("Hyundai", "Avante", 1.6, Passenger.BodyType.SEDAN);
        Passenger kia = new Passenger("Kia", "Sportage 4-го поколения", 2.4, Passenger.BodyType.CROSSOVER);

        Truck man = new Truck("Man", "tgl 8.180", 3.5, Truck.LiftingCapacity.N3);
        Truck gaz = new Truck("ГАЗ", "САЗ-3507", 3.0, Truck.LiftingCapacity.N1);
        Truck kamaz = new Truck("КамАЗ", "   ", 3.3, Truck.LiftingCapacity.N2);
        Truck ural = new Truck("Урал", "375", 3.2, null);

        Bus ikarus = new Bus("Ikarus", "280", 2.4, Bus.Capacity.EXTRA_LARGE);
        Bus liaz = new Bus("ЛиАЗ", "507", 2.9, Bus.Capacity.MEDIUM);
        Bus volkswagen = new Bus("Volkswagen", "Microbus", 2.7, Bus.Capacity.SMALL);
        Bus krupp = new Bus("Krupp", "Titan", 1.8,null);

        DriverCategoryB ivanov = new DriverCategoryB("Иванов Иван Иванович",true,10);
        DriverCategoryC smirnov = new DriverCategoryC("Смирнов Алексей Алексеевич",false,11);
        DriverCategoryD sidorov = new DriverCategoryD("Сидоров Петр Алексеевич",true,12);

        ivanov.driveCar(kia);
        smirnov.driveCar(ural);
        sidorov.driveCar(krupp);

        hyundai.printBodyType();
        gaz.printLiftingCapacity();
        volkswagen.printCapacity();

        passDiagnostic(
                lada,audi,hyundai,kia,man,gaz,kamaz,ural,ikarus,liaz,volkswagen,krupp
        );

    }
    public static void passDiagnostic(Car... cars){
        for (Car car : cars){
            passDiagnosticCar(car);
        }
    }
    private static void passDiagnosticCar(Car car){
        if (!car.passDiagnostic()){
            try {
                throw new RuntimeException("Автомобиль " + car.getBrand() + " " + car.getModel() + " не прошел диагностику");
            } catch(RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Автомобиль " + car.getBrand() + " " + car.getModel() + " успешно прошел диагностику");
        }
    }
}