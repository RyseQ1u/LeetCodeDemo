package leet.stackAndqueue.middle;

import leet._class.stackAndqueue.MinStack_Stack;

public class Leet115 {

    public Integer[] Test(){
        Integer[] arr = new Integer[8];
        MinStack_Stack minStack = new MinStack_Stack();
        arr[0]=null;

        minStack.Push(-2);
        arr[1]=null;
        minStack.Push(0);
        arr[2]=null;
        minStack.Push(-3);
        arr[3]=null;
        arr[4]=minStack.GetMin();

        minStack.Pop();
        arr[5]=null;
        arr[6]=minStack.Top();

        arr[7]=minStack.GetMin();

        return  arr;
    }

}


