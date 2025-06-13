import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the machine code of an LC-3 instruction: ");
		String input = s.nextLine();
		
		String machineCode;
		if(input.startsWith("0x")) //to remove 0x from the input
			machineCode = input.substring(2);
		else {machineCode = input;}
		
		//converts hex to binary
		HexToBinaryConverter hextobin = new HexToBinaryConverter(machineCode);
		
		String opcode = machineCode.substring(0,1);
		switch(opcode) {
		case "0":
			new DecodeBR(hextobin);
			break;
			
		case "1": 
			new DecodeAdd(hextobin);
			break;
			
		case "2": 
			new DecodeLD(hextobin);
			break;
			
		case "3":
			new DecodeST(hextobin);
			break;
			
		case "4":
			String check = hextobin.binaryDigits.substring(0,1);
			switch(check) {
			case "1":
				new DecodeJSR(hextobin);
				break;
			case "0":
				new DecodeJSRR(hextobin);
				break;
			default:
			}
			break;	
			
		case "5": 
			new DecodeAnd(hextobin);
			break;
		
		case "6": 
			new DecodeLDR(hextobin);
			break;
			
		case "7":
			new DecodeSTR(hextobin);
			break;
			
		case "8": 
			//RTI = 0x8000
			if (machineCode.equals("8000"))
				System.out.println("The assembly instruction is RTI");
			else System.out.println("Invalid instruction. Try again later!");
			break;
			
		case "9": 
			new DecodeNOT(hextobin);
			break;
			
		case "A": 
			new DecodeLDI(hextobin);
			break;
			
		case "B":
			new DecodeSTI(hextobin);
			break;
			
		case "C": 
			//RET = 0xC1C0
			if (machineCode.equals("C1C0"))
				System.out.println("The assembly instruction is RET");
			else
				new DecodeJMP(hextobin);
			break;
		
		case "D": 
			System.out.println("This opcode is reserved. Try Again!");
			break;
			
		case "E": 
			new DecodeLEA(hextobin);
			break;
		case "F":
			if(machineCode.startsWith("F0"))
			{
				System.out.println("The assembly instruction is TRAP 0x" + machineCode.substring(2,4));
				break;
			}
		default:
			System.out.println("Invalid instruction. Try again later!");
		}
		s.close();
	}
}
