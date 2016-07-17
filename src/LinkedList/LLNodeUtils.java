package LinkedList;

/**
 * Created by 61310444 on 7/17/2016.
 */
public class LLNodeUtils {


    public static int LLNodeTraversal(LLNode node)
    {
        LLNode temp=node;
        int counter=0;
        while (temp!=null)
        {
            counter++;
            temp=temp.getNext();
        }
        return counter;
    }

}
