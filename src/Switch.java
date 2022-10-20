public class Switch {
    /*
        Switch  can be a Statement or a Expression.
     */
    public static void main(String[] args) {
        /*
        switch (1)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
        */

        String day="Monday";
        switch (day)
        {
            case "Saturday","Sunday"-> System.out.println("6AM");
            case "Monday"-> System.out.println("8AM");
            default-> System.out.println("7am");
        }

//        Switch as Expression

        String res="";
        switch (day)
        {
            case "Saturday","Sunday"->res="6am";
            case "Monday"->res="8am";
            default -> res="nothing";
        }
        System.out.println(res);

        res=switch (day)
                {
                    case "Saturday","Sunday"->"6am";
                    case "Monday"->"8amk";
                    default -> "nothing";
                };
        System.out.println(res);

//        switch (day)
//                {
//                    case "Saturday","Sunday": yield "6am";
//                    case "Monday": yield "8amk";
//                    default : yield "nothing";
//                };
//        System.out.println(res);



    }
}
