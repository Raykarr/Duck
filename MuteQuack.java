package Bird;
public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I am on Mute.....");
    }
}
