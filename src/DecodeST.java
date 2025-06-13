public class DecodeST {
	
	String binaryDigits;

	public DecodeST(HexToBinaryConverter hextobin) {
		this.binaryDigits = hextobin.binaryDigits;
		decodeSTInstruction(this.binaryDigits);
	}

	private void decodeSTInstruction(String binaryDigits2) {
		int sourceR = Integer.parseInt(binaryDigits.substring(0,3), 2);
		String Offset = Integer.toHexString(Integer.parseInt(binaryDigits.substring(3,12), 2)).toUpperCase();
		System.out.println("The assembly instruction is: ST R" + sourceR + ", #0x" + Offset);
	}
}