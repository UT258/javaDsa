package sorting;

import java.util.Arrays;
import java.util.Stack;

public class bubblesort {
    public static void main(String[] args) {
     int arr[]={5,4,3,2,1};
        Stack<Character>st=new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
        System.out.println(st.toString().replace("[","").replace("]","").replace(",",""));

    BubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void BubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1])


                {
                    //if this condition is true means we need to swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
