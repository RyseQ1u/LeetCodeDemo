package leet.methods._2_stackAndqueue.review.L266;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class L266_Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void canPermutePalindrome(String s , boolean expected) {
        boolean res = new L266_r5().canPermutePalindrome(s);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {

        return Stream.of(
                Arguments.of("aab",true),
                Arguments.of("carerac",true),
                Arguments.of("code",false),
                Arguments.of("a",true),
                Arguments.of("ab",false)
        );

    }
}