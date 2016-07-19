package LinkedList;

/**
 * Created by 61310444 on 7/20/2016.
 */
public class ImplementQueueUsingStack {
    ImplementStackUsingLL stackA;
    ImplementStackUsingLL stackB;

    public ImplementQueueUsingStack()
    {
        stackA=new ImplementStackUsingLL();
        stackB=new ImplementStackUsingLL();
    }

    public void enqueue(int data)
    {
        stackA.push(data);
        return;
    }

    public  int dequeue()
    {
        while (stackA.peek()!=-1)
        {
            stackB.push(stackA.pop());
        }
       int data= stackB.pop();
        while (stackB.peek()!=-1)
        {
            stackA.push(stackB.pop());
        }
        System.out.println("Element deleted "+data);
        return data;


    }

}
