package primitivos;

public class ranges {

	public static void main(String[] args) {
		//*byte range
		byte vByte1 = 0, vByte2 = 0;
		short vShort1 = 0, vShort2 = 0;
		int vInt1 = 0, vInt2 = 0;
		long vLong1 = 0, vLong2 = 0;
		
		
		
		try {
			
			while(vByte2 <= vByte1) {
				vByte2 = vByte1;
				vByte1++;
			}
			
			while(vShort2 <= vShort1) {
				vShort2 = vShort1;
				vShort1++;
			}
			
			while(vInt2 <= vInt1) {
				vInt2 = vInt1;
				vInt1++;
			}
			
			while(vLong2 <= vLong1) {
				vLong2 = vLong1;
				vLong1++;
			}
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			System.out.println("Byte range");
			System.out.println(vByte2);
			System.out.println(vByte1);
			System.out.println("Short range");
			System.err.println(vShort1);
			System.err.println(vShort2);
			System.out.println("int range");
			System.out.println(vInt1);
			System.out.println(vInt2);
			System.out.println("long range");
			System.err.println(vLong1);
			System.err.println(vLong2);
		}
	}

}
