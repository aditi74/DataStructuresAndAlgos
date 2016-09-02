package LeetCode;

/**
 * Created by 61310444 on 9/1/2016.
 */
public class ImplementStack {
}


class StackNode
{
	int data;
	StackNode next;
}
class Stack_using_LinkedList
{
	 StackNode top;
}


// This is method only submission

class GfG
{
    /* The method push to push element into the stack */
    void push(int a,Stack_using_LinkedList ob)
    {
        // Your code here

        StackNode node= new StackNode();
        node.data=a;
        node.next=null;

        if (ob==null||ob.top==null)
        {
            System.out.print("I am*/*/ here ob is null");
            ob.top=node;

        }
        else
        {
           // ob.top.next=node;
            node.next=ob.top;
            ob.top= node;
        }
        System.out.println("data "+ ob.top.data);
    }
    /*The method pop which return the element poped out of the stack*/
    int pop(Stack_using_LinkedList ob)
    {
        //Your code here
        if (ob.top==null)
            return -1;


        int a =ob.top.data;
        //System.out.println(a);
        ob.top =ob.top.next;
        //System.out.println("Now top element ="+ob.top.data);
        return a;
    }

}



