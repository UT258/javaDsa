package DynamicProgrammiing;

public class FrogJump {
    public static void main(String[] args) {
        int arr[]={10 ,20 ,30, 10};
        System.out.println(frogJump(arr.length-1, arr));
    }
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        if(n==0)
        {
            return 0;
        }
        int left=frogJump(n-1, heights)+Math.abs(heights[n-1]-heights[n]);
        int right=Integer.MAX_VALUE;
        if(n>1)
        {
            right=frogJump(n-2, heights)+Math.abs(heights[n-2]-heights[n]);
        }
        return Math.min(right, left);
    }


}
