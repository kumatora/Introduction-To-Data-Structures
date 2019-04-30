public class Stack {

    private Node top;
    private int size;

    public Stack(){
        this.top = null;
        size = 0;
    }

    public void push(int value){
        Node insert = new Node(value);

        if (this.top == null){
            this.top = insert;
        }else{
            insert.setNext(this.top);
            this.top = insert;
        }

        this.size+=1;

    }

    public int peek(){
        if (this.top != null) {
            return this.top.getValue();
        }else{
            throw new NullPointerException("Cannot peek empty stack");
        }
    }

    public int pop(){
        if (this.top != null){
            int value = this.top.getValue();
            this.top = this.top.getNext();
            this.size -=1;
            return value;
        }else{
            throw new NullPointerException("Cannot pop empty stack");
        }
    }

    public boolean isEmpty(){
        return this.size == 0;
    }


    public void printStack(){

        Node printer = this.top;

        while (printer != null){
            System.out.println(printer.getValue());
            printer = printer.getNext();
        }

    }

}
