public class Queue {

    private Node front;
    private int size;

    public Queue(){
        this.front = null;
        this.size = 0;
    }

    public void insert(int value){

        Node in = new Node(value);
        Node holder = this.front;

        if (this.front != null) {
            while (holder.getNext() != null) {
                holder = holder.getNext();
            }
            holder.setNext(in);
        }else{
            this.front = in;
        }

        size += 1;

    }

    public int getSize(){
        return this.size;
    }

    public int remove(){

        if (this.front != null) {
            int value = this.front.getValue();
            this.front = this.front.getNext();
            this.size -=1;
            return value;
        }else{
            throw new NullPointerException("You cannot remove from an empty queue!");
        }
    }

    public int peek(){

        if (this.front != null) {
            return this.front.getValue();
        }else{
            throw new NullPointerException("You cannot peek from an empty queue!");
        }
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void printQueue(){
        Node holder = this.front;

        while (holder != null){
            System.out.println(holder.getValue());
            holder = holder.getNext();
        }
    }

}
