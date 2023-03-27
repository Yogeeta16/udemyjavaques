public class LeapYear {
    public static void main(String[] args){
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear2(1924));
    }
//    public static boolean isLeapYear(int year){
//        if (year<1 || year>9999){
//            return false;
//        } else {
//            if (year%4 == 0){
//
//                if (year%100 ==0){
//
//                    if (year%400 == 0){
//
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }else {
//                    return false;
//                }
//            }else {
//                return false;
//            }
//        }
//    }

        public static boolean isLeapYear2(int year){
            if( year>=1 && year<=9999){
                if( (year %400==0)||(year%100 !=0 && year%4==0))
                    return true;
            }
            else
                return false;
            return false;
        }
    }

