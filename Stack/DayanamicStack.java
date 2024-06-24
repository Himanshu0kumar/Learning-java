package Stack;

public class DayanamicStack extends CustomStack{

    public DayanamicStack() {
        super();  // it will call CustomStack()
    }

    public DayanamicStack(int size) {
        super(size);    // it will call CustomStack(int size)
    }

    // now everything will be same as in the CustomStack only problem with push 
    // so we override it 
    @Override
    public boolean push(int item) {
        // this takes care of it being is full 
        if(this.isFull()){
            // double the array size 
            int[] temp = new int[data.length*2];

            // copy all the prviour item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp ; 
        }
        // at this point we know that array is not full 
        // insert the item 
        return super.push(item);
    }

    
    
        
}
