package leet.Daily.easy;

import leet._class.linklist.ListNode;
import leet.methods.linklist.easy.Leet21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class Leet2873Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int[] nums,long expected) {
        long res = new Leet2873().maximumTripletValue(nums);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1000000,1,1000000},999999000000L )


        );
    }
}