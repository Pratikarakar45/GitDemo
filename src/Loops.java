
//**Print all even numbers till n.
//import java.util.*;
//public class Loops {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter any number :");
//        int n = sc.nextInt();
//
//        for(int i=1; i<=n; i++){
//                if(i % 2==0){
//                    System.out.println("even numbers :"+i);
//                }
//        }
//    }
//}

//**Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
//    If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
//    If they enter 0 then stop.
//    If he/ she scores :
//    Marks >=90 -> print “This is Good”
//        89 >= Marks >= 60 -> print “This is also Good”
//        59 >= Marks >= 0 -> print “This is Good as well”
//    Because marks don’t matter but our effort does.

//import java.util.*;
//public class Loops{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int input;
//
//        do{
//            int marks = sc.nextInt();
//            if(marks>=90 && marks<=100){
//                System.out.println("this is good");
//            }else if(marks>=60 && marks<=89){
//                System.out.println("this is also good");
//            }else if(marks>1 && marks<=59){
//                System.out.println("this is good as well");
//            }else{
//                System.out.println("negative no is not allow");
//            }
//
//            System.out.println("Enter 1 for continue & 0 for Stop :");
//            input = sc.nextInt();
//
//        }while(input==1);
//        System.out.println("program is stop");
//    }
//}

//**Qs. Print if a number n is prime or not (Input n from the user).
//        [In this problem you will learn how to check if a number is prime or not]

//import java.util.*;
//public class Loops{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter any number :");
//        int n =sc.nextInt();
//       boolean isprime = true;
//       for(int i=2; i<=n/2; i++){
//           if(n%i==0){
//                isprime = false;
//                break;
//           }
//       }
//       if(isprime){
//           if(n==1){
//               System.out.print("this is not prime or composite");
//           }else{
//               System.out.print("this is prime number");
//           }
//       }else{
//           System.out.print("this is not prime number");
//       }
//    }
//}

//OOPS concept*****************************************************************************
//class Pen {
//    String color;
//    String type;
//
//    public void write() {
//        System.out.print("this is code");
//    }
//
//    public void penInfo() {
//        System.out.println(this.color);
//        System.out.println(this.type);
//    }
//}
//
//class Student {
//    String name;
//    int rollNo;
//
////    public void studentInfo() {
////        System.out.println(this.name);
////        System.out.println(this.rollNo);
////    }
//
////1  non perameterise constructor
//
////    Student() {
////        System.out.println("this is constructor");
////    }
////2  perameterise constructor
//
////     Student(String name,int rollNo){
////        this.name = name;
////        this.rollNo = rollNo;
////     }
////3  Copy constructor
//
////Student(Student s2){
////this.name=s2.name;
////this.rollNo=s2.rollNo;
////}
////Student(){
////
////}
////}
//
////****** Polymorphisum  *************************************************
//    public void studentPrint(String name){
//        System.out.print(name);
//    }
//    public void studentPrint(int rollNo){
//        System.out.print(rollNo);
//    }
//    public void studentPrint(String name,int rollNo){
//        System.out.print(name+ " "+ rollNo);
//    }
//}
//
//
//public class Loops {
//    public static void main(String[] args) {
//        Student s1 = new Student();
////        s1.name="pratik";
////        s1.rollNo=101;
////
////        Student s2 = new Student(s1);
////        s2.studentInfo();
//        s1.studentPrint("pratik",101);
//    }
//}

class Shape{
    int radius;

    public void circle(){
        System.out.print("this is inheritance");
    }
}
class Triangle extends Shape{
    public void circle(int radius){
        System.out.print(2*3.14*r*r);
    }
}
class Equilateral extends Triangle{
    public void circle(2*3.14*r){
    }
}
class Square extends Shape{
    public void circle(int radius){
        System.out.print(A*3.14*r);

    }
}
public class Loops{
    public static void main(String[]args){
        Shape s1 = new Shape();

    }
}


































