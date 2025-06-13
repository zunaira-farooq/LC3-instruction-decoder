public class DecodeLDR {
	String binaryString;
	public DecodeLDR(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeLDRInstruction(this.binaryString);
	}
	public static void decodeLDRInstruction(String binaryString) {
		int dr = Integer.parseInt(binaryString.substring(0, 3), 2);
		int baseR = Integer.parseInt(binaryString.substring(3, 6), 2);
		
		//convert binary to decimal then convert to hex
		int offsetDecimal = Integer.parseInt(binaryString.substring(6, 12),2);
		String offsetHex = Integer.toHexString(offsetDecimal).toUpperCase();
		// Printing the decoded instruction
		System.out.println("The assembly instruction is LDR R" + dr + ", R" + baseR + ", #" + offsetHex);
	}
}
