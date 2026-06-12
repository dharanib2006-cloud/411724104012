// class College{
//     int rollno;
//     String teacher_name;
//     String best_friend;
//     void getValue(int rollno,String teacher_name,String best_friend){
//         this.rollno=rollno;
//         this.teacher_name=teacher_name;
//         this.best_friend=best_friend;
//     }
//     void display(){
//         System.out.println("Roll no:"+rollno);
//         System.out.println("Teacher Name:"+teacher_name);
//         System.out.println("Best Friend:"+best_friend);
//     }
// }


// public class OOPS{
//    public static void main(String[] args) {
//     College c = new College();
//     c.getValue(12,"Sheeja","Rinu");
//     c.display();
//    }
    
    
   
    
// }



// class Bank{
//     String Custname;
//     double balance;
//     void getInfo(String c,double b){
//         this.Custname= c;
//         this.balance = b;
//         System.out.println("customer name:"+Custname);
//         System.out.println("balance:"+balance);
//     }
//     void checkBalance(){
//         System.out.println("total amount:"+balance);
//     }
//     void Deposit(){
//         double deposit_amt=1000;
//         balance = balance + deposit_amt;
//         System.out.println("deposit:"+balance);
//     }
//     void withdraw(){
//         double w =51000.0;
//         if(balance>w){
//              balance  = balance - w;
//             System.out.println("remaining balance:"+balance);
//             System.out.println(true);
//         }else{
//             balance = balance - w;
//             System.out.println("remaining balance:"+balance);
//             System.out.println(false);
//         }
//     }
// }
// public class OOPS {

//     public static void main(String[] args) {
//         Bank b1 = new Bank();
//         b1.getInfo("anu",50000.0);
//         b1.checkBalance();
//         b1.Deposit();
//         b1.withdraw();

//     }
// }


// class College{
//     String name;
//     int rollno;
//     float balance;
//     College(String name,int rollno,float balance){
//         this.name=name;
//         this.rollno=rollno;
//         this.balance=balance;
//     }
//     void display(){
//         System.out.println("Name:"+name);
//         System.out.println("Roll no:"+rollno);
//         System.out.println("Balancve:"+balance);
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         College c = new College("dharani",1001,100.0f);
//         c.display();
//     }
// }


// class Rectangle{
//     double length;
//     double width;
//     double area;
//     Rectangle(double l,double w){
//         this.length=l;
//         this.width=w;
//     }
//     void calculate(){
//         area=length*width;
//     }
//     void display(){
//         System.out.println("Length: "+length);
//         System.out.println("Breadth:"+width);
//         System.out.printf("Area:%.2f ",area);
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         Rectangle r=new Rectangle(35.8,14.8);
//         r.calculate();
//         r.display();

//     }
// }


// import java.util.ArrayList;

// class Book{
//     String title;
//     String author;
//     boolean isAvailable;
//     Book(String t,String a,boolean isavail){
//         this.title = t;
//         this.author = a;
//         this.isAvailable=isavail;
//     }
//     void borrowBook(String bookname){
//         if(isAvailable){
//             isAvailable=false;
//             System.out.println("borrowed book successfully.");
//         }else{
//             System.out.println("Book is not available.");
//         }

//     }
//     void returnBook(String bookname){
//         isAvailable = true;
//         System.out.println("book returned.");
//     }
//     void getavailability(String bookname){
//         if(isAvailable){
//             System.out.println(true);
//         }else{
//             System.out.println(false);
//         }
//     }
// }
// public class OopsEg {

//     public static void main(String[] args) {
//         ArrayList<Book> lst = new ArrayList<>();
//         lst.add(new Book("Sherlock_Holmes","anu",true));
//         lst.add(new Book("Frankenstein","abi",false));
//         lst.add(new Book("  King_arthur","dharani",true));
//         lst.add(new Book("Treasure_island","harini",true));
//         lst.get(2).borrowBook("King_arthur");
//         lst.get(3).borrowBook("Treasure_island");
//         lst.get(2).getavailability("King_arthur");

//     }
// }


// import java.util.*;

// class Book {
//     public ArrayList<String> title;
//     private ArrayList<Boolean> isAvailable;

//     public Book(ArrayList<String> title, ArrayList<Boolean> isAvailable) {
//         this.title = title;
//         this.isAvailable = isAvailable;
//     }

//     public void borrowBook(String bookName) {
//         for (int i = 0; i < title.size(); i++) {
//             if (title.get(i).equals(bookName)) {
//                 if (isAvailable.get(i) == true) {
//                     System.out.println("book is borrowed");
//                     isAvailable.set(i, false);
//                 } else {
//                     System.out.println("Book is not available.");
//                 }
//                 return;
//             }
//         }
//     }

//     public void returnBook(String bookName) {
//         for (int i = 0; i < title.size(); i++) {
//             if (title.get(i).equals(bookName)) {
//                 isAvailable.set(i, true);
//                 return;
//             }
//         }
//     }

//     public void getAvailability(String bookName) {
//         for (int i = 0; i < title.size(); i++) {
//             if (title.get(i).equals(bookName)) {
//                 System.out.println(isAvailable.get(i));
//                 return;
//             }
//         }
//     }
// }

// public class OopsEg {
//     public static void main(String[] args) {
//         ArrayList<String> title = new ArrayList<>();
//         title.add("n1");
//         title.add("n2");
//         title.add("n3");
//         title.add("n4");


//         ArrayList<Boolean> isAvailable = new ArrayList<>();
//         isAvailable.add(true);
//         isAvailable.add(true);
//         isAvailable.add(true);
//         isAvailable.add(false);

//         Book b = new Book(title, isAvailable);

//         b.borrowBook("n2");
//         b.borrowBook("n1");
//          b.borrowBook("n2");
//         b.getAvailability("n1");
//         b.returnBook("n3");
//     }
// }



// class Rectangle
// {
//     double length,width,area;
//     Rectangle()
//     {
//         length=1.0;
//         width=1.0;
//     }
//     Rectangle(double l,double w)
//     {
//         this.length=l;
//         this.width=w;
//     }
//     void calculateArea()
//     {
//         area=this.length*this.width;
//     }
//     void displayDetails()
//     {
//         System.out.printf("Length:%.2f",length);
//         System.out.printf("\nWidth:%.2f",width);
//         System.out.printf("\nArea:%.2f",area);

//     }

// }
// public class OopsEg
// {
//     public static void main(String[] args) {
//         Rectangle r=new Rectangle(5.2,2.4);
//         r.calculateArea();
//         r.displayDetails();
//     }
// }