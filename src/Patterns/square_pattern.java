package Patterns;

public class square_pattern {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");  // square rows and columns
            }
            System.out.println();  // space after every individual line
        }
    }
}
