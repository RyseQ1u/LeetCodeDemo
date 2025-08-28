package leet.methods._13_Math;

import leet._class.Tree.TreeNode;
import leet.methods.DivideConquer.Leet105;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Leet1823Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int n, int k, int expected) {
        int res = new Leet1823().findTheWinner_V3(n,k);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {

        return Stream.of(
                Arguments.of(5,2,3),
                Arguments.of(11,3,7)
        );

    }
}