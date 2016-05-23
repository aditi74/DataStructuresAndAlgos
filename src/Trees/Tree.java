package Trees;

/**
 * Created by 61310444 on 5/22/2016.
 */
public class Tree {
      private int data;
      private Tree left;
      private Tree right;

      public Tree(int data)
      {
          this.data=data;
          this.left=null;
          this.right=null;
      }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}
