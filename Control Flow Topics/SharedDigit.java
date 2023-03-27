public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit(int n,int m){
        if (n<10 || m<10 || n>99 || m >99){
            return false;
        }else{
            int lastdgt_n = n % 10;
            int firstdgt_n = n / 10;
            int lastdgt_m = m % 10;
            int firstdgt_m = m / 10;
            if((lastdgt_n == lastdgt_m) || (firstdgt_n == firstdgt_m)) {
                return true;
            } else if ((lastdgt_n == firstdgt_m) || (firstdgt_n == lastdgt_m)) {
                return true;
            } else {
                return false;
            }
        }



    }
//Shared Digit
//Write a method named hasSharedDigit with two parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//
//EXAMPLE INPUT/OUTPUT:
//
//hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
}
