package LeetCodeProblem;

public class OneThreeTwoPattern {
    public static void main(String[] args) {
        //find the even number


    }
    //123 pattern
    public int onetwothree(int arr[])
    {
        int n=arr.length;
        int min=arr[0];
        for (int i=0;i<n;i++)
        {
            min=Math.min(min,arr[i]);
            if (min==arr[i])
            {
                continue;
            }
            for (int j=i+1;j<n;j++)
            {
                if (min<arr[j] && arr[j]<arr[i])
                {
                    return 1;
                }
            }
        }
        return 0;
    }

}
