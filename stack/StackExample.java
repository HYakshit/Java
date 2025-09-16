package stack;

import java.util.*;


public class StackExample {
    public static void main(String[] args) {
        CustomStack obj = new CustomStack(15);
        obj.push(222);
        obj.push(25);
        obj.pop();
        //   obj.pop();
        obj.peek();
    }

}

class CustomStack {
    int[] arr;
    int top;
    int maximum = 0;

    CustomStack(int arrSize) {
        arr = new int[arrSize];
        top = 0;                // always start at 0
        maximum = arr.length;
    }

    void push(int data) {
        if (top == maximum) {
            System.out.println("Overflow");
            return;
        }
        arr[top++] = data;
    }

    void pop() {
        if (top == 0) {
            System.out.println("Underflow");
            return;
        }
        arr[--top] = 0;
    }

    void peek() {
        if (top == 0) {
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top-1]);
    }
    void peekAll() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }



}