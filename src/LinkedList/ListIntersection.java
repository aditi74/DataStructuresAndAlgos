package LinkedList;

/**
 * Created by 61310444 on 7/17/2016.
 */
public class ListIntersection {
    public static void main(String[] args) {
        LLNode node1= new LLNode(1,null);
        LLNode node2= new LLNode(2,null);
        LLNode node3= new LLNode(3,null);
        LLNode node4= new LLNode(4,null);
        LLNode node5= new LLNode(5,null);
        LLNode node6= new LLNode(6,null);
       // LLNode node7= new LLNode(1,null);
        LLNode node8= new LLNode(8,null);
        LLNode node9= new LLNode(9,null);

        LLNode node10= new LLNode(10,null);
        LLNode node11 =new LLNode(11,null);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        node8.setNext(node9);
        node9.setNext(node10);
        node10.setNext(node11);


        LLNode nodeA=node1;
        LLNode nodeB=node8;

        LLNode node=linkedListIntersection(nodeA,nodeB);
        if( node!=null)
        System.out.println("Node is + " +node.getData());
        else
            System.out.println("No intersection ");

    }

    public static LLNode linkedListIntersection(LLNode nodeA,LLNode nodeB)
    {
       int lengthA=LLNodeUtils.LLNodeTraversal(nodeA);
       int lengthB=LLNodeUtils.LLNodeTraversal(nodeB);
       LLNode headA=nodeA;
       LLNode headB=nodeB;
       int diff= Math.abs(lengthA-lengthB);
       if (nodeA==null || nodeB==null)
           return null;

       if (lengthA>lengthB)
       {
            while (diff!=0)
            {
                headA=headA.getNext();
                diff--;
            }
       }
       if (lengthB>lengthA)
       {
           while (diff!=0)
           {
               headB=headB.getNext();
               diff--;
           }
       }

       while (headA!=null || headB!=null)
       {
           if (headA.getNext()==headB.getNext())
               return headA.getNext();
           headA=headA.getNext();
           headB=headB.getNext();
       }
      return null;


    }


}
