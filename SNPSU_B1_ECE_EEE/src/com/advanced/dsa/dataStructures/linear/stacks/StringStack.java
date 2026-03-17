package com.advanced.dsa.dataStructures.linear.stacks;
public class StringStack {
    private static final int MAX_SIZE = 10;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1; // Initially the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == MAX_SIZE -1;
    }
    public void push(String data){
        if (isFull()){
            System.out.println("Stack Overflow. Can't push more elements.");
            return;
        }
        arr[++top] = data; // Increment the top & add the element at that index
        System.out.println("The string " + data + " was pushed to the stack.");
    }
    public String pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow. Can't pop elements");
            return null; // Because it's String so we return null
        }
        String popped = arr[top--];
        return popped;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Stack Underflow. Can't display anything.");
            return;
        }
        System.out.println("The stack elements from top to bottom (LIFO):");
        for (int i=top; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public String peek(){
        if (isEmpty()){
            System.out.println("Stack Underflow. No Top Element.");
            return null;
        }
        return arr[top];
    }
    public int size(){
        // No elements, single element, multiple elements
        return top + 1; // One formula for all cases
    }
    public static void main(String[] args) {
        StringStack stack = new StringStack();
        // stack.pop();
        stack.push("Mungaru Male");
        stack.push("Milana");
        stack.push("Galipata");
        System.out.println(stack.peek());
        String popped = stack.pop();
        System.out.println("Popped " + popped);
        System.out.println("Size: " + stack.size());
    }
}
