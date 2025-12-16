package withexceptionhandling;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            int a = 20;
            if (a != 20) {
                System.out.println("a is not 20, hence not throwing exception");
            } else {
                throw new RuntimeException("a is 20, hence manually throwing the exception");
            }
        } catch (Exception e){
            System.out.println("exception occurred : "+e.getMessage()+"----"+e.getClass());
        }
    }
}
