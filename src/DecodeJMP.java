public class DecodeJMP {
	String binaryString;
	
	public DecodeJMP(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeJMPInstruction(this.binaryString);
	}
//
//	private void decodeJMPInstruction(String binaryString2) {
//		if(binaryString.startsWith("000") && binaryString.endsWith("000000"))
//		{
//			System.out.println("The assembly instruction is JMP R" + Integer.parseInt(binaryString.substring(3, 6), 2));
//		}
//		else
//			System.out.println("Invalid instruction. Try again later!");
//	}
//	
	public static void decodeJMPInstruction(String binaryString) {
		int check1 = Integer.parseInt(binaryString.substring(0, 3),2);
		int check2 = Integer.parseInt(binaryString.substring(6,12),2);
		if (!(check1 == 0 && check2 == 0)) {
			System.out.println("Invalid Instruction");
			return;
		}
		
		int baseR = Integer.parseInt(binaryString.substring(3, 6), 2);
		
		// Printing the decoded instruction
		System.out.println("The assembly instruction is JMP R" + baseR);
	}
}
