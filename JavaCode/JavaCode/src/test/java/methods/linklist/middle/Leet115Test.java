package methods.linklist.middle;

import leet.stackAndqueue.middle.Leet115;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet115Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet237WithMethodSource( Integer[] expected) {
        Integer[] arr = new Leet115().Test();
        Assertions.assertArrayEquals (expected,arr);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        Integer[] arr =  {null,null,null,null,-3,null,0,-2};
        return Stream.of(
                Arguments.of(
                        arr

                )

        );
    }

}