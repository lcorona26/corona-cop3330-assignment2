package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAnagramTest {

    @Test
    void isAnagram_checks_ifAnagram(){
        CheckAnagram check = new CheckAnagram();

        boolean expected= true;
        boolean actual = check.isAnagram("note", "tone");

        assertEquals(expected, actual);
    }


}