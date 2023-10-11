package BitwiseOperator;

public class operators {
    public static void main(String[] args) {
        //bitwise operator
        //left shift operator when you left shift the number by 1 it will multiply by 2
        //right shift operator when you right shift the number by 1 it will divide by 2
        //left shift operator   <<  multiply by 2
        //right shift operator  >>  divide by 2
        //right shift operator  >>> divide by 2 but it will not consider the sign bit
        int n=34;
        System.out.println(n<<1);
        //it will first convert the decimal number to binary number and then it will left shift the number by 1
        System.out.println(n>>2);//it will divide the number by 2 two times and then it will print the number
        System.out.println(n>>>2);//it will divide the number by 2 two times and then it will print the number
        // but it will not consider the sign bit and the sign bit will be replaced by 0 what is sign bit sign bit is the
        // first bit of the number if the number is positive then the sign bit will be 0 and if the number is negative then the sign bit will be 1
    }
}
