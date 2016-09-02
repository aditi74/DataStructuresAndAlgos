package LeetCode;

/**
 * Created by 61310444 on 8/30/2016.
 */
public class ImplementStackUsingLL {
    public static void main(String[] args) {
        Node node1= new Node(1);
        Node node2= new Node(1);
        Node node3= new Node(1);
        Node node4= new Node(1);
        Node node5= new Node(1);

        int a= 5/2;
        System.out.println("a"+ a);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        /*node4.next=node5;
        node5.next=null;
*/
        GfGg gfGg= new GfGg();
       boolean bool= gfGg.isCircular(node1);
        System.out.println(bool);


    }

}
