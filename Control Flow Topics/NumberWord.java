public class NumberWord {
    public static void main(String[] args) {
        System.out.println(printNumberInWord(5));
        System.out.println(printNumberInWord(6));
        System.out.println(printNumberInWord(8));
        System.out.println(printNumberInWord(-1));
        System.out.println(printNumberInWord(0));
    }

        // write your code here
        public static String printNumberInWord(int numero){
            String word;

            switch (numero){
                case 0 :
                    word = "ZERO";
                    break;
                case 1 :
                    word = "ONE";
                    break;
                case 2 :
                    word = "TWO";
                    break;
                case 3 :
                    word = "THREE";
                    break;
                case 4 :
                    word = "FOUR";
                    break;
                case 5 :
                    word = "FIVE";
                    break;
                case 6 :
                    word = "SIX";
                    break;
                case 7 :
                    word = "SEVEN";
                    break;
                case 8 :
                    word = "EIGHT";
                    break;
                case 9:
                    word = "NINE";
                    break;
                default:
                    word = "OTHER";
                    break;
            }

            return word;
        }
    }

