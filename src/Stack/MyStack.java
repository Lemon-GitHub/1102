package Stack;

public class MyStack {
    private int[] array = new int[100];
    private int size = 0;

    public void push(int x){
        array[size] = x;
        size++;
    }

    //出栈 并且保留出栈元素
    public Integer pop(){
        if(size == 0){
            return null;
        }

        int ret = array[size - 1];
        size--;
        return ret;
    }

    public Integer peek(){
        if(size == 0){
            return null;
        }
        return array[size - 1];
    }

    public boolean isempty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

}
