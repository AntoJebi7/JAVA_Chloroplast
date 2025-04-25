package Section_5_Patterns;
/*

aim :

   A
  ABA
 ABCBA
ABCDCBA


* */
public class letter_full_pyramid {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=0;i<5;i++){
            for(int j=0;j<rows-i-1;j++){ // space   , 4,3,2,1
                System.out.print(" ");
            }
            // character
            char ch = 'A';
            int breakpoint = (2*i-1)/2; // so we can start again from 'A' when it reaches the center of letters
            for(int j=1;j<=(2*i-1);j++){  // letters   , 1,3,5,7
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }else{
                    ch--;
                }
            }
            for(int j=0;j<rows-i-1;j++){  // space   , 4,3,2,1
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


/*

output :

   A
  ABA
 ABCBA
ABCDCBA


* */