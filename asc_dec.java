import java.util.Arrays;

public class asc_dec {
    public static void main(String[] args) {
        int[] a ={8,7,1,6,5,9};
        Arrays.sort(a);
        int len = a.length / 2;


        for (int i=0;i<len;i++)
        {

                System.out.println(a[i]);
            }

        for (int i=a.length-1;i>=len;i--)
        {

            System.out.println(a[i]);
        }
        }

}
