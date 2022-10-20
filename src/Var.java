import java.util.ArrayList;

public class Var {
    /*
    Java 10
    Local Variable Type Inference
    - Java is statically typed language.
    - var only with local variables.
    - It first check the value type than at the time of Compile its set that value.
    - var we use as the variable name.
     */
    public static void main(String[] args) {
        var obj=new ArrayList<>();
        var a=100;
        var b=200;

        int c;
        // var c;      -CTE

        String var="Ayush";

        var arr=new int[10];
//        var obj=new Alien();

    }
}
