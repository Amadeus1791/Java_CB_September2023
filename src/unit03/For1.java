package unit03;


    public class For1 {
        public static void main(String[] args) {
            For1 for1 = new For1();
           for1.printNumFrom1To100();
            String nStars = for1.getNStars(7);
            System.out.println(nStars);
         //   printStringNTimes("Java is cool", 543);
            String codersbay_is_cool = for1.getStringNTimes("Codersbay is cool", 700);
            System.out.println(codersbay_is_cool);
        }

        public  void printNumFrom1To100() {
//        int counter = 1;
//        while (counter <= 100 ) {
//            System.out.println(counter);
//            //  counter = counter + 1;
//            counter++;
//        }
            for (int i = 1; i <= 100 ; i++) {
                System.out.println(i);
            }
        }

        // 7 ===> "*******"
        public String getNStars(int n) {
            String s = "";
            for (int i = 0; i < n; i++) {
                s = s + "*";
            }
            return s;
        }


        public static void printStringNTimes(String input, int numOfTimes) {
            for (int i = 0; i < numOfTimes; i++) {
                System.out.println(input);
            }
        }

        public  String getStringNTimes(String input, int numOfTimes) {
            String s = "";
            for (int i = 0; i < numOfTimes; i++) {
                s = s + input;
                if (i < numOfTimes - 1) {
                    s = s + ", ";
                }
                // s += input;
            }
            return s;
        }


    }


