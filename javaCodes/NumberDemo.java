package learnJava;

class NumberDemo{
    public void printNumberValues() {
        System.out.println(400000000L);  
        System.out.println(0xCAFEBABE);  
        System.out.println(0b1001);  
        System.out.println(011);
        
        System.out.println(1_000_000_000);  
        System.out.println(0b1111_0100_0010_0100_0000); 

        System.out.println(Byte.toUnsignedInt((byte)-127));  
        
        System.out.println(3.14F);  
        System.out.println(3.14);  
        System.out.println(3.14D);  
        System.out.println(0x1.0p-3);  
    }
}