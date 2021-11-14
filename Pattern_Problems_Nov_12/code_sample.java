public class code_sample {
    public static void main(String[] args) {


        System.out.println("Print Square of size n*n: 5*5");

        int n=5;

        for ( int i=1;i<=n;i++ ){

            for (int j=1;j<=n;j++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }


        System.out.println("Triangle:");

        for ( int i=1;i<=n;i++ ){

            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("Inverse Triangle:");
    /*
        for ( int i=5;i>=1;i-- ){

            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    */
        for ( int i=1;i<=n;i++ ){

            for (int j=n;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        System.out.println("Left Rotated PyramidPattern:");

        for ( int i=1;i<=n-1;i++ ){

            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for ( int i=1;i<=n;i++ ){

            for (int j=n;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("Triangle Number I:");

        for (int i=1;i<=n;i++){    // i-> 1, 2, 3 ,4 ,5

            for (int j=1;j<=i;j++){   // j-> 1, 2, 3, ... i
                System.out.print(j+" ");
            }

            System.out.println();
        }

        System.out.println("Triangle Number II:");

        int counter =1;

        for ( int i=1;i<=n;i++ ){   // i->  1, 2, 3, 4, 5

            for (int j=1;j<=i;j++){   // j-> 1, j-> 1,2, j-> 1,2,3
                System.out.print(counter+" ");
                counter=counter+1;  // 1-> 2-> 3 -> 5->
            }
            System.out.println();
        }


        System.out.println("Triangle:");

        for ( int i=1;i<=n;i++ ){     // i-> 1, 2, 3, 4, 5

            for (int j=1;j<=(n-i);j++){ // j-> 1-4->4, 1-3->3, 1-2->2, 1-1->1, 1-0->1
                System.out.print("  ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("Pyramid:");

        for ( int i=1;i<=n;i++ ){     // i-> 1, 2, 3, 4, 5

            for (int j=1;j<=(n-i);j++){ // j-> 1-4->4, 1-3->3, 1-2->2, 1-1->1, 1-0->1
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }




    }


}




/*







1)*****

2)* * * * *

3)
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

4)

1->  *
2->  * *
3->  * * *
4->  * * * *
5->  * * * * *


5)

1->  * * * * *
2->  * * * *
3->  * * *
4->  * *
5->  *


6)

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


7)

1->  1
2->  1 2
3->  1 2 3
4->  1 2 3 4
5->  1 2 3 4 5

8)

counter=1

1->  1
2->  2 3
3->  4 5 6
4->  7 8 9 10
5->  11 12 13 14 15




9)

        *  8  2*4
      * *  6  2*3
    * * *  4  2*2
  * * * *  2  2*1
* * * * *  0  2*0


10)

Pyramid Pattern:

    *
   * *
  * * *
 * * * *
* * * * *

1->      *
2->     * *
3->    * * *
4->   * * * *
5->  * * * * *



 */
