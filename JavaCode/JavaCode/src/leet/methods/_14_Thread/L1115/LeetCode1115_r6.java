package leet.methods._14_Thread.L1115;

import java.util.concurrent.Semaphore;

public class LeetCode1115_r6 {

    class FooBar {
        private final int n;

        public FooBar(int n) {
            this.n = n;
        }
        private final Semaphore foo = new Semaphore(1);
        private final Semaphore bar = new Semaphore(0);
        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                foo.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                bar.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                bar.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                foo.release();
            }
        }
    }

    class FooBarV2 {
        private final int n;

        public FooBarV2(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
            }
        }
    }
}
