    /**
    * This class solves the "CRACKING THE CODE INTERVIEW" Question 1.3 
    * Question: Urlify. Write a method to replace all spacesin a string with '%20'. 
    * You may assume that the string has sufficent space at the end to hold the 
    * additional characters, and that you are given the true length of the string.
    * Please use the character array as string 
    * 
    * @version 1.1
    * @author Riccardo Candido
    */


public class Question_1_3 {

    public static void main(String[] args) {
        System.out.println("========== Brute Force Solution ==========");
        char[] testString = {'m','r',' ','j','h','o','n',' ','s','m','i','t','h',' ',' ',' ',' '};        
        char[] url = BruteForceSolution.urlify(testString, 13);

        url = BruteForceSolution.urlify(testString, 13);

        System.out.print("This is the urlify string: ");
        for (char c : url) System.out.print(c);

    }

    // brute force solution 
    public static class BruteForceSolution {

        public static char[] urlify(char[] string, int stringLen) {
            if (string == null) return null;
            int numberOfshifts = 0;
            for (int i = 0; i < string.length; i++) {
                if (string[i] == ' ') {
                    string = shiftAndReplace(string, i, stringLen + (numberOfshifts * 2));
                    numberOfshifts++;
                    i += 2;
                }
            }
            return string;
        }

        private static char[] shiftAndReplace(char[] string, int endIndex, int stringLen)  {
            // shift
            for (int i = stringLen-1; i > endIndex; i--) string[i+2] = string[i];
            // replace with %20
            string[endIndex]='%'; string[endIndex+1]='2'; string[endIndex+2]='0';

            return string;
        
        }
        /**
        * Computational Cost discussion: for the brute force solution we have n^2
        */
    }


}
