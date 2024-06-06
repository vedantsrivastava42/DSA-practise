public class search_BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
   
        
    
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);
        System.out.println(search(root,5));
       
    }
   
    public static boolean search(Node root,int key){
        if(root==null)
        return false;

        if(root.data==key)
        return true;
        else if(root.data < key && root.left!=null)
        search(root.left,key);
        else 
        search(root.right,key);
        
        return false;
    }
}


