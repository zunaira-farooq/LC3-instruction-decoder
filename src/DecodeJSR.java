public class DecodeJSR {
	String binaryString;
	
	public DecodeJSR(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeJSRInstruction(this.binaryString);
	}
	public static void decodeJSRInstruction(String binaryString) {
		int offsetDecimal = Integer.parseInt(binaryString.substring(1, 12),2);
		String offsetHex = Integer.toHexString(offsetDecimal).toUpperCase();
		
		System.out.println("The assembly instruction is JSR #0x" + offsetHex);
	}
}
