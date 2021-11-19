package com.patterns;

public class Operators {
    public static void main(String[] args) {

        // assignment operator  -> =
//        int a=5;
//        int b=2;
//        double res=0;
//
//        // +, -, *, /
//        res=a+b;  // 2+3->5
//        System.out.println("add:"+res);  // 7
//
//        res=a-b;
//        System.out.println("subs:"+res);  // 3
//
//        res=a*b;
//        System.out.println("mult:"+res);  // 10
//
//        res=(double)a/b;  // quotient
//        System.out.println("div:"+res);  // 2 -> 5/2=2.5
//
//
//        res=a%b;          // remainder
//        System.out.println("mod:"+res);  // 2 -> 5/2=2.5


       // Assignment operators

//        int m=5;

        // increment m by 1

//        System.out.println(m);
//
//        m=m+1;
//
//        m+=1;
//
//        m++;  // post increment // increment at next line   // can be incremented only by 1
//
//        ++m;  // pre increment -> incremented instantly

//         m++;  ->   m  increment
//         ++m;  ->  increment m


//         m=6;
//        System.out.println(m++);  // 6
//        System.out.println(++m);  // 8
//
//     //   --n >= 1  => 4 >= 1 => true
//
//       int n=1;
//       while(n-- >= 1 ){
//
//
//       }

//        System.out.println("actual:"+m); //6
//        System.out.println("during post inc:"+m++);  //6  // keep the current for now and increment it for next line
//        System.out.println("after post inc:"+m); //7
//        System.out.println("during pre inc:"+ ++m);  //8
//        System.out.println("after pre inc:"+m);//8




        // incremental operators

//         ++ -> incremental Operator
//        - pre increment -> incremented instantly
//                - post increment
//         -- -> decremental Operator
//        - pre decrement -> decremented instantly
//                - post decrement


//        System.out.println(m);



   //  write a method which takes a number as input and increments its value by 10 and returns result

//
//        Relational Operator:
//                1. <
//                2. >
//                3. <=
//                4. >=
//                5. ==
//                6. !=

//        - write a method which takes 2 numbers as input and prints their relationship


        printRelation(4,5);

//  Logical Operators:

//        &&
//        ||
//        ~

       int m=3;
       int n=5;

       if(m<5 || ++n<3){
           System.out.println("entered");
       }
        System.out.println(n); //5

        if(!(m<5)){ // do the opposite
            System.out.println("entered");
        }


//        m>5 && ++n<3
//
//         false    false
//        m>5
//
//         ++n < 3

//    Add 2 numbers without using + symbol
//         1
//        123
//         58
//        ----
//         181
//
//        111
//                &101
//                ----
//        101
//
//        111
//                ^101
//                ----
//        010
//2-> 10
//3-> 11
//           1    11000
//           28-> 11100
//           12->  1100
//          -----  ------
//           40   101000
//
//&  11100
//    1100
//--------
//   01100 << 1
//   11000
//
//
//
//
//^  11100
//    1100
//--------
//   10000
//
//^ 11000
//  10000
// -------
//  01000   -> added
//
//& 11000
//  10000
//---------
//  10000   -> &
//0100000  <<1 -> carry
//
//  01000
//0100000
//--------
//0000000 -> &
//
//  01000
//0100000
//--------
//0101000 -> ^
//1010000 -> <<
//
//2->10
//    1 1
//1->  01
//3->  11
//-    --
//4    100
//
//1)add:(^)
//
//  01
//  11
//  --
//  10 -> ^ add
//
//  carry
//  01
//  11
//  ---
//  01<<1
//  10  -> carry
//
//  10
//  10
// ----
//  00 ->^
//
//  10
//  10
// ----
//  10   <<1
//  ---
// 100
//         00
//        100
//        ---
//        100    add
//
//         00
//        100
//        ----
//        000<<1
//        000      when carry is zero stop
//
//
//
//                ^   -> adding
//           & << -> carry

        int a=1;
        int b=3;

        while(b!=0){
            int carry=(a&b)<<1;
            a=a^b;
            b=carry;
        }
        System.out.println("addintion:"+a);



    }

    static void printRelation(int a, int b){

        if(a==b){
            System.out.println("Both are same");
        } else if(a>b){
            System.out.println("a is greater then b");
        } else if(b>a){
            System.out.println("b is greater then a");
        }
    }


}
