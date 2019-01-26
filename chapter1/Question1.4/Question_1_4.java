import java.util.HashMap;
import java.util.Map;

/**
* This class solves the "CRACKING THE CODE INTERVIEW" Question 1.4
* Question: Palindrome permutation. Given a string, write a function to 
* check if it is a permutation of a palindrome. A palindorme is a word or 
* pharse that is the same forwards and bakwards. A permutation is a 
* rearrangment of letters. The palindrome does not need to be limited 
* to just dictionary words.
* @version 1.1
* @author Riccardo Candido
*/
public class Question_1_4 {

    public static void main(String[] args) {
        System.out.println("========== Brute Force Solution ==========");
        // compute all the permutations brute force
        System.out.println("string abc: " + Solution.verifyIfIsPalindrome("abc"));        
        System.out.println("string aba: " + Solution.verifyIfIsPalindrome("aba"));
        System.out.println("string aabaa: " + Solution.verifyIfIsPalindrome("aabaa"));
        System.out.println("string aab cc!: " + Solution.verifyIfIsPalindrome("aab cc!"));
        System.out.println("string aaabcc: " + Solution.verifyIfIsPalindrome("aaabcc"));
    }

    // brute force solution 
    public static class Solution {

        static boolean verifyIfIsPalindrome(String s) {
            HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
            for (char c : s.toCharArray()) {
                if (c == ' ') continue;
                hMap.put(c, hMap.get(c) == null ? 1 : hMap.get(c)+1);
            }

            boolean evenChars = false;
            for (Map.Entry<Character, Integer> item : hMap.entrySet()) {
                if (item.getValue() %  2 != 0){
                    if (evenChars) return false;
                    evenChars = true;
                }
            }
            return true;
        }

        /**
        * Computational Cost discussion: in the worst case is n
        */
    }



    public static class Permutations {
        public static void printAllPermutation(String s) {
            char[] charArray = s.toCharArray();
            permutations(charArray, 0, charArray.length-1);
        }

        private static void permutations(char[] s, int lowerBound, int upperBound){
            if (lowerBound == upperBound){
                for (char a : s) System.out.print(a);  
                System.out.print(" - ");  
            } else {
                for (int i = lowerBound; i <= upperBound; i++) {
                    s = swap(s, lowerBound, i);
                    permutations(s, lowerBound+1, upperBound);
                }    
            }
        }

        private static char[] swap(char[] s, int index1, int index2) {
            char com = s[index1];
            s[index1] = s[index2];
            s[index2] = com;
            return s;
        }
        /**
        * Computational Cost discussion: This class produce all permutations of string in O(n!)
        */
    }
}
