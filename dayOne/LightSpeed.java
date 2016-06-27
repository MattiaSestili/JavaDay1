package dayOne;

/**
 * Created by student on 27-Jun-16.
 */
public class LightSpeed {

    public static void  main(String[] args){
        //299,792,458 meters/seconds

        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186282;
        days = 7;
        //based on n of days.
        seconds = days *24 *60 *60;

        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about...");
        System.out.print(distance + " miles.");
    }
}
