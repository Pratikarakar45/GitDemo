/// /TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
/// / click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//
//    public static void main(String[] args) {
/// /        System.out.print("hello world\napka swagat haiii\n");
/// /        System.out.println("java is here");
/// /        System.out.print("main hoon na");
/// /        System.out.println("*");
/// /        System.out.print("**\n");
/// /        System.out.print("***\n");
/// /        System.out.print("****");
//      int a=65;
//      int b=45;
//      int c=5;
/// /      int sum = a+b+c;
/// /      System.out.print(sum);
/// /      int mult= a*b;
/// /      System.out.print(mult);
//      int div = b/c;
//        System.out.print(div);
//
//    }
//}
//    import java.util.*;
//public class Main{
//     public static void main(String[] args){
//      System.out.println("hii pratik");
//
//    }
//    }
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
////        System.out.print("hello maiii");
//        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int sum = a - b;
////        String name = sc.next();
////        System.out.println(name);
//         String Biodata = sc.next();
//        String name = "pratik";
//        String lastname = "aravkar";
//         int age = 25;
//         int marks = 95;
//         System.out.println(Biodata);
//         System.out.println("name = " + name);
//         System.out.println("lastname = "+lastname);

//*********************************  1 PRINT THE PATTERN  ******************************
//*********************************  Solid Rectangle & Nested Loops  **************************

//import java.util.*;
//   public class Main{
//       public static void main(String[] args){
//           Scanner sc = new Scanner(System.in);
//           int A= sc.nextInt();
//           int B= sc.nextInt();
//
//           for(int i=1; i<=A; i++){
//               for(int j=1; j<=B; j++){
//                   System.out.print("*  ");
//               }
//               System.out.println();
//           }
//       }
//}

//*********************************  2 PRINT THE PATTERN  ******************************
//*********************************  Hollow Rectangle  **************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A= 4;
//             int B= 5;
//
//             for(int i=1; i<=A; i++){
//                 for(int j=1; j<=B; j++){
//                     if( i==1 || i==A || j==1 || j==B){
//                         System.out.print("* ");
//                     }else{
//                         System.out.print("  ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }

//     import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        int n = 5;
//        int m = 4;
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//*********************************  3 PRINT THE PATTERN  ******************************
//*********************************  Half Pyramid   **************************
//import java.util.*;
//   public class Main{
//       public static void main(String[]args){
//           Scanner sc= new Scanner(System.in);
//           int A = sc.nextInt();
//
//           for(int i=1; i<=A; i++){
//               for(int j=1; j<=i; j++){
//                   System.out.print("* ");
//               }
//               System.out.println();
//           }
//       }
//   }

//*********************************  4 PRINT THE PATTERN  ******************************
//*********************************  Inverted half Pyramid  **************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A = sc.nextInt();
//
//             for(int i=A; i>=1; i--){
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }

//*********************************  5 PRINT THE PATTERN  ******************************
//*********************************  Inverted & Rotated Half Pyramid  **************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//
//         for(int i=A; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=0; j<=A-i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         }
//     }
//     import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//
//        for (int i=1; i<=A; i++) {
//            for (int j=1; j<=A-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//}
//********************************* 6 PRINT THE PATTERN  ******************************
//*********************************  HALF PYRAMID WITH NUMBERS  **************************

//import java.util.*;
//  public class Main{
//      public static void main(String[]args){
//          Scanner sc = new Scanner(System.in);
//          int A = sc.nextInt();
//
//          for(int i=1; i<=A; i++){
//              for(int j=1; j<=i; j++){
//                  System.out.print(j+"  ");
//              }
//              System.out.println();
//          }
//      }
//  }

//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A= sc.nextInt();
//
//             for(int i=1; i<=A; i++){
//                 for(int j=1; j<=i; j++){
//                     System.out.print(i+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
//********************************* 7 PRINT THE PATTERN  ******************************
//*********************************  INVERTED HALF PYRAMID WITH NUMBERS  **************

//import java.util.*;
//  public class Main{
//      public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);
//          int A = sc.nextInt();
//
//          for(int i=1; i<=A;i++){
//              for(int j=1; j<=A-i+1;j++){
//                  System.out.print(j+" ");
//              }
//              System.out.println();
//          }
//      }
//  }

//import java.util.*;
//      public class Main{
//          public static void main(String[]args){
//              Scanner sc = new Scanner(System.in);
//              int A = sc.nextInt();
//
//              for(int i=A; i>=1; i--){
//                  for(int j=1; j<=i; j++){
//                      System.out.print(j+" ");
//                  }
//                  System.out.println();
//              }
//          }
//      }
//********************************* 8 PRINT THE PATTERN  ******************************
//*********************************  FLOYD'S TRIANGLE  *******************************
//import java.util.*;
//    public class Main{
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            int A= sc.nextInt();
//            int Number= 1;
//
//            for(int i =1; i<=A;i++){
//                for(int j=1; j<=i; j++){
//                    System.out.print(Number+" ");
//                    Number++;
//                }
//                System.out.println();
//            }
//        }
//    }

