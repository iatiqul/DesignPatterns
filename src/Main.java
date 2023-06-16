import tests.AdapterTest;
import tests.BridgePatternTest;
import tests.Tester;

public class Main {
    public static void main(String[] args) {
        Tester adapterPatternTest = new AdapterTest();
        adapterPatternTest.test();
        System.out.println();
        Tester bridgePatternTest = new BridgePatternTest();
        bridgePatternTest.test();
        System.out.println();
    }
}
