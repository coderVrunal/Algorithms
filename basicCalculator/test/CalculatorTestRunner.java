import org.junit.runner.JUnitCore;

public class CalculatorTestRunner{
    public static void main(String [] args){
        Result result = JUnitCore.runClasses(CalculatorTests.class);
        for( Failure failure : result.getFailures() )
            System.out.println( failure.toString());
    }
}