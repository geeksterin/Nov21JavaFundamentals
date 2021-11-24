public class sample_code {
    public static void main(String[] args) {


//        String str="geekster";
//
//
//        char[] arr=str.toCharArray();
//
//        for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//
//        String str1="geeks";
//        String str2="forgeeks";
//
//
//      boolean isSame= str1.equals(str2);
//
////        String str3=str1.concat(str2);
//
//        String str3=str1+" "+str2+"_1234";
//
//        System.out.println(str3);



//
//        System.out.println(str1);
//        String str1=new String("java");
//
//        String str="geeks for  geeks,leetcode,geekster";
////                  01234567
//
//         String[] arr=str.split(",");
//
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }


//          int index=str.indexOf('e');
//        int lastindex=str.lastIndexOf('e');
//        System.out.println(index);



//          boolean isContains=str.contains("java");
//        System.out.println(isContains);

//        int a=5;
//        int b=3;
//
//
//        String str1="java";
//        String str2="Java";
//
//        boolean isEqual=str1.equalsIgnoreCase(str2);
//        System.out.println(isEqual);


//        boolean isEqual=str1.equals(str2);
//        System.out.println(isEqual);


//       String str1= str.substring(0,3);
//
//        System.out.println(str1);
//
//        String str2= str.substring(2);
//
//        System.out.println(str2);


//
//        System.out.println(str);
//
//
//        int length=str.length();
//
//        System.out.println(length);
//
//        System.out.println(str.charAt(2));



//        -write a function to print characters in string

//        String str="geekster";
//
//        printString(str);

// -program to print all the first char of a words
//            in a sentence

//        String str="Geeks foR GeeEks";
//        convertFirstUpper(str);


 //       - Count total number of alphabets, digits and special characters
//        String str="Geeks1234@$";
//        //          0123456789
//        countCharacters(str);


        String str="madam";  // madam

       String reversedStr= reverse(str);

       boolean isSame=str.equals(reversedStr);

       if(isSame){
           System.out.println("palindrome");
       }
 //       -check given string is palindrome or not
        //   madam



//        int n=4567; // -> "4567"
//
//        String s1=String.valueOf(n);
//
//        System.out.println(s1);

        String str1="4567";

       int num=Integer.valueOf(str1);

       String s2="123.45";
       float f=Float.valueOf(s2);

        System.out.println(f);
    }

    //   madrm
    //   01234

    static void isPalindrome(String str){

        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("Not a palindrome");
                break;
            }
            start++;
            end--;
        }


        System.out.println("Palindrome");

    }

    static String reverse(String str){  // "Geekster"
      String res="";                 //   01234567

      char[] arr=str.toCharArray();

        for (int i=0;i<arr.length;i++){
            res=arr[i]+res;  // res=e+tskeeG
        }

        System.out.println(res);

        return res;
    }


    static void countCharacters(String str){
        //alphabets
        int alphabetsCount=0;  //a-z A-Z
        // digits
        int digitsCount=0;
        // spefical chars
        int specialCount=0;

        char[] arr=str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if( (arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')){
                alphabetsCount++;
            }
            else if(arr[i]>='0'&&arr[i]<'9'){
                digitsCount++;
            }else{
                specialCount++;
            }


        }


        System.out.println("alphabetsCount"+alphabetsCount);
        System.out.println("digitsCount"+digitsCount);
        System.out.println("specialCount"+specialCount);
    }




//    "Geeks foR GeeEks"  -> [g,e,e,k,s, ,f,o,r, ,...]
//     0123456789            0 1 2 3 4 5 6 7 8

    static void convertFirstUpper(String str){
      char[] arr=str.toCharArray();

      for(int i=0;i<arr.length;i++){

          if(i==0){
              System.out.println(arr[i]);
          }
          if(arr[i]==' '){
              System.out.println(arr[i+1]);
          }

      }


    }

    static void printString(String str){
        char[] arr=str.toCharArray();

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}


/*



1)-important string inbuilt functions
   1)length
   2)charAt(index)
   3)

2)-converting string to char array and accessing



3) - Count total number of alphabets, digits and special characters


4) -reverse a string

   geekster
    retskeeg

 */
