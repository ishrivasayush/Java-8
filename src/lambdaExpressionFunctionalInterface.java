public class lambdaExpressionFunctionalInterface {
    public static void main(String[] args) {
        demoAble demoAble = () -> {
            System.out.println("hey i am demo.");
            System.out.println("hey i am demo.");
        };
        demoAble.demo();
    }
}

/*
Interface-we declare the behaviour inside the Interface and define that behaviour inside the another class.
Functional Interface
-A Interface that contains only one method is called Functional Interface.
-SAM-Single Abstract method Interface.
-Maker Interface- zero method declare.
-Normal Interface-Contains any Number of methods.

Anonymous Inner class
-A class with No name is called the Anonymous class.
-It only use at one time.

Arrow Function Or Lambda Expression.
->

 */


@FunctionalInterface  //Restrict the method for Functional interface.
interface demoAble{
    void demo();
    String toString();
}

