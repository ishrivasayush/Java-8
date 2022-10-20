import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        //External Iteration-Fetched the values with the help of a index or with the list.
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        /*
        It will not use the index value for fetching the value its directly fetch the value form the list.
        one by one and put it onto the i and we print it
         */

        for (int i:list)
        {
            System.out.println(i);
        }

        //Internal Iteration-Its throw the values from the array one by one.

        Consumer<Integer> consumer=new Consumer<>(){
            @Override
            public void accept(Integer integer)
            {
                System.out.println(integer);
            }
        };

        Consumer<Integer> consumer1=n-> {
            System.out.println(n);
        };

        list.forEach(consumer1);

        list.forEach(n-> System.out.println(n));


    }
}
