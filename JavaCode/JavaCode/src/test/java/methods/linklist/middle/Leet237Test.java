package methods.linklist.middle;

import leet._class.linklist.ListNode;
import leet.methods.linklist.middle.Leet237;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet237Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet237WithMethodSource(ListNode l1, ListNode expected) {
        new Leet237().deleteNode(l1.next);
        Assertions.assertEquals (expected, l1);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        new ListNode(4,new ListNode(5,new ListNode(1,new ListNode(9)))),
                        new ListNode(4,new ListNode(1,new ListNode(9)))

                )

        );
    }

}