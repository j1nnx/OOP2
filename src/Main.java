public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();
        Car car = new Car("carFirst", 4);
        Car car2 = new Car("carSecond", 2);

        Truck truck = new Truck("truckFirst", 6);
        Truck truck2 = new Truck("truckSecond", 8);

        Bicycle bicycle = new Bicycle("bicycleFirst", 2);
        Bicycle bicycle2 = new Bicycle("bicycleSecond", 2);

        mashines[] transport = {car, car2, truck, truck2, bicycle, bicycle2};

        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);

    }
}