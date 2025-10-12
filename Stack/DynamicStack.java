package Stack;
//Dynamic stack is a stack whose size will never be full
public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super();//this will call the constructor of the CustomStack
    }
    
    public DynamicStack(int size){
        super(size);//this will call the constructor of the CustomStack
    }

    @Override
    public boolean push(int item) throws StackException {
        if(this.isFull()){
            int[] temp=new int[data.length*2];//doubling the size of the stack
            //copy all elements from data stack to temp 
            for(int i=0;i<data.length-1;i++){
                temp[i]=data[i];
            }
            data=temp;//assigning the reference
           

    }
    //now we can insert items
     return super.push(item);//this will call the push method of the CustomStack 
        }
}
