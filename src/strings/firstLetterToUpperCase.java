package strings;

public class firstLetterToUpperCase {

	public static void main(String[] args) {
		String name0 = "my name is mayank agrawal";
		String name = name0.trim();
		char[] stringArr = name.toCharArray();
		stringArr[0]=(char) (stringArr[0]-32);
		for(int i=0;i<stringArr.length;i++) {
			if(stringArr[i]==' ') {
				if(stringArr[i+1]==' ') {
					continue;
				}
				stringArr[i+1]=(char) (stringArr[i+1]-32);
			}
		}
		for(int i=0;i<stringArr.length;i++) {
			System.out.print(stringArr[i]);
		}

	}

}
