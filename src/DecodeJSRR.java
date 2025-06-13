public class DecodeJSRR {
	String binaryString;
	public DecodeJSRR(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeJSRRInstruction(this.binaryString);
	}
	
	public static void decodeJSRRInstruction(String binaryString) {
		int baseR = Integer.parseInt(binaryString.substring(3, 6),2);
		
		System.out.println("The assembly instruction is JSRR R" + baseR);
	}
}
