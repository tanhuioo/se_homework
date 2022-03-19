import java.util.Comparator;
import java.util.List;

public class InsertionSort {

    public static void sort(int[] a){
        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]) {
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}
