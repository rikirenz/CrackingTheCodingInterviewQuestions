/**
* Implement a method to perform a basic string compression using the counts of repeated characters. 
* For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not 
* become smaller than the original string your method should return the roginal string. You can assume
* the string has only uppercase and lowercase letters (a-z).
*
* @version 1.1
* @author Riccardo Candido
*/

import java.util.ArrayList;

public class Question_1_6 {


    public static class Pair {

        public Pair(Character c, Integer i) {
            this.c = c;
            this.i = i;
        }
        
        Character c;
        Integer i;
    }


    public static void main(String[] args) {
        System.out.println("aabcccccaaa - a2b1c5a3: " + compressString("aabcccccaaa"));
        System.out.println("ciao - ciao: " + compressString("ciao"));
        System.out.println("tumadre - tumadre: " + compressString("tumadre"));
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa - a54: " + compressString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    public static String compressString(String s1) {
        if (s1 == null || s1.length() == 0) return "";

        ArrayList<Pair> counterList = new ArrayList<Pair>(); 
        boolean firstIteration = true; 
        Character previousCharacter = null;
        int letterCounter = 0;

        for (Character c : s1.toCharArray()) {
            if (firstIteration) {
                firstIteration = false;
                previousCharacter = c;
                letterCounter++;
                continue;
            }

            if (c == previousCharacter) 
                letterCounter++;
            else {
                counterList.add(new Pair(previousCharacter, letterCounter));
                letterCounter = 1;
                previousCharacter = c;
            }
        }

        counterList.add(new Pair(previousCharacter, letterCounter));

        if (counterList.size() * 2 >= s1.length())  return s1;

        String compressedString = "";

        for (Pair item : counterList) compressedString += item.c.toString() + item.i.toString();
        return compressedString;

        /* Computational cost discussion:
            The first for loop takes o(N) where n is the size of our string.
            The second for loop takes in the worst case o(N) as well because if all the letters are different with 
            the neighbors we have o(N) pairs.
            The concatentaion of the compressed string takes: n^2

            In this case add a char to the first string will result in cost O(n): 
            [ c i c i c i c i ] + c 
              | | | | | | | | 
              V V V V V V V V 
            [ c i c i c i c i c]  

            n + n-1 + n-2 + n-3 + ... + 1 = n^2

            So if we do not use a string builder the total computational cost will be O(n^2)
        
        */
    }

}
