class Queue{
    int front,rear=-1;
    int capacity;
    static int[] q1;
    //Constructor
    Queue(int size){
        this.capacity=size;
        q1=new int[capacity];
    }
    //Building isFull() method
    boolean isFull(){
        if (front==0 && rear==capacity-1)
            return true;
        else
            return false;
    }
    //building the isEmpty() method
    boolean isEmpty(){
        if (front==-1)
            return true;
        else
            return false;
    }
    //Building the enqueue() method
    void enqueue(int value){
        if (isFull())
            System.out.println("Queue overflow");
        else{
            if(front==-1)
                front=0;
            rear++;
            q1[rear]=value;
        }
    }
    //Building the dequeue() method
    void dequeue(){
        if (isEmpty())
            System.out.println("Stack Underflow");
        else{
            for (int i=0;i<rear;i++){
                q1[i]=q1[i+1];
            }
            rear--;
        } 
    }
    void display(){
        if(isEmpty()){
            System.out.println("Nothing to print.");
        }
        else{
            System.out.println();
            for (int i=0;i<=rear;i++){
                System.out.print(q1[i]+" ");
            }
        }
    }
}
public class BasicQueue{
    public static void main(String[] args) {
        Queue q2 = new Queue(8);
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(8);
        q2.enqueue(12);
        q2.enqueue(5);
        q2.display();

        q2.dequeue();
        q2.display();
    }
}