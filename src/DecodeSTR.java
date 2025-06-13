public class DecodeSTR {
	
	String binaryDigits;

	public DecodeSTR(HexToBinaryConverter hextobin) {
		this.binaryDigits = hextobin.binaryDigits;
		decodeSTRInstruction(this.binaryDigits);
	}

	private void decodeSTRInstruction(String binaryDigits2) {
		int sourceR = Integer.parseInt(binaryDigits.substring(0,3), 2);
		int baseR = Integer.parseInt(binaryDigits.substring(3,6), 2);
		String Offset = Integer.toHexString(Integer.parseInt(binaryDigits.substring(6,12), 2)).toUpperCase();
		System.out.println("The assembly instruction is: STR R" + sourceR + ", R" + baseR + ", #0x" + Offset);
	}
}
