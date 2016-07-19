package LinkedList;

import java.util.Stack;

/**
 * Created by 61310444 on 7/17/2016.
 */
public class ImplementStackUsingLL {
    public static int StackCapacity=10;
   public int intCounter=-1;

    private LLNode top;


   public  ImplementStackUsingLL()
    {
        top=null;
        intCounter=0;
    }



    public boolean isEmpty()
    {
        if (top==null)
            return true;
         return false;
    }
    public void push(Integer data)
    {
       LLNode node1= new LLNode(data,null);
      /* if (top==null)
       {

           top=node1;
           return;
       }
       else {
             top.setNext(node1);
           node1=top;
       }*/

        if (top==null)
        {

            top=node1;

        }
        else
        {
           node1.setNext(top);
           top=node1;
        }
        intCounter++;
    }

    public int pop()
    {
      if (top==null)
      {
          System.out.println("Stack Empty");
          return -1;
      }
        else {

          LLNode removeTop= top;
          top=top.getNext();
          System.out.println( removeTop.getData());
          return removeTop.getData();
      }
    }

    public int peek()
    {

      if (top!=null) {
          System.out.println(top.getData());
          return top.getData();
      }
        else
          return -1;
    }
}
