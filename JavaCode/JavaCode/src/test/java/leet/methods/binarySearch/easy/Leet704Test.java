package leet.methods.binarySearch.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet704Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int[] nums, int target,int expected) {
        int res = new Leet704().search(nums,target);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
//                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12, 3},9,4),
                Arguments.of(new int[]{-1,0,3,5,9,12},9,4)
        );
    }
}