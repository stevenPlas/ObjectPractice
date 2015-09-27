package word;

/**
 *This prints our chapter 2 word problem
 * @author Steven
 */
public class WordProblem {
        char L = 'L';
        char O = 'O';
        char V = 'V';
        char E = 'E';
        
        
        //accesors
        public char getL(){return this.L;}
        public char getO(){return this.O;}
        public char getV(){return this.V;}
        public char getE(){return this.E;}
        
        //love method
        public void love(){
         int sum = (L + O + V + E);
        
        System.out.println("The word that I choose is \"Love\"\n");
        
        System.out.print("The Ascii value for L is ");
        System.out.println((int)L);
        System.out.print("The Ascii value for O is ");
        System.out.println((int)O);
        System.out.print("The Ascii value for V is ");
        System.out.println((int)V);
        System.out.print("The Ascii value for E is ");
        System.out.println((int)E);
        
        System.out.println("\nThe sum of the Ascii values is: " + (int)(sum));
        }
}
