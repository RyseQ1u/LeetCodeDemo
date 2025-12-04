package leet.methods._5_mock.review.L946;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class L946_r4Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int[] pushed, int[] popped,boolean expected) {
        boolean res = new L946_r4().validateStackSequences(pushed,popped);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of( new int[]{1,2,3,4,5},new int[]{4,5,3,2,1} ,true)
        );
    }
}