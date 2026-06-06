package leet.methods._14_Thread.L1115;

import java.util.concurrent.Semaphore;

public class LeetCode1115_r5 {

    class FooBar {
        private final int n;
        private volatile boolean isFoo=true;
        private final Object obj= new Object();
        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (obj){
                    if(!isFoo){
                        obj.wait();
                    }
                    isFoo=false;
                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    printFoo.run();
                    obj.notify();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (obj){
                    if(isFoo){
                        obj.wait();
                    }
                    isFoo=true;
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    obj.notify();
                }
            }
        }
    }

    class FooBarV2 {
        private final int n;
        private final Semaphore sF = new Semaphore(1);
        private final Semaphore sB = new Semaphore(0);
        public FooBarV2(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                sF.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                sB.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                sB.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                sF.release();
            }
        }
    }
}
