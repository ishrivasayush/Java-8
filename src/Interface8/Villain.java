package Interface8;

public class Villain implements Actor {

    @Override
    public void act() {
        System.out.println("I can Speak");
    }

    @Override
    public void speak() {
        System.out.println("I can make people comedy");
    }

    public void rude()
    {
        System.out.println("I'm rude");
    }
}
