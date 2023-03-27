public class DecimalComparator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.17564));
    }
    public static boolean areEqualByThreeDecimalPlaces(double n1,double n2 ){
              n1=n1*1000;
              n2=n2*1000;
              boolean chech =((int)n1==(int) n2);
              return chech;


    }
}
