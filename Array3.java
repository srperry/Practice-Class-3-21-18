import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter three numbers");
			
int[]numlist=new int[3];

numlist[0]=scanner.nextInt();
numlist[1]=scanner.nextInt();
numlist[2]=scanner.nextInt();

for(int i=0;i<numlist.length;i++){
	System.out.println(numlist[i]);
}

	}

}
