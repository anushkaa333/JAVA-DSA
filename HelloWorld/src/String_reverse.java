
public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "prutha";
		int i=0;
		int j=str.length()-1;
		char[] ch = str.toCharArray();
		while(i<j) {
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
 for(int k=0;k<str.length();k++) {
	 System.out.println("inside");
	 System.out.println(ch[k]);
	 
 }
	};

}
