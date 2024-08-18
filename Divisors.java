import java.util.Scanner;

public class Divisors {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findDiv(n);
    }

    private static void findDiv(int n) {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i)
                {
                    System.out.println(n/i);
                }
            }
        }
    }
}
