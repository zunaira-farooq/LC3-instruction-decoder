public class DecodeNOT {
	String binaryString;
	public DecodeNOT(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		DecodeNOTInstruction(this.binaryString);
	}
	
	public static void DecodeNOTInstruction(String binaryString) {
		
		int dr = Integer.parseInt(binaryString.substring(0,3),2);
		int sr = Integer.parseInt(binaryString.substring(3, 6),2);
		
		System.out.println("The assembly instruction is NOT R" + dr + ", R" + sr);
		
	}
}
