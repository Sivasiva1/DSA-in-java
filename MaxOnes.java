import java.util.Arrays;
import java.util.Scanner;

public class MaxOnes {
    public static void main(String[] args) {
        int[] n = new int[5];
        int count = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(n));

        for(int i:n)
        {
            if(i==1)
            {
                count+=1;

            }
            else {
                max = Math.max(max,count);
                count=0;
            }
        }
        max = Math.max(max,count);
        System.out.println(max);
    }

}
