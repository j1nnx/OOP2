public class Bicycle extends Transport implements mashines{
    public Bicycle(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
