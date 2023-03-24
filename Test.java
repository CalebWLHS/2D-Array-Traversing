public class Test {
    public static void main(String[] args){
        final int NUM_ROW = 4;
        final int NUM_COL = 4;
        int[][] my2DArray = new int[NUM_ROW][NUM_COL];
        double[][] anotherArray = {{2,3,4},{5,6,7},{8,9,10}};

        for(int row = 0; row< NUM_ROW; row++){
            for(int col = 0; col < NUM_COL; col++){
                my2DArray[row][col] = row*col;
            }
        }
        for(int row = 0; row < NUM_ROW; row++){
            for(int col = 0; col < NUM_COL; col++){
                System.out.print(my2DArray[row][col]+ "\t");

            }
            System.out.println();
        }
        int sum = 0;
        for(int col = 0; col < NUM_COL; col++){
            sum += my2DArray[1][col];
        }
        System.out.println("The sum is " + sum);

        for(int row = 0; row < NUM_ROW; row++){
            int rowSum = 0;
            for(int col = 0; col < NUM_COL; col++){
                rowSum += my2DArray[row][col];

            }
            System.out.println("The sum of row " +row+ " is "+ rowSum);
        }
    }
}
