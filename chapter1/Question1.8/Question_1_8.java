/**
* String rotation: Assume you have a method isSubstring which checks if one word is a substring of another. 
* Given 2 strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to 
* isSubstring (e.g. waterbottle is a rotation of erbottlewat)
*
* @version 1.1
* @author Riccardo Candido
*/

import java.util.ArrayList;

public class Question_1_8 {
    public static void main(String[] args) {

        System.out.println(
            "waterbottle - erbottlewat (True):" + 
                isSubstring(
                    "waterbottle".toCharArray(), 
                    "erbottlewat".toCharArray()
                )
        );

        System.out.println(
            "tumadre - erbottlewat (False):" + 
                isSubstring(
                    "tumadre".toCharArray(), 
                    "erbottlewat".toCharArray()
                )
        );

        System.out.println(
            "waterbottle - aterbottlew (True):" + 
                isSubstring(
                    "waterbottle".toCharArray(), 
                    "aterbottlew".toCharArray()
                )
        );

        System.out.println(
            "waterbottle - aterbottliw (False):" + 
                isSubstring(
                    "waterbottle".toCharArray(), 
                    "aterbottliw".toCharArray()
                )
        );
    }

    /* s2 is a rotation of s1? */
    static boolean isSubstring(char[] s1, char[] s2) {
        if (s1.length != s2.length) return false;
        
        int indexS1 = 0;
        int indexS2 = 0;
        int counter  = 0;
        int wordLengthCounter = s1.length;

        while( counter < s1.length && indexS2 < s1.length) {
            if (wordLengthCounter == 0) return true; 

            if (s1[indexS1] == s2[indexS2]) {
                indexS1++;
                indexS2 = (indexS2 + 1) % s1.length;
                wordLengthCounter--;
            } else {
                indexS1 = 0;
                indexS2++;
                wordLengthCounter=s1.length;
                counter++;
            }
        }
        return false;
    }

    // Computational cost O(n)

}
