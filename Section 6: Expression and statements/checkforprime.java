public class checkforprime {
    public static void main(String[] args) {

        int count =0;
        for (int i =10 ; i<=50;i++){
            if(isprime(i)){
                count++;
                System.out.println("print the number that is prime = "+ i);

//                if(count==3){
//                    System.out.println("exiting the loop");
//                    break;
//                }
            }
        }
        System.out.println(count);

    }
//
    public static boolean isprime(int n){
        if (n == 1) {
            return false;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
   // public static void numberofprimes(int range1 ,int range2){
//        int count = 0;
//        for(int i = range1 ; i<=range2 ; i++){
////            if (i%2==0) {
////                break;
////            }else {
////                count++;
////                System.out.println("print the number that is prime = "+i);
////                if(count==3){
////                    System.out.println("exiting the loop");
////                    break;
////                }
////            }
//            if(isprime(i)){
//                count++;
//                System.out.println("print the number that is prime = "+i);
//                if(count==3){
//                    System.out.println("exiting the loop");
//                    break;
//                }
//            }
//        }
//    }