public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> right;
    BinaryTreeNode<T> left;

    public  BinaryTreeNode(T data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
    public BinaryTreeNode(BinaryTreeNode<T> prev,T data, BinaryTreeNode<T> right){
        this.data = data;
        this.right = right;
        this.left = prev;
    }

    public BinaryTreeNode<T> getPrev() {
        return left;
    }

    public void setPrev(BinaryTreeNode<T> prev) {
        this.left = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }
    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    @Override
    public String toString() {
        return "MyListNode{" +
                "data=" + data +
                ", Left =" + left +
                ", Right =" + right +
                '}';
    }
}
}
