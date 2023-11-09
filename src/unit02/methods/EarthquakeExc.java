package unit02.methods;

public class EarthquakeExc {
    public static void main(String[] args) {
        printMessageFromRichterScale(1.5);
    }

    public static void printMessageFromRichterScale(double richterScaleNumber) {
        if (richterScaleNumber >= 8 && richterScaleNumber <= 10 ) {
            System.out.println("Most structures fall");
        } else if (richterScaleNumber >= 7) {
            System.out.println("Many buildings destroyed");
        } else if (richterScaleNumber >= 6) {
            System.out.println("Many buildings considerably damaged, some collapse");
        } else if (richterScaleNumber < 4.5 && richterScaleNumber >=2) {
            System.out.println("damage to poorly constructed buildings");
            // } else if(richterScaleNumber )
            // ==> go until 2
            // ==> bis
            // ==> <0 richter scale cannot be negative
            // ==> richter scale cannot be greater than 10
        } else {
            System.out.println("no earthquake");
        }
    }
}
