import java.util.Scanner;
public class SumOfLetter {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String A = sc.nextLine();
		        String B = sc.nextLine();
		        int sumLengths = A.length() + B.length();
		        System.out.println(sumLengths);
		        if (A.compareTo(B) > 0) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		        String capitalizedA = capitalizeFirstLetter(A);
		        String capitalizedB = capitalizeFirstLetter(B);
		        System.out.println(capitalizedA + " " + capitalizedB);
		        sc.close();
		    }
		    private static String capitalizeFirstLetter(String str) {
		        if (str == null || str.isEmpty()) {
		            return str;
		        }
		        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
		    }
}