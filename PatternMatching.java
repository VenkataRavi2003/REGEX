import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class PatternMatching{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the target string : ");
		String target = sc.nextLine();

		System.out.print("\nEnter the pattern : ");
		String pattern = sc.next();

		findAndPrintTheIndexesAndCountOfPattern(target,pattern);

		sc.close();
	}
	public static void findAndPrintTheIndexesAndCountOfPattern(String target,String pattern){

		Pattern p = Pattern.compile(pattern);

		Matcher m = p.matcher(target);

		int count = 0;

		while (m.find()) {

			++count;
			System.out.print(m.start()+",");
		}

		if(count != 0){
			System.out.println("\nno.of times pattern matched : "+count);
		}else {
			System.out.println("Pattern doesn't matched!!");
		}
	}
}