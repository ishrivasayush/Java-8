import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApI {
    /*
    Stream ApI-
    -For storing the data we use Collections in java for non-primitives.
    -For Process that data we use normally for loop or for each loop.
    -we use stream only once.
    -Map-Give the value and tell me what to do with that value and i will do it.
    -predicate is the Functional interface which takes values as method and that method return true or false values. it contains the test method on it.
    -filter is method which takes predicate interface as parameter and returns the true and false.
     */
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(10,20,130,420,250,60);
        Stream<Integer> data=nums.stream();

        //Reduce
        Integer reduce = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(reduce);

        //filter and map
        nums.stream()
                .filter(n->n%2==0)
                .sorted()
                .map(n->n*2)
                .forEach(n-> System.out.println(n));

        //Map the data
        Stream<Integer> stream = data.map(n -> n * 2);
        stream.forEach(n-> System.out.println(n));

        //Sort the data
        Stream<Integer> sorted = data.sorted();
        sorted.forEach(n-> System.out.println(n));

        //count the data
        long count = data.count();
        System.out.println(count);

        //Print the data
        data.forEach(n-> System.out.println(n));
        data.forEach(n-> System.out.println(n));


    }
}
