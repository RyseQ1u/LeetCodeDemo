package leet.methods._13_Math.L238;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet238_r1Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int[] input, int[] expected) {
        int[] res = new Leet238_r1().productExceptSelf(input);
        Assertions.assertArrayEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        //test1
        int[] input1 = {1, 2, 3, 4};
        int[] res1 = {24, 12, 8, 6};

        return Stream.of(
                Arguments.of(input1, res1)
        );
    }
}