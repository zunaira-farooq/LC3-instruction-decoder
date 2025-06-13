public class DecodeLDI {
	String binaryString;
	public DecodeLDI(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeLDIInstruction(this.binaryString);
	}
	public static void decodeLDIInstruction(String binaryString) {
		int dr = Integer.parseInt(binaryString.substring(0, 3), 2);
		//convert binary to decimal then convert to hex
		int offsetDecimal = Integer.parseInt(binaryString.substring(3, 12),2);
		String offsetHex = Integer.toHexString(offsetDecimal).toUpperCase();
		// Printing the decoded instruction
		System.out.println("The assembly instruction is LDI R" + dr + ", #0x" + offsetHex);
	}
}
