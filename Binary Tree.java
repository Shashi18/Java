public class Main{
    public static void main(String[] args){
        BinaryTree b = new BinaryTree();
        
        b.addNode(50,"Amigo");
        b.addNode(25,"Bonjour");
        b.addNode(15,"MushiMushi");
        b.addNode(30,"Oho!");
        b.addNode(75,"MayaO");
        b.addNode(85,"Oii Maa");

        b.inOrderTraverse(b.root);
        System.out.println("  ");
        b.preOrderTraverse(b.root);
        System.out.println("  ");
        b.postOrderTraverse(b.root);
        
    }
    
    public static class Node{
        int key;
        String name;
        Node leftChild;
        Node rightChild;
        public Node(int key, String name){
            this.key = key;
            this.name = name;
        }
        
        public String toString(){
            return name + "  " + key;
        }
    }
    
    public static class BinaryTree{
        Node root;
        
        public void preOrderTraverse(Node point){
            if(point != null){
                System.out.println(point);
                preOrderTraverse(point.leftChild);
                preOrderTraverse(point.rightChild);
            }
        }
        public void inOrderTraverse(Node point){
            if(point != null){
                inOrderTraverse(point.leftChild);
                System.out.println(point);
                inOrderTraverse(point.rightChild);
            }
        }
        
        public void postOrderTraverse(Node point){
            if(point != null){
                postOrderTraverse(point.leftChild);
                postOrderTraverse(point.rightChild);
                System.out.println(point);
            }
        }
        public void addNode(int key, String name){
            Node n = new Node(key, name);
            if(root == null)
                root = n;
            else{
                Node temp = root;
                while(true){
                    if(key < temp.key){
                        if(temp.leftChild == null){
                            temp.leftChild = n;
                            break;
                        }
                        temp = temp.leftChild;
                    }
                    else{
                        if (temp.rightChild == null){
                            temp.rightChild = n;
                            break;
                        }
                        temp = temp.rightChild;
                    }

                }
            }
        }
    }
}
