package leet.methods.Search.easy;

import leet.methods.Search.Leet278;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet278Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int n,int expected) {
        int res = new Leet278().firstBadVersion(n);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
//                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12, 3},9,4),
                Arguments.of(3,1)
        );
    }
}