public class hello {
    public static void main (String[] args){
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");;
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/hr = " + milesPerHour +
                    " mi/hr ");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = (kilometersPerHour / 1.609);
            // long roundedans=Math.round(MilesPerHour);
            return Math.round(milesPerHour);
        }
    }
    }
