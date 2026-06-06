package leet.methods._14_Thread.L1115;

import java.util.concurrent.Semaphore;

public class LeetCode1115_r1 {

    class FooBar {
        private final int n;
        private final Object lock = new Object();
        private volatile boolean isFoo = true;

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (lock){
                    if(!isFoo){
                        lock.wait();
                    }
                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    printFoo.run();
                    isFoo=false;
                    lock.notify();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (lock){
                    if(isFoo){
                        lock.wait();
                    }
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    isFoo=true;
                    lock.notify();
                }
            }
        }
    }

    class FooBarV2 {
            private final int n;
            private final Semaphore fooSema = new Semaphore(1);
            private final Semaphore barSema = new Semaphore(0);


            public FooBarV2(int n) {
                this.n = n;
            }

            public void foo(Runnable printFoo) throws InterruptedException {

                for (int i = 0; i < n; i++) {
                    fooSema.acquire();
                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    printFoo.run();
                    barSema.release();
                }
            }

            public void bar(Runnable printBar) throws InterruptedException {

                for (int i = 0; i < n; i++) {
                    barSema.acquire();
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    fooSema.release();
                }
            }
    }
}
