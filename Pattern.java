// public class Pattern {
//     public static void main(String[] args) {

//         int n = 5;

//         for (int i = 0; i < n; i++) {

//             // 1. Print spaces
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }

//             // 2. Print stars
//             for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }


// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 0; i < n; i++) {

//             // Find starting character
//             char ch = (char)('A' + n - 1 - i);

//             // Print characters from ch to 'A'+n-1
//             for (char j = ch; j <= 'A' + n - 1; j++) {
//                 System.out.print(j + " ");
//             }

//             System.out.println();
//         }
//     }
// }


// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 0; i < n; i++) {

//             // Find character for this row
//             char ch = (char) ('A' + i);

//             // Print the character (i+1) times
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(ch);
//             }

//             // Move to next line
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class Pattern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int u;
//         System.out.println("Enter the value of i:");
//         u=sc.nextInt();
        

//         for(int i=0;i<u;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }



// import java.util.Scanner;

// public class Pattern{
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=0;k<=i;k++)
//             {
//                 System.out.print("*");
//             }
//             for(int p=0;p<i;p++)
//             {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n;
//         n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


