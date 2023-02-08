public class Main {

    public static void main(String[] args) {

//        int rows = 2;
//        int columns = 3;
//        int[][] matrix = new int[rows][columns];
//        matrix[0][1] = 5;
//        matrix[1][0] = 3;
//        matrix[1][2] = 7;
//        System.out.println(arrayAsString(matrix));


        int[][] matrix = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));
    }

    // create a string representation of array it receives as the parameter
    // return string
    public static String arrayAsString(int[][] array) {
        StringBuilder string = new StringBuilder();

        // forloop
        // iterate through array of array
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = 0; j < array[i].length; j++) {
//                // affix elements in each row
//                string.append(array[i][j]);
//            }
//            // affix a line break
//            string.append("\n");
//        }
//        // string representation
//        return string.toString();

        // foreach -- array of array
        for (int[] row : array) {
            // this is where the elements are
            for (int col : row) {
                // append each element in that row
                string.append(col);
            }
            // line break
            string.append("\n");
        }
        // string representation
        return string.toString();
    }
}