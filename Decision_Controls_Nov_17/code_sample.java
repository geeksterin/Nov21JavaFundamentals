package Decision_Controls_Nov_17;

public class code_sample {

    public static void main(String[] args) {

//  1) program to print the square of a number if number is less than 10
//        int n=9;
//
//        if(n<10){
//            int res=n*n;
//            System.out.println("square of a number is:"+res);
//        }


//   2) program to print whether user is elegible to vote?

//        int age=20;
//
//        if(age>=18){
//            System.out.println("Eligible to Vote");
//        }else{
//            System.out.println("Not Eligible to Vote");
//        }


// 3) program to print the square of a number if it is less than 10 or else print invalid

//       int n=9;
//
//        if(n<10){
//            int res=n*n;
//            System.out.println("square of a number is:"+res);
//        }else{
//            System.out.println("Invalid");
//        }


// 4) write a method to print whether given 2 numbers are same  or not
//        isSame(5,5);


// 5) write a method to print whether given number is positive or negative
//        isPositive(-4);


//6)program to print "num is between 0 and 10"  when number is between 0 and 10

//        0->10->0,1,2,3,..... 10
//        int n=5;
//
//        if(n>=0){
//
//            if(n<=10){
//
//                System.out.println( "num is between 0 and 10");
//            }
//
//        }
//
//        if(n>=0 && n<=10){
//            System.out.println( "num is between 0 and 10");
//        }
//
//
//   //     7)write a method to print whether given number is positive or negaitve or zero
//        isPositiveAndZero(5);

//      8) write a program to check whether given number is 10,20,30,40 or not any of these
//        int n=20;
//
//
//        if(n==10){
//            System.out.println("it is 10");
//        }else if(n==20){
//            System.out.println("it is 20");
//        }else if(n==30){
//            System.out.println("it is 30");
//        }else if(n==40){
//            System.out.println("it is 40");
//        }else{
//            System.out.println("not any of these");
//        }

//  9)write a method to take 3 persons age and print who is oldest among 3 of them

//        maxAge(6,7,8);

        //10) write a program to print name of the month by passing number of the month for first 4 months
        int n=20;

        if(n==10){
            System.out.println("it is 10");
        }else if(n==20){
            System.out.println("it is 20");
        }else if(n==30){
            System.out.println("it is 30");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }else if(n==40){
            System.out.println("it is 40");
        }




        switch (n){

            case 1:   //if else
                System.out.println("Jan");
                break;
            case 2:   //if else
                System.out.println("Feb");
                break;
            case 3:  //if else
                System.out.println("March");
                break;
            case 4:   //if else
                System.out.println("Apr");
                break;

            default:  // else
                System.out.println("not a valid month");

        }




    }


    static void isSame(int a, int b){

        if(a==b){     // a==b -> same -> true   else -> false
            System.out.println("2 numbers are same");
        }else{
            System.out.println("2 numbers are not same");
        }

    }

    static void isPositive(int a){

        if(a>0){
            System.out.println("Its positive");
        }else{
            System.out.println("Its negative");
        }

    }

    static void isPositiveAndZero(int a){

        if(a>0){
            System.out.println("Its positive");
        }else if(a<0){
            System.out.println("Its negative");
        }else{
            System.out.println("Its zero");
        }

    }

    static void maxAge(int a, int b, int c){

        if(a>b && a>c){
            System.out.println("A is elder");
        }else if(b>a && b>c){
            System.out.println("B is elder");
        }else {
            System.out.println("C is elder");
        }
    }



}


/*

If:

1) program to print the square of a number if number is less than 10

2) program to print whether user is elegible to vote or else print not elegible?


if-else :
3) program to print the square of a number if it is less than 10 or else print invalid

4) write a method to print whether given 2 numbers are same  or not

5) write a method to print whether given number is positive or negative


nested-if :  -> converted to &&
6)print "num is between 0 and 10"  when num is between 0 and 10


else - if :
7)write a method to print whether given number is positive or negaitve or zero

8) write a program to check whether given number is 10,20,30,40 or not any of these

9)write a method to take 3 persons age and print who is oldest among 3 of them


switch:
10) write a program to print name of the month by passing number of the month
 */
