package LeetCode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by 61310444 on 9/4/2016.
 */
public class BinarySearchTree {

}

class BinaryTree
{
   int data;
    BinaryTree left;
    BinaryTree right;

    BinaryTree (int data)
    {
        this.data=data;
        left=null;
        right=null;

    }
}
@SuppressWarnings("rawtypes")
class BinaryTreeImplementation
{
    BinaryTree root;
    public BinaryTree BinaryTreeInsertion(BinaryTree root,int data)
    {

        //BinaryTree node= new BinaryTree(data);
        if (root==null)
        {
            BinaryTree node= new BinaryTree(data);
            return node;
        }

        if (root.data< data)
            root.right= BinaryTreeInsertion(root.right,data);

        else if (root.data >data)
            root.left=BinaryTreeInsertion(root.left,data);

        return root;
    }


    public void BinarySearchTreeTraversal(BinaryTree root)
    {
        if (root!=null)
        {
            BinarySearchTreeTraversal(root.left);
            System.out.println(root.data);
            BinarySearchTreeTraversal(root.right);
        }
    }


    public void BinarySearchwithinGivenRange(BinaryTree node,int k1,int k2)
    {
        if (node!=null)
        {
            BinarySearchwithinGivenRange(node.left,k1,k2);
            if (node.data>=k1 && node.data<=k2)
                System.out.print(node.data +" ");
            BinarySearchwithinGivenRange(node.right,k1,k2) ;
        }
    }


    public  void levelOrderTraversalFollowedByDollar(BinaryTree root)
    {
        if (root==null)
        {
            return;
        }
        BinaryTree node=root;
        Queue<BinaryTree>  queue= new LinkedList<>();
        queue.add(node);
        //BinaryTree dummy= new BinaryTree(-100);
        queue.add(null);


        while (!queue.isEmpty())
        {
           BinaryTree temp= queue.remove();
           if (temp==null){
               System.out.print("$" +" ");
               if (!queue.isEmpty())
               queue.add(null);
              continue;
           }
           else
               System.out.print(temp.data + " ");

           if(temp.left!=null)
               queue.add(temp.left);

           if (temp.right!=null)
               queue.add(temp.right);

           //queue.add(null);

        }


    }





    public static void main(String[] args) {
        BinaryTree node= new BinaryTree(1);
        BinaryTree node1= new BinaryTree(2);
        BinaryTree node2= new BinaryTree(3);
        BinaryTree node3= new BinaryTree(4);
        BinaryTree node4= new BinaryTree(5);
        BinaryTree node5= new BinaryTree(6);
        node.left=node1;
        node.right=node2;
        node1.left=node3;
        node1.right=node4;
        node2.left=node5;

        BinaryTree nodeA= new BinaryTree(1);
        BinaryTree nodeA1= new BinaryTree(2);
        BinaryTree nodeA2= new BinaryTree(3);
        BinaryTree nodeA3= new BinaryTree(4);
        BinaryTree nodeA4= new BinaryTree(5);
        BinaryTree nodeA5= new BinaryTree(6);
        nodeA.left=nodeA1;
        nodeA.right=nodeA2;
       /* nodeA1.left=nodeA3;
        nodeA1.right=nodeA4;
       nodeA2.left=nodeA5;*/
/*

        node3.left=null;
        node3.right=null;

        node4.left=null;
        node4.right=null;
        node5.left=null;
        node5.right=null;

        node3.right=null;
*/

        BinaryTreeImplementation binaryTreeImplementation=new BinaryTreeImplementation();
       // binaryTreeImplementation.levelOrderTraversalFollowedByDollar(node);
        //binaryTreeImplementation.BinarySearchTreeTraversal(node);

      /*  boolean tree=binaryTreeImplementation.checkTreesIdentical(node,nodeA);
        System.out.println("Is trees identical "+ tree);*/

        binaryTreeImplementation.levelOrderReversal(node);


    }


  @SuppressWarnings("rawtypes")
    public void levelOrderReversal(BinaryTree root)
    {
        if (root ==null)
            return;

        Queue<BinaryTree> queue= new LinkedList<BinaryTree>();
        queue.add(root);
        Stack<BinaryTree> stack=new Stack();

        while (!queue.isEmpty())
        {
            BinaryTree temp= queue.remove();
            stack.add(temp);
            if(temp.right!=null)
                queue.add(temp.right);
            if (temp.left!=null )
                queue.add(temp.left);
        }

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop().data + " ");
        }
    }


    public  boolean checkTreesIdentical(BinaryTree rootA,BinaryTree rootB)
    {
      /* if (rootA==null && rootB==null)
           return true;*/
        if ((rootA==null && rootB!=null )||(rootA!=null && rootB==null ))
        {
            return false;
        }


        if ( rootA!=null && rootB!=null && (rootA.data!=rootB.data))
            return false;

        if (rootA==null && rootB==null)return true;
        else
            return (rootA.data==rootB.data &&checkTreesIdentical(rootA.left,rootB.left) &&  checkTreesIdentical(rootA.right,rootB.right));






    }

}

