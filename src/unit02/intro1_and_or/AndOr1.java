package unit02.intro1_and_or;

public class AndOr1 {
    public static void main(String[] args) {
        // group of young adults -> they want to party
        // club is only allowing people > 18
        int age = 19;
        boolean isFit = false;
        boolean isDrunk = true;
        int startingHour = 23;
        // this is the first solution
//        if(isFit) {
//            if(age >= 18) {
        //                System.out.println("You are old enough, have fun partying");
//            } else {
//               System.out.println("You are too young");
//            }
//        }


            // 18 , notdrunk, notfit, startingHour=23
//            if(age >= 18 && (isFit==true || isDrunk ==false) && startingHour>=22) {
//                System.out.println("You are allowed");
//            } else {
//                System.out.println("You are not allowed to party");
//            }



        // This person would not be allowed: age = 17, isNotfit, isDrunk, startingHour=21
        if(age >= 18 || (isFit==true || isDrunk ==false) || startingHour>=22) {
            System.out.println("You are allowed");
        } else {
            System.out.println("You are not allowed to party");
        }

    }
}
