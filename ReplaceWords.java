import java.util.*;

public class ReplaceWords {

    static class Solution {

        public String replaceWords(List<String> dictionary, String sentence) {
            String[] arr = sentence.split(" ");
            StringBuilder sb = new StringBuilder();
            String str;

            for (int i = 0; i < arr.length; i++) {
                str = arr[i];

                for (int j = 0; j < dictionary.size(); j++) {
                    if (str.startsWith(dictionary.get(j))) {
                        str = dictionary.get(j);
                    }
                }

                sb.append(str + " ");
            }

            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        List<String> dictionary = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";

        String result = solution.replaceWords(dictionary, sentence);

        System.out.println("Original Sentence:");
        System.out.println(sentence);

        System.out.println("\nModified Sentence:");
        System.out.println(result);
    }
}