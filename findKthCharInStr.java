public class findKthCharInStr {

    static char findK(StringBuilder str, int k) {

        if (str.length() >= k)
            return str.charAt(k - 1);

        int x = str.length();

        for (int i = 0; i < x; i++) {
            char c = (char) (str.charAt(i) + 1);
            str.append(c);
        }

        return findK(str, k);
    }

    public char kthCharacter(int k) {

        if (k == 1)
            return 'a';

        StringBuilder sb = new StringBuilder("a");

        return findK(sb, k);
    }

    public static void main(String[] args) {

        int k = 10;

        findKthCharInStr obj = new findKthCharInStr();

        char ans = obj.kthCharacter(k);

        System.out.println("Kth character: " + ans);
    }
}