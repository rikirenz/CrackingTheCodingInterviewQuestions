/**
* The class solves the "CRACKING THE CODE INTERVIEW" Question 1.2 
* Question: Given 2 string write a method to decide if one is permutation of the other.
* 
* @version 1.1
* @author Riccardo Candido
*/

import java.util.HashMap;
import java.util.Map;

public class Question_1_2 {

    public static void main(String[] args){
        System.out.println("### Test 1: 'abcd' and 'abdc' result: true ###");
        System.out.println(assert(permutationCheck("abcd", "abdc")));

        System.out.println("### Test 2: 'abcd' and 'abdcc' result: false ###");
        System.out.println(assert(permutationCheck("abcd", "abdcc")));

        System.out.println("### Test 3: '' and '' result: true ###");
        System.out.println(assert(permutationCheck("", "")));

        System.out.println("### Test 4: 'aaaaac' and 'aacaaa' result: true ###");
        System.out.println(assert(permutationCheck("aaaaac", "aacaaa")));

    }


    boolean permutationCheck(char[] s1, char[] s2) {
        if (s1 == null || s2 == null) return false;
        // we use a map to define the structure

        HashMap<char, int>()  s1Map = new HashMap<char, int>();
        for (char c : s1) {
            s1Map.put(c, 1);
        }

        for (char c : s1) {
            s1Map.put(c, 1);
        }





    }



} 