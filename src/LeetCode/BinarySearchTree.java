package LeetCode;

import Arrays.BinarySearch;

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


}

