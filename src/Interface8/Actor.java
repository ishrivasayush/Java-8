package Interface8;
/*
we should not modify the Java interface after published because we are overriding the methods again and again
before java 1.8 but after java 1.8 we can create the Method by default keyword now we can't override that method on further class.
With the help of Default Keyword we can create and define the method in interface also.
*/
public interface Actor {
    void act();
    void speak();
    default void comedy()
    {
        System.out.println("I can make People Laugh");
    }
}