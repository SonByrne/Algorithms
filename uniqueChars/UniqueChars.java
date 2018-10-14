public class UniqueChars {
	public static void main(String[] args) {
		if(args.length > 1) {
			System.out.println("Too many arguments...");
		} else {
			if(hasUniqueChars(args[0])) {
				System.out.println("\"" + args[0] + "\"" + " has all unique characters");
			} else {
				System.out.println("\"" + args[0] + "\"" + " does not have all unique characters");
			}
		}
	}

	private static boolean hasUniqueChars(String string) {
		boolean hasUniqueChars = true;
		for(int i = 0; i < string.length() - 1; i++) {
			for(int j = i + 1; j < string.length(); j++) {
				if(string.charAt(i) == string.charAt(j)) {
					hasUniqueChars = false;
					return hasUniqueChars;
				}
			}
		}
		return hasUniqueChars;
	}
}
