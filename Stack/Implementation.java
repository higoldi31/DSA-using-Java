package Stack;
//Stack implementation using array
class StackException extends Exception{//customized exception
    public StackException(String msg){
        super(msg);
    }
}
 class CustomStack{
    int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
   
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item) throws StackException{//push method for adding item
        if(isFull()){
            throw new StackException("Stack is Full.");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException{//pop method for removing item
        if(isEmpty()){
            throw new StackException("Cannot pop form an Empty Stack.");
        }
        int removedItem=data[ptr--];
        return removedItem;
    }

    public int peek() throws StackException{//peek method for retrieving topmost element
        if(isEmpty()){
            throw new StackException("Cannot peek from an Empty Stack.");
        }
        return data[ptr];

    }

    public boolean isFull(){// isFull method to check if stack is full
        return ptr==data.length-1;
    }
    
    public boolean isEmpty(){// isEmpty method to check if stack is empty
        return ptr==-1;
    }
}

public class Implementation{
    public static void main(String[] args) throws StackException {
        CustomStack stack=new CustomStack(5);//passing the size of the stack
        stack.push(3);
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(14);
        stack.push(19);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        DynamicStack dynamicStack=new DynamicStack(5);
        dynamicStack.push(2);
        dynamicStack.push(4);
        dynamicStack.push(6);
        dynamicStack.push(7);
        dynamicStack.push(8);
        dynamicStack.push(11);
        System.out.println(dynamicStack.peek());
    }
}