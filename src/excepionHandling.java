public class excepionHandling {
    public static void main(String[] args) {
        //theory of error and exception
        //error is a problem that arises during the execution of the program
        //exception is a problem that arises during the execution of the program
        //exception is a problem that arises during the execution of the program
        try {
            System.out.println(1/0);
        }
        catch (Exception e)
        {
            System.out.println("error"+e);
        }
        finally {
            System.out.println("finally block");
        }
    }
}
