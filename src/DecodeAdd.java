public class DecodeAdd {
	String binaryString;
	
	public DecodeAdd(HexToBinaryConverter binaryString) {
		super();
		this.binaryString = binaryString.binaryDigits;
		decodeAddInstruction(this.binaryString);
	}
	public static void decodeAddInstruction(String binaryString) {
		int dr = Integer.parseInt(binaryString.substring(0, 3), 2);
		int sr1 = Integer.parseInt(binaryString.substring(3, 6), 2);
		int check = Integer.parseInt(binaryString.substring(6, 7),2);
		
		if (check == 0) {
			int sr2 = Integer.parseInt(binaryString.substring(9, 12), 2);
			
			// Printing the decoded instruction
			System.out.println("The assembly instruction is ADD R" + dr + ", R" + sr1 + ", R" + sr2);
		}
		else if (check == 1){
			String imm = binaryString.substring(7,12);
			String parts[] = imm.split("", imm.length());
			int immediate = 0;
			//check if negative number
			if(parts[0].equals("1")) {
				
				//invert the bits
				for(int i = imm.length()-1;i>=0;i--) {
					if(parts[i].equals("1"))
						parts[i] = "0";
					else if(parts[i].equals("0"))
						parts[i] = "1";
				}
				//convert back to integer and add 1
				immediate = Integer.parseInt(String.join("", parts),2) + 1;
				immediate *= -1; //make the number negative
			}
			else {
				//if positive just convert the string to int
				immediate = Integer.parseInt(imm);
			}
			
			// Printing the decoded instruction
			System.out.println("The assembly instruction is ADD R" + dr + ", R" + sr1 + ", #" + immediate);
		}
		else {
			System.out.println("Invalid Instruction!");
		}
	}
}
//0001  111  1  1101
//
