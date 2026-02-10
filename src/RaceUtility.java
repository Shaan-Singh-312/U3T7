public class RaceUtility {

    public static double milesToKm(double n){
        return 1.609 * n;
    }

    public static double kmToMiles(double n){
        return n/1.609;
    }

    public static String makeProper(String s){
        String str = "";
        int i = s.indexOf(" ");
        while (i > -1){

            str += s.substring(0,1).toUpperCase() + s.substring(1,i).toLowerCase() + " ";
            s = s.substring(i+1);
            i = s.indexOf(" ");
        }

        str += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        return str;
    }
}
