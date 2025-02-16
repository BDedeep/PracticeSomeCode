package TryCatch;

public class TryCatchFinalExamples {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try{
            j = 20/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        }catch(ArithmeticException e) {
            System.out.println("Cannot divide by Zero"+ e);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit."+ e);
        }catch(Exception e) {
            System.out.println("Something went wrong"+ e);
        }
        System.out.println(j);

        System.out.println("bye");
    }
}
