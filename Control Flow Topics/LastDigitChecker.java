public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23,32,42));
    }
    public static boolean hasSameLastDigit(int n, int m, int p){
        if(isValid(n) && isValid(m) && isValid(p) ){
            int lst_n =n%10;
            int lst_m =m%10;
            int lst_p =p%10;
            if (lst_n== lst_p || lst_m==lst_p || lst_m == lst_n){
                return true;
            }else {
                return false;
            }

        }
        return false;
    }
    public static boolean isValid(int x){
        if(x<10 || x>1000 ){
            return  false;
        }
        return true;
    }
}
//Last Digit Checker
//Write a method named hasSameLastDigit with three parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
//
//
//
//EXAMPLE INPUT/OUTPUT:
//
//hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//
//hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//
//hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000