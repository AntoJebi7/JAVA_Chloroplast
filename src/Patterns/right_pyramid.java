package Patterns;

public class right_pyramid {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col <= row; col++) {
                // remember = column should connect somehow to the rows
                // col <= row , this means column belongs to row, that is 1st row contains 1 element,
                // 2nd row contains 2 element....
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // with numbers
        for (int row1 = 0; row1 < 5; row1++) {
            for (int col1 = 0; col1 <= row1; col1++) {
                // remember = column should connect somehow to the rows
                // col <= row , this means column belongs to row, that is 1st row contains 1 element,
                // 2nd row contains 2 element....
                System.out.print(col1+1+" ");
            }
            System.out.println();
        }

        // with numbers
        for (int row2 = 0; row2 < 5; row2++) {
            for (int col2 = 0; col2 <= row2; col2++) {
                // remember = column should connect somehow to the rows
                // col <= row , this means column belongs to row, that is 1st row contains 1 element,
                // 2nd row contains 2 element....
                System.out.print(row2+1+" ");
            }
            System.out.println();
        }
        // 5 to 1 pyramid
        System.out.println();
        for (int row2 = 5; row2 >= 1; row2--) {
            for (int col2 = 1; col2 <= row2; col2++) {
                // remember = column should connect somehow to the rows
                // col <= row , this means column belongs to row, that is 1st row contains 1 element,
                System.out.print("* ");
            }
            System.out.println();
        }
        // using equation to solve 5 to 1 pyramid
        //           n - row + 1

        System.out.println();
        int total_rows = 5;
        for (int row3 = 1; row3 <= total_rows; row3++) {
            for (int col3 = 0; col3 <(total_rows-row3+1); col3++) {
                // remember = column should connect somehow to the rows
                System.out.print("* ");
            }
            System.out.println();
        }
        //Because when row = 1, we want 5 stars →
        //5 - 1 + 1 = 5 ✅

        //When row = 5, we want 1 star →
        //5 - 5 + 1 = 1 ✅

        //Without the +1, it would give one less than needed.

    }
}
