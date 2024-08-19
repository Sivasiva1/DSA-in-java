

public class BuySell {
    public static void main(String[] args) {
        int[] n = {1,2,4,0};
        int left = 0;
        int right =1;
        int maxpro = 0;

        while (right<n.length)
        {
             int profit = n[right] - n[left];
            if(n[left]<n[right])
            {
                maxpro = Math.max(maxpro,profit);
            }
            else {
                left = right;
            }
            right++;
        }
        System.out.println(maxpro);
    }
}
