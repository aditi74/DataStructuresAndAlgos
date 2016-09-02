/*
package LeetCode;

*/
/**
 * Created by 61310444 on 9/3/2016.
 *//*

public class CheckCircular {
}

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class GfGg
{
    boolean isCircular(Node head)
    {
        // Your code here
        if (head==null)
            return true;
        Node slow=head;
        Node fast= head.next;
        while(fast!=null)
        {
            if (slow==fast)
                return true;
            slow=slow.next;
            fast=fast.next.next;


        }


        return false;

    }



}
*/
