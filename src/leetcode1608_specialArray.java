import java.util.Arrays;

public class leetcode1608_specialArray {
    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{3,5}));
        int nums[]={3,9,7,8,3,8,6,6};
        Arrays.sort(nums);
        System.out.println(bs(nums,6));

    }
    public static int specialArray(int[] nums) {
        // using sorting and binary search
        Arrays.sort(nums);
        int count=0;
        int ans=-1;
        for (int i = 0; i <= nums.length; i++)

        {
            count = nums.length-bs(nums,i);
            if(count==i)
            {
                return i;
            }
        }

        return -1;
    }

    public static int bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid =(start+end)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                return mid;
            }



        }
        return start;
    }
}
