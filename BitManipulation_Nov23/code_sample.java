public class code_sample {

    public static void main(String[] args) {

     //   1)For a given number N print "yes" if 0'th bit is set
//        int n=28;
//
//        if((n&1)==1){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }

//        2)For a given number N count number of set bits
//        int n=28;
//        int count=0;
//
//        while(n!=0){
//
//            if( (n&1) == 1 ){
//                count++;
//            }
//            n=n>>1;
//        }
//
//        System.out.println("number of 1's are:"+count);


//        3) Given number N and index k check k'th bit is set or not

//        int n=28;
//        int k=3;
//
//        int mask=1;  // 00000001
//        mask=mask<<k; // 0001000<<3 ->
//
//        if((n&mask)==1){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }

// 4) write a program to determine given number N is power of 2 or not

//     int n=4;
//        int count=0;
//
//        while(n!=0){
//
//            if( (n&1) == 1 ){
//                count++;
//            }
//            n=n>>1;
//        }
//
//     if(count==1){
//         System.out.println("Power of 2");
//     }else{
//         System.out.println("Not a Power of 2");
//     }

        
    }
}


/*

1)For a given number N print "yes" if 0'th bit is set
set bits-> 1
    n-> eg: 1110011110101
                      210



2)For a given number N count number of set bits

set bits-> 1
    n-> e.g: 1110011110101
            &0000000000001
            ---------------
            0 or 1

          1>>000000

          000
         &000000000001
         ---------------
          0 or 1

       1>>

       n!=0

3) Given number N and index k check k'th bit is set or not

set bits-> 1
    n-> e.g: 1110011110101
    k=3     &00000001001

   1-> 00000001001
<<k


4) write a program to determine given number N is power of 2 or not


   1,2,4,8,.....
   2^0, 2^1, 2^2.....
 */
