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
        System.out.print("string abc: ");
        BruteForceSolution.printAllPermutation("abc");


    }

    // brute force solution 
    public static class BruteForceSolution {

        public static void printAllPermutation(String s) {
            char[] charArray = s.toCharArray();
            permutations(charArray, 0, charArray.length-1);
        }


        private static void permutations(char[] s, int lowerBound, int upperBound){
            if (lowerBound == upperBound){
                for (char a : s) System.out.print(a);  
                System.out.print(" - ");  
            } else {
                for (int i = lowerBound; i < upperBound; i++) {
                    s = swap(s, lowerBound, upperBound);
                    for (char a : s) System.out.print(a);  
                    System.out.print(" - ");  
                    permutations(s, lowerBound+1, upperBound);
                    s = swap(s, lowerBound, upperBound);
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
        * Computational Cost discussion: for the brute force solution we have n^2
        */
    }


}
