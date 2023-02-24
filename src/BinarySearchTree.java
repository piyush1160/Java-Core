import java.util.Scanner;

class Node{
    int data;
    Node right ;
    Node left;

    Node(int key ){
        this.data = key;
        this.left =this.right = null;
    }

}

public class BinarySearchTree {
  Node root ;
  BinarySearchTree() {
       root = null;
    }
    public void insert(int key ){
      root = InsertData(root , key );
    }
    public Node InsertData(Node root , int key ){

      if(root == null ){
          root  = new Node(key );
      }

      else if(key < root.data ){
          //key choti hogi to left me hogi ..
          root.left = InsertData(root.left , key );
      }
      else if(key >root.data){
          //key badi hogi to right me hogi ..
          root.right = InsertData(root.right , key);
      }
      return root;

    }
       public void print(){
         PrintTree(root);
       }
     public void PrintTree(Node root ){
        if(root!=null){
            PrintTree(root.left);

            PrintTree(root.right);
            System.out.print(root.data + " ");
        }
     }
     public int searchElement (int key){
      root.data = search(root  , key );
      return root.data;
     }

     public int search (Node root  , int key  ){
//         if (root.data == key || root != null) {
//             return root;
//         }
//         else if (key < root.data ) {
//            root.left =  search(root.left , key);
//         }
//         else if (key> root.data){
//         root.right =  search(root.right , key);
//         }

     return root.data ;
     }




    public static void main(String[] args) {
         BinarySearchTree bst = new BinarySearchTree();
        Scanner cin  =  new Scanner(System.in);
        int n  = cin.nextInt();
          for(int i = 0 ; i< n ; i++ ){
              bst.insert(cin.nextInt());
          }
        bst.print();
         // bst.search(30);
    }

}
