package Arrays;

import java.util.HashMap;

/**
 * Created by 61310444 on 9/18/2016.
 */
public class ImplementLRUcache {
    public static void main(String[] args) {
        LRUCache cache= new LRUCache(1);

        cache.set(2,1);
        System.out.println(cache.get(2));//1
        //System.out.println(cache.get());
        cache.set(3,2);
        System.out.println(cache.get(2));//-1
        System.out.println(cache.get(3));//3
    }
}



class LRUCache {
    class NodeLRU{
        int key;
        int value;
        NodeLRU prev;
        NodeLRU next;

        public NodeLRU(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
        int capacitySize;
        HashMap<Integer, NodeLRU> map = new HashMap<>();
        NodeLRU head = null;
        NodeLRU tail = null;

    public LRUCache(int capacitySize) {
        this.capacitySize = capacitySize;
    }

    public int get(int key) {
            if (map.containsKey(key)) {
                NodeLRU n = map.get(key);
                removeKey(n);
                setHead(n);
                return n.value;
            }

            return -1;


        }


        public void set(int key, int value){
            if (map.containsKey(key))
            {
                NodeLRU nodeLRU= map.get(key);
                nodeLRU.value=value;
                removeKey(nodeLRU);
                setHead(nodeLRU);
               // return;
            }



            else
            {
                NodeLRU nodeLRU= new NodeLRU(key,value);
                if (map.size()>=capacitySize)
                {
                    map.remove(tail.key);
                    removeKey(tail);
                    setHead(nodeLRU);
                   // return;
                }
                else {
                    setHead(nodeLRU);

                }
                map.put(key,nodeLRU);
            }
       return;



}

   public  void removeKey(NodeLRU nodeLRU)
   {
       NodeLRU prevNode=null;
       NodeLRU nextNode=null;

       if (nodeLRU.prev!=null)
       {
           prevNode=nodeLRU.prev;
           prevNode.next=nodeLRU.next;

       }

       else
       {
           tail=nodeLRU.next;
//           tail.prev=null;
       }


       if (nodeLRU.next!=null)
       {
           nextNode=nodeLRU.next;
           nextNode.prev=nodeLRU.prev;

       }


       else {
           head=nodeLRU.prev;

           //    head.next=null;
       }

   }

    public void setHead(NodeLRU nodeLRU)
    {
        if (head==null)
        {
            tail=nodeLRU;
            head=nodeLRU;
           return;
        }

        head.next=nodeLRU;
        nodeLRU.prev=head;
        head=nodeLRU;





    }



}



