import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    static HashMap[] createHashMapsWithAllTheSubstrings(String s) {
        int sizeString = s.length();

        for (int i = 0; i < sizeString-1; i++) {
            for (int j = 0; j < sizeString-i; j++) {
                System.out.println(s.substring(j,i));
            }
        }

        return null;
    }

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        HashMap[] hmAllSubStrings = createHashMapsWithAllTheSubstrings(s);
        int total = countAnagramsFromHashmaps(hmAllSubStrings);
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}