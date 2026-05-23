package org.example;

class IMPRotateImage{
    public void rotate(int[][] matrix) {
        System.out.println("Current matrix: ");
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<matrix.length; i++){
            for (int j=i+1; j<matrix.length; j++){
                if (i==j)continue;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transpose matirx: ");
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i< matrix.length; i++){
            int leftItr=0, rightItr= matrix.length-1;
            while (leftItr<rightItr){
                int temp = matrix[i][leftItr];
                matrix[i][leftItr] = matrix[i][rightItr];
                matrix[i][rightItr] = temp;
                leftItr++;
                rightItr--;
            }
        }

        System.out.println("Row Reverse matirx: ");
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class RotateImage_48 {

    static void main() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        IMPRotateImage rm = new IMPRotateImage();
        rm.rotate(matrix);
    }

}
