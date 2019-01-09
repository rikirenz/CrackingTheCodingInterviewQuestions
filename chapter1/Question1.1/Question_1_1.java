/**
* The class solves the "CRACKING THE CODE INTERVIEW" Question 1.1 
* Question: Implement an algorithm to determine if a string has all unique characters. 
*           What if you cannot use any addional data structure.
* 
* @version 1.1
* @author Riccardo Candido
*/


public class Question_1_1 {

    public static void main(String[] args) {
        System.out.println("========== Brute Force Solution ==========");
        System.out.println("Test case with empty string:" + BruteForceSolution.allUniqueCharactes(""));
        System.out.println("Test case with 'aaaaa' string:" + BruteForceSolution.allUniqueCharactes("aaaaa")); 
        System.out.println("Test case with 'bbbbc' string:" + BruteForceSolution.allUniqueCharactes("bbbbc"));
        System.out.println("Test case with 'AAAAaaa' string:" + BruteForceSolution.allUniqueCharactes("AAAAaaa")); 
        System.out.println(
            "Solution without additional data structure, Brute Force" + 
            "solution and optimize solution the are all the same"
        );
    }

    // brute force solution 
   public static class BruteForceSolution {
        static boolean allUniqueCharactes(String s) {
            // empty string case
            if (s.length() <= 0) return true;

            for (int i = 1; i < s.length(); i++) {
                if (!(s.charAt(0)==s.charAt(i))) return false;
            }
            return true;
        }
   }

   /**
    * Computational Cost discussion: The cost in the worst case is O(n). The BCR (Best conceivable runtime is O(n)).
    */

}



