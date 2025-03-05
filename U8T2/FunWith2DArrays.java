package U8T2;

public class FunWith2DArrays {
    public static int totalElements(int[][] TwoDArray) {
        int count = 0;
        for (int[] array : TwoDArray) {
            for (int integer : array) {
                count++;
            }
        }
        return count;
    }
    public static void fourCorners(String[][] TwoDArray) {
        System.out.println(TwoDArray[0][0]);
        System.out.println(TwoDArray[0][TwoDArray[0].length - 1]);
        System.out.println(TwoDArray[TwoDArray.length - 1][0]);
        System.out.println(TwoDArray[TwoDArray.length - 1][TwoDArray[0].length - 1]);
    }
    public static void swapFrontAndBackRows(String[][] TwoDArray) {
        String[] temp = TwoDArray[0];
        TwoDArray[0] = TwoDArray[TwoDArray.length - 1];
        TwoDArray[TwoDArray.length - 1] = temp;
    }
    public static double average(int[][] numArray) {
        double sum = 0;
        int count = 0;
        for (int[] ints : numArray) {
            for (int integer : ints) {
                sum += integer;
                count++;
            }
        }
        sum /= count;
        return sum;
    }
    public static int edgeSum(int[][] nums) {
        int sum = 0;
        for (int integer : nums[0]) {
            sum += integer;
        }
        for (int integer : nums[nums.length - 1]) {
            sum += integer;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i][0];
            sum += nums[i][nums[0].length - 1];
        }
        return sum;
    }
    public static int[] indexFound(String[][] strArray, String target) {
        int[] found = new int[2];
        for (int i = 0; i < strArray[0].length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                String string = strArray[j][i];
                if (string.equals(target)) {
                    found[0] = j;
                    found[1] = i;
                    return found;
                }
            }
        }
        found[0] = -1;
        found[1] = -1;
        return found;
    }
    public static int[][] split(int[][] arr, int rowNum, int colNum) {
        if (rowNum >= arr.length || colNum >= arr[0].length) {
            int[][] returnArr = new int[0][0];
            return returnArr;
        }
        int[][] splitArr = new int[rowNum + 1][colNum + 1];
        for (int i = 0; i <= rowNum; i++) {
            for (int j = 0; j <= colNum; j++) {
                splitArr[i][j] = arr[i][j];
            }
        }
        return splitArr;
    }
    public static int[][] invert(int[][] arr) {
        int[][] invert = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int integer = arr[i][j];
                invert[j][i] = integer;
            }
        }
        return invert;
    }
}