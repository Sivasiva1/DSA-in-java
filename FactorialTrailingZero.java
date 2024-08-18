public class FactorialTrailingZero {
    public static void main(String[] args)
    {
        int n = 25;
        int count = 0;
        for (int i=1;i<n+1;i++)
        {
            if (i%5==0)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
