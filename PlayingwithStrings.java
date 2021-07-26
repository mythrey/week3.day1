package week3.day1.assignments;

public class PlayingwithStrings {

	public static void main(String[] args) {
		// to get the index of the character
		String text = "Java Exercise";
		int E = text.indexOf('E');
		int s = text.indexOf('s');
		System.out.println("Index position of E and s are :" + E + " and " + s);

		/// to get the character at the given index

		char charAt = text.charAt(5);
		char chatAT1 = text.charAt(11);
		System.out.println("Characters of 5 and 11 are :" + charAt + " and " + chatAT1);

		// to compare a given string to another string, ignoring case considerations

		String text1 = "I am Learning Java";
		String text2 = "I am learning java";

		// using equals
		boolean equals = text1.equals(text2);
		System.out.println(equals);

		System.out.println("*************");

		// using ==

		if (text1 == text2) {
			System.out.println("Same text");
		} else
			System.out.println("Different text");
		System.out.println("*************");

		// using equals ignore
 
		if (text1.equalsIgnoreCase(text2)) {
			System.out.println("Same text");
		} else
			System.out.println("Different text");
		System.out.println("*************");

	}

}
