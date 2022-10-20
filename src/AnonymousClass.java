public class AnonymousClass {
    public static void main(String[] args) {
        //Anonymous Inner class
        Hello hello=new Hello(){
            @Override
            public void sayHello()
            {
                System.out.println("hello Ayush.");
            }
        };
    }
}

@FunctionalInterface
interface Hello {
    void sayHello();
}