//import java.util.*;
//      public class Main{
//          public static void main(String[]args){
//              Scanner sc = new Scanner(System.in);
//              int A=sc.nextInt();
//              int Num=sc.nextInt();
//
//              for(int i=1; i<=A; i++){
//                  for(int j=1; j<=i; j++){
//                      System.out.print(Num+"  ");
//                      Num++;
//                  }
//                  System.out.println();
//              }
//          }
//      }
//********************************* 9 PRINT THE PATTERN  ******************************
//*********************************  0-1 TRIANGLE  **********************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A = sc.nextInt();
//
//             for(int i=1; i<=A;i++){
//                 for(int j=1;j<=i;j++){
//                     int div = i+j;
//                     if(div % 2==0){
////                         #even
//                         System.out.print("0 ");
//                     }else{
////                         #odd
//                         System.out.print("1 ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }
//import java.util.*;
//    public class Main{
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            int A= sc.nextInt();
//
//            for(int i=1; i<=A; i++){
//                for(int j=1; j<=i; j++){
//
//                    int Num= i+j;
//
//                    if(Num %2==0){
//                        System.out.print("1 ");
//                    }else{
//                        System.out.print("0 ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }

//********************************* 10 PRINT THE PATTERN  ******************************
//*********************************  BUTTERFLY PATTERN  **********************************
//import java.util.*;
//   public class Main{
//       public static void main(String[]args){
//           Scanner sc = new Scanner(System.in);
//           int A = sc.nextInt();
//
//           for(int i=1; i<=A; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//            int spaces = 2 * (A-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //lower part
//        for(int i=A; i>=1; i--) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//            int spaces = 2 * (A-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//       }
//   }

//import java.util.*;
//      public class Main{
//          public static void main(String[]args){
//              Scanner sc = new Scanner(System.in);
//                  int A= sc.nextInt();
//
//              for(int i=1; i<=A; i++){
//                  for(int j=1; j<=i; j++){
//                      System.out.print("*");
//                  }
//                  int But = 2*(A-i);
//                  for(int j=1; j<=But; j++){
//                      System.out.print(" ");
//                  }
//                  for(int j=1; j<=i; j++){
//                      System.out.print("*");
//                  }
//                  System.out.println();
//              }
//
//              for(int i=A; i>=1; i--){
//                  for(int j=1; j<=i; j++){
//                      System.out.print("*");
//                  }
//                  int But = 2*(A-i);
//                  for(int j=1; j<=But; j++){
//                      System.out.print(" ");
//                  }
//                  for(int j=1; j<=i; j++){
//                      System.out.print("*");
//                  }
//                  System.out.println();
//              }
//          }
//      }

//********************************* 11 PRINT THE PATTERN  ******************************
//*********************************  Solid Rhombus  **********************************
//import java.util.*;
//      public class Main{
//          public static void main(String[]args){
//              Scanner sc = new Scanner(System.in);
//              int A = sc.nextInt();
//
//              for(int i=1; i<=A; i++){
//                  for(int j=1; j<=A-i; j++){
//                      System.out.print("  ");
//                  }
//                  for(int j=1; j<=A; j++){
//                      System.out.print("* ");
//                  }
//                  System.out.println();
//              }
//          }
//      }
//import java.util.*;
//   public class Main{
//       public static void main(String[] args){
//           Scanner sc = new Scanner(System.in);
//           int A=sc.nextInt();
//
//           for(int i=1; i<=A; i++){
//               for(int j=1; j<=A-i; j++){
//                   System.out.print(" ");
//               }
//               for(int j=1; j<=A; j++){
//               if(i==A||i==1||j==A||j==1) {
//                   System.out.print("* ");
//               }else{
//                   System.out.print("  ");
//               }
//               }
//               System.out.println();
//           }
//       }
//   }

//********************************* 12 PRINT THE PATTERN  ******************************
//*********************************  NUMBER PYRAMID  **********************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A = sc.nextInt();
//
//             for(int i=1; i<=A; i++){
//                 for(int j=1; j<=A-i; j++){
//                     System.out.print(" ");
//                 }
//                 for(int j=1; j<=i; j++){
//                     System.out.print(i+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

//********************************* 13 PRINT THE PATTERN  ******************************
//*********************************  Palindromic pattern  **********************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A= sc.nextInt();
//
//             for(int i=1; i<=A; i++){
//                 for(int j=1; j<=A-i; j++){
//                     System.out.print("  ");
//                 }
//                 for(int j=i; j>=1; j--){
//                     System.out.print(j+" ");
//                 }
//                 for(int j=2; j<=i; j++){
//                     System.out.print(j+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

//********************************* 13 PRINT THE PATTERN  ******************************
//*********************************  DIAMOND PATTERN  **********************************
//
//import java.util.*;
//    public class Main{
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            int A = sc.nextInt();
//
//            for(int i=1; i<=A; i++){
//                for(int j=1; j<=A-i; j++){
//                    System.out.print("  ");
//                }
//                for(int j=i; j>=1; j--){
//                    System.out.print("* ");
//                }
//                for(int j=2; j<=i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            for(int i=1; i<=A; i++){
//                for(int j=2; j<=i; j++){
//                    System.out.print("  ");
//                }
//                for(int j=A; j>=i+1; j--){
//                    System.out.print("* ");
//                }
//                for(int j=A; j>=i; j--) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
//    }

//import java.util.*;
//    public class Main{
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            int A = sc.nextInt();
//
//            for(int i=1; i<=A; i++){
//                for(int j=1; j<=A-i; j++){
//                    System.out.print("  ");
//                }
//                for(int j=1; j<=2*i-1; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            for(int i=A; i>=1; i--){
//                for(int j=1; j<=A-i; j++){
//                    System.out.print("  ");
//                }
//                for(int j=1; j<=2*i-1; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
//    }

