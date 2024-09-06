package arrays;

public class MultiDimensionalArray {
    public static void main (String[] args){
        int[][] marks = {
                {67,34,54,34,34},
                {67,34,54,34,34},
                {67,34,54,34,34}};

        for (int i = 0; i < 3; i++) {
            for(int j=0; j<5; j++){
                System.out.println(marks[i][j]);
//                tabular format
//                System.out.println(marks[i][j] + "\t");
            }
//            System.out.println();
        }

    }
}
