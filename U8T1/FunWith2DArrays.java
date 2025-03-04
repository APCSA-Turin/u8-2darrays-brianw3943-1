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
}