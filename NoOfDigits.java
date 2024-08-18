public class NoOfDigits {
    public static void main(String[] args)
    {
        int n = 1234;
        int temp = n;
        int count = 0;
        while(temp>0)
        {
            int digit = temp % 10;
            count+=1;
            temp = temp /10;
        }
        System.out.println(count);
    }
}
