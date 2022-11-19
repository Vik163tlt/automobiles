import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Car> cars = new ArrayDeque<>();
    private void add(Car car){
        cars.offer(car);
    }
    public void addPassenger(Passenger passenger){
        add(passenger);
    }
    public void addTruck(Truck truck){
        add(truck);
    }
    public void service(){
        if (!cars.isEmpty()){
            Car car = cars.poll();
            boolean result = car.passDiagnostic();
            if (!result) {
                car.repair();
            }
        }

    }

}
