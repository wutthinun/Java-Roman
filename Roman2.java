public class Roman2 {

	private static final String NOT_SUPORT_VALUE = "Not suport value";

	public static void main(String[] args) {
		convertToRoman("2","II");
	}
	
	public static boolean convertToRoman(String input, String expect) {
		String out = "";
		int index = 0;
		
		/**
		 * Reverse and send digit to convert
		 */
		for(int i=input.toCharArray().length-1;i>=0;i--) {
			out = ss(input.toCharArray()[i], index)+out;
			if(NOT_SUPORT_VALUE.equals(out)) {
				break;
			}
			index++;
		}
		
		/**
		 * Print when convert is not expect
		 */
		if(!expect.equals(out)) {
			System.out.println(input+" ==> "+expect+" ===> "+out);
		}
		return expect.equals(out);
	}
	
	public static String ss(char c, int index) {
		String main="";
		String harf="";
		String prev="";
		String last="";
		switch(index) {
			case 3:
				main="M";
				break;
			case 2:
				main="C";
				harf="D";
				prev=main+harf;
				last=main+"M";
				break;
			case 1:
				main="X";
				harf="L";
				prev=main+harf;
				last=main+"C";
				break;
			case 0:
				main="I";
				harf="V";
				prev=main+harf;
				last=main+"X";
				break;
			default:
				return NOT_SUPORT_VALUE;
				
		}
		
		return sss(c, main, harf, prev, last);
	}
	
	public static String sss(char c, String main, String harf, String priv, String last) {
		String s="";
		Integer valueOf = Integer.valueOf(String.valueOf(c));
		for(int i=valueOf;i>0;i++) {
			if(valueOf != 0) {
					if(i==4) {
						s=priv;
					}else if(i==5) {
						s=harf;
					}else if(i==9){
						s=last;
					}else{
						s+=main;
					}
			}
		}
		return s;
	}
}
