package leet.methods._4_doublePointer.review.L392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class L392_TemplateTest {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void canPermutePalindrome(String s,String t , boolean expected) {
        boolean res = new L392_r4().isSubsequence(s,t);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {

        return Stream.of(
                Arguments.of("acb","ahbgdc",false)

        );

    }
}