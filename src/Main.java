import tests.AdapterTest;
import tests.BridgePatternTest;
import tests.Tester;

public class Main {
    public static void main(String[] args) {
        Test.test(new AdapterTest());
        System.out.println();

        Test.test(new BridgePatternTest());
        System.out.println();


    }
}
