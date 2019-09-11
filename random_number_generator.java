 package Basic_java;
import java.util.Random;
public class random_number_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random dice = new Random();
int n;
for( int c =1; c<=10; c++) {
	n = 1+ dice.nextInt(6); 
	System.out.println(n);
}
	}

}
			
