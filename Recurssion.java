// check if it is palindrome or not

// public class Recurssion {
//     public static boolean isPalindrome(String s,int i,int j)
//     {
//         if(i>=j) return true;
//         if (s.charAt(i) != s.charAt(j)) return false;

//         return isPalindrome(s, i + 1, j - 1);
//     }
//     public static void main(String[] args) {
//         String s = "madam";
//         System.out.println(isPalindrome(s, 0, s.length() - 1));
//     }
// }


// fibonacci series using recurssion


// public class Recurssion {

//     public static int fib(int n) {
//         if (n <= 1) return n;

//         return fib(n - 1) + fib(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 7;

//         for (int i = 0; i < n; i++) {
//             System.out.print(fib(i) + " ");
//         }
//     }
// }



// import java.util.*;

// class Main {
//   public static void main(String[] args){ 
//       System.out.println(new Main().solve()); 
//   }

//   public String solve(){ 
//       Scanner sc = new Scanner(System.in);
//       String s = sc.nextLine().trim();

//       String[] words = s.split(" +"); // split by spaces

//       StringBuilder result = new StringBuilder(); // FIX

//       for (int i = words.length - 1; i >= 0; i--) {
//           result.append(words[i]);
//           if (i != 0) {
//               result.append(" ");
//           }
//       }

//       return result.toString(); // FIX
//   }
// }


// recurssion in factorial

// public class Recurssion{
//     static int factorial(int x){
//         if(x==0 || x==1)
//             return 1;
//         else
//             return x*factorial(x-1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int result=factorial(n);
//         System.out.println("factorial of " +  n  +  " is " +  result );
//     }
// }


// recurssion in sum

// public class Recurssion{
//     static int sum(int x){
//         if(x==0)
//             return 0;
//         else
//             return x+sum(x-1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int result=sum(n);
//         System.out.println("factorial of " +  n  +  " is " +  result );
//     }
// }

// recurssion in fibonacci series

// public class Recurssion{
//     static int fibonacci(int x){
//         if(x==0 || x==1)
//             return 1;
//         else
//             return fibonacci(x-1)+fibonacci(x-2);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int result=fibonacci(n);
//         System.out.println("factorial of " +  n  +  " is " +  result );
//     }
// }