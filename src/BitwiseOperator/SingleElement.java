package BitwiseOperator;

public class SingleElement {
    public static void main(String[] args) {
        //Question is every element is repeated twice except one element find that element
        System.out.println("find the single element");
        int arr[]={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7};
        System.out.println(singleElement(arr));

    }
    public static int singleElement(int arr[])
    {
        int n=arr.length;
        int res=0;
        for (int i=0;i<n;i++)
        {
            res=res^arr[i];
        }
        return res;
    }
}
