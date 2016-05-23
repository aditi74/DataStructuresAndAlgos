package Heaps;

import Trees.Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 61310444 on 5/22/2016.
 * 1)all levels except last level should have children
 * 2) Root should be greater than children (Max heap)
 *
 */
public class IsBinaryTreeHeap {
    public static void main(String[] args) {
        Tree binaryTree=new Tree(97);
        Tree binaryTree1=new Tree(46);
        Tree binaryTree2=new Tree(37);
        Tree binaryTree3=new Tree(12);
        Tree binaryTree4=new Tree(3);
        Tree binaryTree5=new Tree(7);
        Tree binaryTree6=new Tree(31);
        Tree binaryTree7=new Tree(6);
        Tree binaryTree8=new Tree(4);

         binaryTree.setLeft(binaryTree1);
          binaryTree.setRight(binaryTree2);
        binaryTree1.setLeft(binaryTree3);
        binaryTree1.setRight(binaryTree4);
        binaryTree2.setLeft(binaryTree5);
        binaryTree2.setRight(binaryTree6);
        binaryTree3.setLeft(binaryTree7);
        binaryTree3.setRight(binaryTree8);

       boolean bool= isRootGreaterThanChildren(binaryTree);
        System.out.println(bool);
    }

   public static boolean isRootGreaterThanChildren(Tree root)
   {
       if (root==null) return true;

       if (root.getLeft()==null && root.getRight()==null) return true;

       if (root.getLeft()!=null &&root.getData() < root.getLeft().getData() )
           return false;

       if (root.getRight()!=null && root.getData() <root.getRight().getData())
       return  false;

       return isRootGreaterThanChildren(root.getLeft()) && isRootGreaterThanChildren(root.getRight());
   }

    public static boolean isCompleteBinaryTree(Tree root)
    {
        if (root==null) return false;

        Queue<Tree> queue=new LinkedList<>();


        queue.add(root);
        boolean flag=false;
        while (!queue.isEmpty())
        {
            Tree node =queue.remove();

            if (node.getLeft()!=null)
            {
                if (flag==true)
                    return false;
                queue.add(node.getLeft());


            }
            else flag=false;

            if (node.getRight()!=null)
            {
                if (flag==true)
                    return false;
                queue.add(node.getRight());
            }

            else flag=false;

        }
        return true;

    }
}
