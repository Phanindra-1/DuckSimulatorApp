
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        //Testing the model duck behavior and changing it

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();

        model.setFlyBehavior(new FlyRockerPowered());

        model.performFly();
    }
}