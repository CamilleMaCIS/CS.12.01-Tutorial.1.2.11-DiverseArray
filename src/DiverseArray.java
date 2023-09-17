public class DiverseArray {
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int element : arr){
            sum += element;
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2d){
        int[] sumOfRows = new int[arr2d.length];

        for (int row = 0; row < arr2d.length; row++){
            sumOfRows[row] = arraySum(arr2d[row]);
        }

        return sumOfRows;
    }
    public static boolean isDiverse(int[][] arr2d){
        int[] sumOfRows = rowSums(arr2d);
        for (int i = 0; i < sumOfRows.length; i++){
            for (int j = i+1; j < sumOfRows.length; j++){
                if (sumOfRows[i] == sumOfRows[j]){
                    return false;
                }
            }
        }
        //otherwise if all sums are unique, return true
        return true;
    }
}
