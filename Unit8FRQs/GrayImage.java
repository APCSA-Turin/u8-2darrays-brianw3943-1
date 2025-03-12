package Unit8FRQs;
public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /** The 2-dimensional representation of this image. Guaranteed not to be null.
     *  All values in the array are within the range [BLACK, WHITE], inclusive.
     */
    private int[][] pixelValues;

    /** constructor that takes a 2D array */
    public GrayImage(int[][] theArray) {
        pixelValues = theArray;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getPixelValues() {
        return pixelValues;
    }

    /** @return the total number of white pixels in this image.
     *  Postcondition: this image has not been changed.
     */
    public int countWhitePixels() {
        int count = 0;
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[i].length; j++) {
                if (pixelValues[i][j] == 255) {
                    count++;
                }
            }
        }
        return count;
    }
    

    /** Processes this image in row-major order and decreases the value of each pixel at
     *  position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
     *  Resulting values that would be less than BLACK are replaced by BLACK.
     *  Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
     */
    public void processImage() {
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[0].length; j++) {
                if (i + 2 >= pixelValues.length || j + 2 >= pixelValues[0].length) {
                    
                } else {
                    pixelValues[i][j] = pixelValues[i][j] - pixelValues[i+2][j+2];
                    if (pixelValues[i][j] < 0) {
                        pixelValues[i][j] = 0;
                    }
                }
            }
        }
    }
    
}