public class DecodeBR {
	String binaryString;
	public DecodeBR(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeBRInstruction(this.binaryString);
	}
	public static void decodeBRInstruction(String binaryString) {
		int n = Integer.parseInt(binaryString.substring(0, 1),2);
		int z = Integer.parseInt(binaryString.substring(1, 2),2);
		int p = Integer.parseInt(binaryString.substring(2, 3),2);
		
		//convert binary to decimal then convert to hex
		int offsetDecimal = Integer.parseInt(binaryString.substring(3, 12),2);
		String offsetHex = Integer.toHexString(offsetDecimal).toUpperCase();
		
		if(n == 1) {
			if (z == 1) {
				if (p == 1) System.out.println("The assembly instruction is BRnzp #" + offsetHex);
				else System.out.println("The assembly instruction is BRnz #" + offsetHex);
			}
			else {
				if (p == 1) System.out.println("The assembly instruction is BRnp #" + offsetHex);
				else System.out.println("The assembly instruction is BRn #" + offsetHex);
			}
		}
		else {
			if (z == 1) {
				if (p == 1) System.out.println("The assembly instruction is BRzp #" + offsetHex);
				else System.out.println("The assembly instruction is BRz #" + offsetHex);
			}
			else {
				if (p == 1) System.out.println("The assembly instruction is BRp #" + offsetHex);
				else System.out.println("Invalid Code. Check the code and try again!");
			}
		}
	}
}