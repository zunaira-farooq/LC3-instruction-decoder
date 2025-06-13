public class DecodeAnd {
	String binaryString;
	
	public DecodeAnd(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeAndInstruction(this.binaryString);
	}
	public static void decodeAndInstruction(String binaryString) {
		int dr = Integer.parseInt(binaryString.substring(0, 3), 2);
		int sr1 = Integer.parseInt(binaryString.substring(3, 6), 2);
		
		int check = Integer.parseInt(binaryString.substring(6, 7),2);
		
		if (check == 0) {
			int sr2 = Integer.parseInt(binaryString.substring(9, 12), 2);
			
			// Printing the decoded instruction
			System.out.println("The assembly instruction is AND R" + dr + ", R" + sr1 + ", R" + sr2);
		}
		else if (check == 1){
			String imm = binaryString.substring(7,12);
			
			//converting binary string to binary
			//converting binary to hexstring
			String hex_immediate = Integer.toHexString(Integer.parseInt(imm,2)).toUpperCase();

			// Printing the decoded instruction
			System.out.println("The assembly instruction is AND R" + dr + ", R" + sr1 + ", #0x" + hex_immediate);
		}
		else {
				System.out.println("Invalid Instruction!");
		}
	}
}
