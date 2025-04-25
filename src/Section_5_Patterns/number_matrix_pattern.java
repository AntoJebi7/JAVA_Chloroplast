package Section_5_Patterns;
/*

aim :

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4


*/
public class number_matrix_pattern {
    public static void main(String[] args) {
        int n=4;
        for (int row = 0; row < 2*n-1; row++) { // rows
            for (int col = 0; col < 2*n-1; col++) {  // columns
                int top = row;
                int left = col;
                int right = (2*n-2)-col;
                int down = (2*n-2)-row;
                System.out.print(n-Math.min(Math.min(top, down), Math.min(left,right))+ " ");
            }
            System.out.println();
        }
    }
}
