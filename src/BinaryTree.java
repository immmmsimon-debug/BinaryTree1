public class BinaryTree <T>{

    private BinaryTreeNode<T> root;
    private int size;

    public BinaryTree(){
        root=null;
        size=0;
    }

    public void add(T data){
        //the list empty
        BinaryTreeNode<T>nodeToAdd = new BinaryTreeNode<T>(data);
        if(front == null){
            front = nodeToAdd;   //add data to front of list
            end = front;// end and front are the same, only one thing in list
        }
        else {//the list is not empty
            //point the new node to the end
            end.setNext(nodeToAdd);
            //point to the front the prev end
            nodeToAdd.setPrev(end);
            //change front ot point to the new node
            end = nodeToAdd;
        }
        size++;
    }

    public T removeFront(){
        if(front != null) {
            front = front.getNext();
            front.getNext().setPrev(front);
            size--;
        }
        return front.getData();
    }

    public T removeEnd2(){
        if(front==null){
            throw new IndexOutOfBoundsException("retarded");
        }
        if(front==end){
            T data = front.getData();
            front=null;
            end=null;
            return data;
        }
        MyDoubleListNode<T> prev = null;
        MyDoubleListNode<T> current = front;
        while(current!=end){
            prev=current;
            current = current.getNext();
        }
        T data = end.getData();

        prev.setNext(null);
        end = prev;
        size--;
        return data;
    }
    public int size(){
        return size;
    }

    public T get(int index) {
        int counter = 0;
        MyDoubleListNode<T> current = front;
        if(index>=size){
            throw new IndexOutOfBoundsException("retarded");
        }
        while ( counter!= index) {
            current = current.getNext();
            counter++;
        }

        return current.getData();
    }
    public T remove(int index){
        int counter = 0;
        MyDoubleListNode<T> current = front;
        MyDoubleListNode<T> next = front.getNext();
        MyDoubleListNode<T> prev = null;
        if(index>=size){
            throw new IndexOutOfBoundsException("dumbmy");
        }
        while ( counter< index) {
            prev = current;
            current = next;
            next = next.getNext();
            counter++;
        }
        T data = current.getData();
        next.setPrev(prev);
        current.setData(null);
        prev.setNext(next);


        size--;
        return data;
    }

    public void addToFront(T data){
        MyDoubleListNode<T> nodeToAdd = new MyDoubleListNode<>(data);

        //the list empty
        if(front == null){
            front=nodeToAdd;//add data to front of list
            end = front;// end and front are the same, only one thing in list
        }
        else {//the list is not empty
            //point the new node to the front
            nodeToAdd.setNext(front);
            //point the front to the new node
            front.setPrev(nodeToAdd);
            //change front to the new node
            front = nodeToAdd;
        }
        size++;
    }

    public String toString() {
        String output = "null-><-";
        int counter=0;
        MyDoubleListNode<T> current = front;
        while (current !=null) {
            output += current.getData() + "-><-";
            current = current.getNext();
        }
        output += "null";
        return output;
    }

}
