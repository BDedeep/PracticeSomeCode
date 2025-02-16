package ThrowThrows;

public class ThrowExamples {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;


        try{
            j = 10/i;
            if(j == 0)
                throw new ArithmeticException("I don't want to print zero!");
        }catch(ArithmeticException e) {
            j = 18;
            System.out.println("that's the default output" + e);
        }catch(Exception e) {

            System.out.println("Something went wrong"+ e);
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}