//********************************* PRACTICE QUESTIONS  ******************************
//********************************* Print a hollow Butterfly  **********************************
//import java.util.*;
//    public class Main{
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//               int A = sc.nextInt();
//
//            for(int i=1; i<=A; i++){
//                for(int j=1; j<=i; j++){
//                    if(j==1||j==i){
//                    System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//                for(int j=1; j<=2*(A-i); j++){
//                    System.out.print(" ");
//                }
//                for(int j=1; j<=i; j++){
//                    if(j==1||j==i){
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//            for(int i=A; i>=1; i--){
//                for(int j=1; j<=i; j++){
//                    if(j==1||j==i){
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//                for(int j=1; j<=2*(A-i); j++){
//                    System.out.print(" ");
//                }
//                for(int j=1; j<=i; j++){
//                    if(j==1||j==i){
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }

//********************************* Print a hollow Rhombus.  **********************************

//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A = sc.nextInt();
//             int B = sc.nextInt();
//
//             for(int i=1; i<=A; i++){
//                 for(int j=1; j<=A-i; j++){
//                     System.out.print(" ");
//                 }
//                 for(int j=1; j<=B; j++){
//                     if(i==1||i==A||j==1||j==B){
//                         System.out.print("*");
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//********************************* Print Pascal’s Triangle.  **********************************


//********************************* Print half Pyramid.  **********************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A= sc.nextInt();
//
//             for(int i=1; i<=A; i++){
//                 for(int j=1; j<=A-i; j++){
//                     System.out.print(" ");
//                 }
//                 for (int j=1; j<=i; j++){
//                     System.out.print(j+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
//********************************* Print Inverted Half Pyramid.  **********************************
//import java.util.*;
//   public class Main{
//       public static void main(String[]args){
//           Scanner sc = new Scanner(System.in);
//           int A =sc.nextInt();
//
//           for(int i=1; i<=A; i++){
//               for(int j=1; j<=i; j++){
//                   System.out.print(" ");
//               }
//               for(int j=1; j<=A-i+1; j++){
//                   System.out.print(i+" ");
//               }
//               System.out.println();
//           }
//       }
//   }
//********************************* Print Pascal’s Triangle.  **********************************
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int A = sc.nextInt();
//
//             for(int i=0; i<=A; i++){
//                 for(int j=0; j<=A-i; j++){
//                     System.out.print(" ");
//                 }
//                 int number = 1;
//                 for(int j=0; j<=i; j++){
//                     System.out.print(number+" ");
//                     number = number*(i-j)/(j+1);
//                 }
//                 System.out.println();
//             }
//         }
//     }
//***************************************  Functions & Methods  **********************************
//import java.util.*;
//    public class Main{
//        public static void printMyName(String name){
//            System.out.println(name);
//            return ;
//    }
//    public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            String name = sc.next();
//            printMyName(name);
//        }
//            }
//*********************************************************************************************
//import java.util.*;
//   public class Main{
//       public static int sumOfNumber(int a,int b){
//           int sum = a+b;
//           return sum;
//       }
//       public static void main(String[]args){
//           Scanner sc = new Scanner(System.in);
//           System.out.print("enter a:");
//           int a = sc.nextInt();
//           System.out.print("enter b:");
//           int b = sc.nextInt();
//
//           int sum= sumOfNumber(a, b);
//           System.out.println("Sum of a and b = "+sum);
//       }
//   }

//import java.util.*;
//public class Main{
//    public static int multiplecationOfNumber(int A, int B){
//        int Multy = A*B;
//        return Multy;
//    }
//    public static void main(String[]args){
//        Scanner sc= new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//         int Multy = multiplecationOfNumber(A, B);
//         System.out.println("Multiply A and B = "+Multy);
//    }
//}

//import java.util.*;
//   public class Main{
//       public static void factorialOfNo(int n){
//           int factorial = 1;
//
//           for(int i=n; i>=1; i--){
//               factorial = factorial * i;
//           }
//           System.out.println(factorial);
//       }
//       public static void main(String[]args){
//           Scanner sc = new Scanner(System.in);
//           int  n =sc.nextInt();
//
//           factorialOfNo(n);
//       }
//   }
//#####################################  Java - Introduction to Programming  ######################################
//***********************************************   Exercise 1   ***************************************************
// 01. Enter 3 numbers from the user & make a function to print their average.

//import java.util.*;
//    public class Main{
//        public static int averageOfNumbers(int a, int b,int c){
//            int avg = (a+b+c)/3;
//            return avg;
//        }
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter value of a = ");
//            int a =sc.nextInt();
//            System.out.print("Enter value of b = ");
//            int b =sc.nextInt();
//            System.out.print("Enter value of c = ");
//            int c =sc.nextInt();
//
//            int avg = averageOfNumbers(a,b,c);
//            System.out.println("Average of a b c = "+avg);
//        }
//    }

//02 Write a function toz print the sum of all odd numbers from 1 to n.
//###  ODD NUMBER#############
//import java.util.*;
//   public class Main{
//       public static int oddNumber(int n){
//           int sum = 0;
//                   for(int i=1; i<=n; i++){
//                       if(i%2 !=0){
//                           sum=sum+i;
//                       }
//                   }
//                   System.out.println(sum);
//                   return sum;
//       }
//       public static void main(String[]args){
//           Scanner sc = new Scanner(System.in);
//           int n =sc.nextInt();
//
//           oddNumber(n);
//       }
//   }

//####  EVEN NUMBER  *************************************

//import java.util.*;
//    public class Main{
//        public static int evenNo(int n){
//            int Div =0;
//            for(int i=1;i<=n; i++){
//                if(i%2==0){
//                    Div=Div+i;
//                }
//            }
//            System.out.println(Div);
//        return Div;
//        }
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//
//            evenNo(n);
//        }
//    }

//03 Write a function which takes in 2 numbers and returns the greater of those two.

