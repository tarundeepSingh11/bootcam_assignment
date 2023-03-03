package question3;
import java.util.*;
public class specialStack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    private int[] minArray;

    // Constructor to initialize the stack
    public specialStack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
        minArray = new int[maxSize];
    }

    // Push operation
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push data.");
            return;
        }
        if (isEmpty()) {
            minArray[++top] = data;
        } else {
            minArray[++top] = Math.min(data, minArray[top - 1]);
        }
        stackArray[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop data.");
            return -1;
        }
        int data = stackArray[top--];
        minArray[top + 1] = 0; // remove the min element from minArray
        return data;
    }

    // isEmpty operation
    public boolean isEmpty() {
        return (top == -1);
    }

    // isFull operation
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // getMin operation
    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot get minimum element.");
            return -1;
        }
        return minArray[top];
    }
    public static void main(String[] args){
        specialStack st=new specialStack(10);
        st.push(5);
        st.push(7);
        st.push(77);
        st.push(55);
        st.pop();
        System.out.println(st.getMin());
       System.out.println(st.pop());

    }
}
