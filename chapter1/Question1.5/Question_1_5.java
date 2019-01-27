/**
* There are 3 types of edits that can beperfomed on strings: insert a character
* remove a character, or replace a character. Given 2 strings, write a funciton 
* to check if they are 1 edit (or 0 edit) away
* @version 1.1
* @author Riccardo Candido
*/



public class Question_1_5 {

    public static void main(String[] args) {
        System.out.println("Pale - ple (true): " + oneAway("pale", "ple"));
        System.out.println("Pales - pale (true): " + oneAway("pales", "pale"));
        System.out.println("pale - bale (true): " + oneAway("pale", "bale"));
        System.out.println("pale - bake (false): " + oneAway("pale", "bake"));
        System.out.println("pale - bakfdsafdsafdsae (false): " + oneAway("pale", "bakfdsafdsafdsae"));
    }

    public static boolean oneAway(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        } 

        int indexLongString = 0;
        int indexShortString = 0;

        String longString = s1.length() > s2.length() ? s1 : s2;
        String shortString = s1.length() <= s2.length() ? s1 : s2;

        boolean thereIsAnEdit = false;
        while (indexLongString < longString.length() && indexShortString < shortString.length()) {
            if (longString.charAt(indexLongString) != shortString.charAt(indexShortString)) {
                if (thereIsAnEdit) return false;
                thereIsAnEdit = true;
                if (longString.length() == shortString.length()) indexShortString++;
            } else { 
                indexShortString++;
            }
            indexLongString++;
        }
        return true;
    }

}
