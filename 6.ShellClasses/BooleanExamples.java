public class BooleanExamples {
    public static void main(String[] args) {
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.valueOf("false");
        Boolean bool4 = Boolean.valueOf("TRUE");

        Boolean bool5 = true;
        
        System.out.println(bool1); 
        System.out.println(bool2); 
        System.out.println(bool3); 
        System.out.println(bool4); 
        System.out.println(bool5); 
    }
}
