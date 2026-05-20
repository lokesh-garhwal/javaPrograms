public class minOpToMoveBalls {
    public static int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int[] temp = new int[boxes.length()];
        int idx = 0;
        for(int i = 0;i<ans.length;i++){
            temp[i] = -1;
        }
        for(int i = 0;i<ans.length;i++){
            if(boxes.charAt(i) == '1'){
                temp[idx++] = i;
            }
        }
        int n=0;
        for(int i = 0;i<ans.length;i++){
            for(int j = 0;j<temp.length;j++){
                if(temp[j] == -1) break;
                n += Math.abs(temp[j]-i);
            }
            ans[i] = n;
            n=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = minOperations("110");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}