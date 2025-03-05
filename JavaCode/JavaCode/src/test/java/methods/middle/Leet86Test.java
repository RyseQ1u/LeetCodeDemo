package methods.middle;

import leet._class.ListNode;
import leet.methods.middle.Leet86;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet86Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet206WithMethodSource(ListNode l1, int x, ListNode expected) {
        ListNode res = new Leet86().partition(l1,x);
        Assertions.assertEquals (expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(1)))),
                        3,
                        new ListNode(1,new ListNode(2,new ListNode(1,new ListNode(3))))



                )

        );
    }

}