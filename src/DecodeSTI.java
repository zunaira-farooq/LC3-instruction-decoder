public class DecodeSTI {
	
	String binaryDigits;

	public DecodeSTI(HexToBinaryConverter hextobin) {
		this.binaryDigits = hextobin.binaryDigits;
		decodeSTIInstruction(this.binaryDigits);
	}

	private void decodeSTIInstruction(String binaryDigits2) {
		int sourceR = Integer.parseInt(binaryDigits.substring(0,3), 2);
		String Offset = Integer.toHexString(Integer.parseInt(binaryDigits.substring(3,12), 2)).toUpperCase();
		System.out.println("The assembly instruction is: STI R" + sourceR + ", #0x" + Offset);
	}
}
