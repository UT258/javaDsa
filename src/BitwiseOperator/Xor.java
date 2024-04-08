package BitwiseOperator;

public class Xor {
    public static void main(String[] args) {
        //you need
        char a='3';
        int b=-'3'-'0';
        char are[]={'1','a','b','2'};
        int sum=0;
        for(char c:are)
        {
          if(c>='0' && c<='9')
          {
              sum+=c-'0';
          }
        }
        System.out.println(sum);
    }
}
