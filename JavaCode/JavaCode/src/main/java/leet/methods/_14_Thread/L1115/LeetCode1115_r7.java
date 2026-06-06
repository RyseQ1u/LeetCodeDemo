package leet.methods._14_Thread.L1115;

import java.util.concurrent.Semaphore;

public class LeetCode1115_r7 {

    class FooBar {
        private final int n;

            private final Semaphore foo =  new Semaphore(1);
            private final Semaphore bar =  new Semaphore(0);

            public FooBar(int n) {
                this.n = n;
            }

            public void foo(Runnable printFoo) throws InterruptedException {

                for (int i = 0; i < n; i++) {

                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    foo.acquire();

                    printFoo.run();
                    bar.release();
                }
            }

            public void bar(Runnable printBar) throws InterruptedException {

                for (int i = 0; i < n; i++) {

                    // printBar.run() outputs "bar". Do not change or remove this line.
                    bar.acquire();
                    printBar.run();
                    foo.release();
                }
            }
    }
}
