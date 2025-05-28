package leet.methods.mock.middle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet6Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(String str,int target,String expected) {
        String res = new Leet6().convert(str,target);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of( "PAYPALISHIRING",3 ,"PAHNAPLSIIGYIR"),
                Arguments.of( "PAYPALISHIRING",4 ,"PINALSIGYAHRPI")
        );
    }
}