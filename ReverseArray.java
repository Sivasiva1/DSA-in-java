import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int i =a.length-1;
        int[] b = new int[a.length];
        int c = 0;
        while (i>=0)
        {

                b[c++] = a[i];
                i--;

        }
        System.out.println(Arrays.toString(b));
    }
}
