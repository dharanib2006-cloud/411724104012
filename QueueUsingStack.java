import java.util.*;
public class QueueUsingStack{
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    public void Enqueue(int val){
        s1.push(x);
        //System.out.println();
    }
    public int Dequeue(int val){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;

        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
        return s2.pop();
    }
    

}






public class QueueUsingStack{
    public static void main(String[] args) {
        Stack<Integer> std=new Stack<>();
      

    }
}


    

}