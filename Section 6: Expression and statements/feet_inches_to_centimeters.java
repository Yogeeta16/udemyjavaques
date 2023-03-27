public class feet_inches_to_centimeters {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(8,4);
        calcFeetAndInchesToCentimeters(500);
        calcFeetAndInchesToCentimeters(-9,5);
        calcFeetAndInchesToCentimeters(8,15);
        calcFeetAndInchesToCentimeters(6,-4);
        calcFeetAndInchesToCentimeters(-500);
    }
    public static int calcFeetAndInchesToCentimeters(int feet , int inches){
        if((feet <0) || (inches <0 || inches>12)){
            System.out.println("invalid value");
            return -1;
        } else {
            double centimeters = ((inches*2.54)+(feet*12*2.54));
            System.out.println(feet + " feet "+ inches + "inches = "
                    + centimeters + "centimeters");
            return 0;
        }
    }
    public static int calcFeetAndInchesToCentimeters(int inches){
        if(inches<0){
            System.out.println("invalid value");
            return -1;
        } else {
            int feet =inches/12;
            int Inches=inches%12;
            System.out.println( inches + "inches = " + feet + " feet "
                    + Inches + "inches  " );
            return 0;
        }
    }
}
