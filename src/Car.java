public class Car extends Transport implements mashines{


    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}