package LinkedList;

/**
 * Created by 61310444 on 7/17/2016.
 */
public class LLNode {
    int data;
    LLNode next;

   public LLNode (int data,LLNode next)
    {
        this.data=data;
        this.next=next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }
}
