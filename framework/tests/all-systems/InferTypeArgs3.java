import java.util.Arrays;
import java.util.HashSet;

class InferTypeArgs3 {
    void test() {
        java.util.Arrays.asList(new Integer(1), "");
    }

    void foo() {
        new HashSet<>(Arrays.asList(new Object()));
        new HashSet<Object>(Arrays.asList(new Object())) {};
    }
}
