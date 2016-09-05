package LeetCode;

import java.util.Stack;
import java.util.jar.Pack200;

/**
 * Created by 61310444 on 9/6/2016.
 */
public class ImplementQueueUsingStack {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();


    void insert(int data)
    {
        st1.push(data);
    }


    int remove()
    {
        if (st1.isEmpty())
            return -1;
        while (!st1.isEmpty())
        {
            int data= st1.peek();
            st2.push(data);
            st1.pop();
        }

        int popedEle= st2.peek();
        System.out.println(popedEle);
        st2.pop();

        while (!st2.isEmpty())
        {
           st1.push(st2.peek());
           st2.pop();



        }
  return popedEle;

    }


    public static void main(String[] args) {
        ImplementQueueUsingStack queueUsingStack= new ImplementQueueUsingStack();
        queueUsingStack.insert(1);
        queueUsingStack.insert(2);
        queueUsingStack.insert(3);

        queueUsingStack.remove();
        queueUsingStack.remove();
        queueUsingStack.remove();
        queueUsingStack.remove();

    }
}
