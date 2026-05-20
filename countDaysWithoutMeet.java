import java.util.Arrays;

public class countDaysWithoutMeet {
    public static int countDays(int days, int[][] meetings) {
        int start = 0;
        int end = 0;
        int prevEnd = 0;
        int freeDays = 0;
        Arrays.sort(meetings,((a,b)->a[0] - b[0]));
        for(int[] arr : meetings){
            start = arr[0];
            end = arr[1];
            if(start > prevEnd +1){
                freeDays += start-prevEnd-1;
            }
            prevEnd = Math.max(prevEnd,end);
        }
        if(prevEnd < days){
            freeDays += days-prevEnd;
        }
        return freeDays;
    }
    public static void main(String[] args) {
        int[][] arr = {{3,5},{7,8},{14,17}};
        int res = countDays(10, arr);
    }
}
