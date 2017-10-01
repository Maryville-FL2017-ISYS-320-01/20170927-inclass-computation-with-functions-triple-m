/*
	ISYS 320
	MohammadAlshehri
	MohammedAljohani
	MansourAlbaibi
	9/30/17 
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
   we think it will print  Lines numbered like 1 2 3  
  											  1 2 3
  											  1 2 3
  											  7 5 2
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 i was not correct, we found different output and we was not near to the output, where is the problem was in the equation miss understood it 
we learn new thing throw the complexity of variables.
 
 */
public class P1_MysteryReturn {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery( x, z, y);
        System.out.println( x + " " + y + " " + z);
        x = mystery( z, z, x);
        System.out.println( x + " " + y + " " + z);
        y = mystery( y, y, z);
        System.out.println( x + " " + y + " " + z);

    }
    
    public static int mystery( int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 2;
        System.out.println(y + " " + z );
        return x;
    }


}
