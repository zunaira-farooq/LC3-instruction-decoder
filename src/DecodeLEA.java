public class DecodeLEA {
	String binaryString;
	public DecodeLEA(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		DecodeLEAInstruction(this.binaryString);
	}
	
	public static void DecodeLEAInstruction(String binaryString) {
		
		int dr = Integer.parseInt(binaryString.substring(0,3), 2);
		int offsetDecimal = Integer.parseInt(binaryString.substring(3, 12),2);
		String offsetHex = Integer.toHexString(offsetDecimal).toUpperCase();
		
		System.out.println("The assembly instruction is LEA R" + dr + ", #0x" + offsetHex);
	}
}