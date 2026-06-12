// class Node{
//     int val;
//     Node next;
//     Node(int val)
//     {
//         for (int i=0;i<N;i++){
//             this.val=val;
//             next=null;
//         }
//         //this.val=val;
//         //next=null;
//     }
// }
// public class LinkedListEg1{
//     public static void main(String[] args) {
//         int N=5;
//         int[] arr=new int[N];
//     }
// }

// count of elements in linked list
// class Node
// {
//     int val;
//     Node next;
//     Node(int val)
//     {
//         this.val=val;
//         next=null;
//     }
// }
// public class LinkedListEg1 {
//     public static void main(String[] args) {
//         int arr[]=new int[]{1,2,3,4,5};
//         int target=3;
//         // Node e=new Node(arr);
//         Node head=new Node(arr[0]);
//         Node curr=head;
//         int count=1;
//         for(int i=1;i<arr.length;i++)
//         {
//             Node temp=new Node(arr[i]);
//             count+=1;
//             curr.next=temp;
//             curr=curr.next;
//         }
//         while(head!=null)
//         {
//             System.out.println(head.val);
//             head=head.next;
//         }
//         System.out.println("Count:"+count);
//     }
// }


// to remove the head


// class Node
// {
//     int val;
//     Node next;
//     Node(int val)
//     {
//         this.val=val;
//         next=null;
//     }
// }
// public class LinkedListEg1 {
//     public static void main(String[] args) {
//         int arr[]=new int[]{1,2,3,4,5};
//         int target=3;
//         // Node e=new Node(arr);
//         Node head=new Node(arr[0]);
//         Node curr=head;
//         int count=1;
//         for(int i=1;i<arr.length;i++)
//         {
//             Node temp=new Node(arr[i]);
//             count+=1;
//             curr.next=temp;
//             curr=curr.next;
//         }
//         // while(head!=null)
//         // {
//         //     System.out.println(head.val);
//         //     head=head.next;
//         // }
//         System.out.println("Count:"+count);
//         curr=head;
//         target=1;
//         if(head.val==target){
//             head=curr.next;
//             curr=null;
//         }
//         System.out.println(head.val);
        
//     }
// }


// remove tail from linked list


// class Node
// {
//     int val;
//     Node next;
//     Node(int val)
//     {
//         this.val=val;
//         next=null;
//     }
// }
// public class LinkedListEg1 {
//     public static void main(String[] args) {
//         int arr[]=new int[]{1,2,3,4,5};
//         int target=3;
//         // Node e=new Node(arr);
//         Node head=new Node(arr[0]);
//         Node curr=head;
//         int count=1;
//         for(int i=1;i<arr.length;i++)
//         {
//             Node temp=new Node(arr[i]);
//             count+=1;
//             curr.next=temp;
//             curr=curr.next;
//         }
//         // while(head!=null)
//         // {
//         //     System.out.println(head.val);
//         //     head=head.next;
//         // }
//         System.out.println("Count:"+count);
//         // curr=head;
//         // target=1;
//         // if(head.val==target){
//         //     head=curr.next;
//         //     curr=null;
//         // }
//         // System.out.println(head.val);

//         curr=head;
//         Node temp=head;
//         while(curr.next!=null){
//             temp=curr;
//             curr=curr.next;
//             System.out.println(temp.val);

//         }
//         temp.next=null;
//         //System.out.println(curr.val);
        
//     }
// }



class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        next=null;
    }
}
public class LinkedListEg1 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        int target=3;
        // Node e=new Node(arr);
        Node head=new Node(arr[0]);
        Node curr=head;
        // int count=1;
        // for(int i=1;i<arr.length;i++)
        // {
        //     Node temp=new Node(arr[i]);
        //     count+=1;
        //     curr.next=temp;
        //     curr=curr.next;
        // }
        // while(head!=null)
        // {
        //     System.out.println(head.val);
        //     head=head.next;
        // }
        //System.out.println("Count:"+count);
        // curr=head;
        // target=1;
        // if(head.val==target){
        //     head=curr.next;
        //     curr=null;
        // }
        // System.out.println(head.val);

        // curr=head;
        // Node temp=head;
        // while(curr.next!=null){
        //     temp=curr;
        //     curr=curr.next;
        //     System.out.println(temp.val);

        // }
        // temp.next=null;
        //System.out.println(curr.val);

        Node temp=head;
        if(temp.next==null){
            Node newNode=new Node(8);
            temp.next=newNode;
        }
        
    }
}