//import java.util.*;
//   public class Main {
//       public static int greter(int A,int B){
//           if(A>B){
//               System.out.print(A);
//               return A;
//           }else{
//               System.out.print(B);
//               return B;
//           }
//       }
//       public static void main(String[]args){
//           Scanner sc = new Scanner(System.in);
//           int A = sc.nextInt();
//           int B = sc.nextInt();
//
//           greter(A,B);
//       }
//   }

//04  Write a function that takes in the radius as input and returns the circumference of a circle.

//import java.util.*;
//    public class Main{
//        public static double circumference(int r){
//            double c =2*Math.PI*r;
//
//        return c;
//        }
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//
//            do {
//                System.out.println("Enter Radius :");
//                int r = sc.nextInt();
//
//                if (r == 0) {
//                    System.out.println("thank you");
//                    break;
//                }
//
//                System.out.println(circumference(r));
//
//            }while(true);
//
//        }
//    }

// 05 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// import java.util.*;
//     public cl+632.ass Main{
//         public static boolean ageGroup(int age){
//             if(age > 18) {
//                return true;
//             }
//                return false;
//         }
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int age = sc.nextInt();
//
//             System.out.println(ageGroup(age));
//         }
//     }

//***  06 write an infinite loop using do while condition.  ************************************************************
//
//import java.util.*;
//     public class Main{
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
/// /  1   ### continue enter ###
//             do{
//                 String name = sc.next();
//                 System.out.println(name);
//
//             }while(true);
//
/// /  2   ###  Print without stop###
//
//             string name = sc.next();
//             do{
//                 System.out.println(name);
//             }while(true);
//
//         }
//     }
//
//# 07 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//
//        System.out.println("Enter any positiveNo,negativeNo,zero :");
//        int count = sc.nextInt();
//
//        while (count == 1) {
//
//            System.out.println("enter any no.");
//            int number = sc.nextInt();
//            if (number > 0) {
//                positiveCount++;
//            } else if (number < 0) {
//                negativeCount++;
//            } else {
//                zeroCount++;
//            }
//            System.out.println("enter 1 it would be continue and 0 will be stop");
//            count = sc.nextInt();
//        }
//        System.out.println("positiveCount :" + positiveCount);
//        System.out.println("negativeCount :" + negativeCount);
//        System.out.println("zeroCount :" + zeroCount);
//    }
//}
//###  ODD ANDD EVEN NUMBERS ##################
//import java.util.*;
//  public class Main{
//      public static void main(String[]args){
//          Scanner sc = new Scanner(System.in);
//          int even = 0;
//          int odd = 0;
//
//          System.out.println("Enter 100 Number and 0 will stop");
//
//          int counter = 1;
//          while(counter==1){
//              System.out.println("enter any number :");
//
//              int numaric = sc.nextInt();
//              if(numaric % 2==0){
//                  even++;
//              }else {
//                  odd++;
//              }
//              System.out.println("enter 1 or 0");
//              counter = sc.nextInt();
//          }
//          System.out.println("even"+even);
//          System.out.println("odd"+odd);
//
//      }
//  }

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        int count;
//
//        do {
//            System.out.println("enter any no.");
//            int num = sc.nextInt();
//
//            if (num > 0) {
//                positive++;
//            } else if (num < 0) {
//                negative++;
//            } else
//                zero++;
//
//            System.out.println("Enter 1 for continue and 0 for stop :");
//            count = sc.nextInt();
//
//        } while (count == 1);
//
//        System.out.println("positive :" + positive);
//        System.out.println("negative :" + negative);
//        System.out.println("zero :" + zero);
//    }
//}
//## 08 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

//import java.util.*;
//public class Main{
//    public static int cubeNumber(int x,int n){
//        int input = 1;
//        for(int i=1; i<=n; i++){
//            input = input * x;
//        }
//        return input;
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//
//        System.out.println("cube of X :"+(cubeNumber(x,n)));
//    }
//}
//*#* 09 Write a function that calculates the Greatest Common Divisor of 2 numbers.

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//        do{
//            if(A>B){
//                A=A-B;
//            }else{
//                B=B-A;
//            }
//        }while(A!=B);
//        System.out.println("GCD :"+A);
//    }
//}

//#*# 10 Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 21 .....
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

//import java.util.*;
//
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int a = 0, b = 1;
//
//        System.out.print(a + " ");
//
//        if (n > 1) {
//            //find nth term
//            for (int i = 2; i <= n; i++) {
//                System.out.print(b + " ");
//                //the concept below is called swapping
//                int temp = b;
//                b = a + b;
//                a = temp;
//            }
//            System.out.println();
//        }
//    }
//}

//###########******************##  Arrays Introduction  #####$$$$$$$$$*****************$$$$$$$$$$$

//public class Main{
//    public static void main(String[]args){
//
////        type[] arrayName = new int[size];
//
////        int sub[] = new int[3];
////   ### or
////        int [] sub = new int[3];
////   ### or
//        int sub[] = {90,85,95};
//
//        for(int i=0; i<3; i++){
//        System.out.println(sub[i]);
//        }
//    }
//}

//import java.util.*;
//public class Main{
//public static void main(String[]args) {
//    Scanner sc = new Scanner(System.in);
//
//    System.out.print("enter size :");
//    int size = sc.nextInt();
//    int number[] = new int[size];
//
//    System.out.println("enter the numbers :");
//    for (int i = 0; i < size; i++) {
//        number[i] = sc.nextInt();
//}
//        for (int i = 0; i < size; i++) {
//            System.out.println(number[i]);
//        }
//    }
//}
//############################# PRACTICE QUESTION *************************************
//** take an array as input for the user. search from given number X and print the index at which occurs.

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter no. of rows :");
//        int size = sc.nextInt();
//        int buzz[] = new int[size];
//
//        for(int i=0; i<size; i++){
//            buzz[i]=sc.nextInt();
//        }
//        System.out.print("enter X no. :");
//        int x = sc.nextInt();
//
//        for(int i=0; i<buzz.length; i++){
//            if(buzz[i]==x){
//                System.out.println("x found at index :"+i);
//            }
//        }
//    }
//}

