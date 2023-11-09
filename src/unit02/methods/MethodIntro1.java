package unit02.methods;

public class MethodIntro1 {
    public static void main(String[] args) {
        // BAD CODE!!!!
//        System.out.println("Welcome choose your card");
//        // random code ...
//        System.out.println("Welcome choose your card");
//        // random code ...
//        System.out.println("Welcome choose your card");
        String myName = "Wolfgang";
        sayWelcomeWithName(myName);

        sayWelcome();
        // random code ...
        sayWelcome();
        // random code ...
       sayWelcome();
    }

    public static void sayWelcome(){
        System.out.println("Welcome choose your card");

    }

    public static void sayWelcomeWithName(String name){
        System.out.println("Welcome " + name + " choose your card" );
    }
}
