package leet.methods._14_Thread.L1115;

import java.util.concurrent.Semaphore;

public class LeetCode1115_r3 {

    class FooBar {
        private final int n;
        private final Object obj = new Object();
        private volatile boolean isFoo = true;

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (obj) {
                    if (!isFoo) {
                        obj.wait();
                    }
                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    printFoo.run();
                    isFoo=false;
                    obj.notify();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (obj) {
                    if (isFoo) {
                        obj.wait();
                    }
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    isFoo=true;
                    obj.notify();
                }
            }
        }
    }

    class FooBarV2 {
        private final int n;

        public FooBarV2(int n) {
            this.n = n;
        }
        private final Semaphore fs = new Semaphore(1);
        private final Semaphore bs = new Semaphore(0);

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                fs.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                bs.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                bs.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                fs.release();
            }
        }
    }
}
