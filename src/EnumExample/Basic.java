package EnumExample;

public class Basic {
    Basic(){
        // empty constructor ...
    }
    enum week {
        Monday , Tuesday , Wednesday , Thursday , Friday ,Saturday ,Sunday;
        // these are enum cons
        // public static final
        // since its final you can create child enums
        // its type is week


        week() {
            System.out.println("Constructor called for  "+ this );
            // this is not public or protected , only private or default
            // why? we dont want to create new objects
            // this is not the enum concept , thats why

            //internally:  public static final week Monday =  new week();
        }
    }

    public static void main(String[] args){

        week weekDays ;
        weekDays = week.Monday;
        // print while storing the value of enum week in weekDays and print the weekDays ..
        System.out.println(weekDays);

        System.out.println("-------------------------------");
        // print using for-each  loop
//        for(week day : week.values()){
//            System.out.println(day);
//        }

        System.out.println("-------------------------------");
        // it returns the value of the index of were the Monday is situated ..
        // like in array we use indexing ....
        // it is similar . it also give the index of enum variables .
        System.out.println(weekDays.ordinal());


    }
}
