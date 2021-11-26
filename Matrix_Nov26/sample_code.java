
import java.util.Scanner;

public class sample_code {
    public static void main(String[] args) {

        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows?");
        int row = sc.nextInt();
        System.out.println("How many cols?");
        int col = sc.nextInt();

        int[][] matrix=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        // printing matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }





//        int[][] matrix1={
//                        {1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        {9,10,11,12},
//                        {13,14,15,16}
//                        };
//
//        int[][] matrix2={
//                {1, 2, 6, 4},
//                {5, 6, 7, 8},
//                {9,10,11,12},
//                {13,14,15,16}
//              };
//
//        int rows=matrix1.length;
//        int cols=matrix1[0].length;
//        boolean isIdentical=true;
//
//        for(int i=0;i<rows;i++){   //rows
//            for(int j=0;j<cols;j++){  //cols
//                 if(matrix1[i][j]!=matrix2[i][j]){
//                     isIdentical=false;
//                     break;
//                 }
//            }
//            if(isIdentical==false){
//                break;
//            }
//        }
//
//        if(isIdentical){
//            System.out.println("Identical");
//        }else {
//            System.out.println("Not identical");
//        }

//
//                int[][] matrix={
//                        {1, 2, 3, 4},// ->1, 2, 3, 4=sum
//                        {5, 6, 7, 8},// 5+6+7+8
//                        {9,10,11,12},//
//                        {13,14,15,16}
//                        };
//                int rows=matrix.length;
//                 int cols=matrix[0].length;
//
//       int colSum;
//        // column Sum
//        for (int j = 0; j < cols; j++) {
//            colSum=0;
//            for (int i = 0; i < rows; i++) {
//                colSum=colSum+matrix[i][j];
//            }
//             System.out.println("sum of "+(j+1)+"col: "+colSum);
//        }
//
//
//
//
//       // Row Sum
//        int rowSum;
//           for(int i=0;i<rows;i++){  // rows
//               rowSum=0;
//               for(int j=0;j<cols;j++){   // column
//                   rowSum=rowSum+matrix[i][j];
//               }
//               System.out.println("sum of "+(i+1)+"row: "+rowSum);
//           }

//        Check if a given Matrix is an Identity Matrix or not
//
//                int[][] matrix={
//                        {1, 0, 0, 0},//
//                        {0, 0, 0, 0},//
//                        {0, 0, 1, 0},//
//                        {0, 0, 0, 1}
//                        };
//
//                 int rows=matrix.length;
//                 int cols=matrix[0].length;
//
//           // 1-> diag & val==1
//           // 2-> not a diag & val==0
//
//        boolean isIdentityMatrix=true;
//
//          for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//
//                 if(i==j && matrix[i][j]!=1){
//                     isIdentityMatrix=false;
//                     break;
//                 }else if(i!=j && matrix[i][j]!=0){
//                     isIdentityMatrix=false;
//                     break;
//                 }
//
//
//             }
//             if(isIdentityMatrix==false){
//                 break;
//             }
//          }
//
//         if(isIdentityMatrix){
//             System.out.println("Identity Matrix");
//         }else{
//             System.out.println("Not a Identity Matrix");
//         }
//
//

//        5) Transpose of a Matrix

//        int[][] matrix={
//                        {1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        };
//
//                 int rows=matrix.length;
//                 int cols=matrix[0].length;
//
//                 int newRow=cols;
//                 int newCol=rows;
//
//
//        int[][] TransposedMatrix=new int[newRow][newCol];
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                TransposedMatrix[j][i]=matrix[i][j];
//            }
//        }
//
//
//        for(int i=0;i<newRow;i++){
//            for(int j=0;j<newCol;j++){
//                System.out.print(TransposedMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//        6) Rotate a matrix
//
//        int[][] matrix={
//                {1, 2, 6, 4},
//                {5, 6, 7, 8},
//                {9,10,11,12},
//                {13,14,15,16}
//              };
//            int rows=matrix.length;
//            int cols=matrix[0].length;
//
//    // step:1 transpose
//
//                 int newRow=cols;
//                 int newCol=rows;
//
//
//        int[][] TransposedMatrix=new int[newRow][newCol];
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                TransposedMatrix[j][i]=matrix[i][j];
//            }
//        }
//
//        // step:2 reverse each row
//
//        for(int i=0;i<newRow;i++){
//            reverseRow(TransposedMatrix[i]);
//        }
//
//        // printing matrix
//        for(int i=0;i<newRow;i++){
//            for(int j=0;j<newCol;j++){
//                System.out.print(TransposedMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//        8)Find maximum element of each row in a matrix
//                int[][] matrix={
//                {1, 2, 6, 4},
//       //        |
//                {5, 6, 7, 8},
//                {9,10,11,12},
//                {13,14,15,16}
//              };
//
//            int rows=matrix.length;
//            int cols=matrix[0].length;
//
//        int max;
//
//        for(int i=0;i<rows;i++){
//            max=0;
//            for(int j=0;j<cols;j++){
//                if(matrix[i][j]>max){
//                    max=matrix[i][j];
//                }
//            }
//            System.out.println("max of"+i+" row:"+max);
//        }




    }

    static void reverseRow(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}




/*

1) check if two given matrices are identical

2)  Row Sum and Column Sum of a Matrix

3) Check if a given Matrix is an Identity Matrix or not
     Identity matrix is a square matrix with 1’s along the diagonal from
       upper left to lower right (1')and 0’s in all other positions.

4)Sum of Diagonal(Principal Diagonal, Secondary Diagonal) Elements of Matrix

5) Transpose of a Matrix

6) Rotate a matrix  - 90 degree

7) Rotate a matrix  - 180 degree

8)Find maximum element of each row in a matrix



 */
