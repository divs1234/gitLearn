package learnJava;
import java.util.Random;

class VariableDemo{
    public static final int DAYS_PER_YEAR = 365;

    enum Weekday { MON, TUE, WED, THU, FRI, SAT, SUN };

    public void printVariables() {

        int i=0;
        Random generator = new Random();
        double lotsa$ = 10000000.0;
        double elevation = 0.0;
        double n = 3.14159234567865435654;
        String Count = "Dracula";
        final int DAYS_PER_WEEK = 7;
        Weekday startDay = Weekday.MON;

        System.out.println(i);
        System.out.println(generator.nextDouble());
        System.out.println(lotsa$);
        System.out.println(elevation);
        System.out.println(n);
        System.out.println(Count);
        System.out.println(DAYS_PER_WEEK);
        System.out.println(startDay);

    }
}


class HelloWorld{
    public void helloWorld(){  
        System.out.println("Hello");  
    } 
}

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

public class JavaFundamentals {
    public static void playWithNumbers(){
        NumberDemo numbers = new NumberDemo();
        numbers.printNumberValues();
    }

    public static void playWithVariables(){
        VariableDemo variable = new VariableDemo();
        variable.printVariables();
    }

    public static void playWithHelloWorld() {
        HelloWorld hello = new HelloWorld();
        hello.helloWorld();
    }      

    public static void main(String[] args) {
        System.out.println("\nFunction : playWithHelloWorld");
        playWithHelloWorld();

        System.out.println("\nFunction : playWithNumbers");
        playWithNumbers();

        System.out.println("\nFunction : playWithVariables");
        playWithVariables();

    }
}