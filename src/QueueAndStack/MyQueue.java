package QueueAndStack;

import java.util.Stack;

public class MyQueue<T> {

    Stack<T> newestStack, oldestStack;


    public MyQueue(){
        newestStack=new Stack<T>();
        oldestStack=new Stack<T>();
    }

    public int size(){
        return newestStack.size()+oldestStack.size();
    }

    public void add(T value){
        newestStack.push(value);
    }

    private void shiftStack(){
        if(oldestStack.isEmpty()){
            while(!newestStack.isEmpty()){
                oldestStack.push(newestStack.pop());
            }
        }
    }

    public T peek(){
        shiftStack();
        return oldestStack.peek();
    }

    public T remove(){
        shiftStack();
        return oldestStack.pop();
    }
}
