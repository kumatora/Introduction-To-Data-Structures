public class BinaryTree {

    private Node root;

    public BinaryTree(){
        this.root = null;
    }

    private Node insertRec(Node node, int value){

        if (node == null){
            return new Node(value);
        }

        if (value < node.getValue()){
            node.setLeft(insertRec(node.getLeft(),value));
        }

        if (value > node.getValue()){
            node.setRight(insertRec(node.getRight(),value));
        }

        return node;

    }

    public void insert(int value){

        this.root = insertRec(this.root,value);

    }


    private void inorderRec(Node node){
        if (node != null){
            inorderRec(node.getLeft());
            System.out.println(node.getValue());
            inorderRec(node.getRight());
        }
    }

    public void inOrder(){
        inorderRec(this.root);
    }

    private void preOrderRec(Node node){
        if (node != null){
            System.out.println(node.getValue());
            preOrderRec(node.getLeft());
            preOrderRec(node.getRight());
        }
    }

    public void preOrder(){
        preOrderRec(this.root);
    }

    public void postOrderRec(Node node){
        if (node != null){
            postOrderRec(node.getLeft());
            postOrderRec(node.getRight());
            System.out.println(node.getValue());
        }
    }

    public void postOrder(){
        postOrderRec(this.root);
    }

    public int minval(Node node){
        int minv = node.getValue();
        while (node.getLeft() != null){
            minv = node.getLeft().getValue();
            node = node.getLeft();
        }

        return minv;
    }

    private int maxVal(Node node){
        int maxv = node.getValue();
        while (node.getRight() != null){
            maxv = node.getRight().getValue();
            node = node.getRight();
        }

        return maxv;
    }

    public int getMax(){
        return maxVal(this.root);
    }

    public Node removeRec(Node node, int value){

        if (node == null){
            return node;
        }

        if (value < node.getValue()){
            node.setLeft(removeRec(node.getLeft(),value));
        }else if (value > node.getValue()){
            node.setRight(removeRec(node.getRight(),value));
        }else{
            if (node.getLeft() == null && node.getRight() == null){
                return null;
            }
            if (node.getLeft() == null){
                return node.getRight();
            }

            if (node.getRight() == null){
                return node.getLeft();
            }

            node.setValue(minval(node.getRight()));
            int minv = node.getValue();
            node.setRight(removeRec(node.getRight(),minv));
        }

        return node;

    }

    public void remove(int value){
        this.root = removeRec(this.root, value);
    }

    private boolean containsRec(Node node, int value){

        if (node == null){
            return false;
        }else if (node.getValue() == value){
            return true;
        }else if (node.getValue() > value){
            return containsRec(node.getLeft(),value);
        }

        return containsRec(node.getRight(),value);

    }

    public boolean contains(int value){
        return containsRec(this.root,value);
    }

}
