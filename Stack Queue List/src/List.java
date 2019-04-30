public class List {

    private Node front;
    private int size;

    public List(){
        this.front = null;
        this.size = 0;
    }

    public void insertFront(int value){
        Node in = new Node(value);

        if (this.front == null){
            this.front = in;
        }else{
            in.setNext(this.front);
            this.front = in;
        }
        this.size += 1;
    }

    public void insertRear(int value){
        Node in = new Node(value);

        if (this.front == null){
            this.front = in;
        }else{
            Node holder = this.front;

            while (holder.getNext() != null){
                holder = holder.getNext();
            }

            holder.setNext(in);
        }

        this.size += 1;

    }

    public void printList(){
        Node holder = this.front;

        while (holder != null){
            System.out.println(holder.getValue());
            holder = holder.getNext();
        }

    }

    public int removeFront(){

        if (this.front == null){
            throw new NullPointerException("Cannot remove from an empty list");
        }else {
            int value = this.front.getValue();
            this.front = this.front.getNext();
            this.size -=1;
            return value;
        }
    }

    public int removeRear(){
        int value = 0;

        if (this.front == null){
            throw new NullPointerException("Cannot remove from an empty list");
        }else{
            Node holder = this.front;
            Node previous = this.front;

            while (holder.getNext() != null){
                previous = holder;
                holder = holder.getNext();
            }
            value = holder.getValue();
            previous.setNext(null);
            this.size -=1;
        }
        return value;

    }

    public int max(){
        int max = this.front.getValue();
        Node holder = this.front;

        while (holder != null){
            if (holder.getValue() > max){
                max = holder.getValue();
            }
            holder = holder.getNext();
        }

        return max;

    }

    public int min(){
        int min = this.front.getValue();
        Node holder = this.front;

        while (holder != null){
            if (holder.getValue() < min){
                min = holder.getValue();
            }
            holder = holder.getNext();
        }

        return min;

    }

    public int remove(int index){

        int value = 0;

        if (this.front == null){
            throw new NullPointerException("Can't remove from an empty list");
        }else if (index > this.size){
            throw new ArrayIndexOutOfBoundsException("Can't remove outside array bounds!");
        }else{
            if (index == 0){
                value = this.front.getValue();
                this.front = this.front.getNext();
                size -= 1;
            }else{
                Node holder = this.front;
                Node previous = this.front;

                int counter = 0;

                while (holder != null){
                    if (counter == index){
                        value = holder.getValue();
                        previous.setNext(holder.getNext());
                        counter += 1;
                    }else{
                        previous = holder;
                        holder = holder.getNext();
                        counter += 1;
                    }
                }

            }
        }

        return value;
    }

}
