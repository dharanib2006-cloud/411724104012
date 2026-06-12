// class PracticeProblems{
//     public int countOddDigit(int n){
//         String s = String.valueOf(n);
//         char[] ch = s.toCharArray();
//         int cnt=0;
//         for(char it:ch){
//             int x=it - '0';
//             if(x%2!=0){
//                 cnt++;
//             }
//         }
//         return cnt;
//     }
// }


// import java.util.Scanner;

// public class Day4cw {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int c =0;
//         while(n>0)
//         {
//             int d = n%10;
//             if(d%2==1)
//                 c++;
//             n=n/10;
//         }
//         System.out.println(c);
//     }
// }


// returns largest digit of a number



// import java.util.*;

// public class PracticeProblems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int max = 0;

//         while (N != 0) {
//             int digit = N % 10;
//             if (digit > max) {
//                 max = digit;
//             }
//             N /= 10;
//         }

//         System.out.println("Maximum digit: " + max);

//         sc.close();
//     }
// }


// import java.util.*;
// public class PracticeProblems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N=sc.nextInt();
//         for(int i=2;i<=N;i++){
//             if()

//         }
//     }
// }


// public class PracticeProblems {
//     public static void main(String[] args) {

//         String s = "Hello123World45";

//         String upper = "";
//         String lower = "";
//         String digits = "";

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (Character.isUpperCase(ch)) {
//                 upper += ch;
//             } 
//             else if (Character.isLowerCase(ch)) {
//                 lower += ch;
//             } 
//             else if (Character.isDigit(ch)) {
//                 digits += ch;
//             }
//         }

//         System.out.println("Capital Letters: " + upper);
//         System.out.println("Small Letters: " + lower);
//         System.out.println("Digits: " + digits);
//     }
// }


// count the number of capital and small leters and digits in a string

// public class PracticeProblems {
//     public static void main(String[] args) {

//         String s = "Hello123World45";

//         int upper = 0;
//         int lower = 0;
//         int digits = 0;

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (Character.isUpperCase(ch)) {
//                 upper++;
//             } 
//             else if (Character.isLowerCase(ch)) {
//                 lower++;
//             } 
//             else if (Character.isDigit(ch)) {
//                 digits++;
//             }
//         }

//         System.out.println("Capital Letters Count: " + upper);
//         System.out.println("Small Letters Count: " + lower);
//         System.out.println("Digits Count: " + digits);
//     }
// }


// 