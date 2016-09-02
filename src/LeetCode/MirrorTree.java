package LeetCode;

/**
 * Created by 61310444 on 9/3/2016.
 */
public class MirrorTree {
}
// FUNCTION CODE
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
}

class gg
{
    void mirror(Node node)
    {
        // Your code here
        if (node==null)
            return ;
        mirror(node.left);
        mirror(node.right);

        Node temp=node.left;
        node.left =node.right;
        node.right=temp;


    }
}
