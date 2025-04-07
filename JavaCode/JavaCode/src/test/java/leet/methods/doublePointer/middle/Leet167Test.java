package leet.methods.doublePointer.middle;

import leet.Daily.easy.Leet2873;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Leet167Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int[] nums,int target,int[] expected) {
        int[] res = new Leet167().twoSum(nums,target);
        Assertions.assertArrayEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of( new int[]{2,7,11,15},9 ,new int[]{1,2}),
                Arguments.of( new int[]{2,3,4},6 ,new int[]{1,3}),
                Arguments.of( new int[]{-1,0},-1 ,new int[]{1,2})

        );
    }
}