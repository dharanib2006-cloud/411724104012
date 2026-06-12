// import java.util.*;
// public class Numbers{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int x = sc.nextInt();
//         // for(int i = x;i>=1;i--){
//         //     System.out.println();

//         int x = sc.nextInt();
//         for(int i = x;i>=1;i-= 5){
//             System.out.println(i);
//         }

//     }
// }


// sum of first n numbers

// import java.util.*;
// public class Numbers{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         for(int i=0;i<=9;i++)
//         {
//             int x = sc.nextInt();

//         }
        
//         for(int i =0;i<=9;i++){
//             sum+=i;
//         }
//         System.out.println("sum of 10 numbers is:"+sum);
//     }
// }

// sum of even indexed values

// import java.util.*;
// public class Numbers{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[10];
//         for(int i=0;i<10;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         int sum =0;
//         for(int i =0;i<10;i++){
//             if(i%2==0){
//                 sum+=arr[i];
//             }
//         }
//         System.out.println("sum of even index numbers is:"+sum);
//     }
// }

// leap year

// import java.util.*;
// public class Numbers
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter year:");
//         int year = sc.nextInt();
//         if(year%400==0 || (year%4==0 && year%100 !=0))
//         {
//             System.out.println("It is a leap year");
//         }
//         else{
//             System.out.println("It is not a leap year");
//         }

// }
// }

   

// import java.util.*;
// public class Numbers
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter side1:");
//         int a = sc.nextInt();
//         System.out.println("enter side2:");
//         int b = sc.nextInt();
//         System.out.println("enter side3:");
//         int c = sc.nextInt();
//         if((a+b)>c && (a+c)>a && (b+c)>a)
//         {
//             System.out.println("It is a valid triangle");
//         }
//         else{
//             System.out.println("It is not a valid triangle");
//         }

// }
// }


// check whether a number is multiple of both 3 and 5

// import java.util.*;
// public class Numbers
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number:");
//         int num = sc.nextInt();
//         if(num%3==0 && num%5==0)
//         {
//             System.out.println("the number is multiple of both 3 and 5");
//         }
//         else{
//             System.out.println("the number is not the multiple of 3 and 5");
//         }

// }
// }


// check whether a number lies between 10 and 50

// import java.util.*;
// public class Numbers
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number:");
//         int num = sc.nextInt();
//         if(num>=10 && num<=50)
//         {
//             System.out.println("the number is between 3 and 5");
//         }
//         else{
//             System.out.println("the number is not in between 3 and 5");
//         }

// }
// }


// pattern

// import java.util.*;
// public class Numbers
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int cur=1;
//         for(int i=0;i<x;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print(cur + " ");
//                 cur++;
//             }
//             System.out.println();
//         }

// }
// }



// import java.util.*;
// public class Numbers
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
        
//         for(int i=0;i<x;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print((char)('A'+j) );
               
//             }
//             System.out.println();
//         }

// }
// }




// public class Numbers
// {
//     public static void main(String[] args) {
        
//         int n=4;
//         for(int i=0;i<n;i++){
//             for (int j = 0; j < n-1-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=0;k<i+1;k++){
//                 System.out.print((char)('A'+k));
//             }for(int l=i-1;l>=0;l--){
//                 System.out.print((char)('A'+l));
//             }
//             System.out.println();
        
//     }

// }
// }



 public class Numbers
{
    public static void main(String[] args) {
        
        int n=5;
        for(int i=0;i<n;i++){
            int cur=i%2;
        for(int j=0;j<i;j++){
            System.out.print(cur+" ");
            cur = 1-cur;
        }
        System.out.println();
        
    }

}
}
