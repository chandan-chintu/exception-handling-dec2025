package withexceptionhandling;

public class MultipleCatchExample {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        int res =0;
        try{
            res =a/b;
            System.out.println("res is : "+res);

            String msg1 = "hi hello";
            String msg2 = null;
            System.out.println("length of msg1 is : "+msg1.length());
            System.out.println("length of msg2 is : "+msg2.length());
        }
        catch (ArithmeticException e){
            System.out.println("Exception occurred : "+e.getMessage() +"----"+e.getClass());
        } catch (NullPointerException e){
            System.out.println("Exception occurred : "+e.getMessage() +"----"+e.getClass());
        }

        // generic catch
//        catch (Exception e){
//            System.out.println("Exception occurred : "+e.getMessage() +"----"+e.getClass());
//        }

    }
}
