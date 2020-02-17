public class IsUnique
{
	
	public boolean isUnique(String word){
		if (word.length() > 128) return false;
		boolean[] charSet = new boolean[128];
		for (int i = 0; i < word.length(); i++){
			int currChar = word.charAt(i);
			if (charSet[currChar]) return false;
			charSet[currChar] = true;
		}
		return false;
	}
	public static void main(String[] args) {
		IsUnique myUnique = new IsUnique();
		System.out.println(myUnique.isUnique("name"));
	}

	

}