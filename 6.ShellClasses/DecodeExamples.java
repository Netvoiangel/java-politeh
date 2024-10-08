public class DecodeExamples {
    public static void main(String[] args) {
        Integer value1 = Integer.decode("123");      
        Integer value2 = Integer.decode("0x7B");     
        Integer value3 = Integer.decode("0173");     
        Integer value4 = Integer.decode("-0x7B");    

        System.out.println(value1); 
        System.out.println(value2); 
        System.out.println(value3); 
        System.out.println(value4); 
    }
}
