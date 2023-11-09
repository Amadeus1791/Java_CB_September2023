package unit03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class For1Test {
    For1 for1 = new For1();


    @Test
    void getNStarsWithPositiveNumbers() {
        // 7 ===> ********
        String result = for1.getNStars(7);
        String expected = "*******";
        assertEquals(expected, result);
    }

    @Test
    void getNStarsWithNegativeNumbers() {
        // -1 ===> ""
        String result = for1.getNStars(-1);
        String expected = "";
        assertEquals(expected, result);
    }

    @Test
    void getStringNTimes() {
        // ("Java",3) ==> "Java, Java, Java"
        String result = for1.getStringNTimes("Java", 3);
        String expected = "Java, Java, Java";
        assertEquals(result,expected);
    }
}