//** 01 Take an array of names as input from the user and print them on the screen.

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        String name[] = new String[size];
//
//        for (int i = 0; i < size; i++) {
//            name[i] = sc.next();
//        }
//        for (int i = 0; i < name.length; i++) {
//            System.out.println("name " + (i + 1) + " is :" + name[i]);
//        }
//    }
//}

//## 02Find the maximum & minimum number in an array of integers.

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int order[] = new int[size];
//
//        for (int i=0; i<size; i++){
//            order[i] = sc.nextInt();
//        }
//            int max =Integer.MAX_VALUE;
//            int min =Integer.MIN_VALUE;
//
//        for(int i=1; i<order.length; i++){
//            if(order[i]<max){
//                max=order[i];
//            }
//            if(order[i]>min){
//                min=order[i];
//            }
//        }
//        System.out.println("max value of array :"+min);
//        System.out.println("min value of array :"+max);
//    }
//}

//** 03 Take an array of numbers as input and check if it is an array sorted in ascending order.######
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int order[] = new int[size];
//
//        for(int i=0; i<size; i++){
//        order[i] = sc.nextInt();
//        }
//
//        boolean assending=true;
//
//        for(int i=0; i<order.length-1; i++){
//            if(order[i]>order[i+1]){
//                assending=false;
//            }
//        }
//
//        if(assending){
//            System.out.println(" is sorted in ascending order.");
//        }else{
//            System.out.println("is not sorted in ascending order.");
//
//        }
//    }
//}

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int descending [] = new int[size];
//
//        for(int i=0; i<size; i++){
//            descending[i]= sc.nextInt();
//        }
//        boolean descendingOrder = true;
//
//        for(int i=0; i<descending.length-1; i++){
//           if(descending[i]<descending[i+1]){
//               descendingOrder = false;
//           }
//        }
//        if(descendingOrder){
//            System.out.println("descending order found :");
//        }else{
//            System.out.println("descending order is not found");
//        }
//    }
//}
//#######**************************####### 2D ARRAYS  ************#########################**********************
//************************************************************************************************************************
//############@#@#@###############@@@@@@@@@@@@@@@@@@@@@@@@@#############################################@@@@@@@@@@@@@@@@@@@@@@

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        int[][] number= new int[row][col];
//
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                number[i][j]= sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                System.out.print(number[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//**##  Searching for an element x in a matrix. **/*/*/*/***********************************

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter no. of rows :");
//        int row = sc.nextInt();
//        System.out.print("Enter no.of columns :");
//        int col = sc.nextInt();
//        int[][] factor = new int[row][col];
//
//        System.out.println("Enter matrix values");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                factor[i][j] = sc.nextInt();
//            }
//        }
//        System.out.print("Enter X value :");
//        int X = sc.nextInt();
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (factor[i][j] == X) {
//                    System.out.println("X value found at lication :" + "(" + i + "," + j + " " + ")");
//                }
//            }
//        }
//    }
//}

//import java.util.*;
// public class Main{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//
//         System.out.print("enter no. of rows ");
//         int row = sc.nextInt();
//         System.out.print("enter no. of columns ");
//         int col = sc.nextInt();
//         int decimal[][]= new int [row][col];
//
//         System.out.println("enter matrix values :");
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 decimal[i][j] = sc.nextInt();
//             }
//         }
//         System.out.print("enter value of X :");
//         int X = sc.nextInt();
//
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(decimal[i][j]==X){
//                     System.out.println("decimal value of X location at :"+"("+ i +","+ j +")");
//                 }
//             }
//         }
//     }
// }
//**  Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter no. of rows :");
//        int N = sc.nextInt();
//        System.out.print("enter no. of columns :");
//        int M = sc.nextInt();
//        int oracal[][] = new int[N][M];
//
//        System.out.println("enter no. of matrix form :");
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                oracal[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("The spiral order matrix is :");
//        int rowStart = 0;
//        int rowEnd = N - 1;
//        int colStart = 0;
//        int colEnd = M - 1;
//
//        while (rowStart <= rowEnd && colStart <= colEnd) {
////       1
//            for (int col = colStart; col <= colEnd; col++) {
//                System.out.print(oracal[rowStart][col] + " ");
//            }
//            rowStart++;
//
////       2
//            for (int row = rowStart; row <= rowEnd; row++) {
//                System.out.print(oracal[row][colEnd] + " ");
//            }
//            colEnd--;
//
////       3
//            for (int col = colEnd; col >= colStart; col--) {
//                System.out.print(oracal[rowEnd][col] + " ");
//            }
//            rowEnd--;
//
////       4
//            for (int row = rowEnd; row >= rowStart; row--) {
//                System.out.print(oracal[row][colStart] + " ");
//            }
//            colStart++;
//
//            System.out.println();
//        }
//    }
//}

//** For a given matrix of N x M, print its transpose.

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        int transpose [][] = new int[N][M];
//
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                transpose[i][j] = sc.nextInt();
//            }
//        }
//        System.out.print("The transpose is :");
//
//        for(int j=0; j<M; j++){
//            for(int i=0; i<N; i++){
//                System.out.println(transpose[i][j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//}
//@@@@@@@@@@@##################%%%%%%%%%%%%%&&&&&&&&&**************+++++++++++$$$$$$$$$$$||||||||||
//***####*******#######*******  STRING METHODS  ***##********#################********###

//@@@ Declaration :

//public class Main{
//    public static void main(String[]args){
//
//        String name = "Pratik";
//        System.out.print(name);
//    }
//}

//@@@ Taking Input :

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner (System.in);
//        String name = sc.nextLine();
//        System.out.print(name);
//    }
//}

//@@@ Concatenation (joining 2 Strings) :

//public class Main{
//    public static void main(String[]args){
//        String name = "pratik";
//        String surname = "Aravkar";
//        String Fullname = name +" "+surname;
//        System.out.print(Fullname);
//    }
//}

//@@@ Lenght of strings "length()":

//public class Main{
//    public static void main(String[]args){
//        String name = "pratik";
//        String surname = "aravkar";
//        String fullname = name+" "+surname;
//        System.out.print(fullname.length());
//    }
//}

//@@@ Access character of strings "charAt()" :

//public class Main{
//    public static void main(String[]args){
//        String name = "pratik";
//        String surname = "aravkar";
//        String fullname = name + "@" + surname;
//        System.out.println(fullname.length());
//
//        for(int i=0; i<fullname.length(); i++){
//            System.out.println(fullname.charAt(i));
//        }
//    }
//}

//@@@ Compare 2 strings :

//public class Main{
//    public static void main(String[]args){
//        String name1 = "pratik";
//        String name2 = "pratik";

//        if((name1).compareTo(name2)==0){
//            System.out.print("name is equal");
//        }else{
//            System.out.print("name are not equal");
//        }

//        if(name1 == name2){
//            System.out.print("name is equal");
//        }else{
//            System.out.print("name are not equal");
//        }

//  ××××× if(new String("pratik") == new String("pratik")){
//            System.out.print("name is equal");
//        }else{
//            System.out.print("name are not equal");
//        }

//        if((name1).equals(name2)){
//            System.out.print("name is equal");
//        }else{
//            System.out.print("name are not equal");
//        }
//    }
//}

//@@@ Substring :

//public class Main{
//public static void main(String[]args){
//    String name  = "pratikaravkar";
//    System.out.print(name.substring(0,4));
//}
//}

//public class Main{
//    public static void main(String[]args){
//        String name = "pratikaravkar";
//        System.out.print(name.substring(0,8));
//    }
//}

//@@@ parseInt method of integer class :
//public class Main{
//    public static void main(String[]args){
//    String dou = "1234";
//    int name = Integer.parseInt(dou);
//    System.out.println(name);
//    }
//}

//public class Main{
//    public static void main(String[]args){
//        String vari = "12345";
//        int name = Integer.parseInt(vari);
//        System.out.print(name);
//    }
//}

//@@@ ToString method of string class :
//public class Main{
//    public static void main(String[]args){
//        int top = 1234;
//        String name = Integer.toString(top);
//        System.out.print(name);
//    }
//}

//public class Main{
//    public static void main(String[]args){
//        int high = 9876;
//        String name = Integer.toString(high);
//        System.out.print(name);
//    }
//}

//@@##@##@#@#@#@#@#@@ String builder #@@#@#@#@#@#@#@#@@#@#@#@@#@#@#@#@#@#@#@#@@#@#@#@#@#@@#@#$@#$%$@$%#@#$%##$%#@#$%$#@$%#@#$%$#@#$%$#$#@%$#@
//@@@@***********%%%*&&&&&&$$$$$$$$$$$#########%%%@@@@@^&&&&&&&&&&%%%########******%*&&&&&&&&&&&$$$$#@@@@@@@######$$$%%%%%%&&&&&*************
//1
//    import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        String name1 = "pratik";
//        String name2 = "pratik";
//        String cource = name+" "+lastname;
//        System.out.print(cource.length());
//
//        for(int i=0; i<cource.length(); i++){
//            System.out.println(cource.charAt(i));
//        }
//        if(name1 == name2){
//            System.out.print("name are equal");
//        }else{
//            System.out.print("name are not equal");
//        }
//        if(name1.equals(name2)){
//            System.out.print("name are equal");
//        }else {
//            System.out.print("name are not equal");
//        }
//        if(new String("pratik") == new String("pratik")){
//            System.out.print("name are equal");
//        }else{
//            System.out.print("name are not equal");
//        }
//        if((name1).compareTo(name2)==0){
//            System.out.print("name are equal");
//        }else{
//            System.out.print("name are not equal");
//        }
//        String name = "pratik@aravkar";
//        System.out.println(name.substring(0,6));
//        String num = "1234";
//        int name = Integer.parseInt(num);
//
//        System.out.print(name);
//        int num = 1234;
//        String name = Integer.toString(num);
//        System.out.print(name);
//    }
//}
//@#@$@#@$@#@$@%@%@$@#@$%%@$%@$%@$%@$@#@#@@%$@$#@$%@$@#@$@$@%$@$@%@$@##@%$@%@$@#@#@$@@$@#$%@#@#$#%##@%%#$#$@%@$#$#$%$@$%@$@#@#@@%$@$#@$%@$@#@$@$@%$@$@%@$@##@%$@%@
//@#@$@#@$@#@$@%@%@$@#@$%%@$%@$%@$%@$@#@#@@%$@$# Practice problems @$@#@#@$@@$@#$%@#@#$#%##@%%#$#$@%@$#$#$%$@$%@$@#@#@@%$@$#@$%@$@#@$@$@%$@$@%@$@##@%$@%@

//@1Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String problem[] = new String[size];
        int totalle = 0;

        for(int i=0; i<size; i++){
            problem[i]= sc.next();
            totalle += problem[i].length();
        }
        System.out.println(totalle);
    }
}
//@2Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
//       Example :
//       original = “eabcdef’ ; result = “iabcdif”
//       Original = “xyz” ; result = “xyz”

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//            String people = sc.next();
//            String result = " ";
//
//            for(int i=0; i<people.length(); i++){
//                if(people.charAt(i)=='e'){
//                    result += 'i';
//                }else{
//                    result += people.charAt(i);
//                }
//            }
//            System.out.println(result);
//    }
//}

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        String Exchange = sc.next();
//
//        String result = " ";
//
//        for(int i=0; i<Exchange.length(); i++){
//            if(Exchange.charAt(i)=='e'){
//                result +='P';
//            }else{
//                result+=Exchange.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
//}
//@3 Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//         Example :
//         email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//         email = “helloWorld123@gmail.com”; username = “helloWorld123”

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        String email = sc.next();
//        String username = "";
//
//        for(int i=0; i<email.length(); i++){
//            if(email.charAt(i)=='@'){
//                break;
//            }else{
//                username +=email.charAt(i);
//            }
//        }
//        System.out.println(username);
//    }
//}

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        String tought = sc.next();
//        String result = "";
//
//        for(int i=0; i<tought.length(); i++){
//            if(tought.charAt(i)=='.'){
//                break;
//            }else{
//                result +=tought.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
//}
//or
//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String result = "";
//
//        for(int i=0; i < name.length(); i++){
//            if(name.charAt(i)=='a'){
//                result += "x";
//            }else{
//                result += name.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
//}

//@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#
//@#$@#$@#$%$#@#$%$#@#$@#$@#$%$ String BUILDER @#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$%$#@#$%$#
//@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#

//public class Main{
//    public static void main(String[]args){
//        StringBuilder sc = new StringBuilder("pratik");
//        System.out.print(sc);

//// 1*   charAt Index
//        System.out.println(sc.charAt(0));
//
//// 2*   setCharAt index (0, a)(update)
//        sc.setCharAt(0, 'r');
//        System.out.println(sc);
//
//// 3*   Insert
//        sc.insert(0, 'x');
//        System.out.println(sc);
//
//// 4*   Delete
//        sc.delete(0, 2);
//        System.out.print(sc);

// 5*   Append
//        StringBuilder sc = new StringBuilder("P");
//        sc.append("R");
//        sc.append("A");
//        sc.append("R");
//        sc.append("T");
//        sc.append("I");
//        sc.append("K");
//
//        sc.delete(3, 4);
//        System.out.print(sc.length());
//    }
//}

//    reverse method(pratik = kitarp)

//public class Main {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("PRATIK");
//
//        for(int i= 0; i<sb.length()/2; i++){
//            int front = i;
//            int back = sb.length() - 1 - i;
//
//            char frontchar = sb.charAt(front);
//            char backchar = sb.charAt(back);
//
//            sb.setCharAt(front, backchar);
//            sb.setCharAt(back, frontchar);
//
//        }
//        System.out.print(sb);
//    }
//}
//@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#
//@#$@#$@#$%$#@#$%$#@#$@#$@#$%  Operators and Binary number System  @#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#

//Arthmetic operators  $#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%

// 1*  Binary         2*  unary
//        +                 ++
//        -                 --
//        *
//        /
//        %

//Pre-Increment                    Post-Increment                   pre-Decrement                   post-Decrement
//     ++a                              a++                              --a                              a--
//(change value)                   (use value)                      (value change)                  (value assign)
//(use value)                      (change value)                   (value assign)                  (value change)

//int a = 10;                      int a = 10;                      int a = 10;                     int a = 10;
//int b = 0;                       int b = 0;                       int b = 0;                      int b = 0;
//
//b = ++a;                         b = a++;                         b = --a;                        b = a--;
//System.out.println(a = 11);      System.out.println(a = 11);      System.out.println(a = 9);      System.out.println(a = 9);
//System.out.println(b = 11);      System.out.println(b = 10);      System.out.println(b = 9);      System.out.println(b = 10);

//Relational Operators  $#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%

//A = 10  , B = 5
//  ==     A == B    False
//  !=     A != B    True
//  >      A  > B    True
//  <      A  < B    False
//  >=     A >= B    True
//  <=     A <= B    False

//Logical Operators  $#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%

//   && (logical AND) T && T = T othrwise F
//   || (logical OR)  F && F = F othrwise T
//   !  (Logical NOT) Reverse decision  T=F, F=T

//Binary number system (base 2)  $#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%

//0 = 000
//1 = 001
//2 = 010
//3 = 011
//4 = 100
//5 = 101
//6 = 110
//7 = 111
//8 = 1000
//9 = 1001

//  Other System

//  Octal         (Base 8)
//  Hexadecimal   (Base 16)

//Bitwise Operators  $#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%
//A = 0101 ,B = 0110

//&  (Binary AND)  = 1 & 1= 1 otherwise 0
//|  (Binary OR)   = 0 | 0= 0 otherwise 1
//^  (Binary XOR)  = 0 | 0 / 1 | 1 = 0 otherwise 1
//~  (Binary One's Complement)
//<< (Binary Left Shift)  = A << 1 (Shift 1 mode to left side last one is 0)
//>> (Binary Right Shift) = A >> 1 (Shift 1 mode to right side last one is 0)

//Assignment Operators  $#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%
//Operators
//A=10, B=5
//  =    A=B    = A=5
//  +=   A=A+B  = A+=B
//  -=   A=A-B  = A-=B
//  *=   A=A*B  = A*=B
//  /=   A=A/B  = A/=B

//$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%
//$#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%  Bit Manipulation  $#@#$%$#@#$@#$@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#$%$#@#$@#$@#$%$#@#$%$#@#

// 1* Get Bit = (check the bit its 0 or 1)
// 2* Set Bit = (set become 1)
// 3* Clear Bit = (clear become 0)
// 4* Update Bit = (update the bit)

// * Get Bit
// * Get the 3rd bit (position 2) of a no. n (n. 0101)
//1. Bit mask = 1<<i (0001<<i)
//2. operation = AND

//(1) 1<<i
//   =0001<<2
//   =0100
//(2) AND
//    =0100 AND 0101
//    =0100 = this is non zero bit so this is 1

//public class Main{
//    public static void main(String[]args){
//        int n = 5;
//        int pos = 2;
//        int bitmask = 1<<pos;
//
//        if((bitmask & n)==0){
//            System.out.print("it is 0 bit");
//        }else{
//            System.out.print("it is 1 bit");
//        }
//    }
//}

//1. Bit mask = 1<<i (0001<<i)
//2. operation = AND

//public class Main{
//    public static void main(String[]args){
//        int n = 5;
//        int pos = 3;
//        int Bitmask = 1<<pos;
//
//        if((Bitmask & n)==0){
//            System.out.print("it is 0 bit");
//        }else{
//            System.out.print("it is 1 bit");
//        }
//    }
//}

// * Set Bit
// * set the 2nd bit(position = 1) of a no. n.(n = 0101)
//1. Bit mask = 1<<i (0001<<i)
//2. operation = OR

//    (1) 1<<i
//   =0001<<1
//   =0010
//(2) OR
//    =0010 OR 0101
//    =0111 = 7

//public class Main{
//    public static void main(String[] args){
//        int n = 5;
//        int pos = 1;
//        int Bitmask = 1<<pos;
//
//        int SetBit = Bitmask | n;
//        System.out.print(SetBit);
//    }
//}

//1. Bit mask = 1<<i (0001<<i)
//2. operation = OR
//public class Main{
//    public static void main(String[]args){
//        int n = 5;
//        int pos = 3;
//        int Bitmask = 1<<pos;
//
//        int SetBit = Bitmask | n;
//        System.out.print(SetBit);
//    }
//}

// * Clear Bit

// * clear the 3rd bit (position = 2) of a no. n (n.= 0101)
//1. Bit mask = 1<<i (0001<<i)
//2. operation = AND with NOT

//(1) 1<<i
//   =0001<<2
//   =0100
//(2) AND with NOT
//    =~(0100)= 1011 AND 0101
//    =0001 = 1

//public class Main{
//    public static void main(String[]args){
//        int n = 5;
//        int pos = 2;
//        int Bitmask = 1<<pos;
//        int  notBitmask = ~(Bitmask);
//
//        int ClearBit = (notBitmask & n);
//        System.out.print(ClearBit);
//    }
//}

//public class Main{
//    public static void main(String[]agrs){
//        int n = 5;
//        int pos = 0;
//        int Bitmask = 1<<pos;
//        int NotBitmask = ~(Bitmask);
//
//        int clearbit = NotBitmask & n;
//        System.out.print(clearbit);
//    }
//}

// * Update Bit
//update the 2nd bit (position = 1) of anumber n to 1 and 0.(n = 0101)

//import java.util.*;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Set Bit = 1 and Clrar Bit = 0");
//        int oper = sc.nextInt();
//
//        int n = 5;
//        int pos = 1;
//        int Bitmask = 1<<pos;
//
//        if(oper == 1){
//        int Setbit = Bitmask | n;
//            System.out.println(Setbit);
//        }else if(oper ==0){
//        int Notbitmask = ~(Bitmask);
//        int Clearbit = Notbitmask & n;
//            System.out.print(Clearbit);
//        }else{
//            System.out.print("Indavid Number");
//        }
//    }
//}

//    import java.util.ArrayList;
//    import java.util.Collections;
//
//public class Main{
//    public static void main(String[]args){
//
//        ArrayList<Integer> tap = new ArrayList<Integer>();
//
////        Add Elements
//        tap.add(2);
//        tap.add(4);
//        tap.add(6);
//        tap.add(8);
//        tap.add(10);
//        tap.add(12);
//        System.out.println(tap);
//
////        get Element
//        int gett = tap.get(2);
//        System.out.println(gett);
//
////        set element (update)
//        tap.set(2, 99);
//        System.out.println(tap);
//
////        Add element in between
//        tap.add(1, 33);
//        System.out.println(tap);
//
////        Remove Element
//        tap.remove(3);
//        System.out.println(tap);
//
//        tap.set(2, 6);
//        System.out.println(tap);
//
//        tap.set(1, 4);
//        System.out.println(tap);
//
//        int size = tap.size();
//        System.out.println(size);
//
//        for(int i=0; i<tap.size();i++){
//            System.out.println(tap.get(i));
//        }
//        Collections.sort(tap);
//        System.out.println(tap);
//
//        System.out.println(tap.contains("12"));
//    }
//}

//public class Main{
//    public static String privateName(String name){
//        System.out.print(name);
//
//        return name;
//    }
//    public static void main(String[]args){
//        Statement dot = new Statement();
//        String name = "pratik";
//
//        privateName(name);
//
//
//        dot.username();
//    }
//}





































































