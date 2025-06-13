public class HexToBinaryConverter {
	
	String binaryDigits;
	int num;
	
	public HexToBinaryConverter(String machineCode)
	{
		num = Integer.parseInt(machineCode,16);
		binaryDigits = Integer.toBinaryString(num);
		while(binaryDigits.length()<16)
		{
			binaryDigits = "0" + binaryDigits;
		}
		System.out.println("Binary value: " + binaryDigits);
		binaryDigits = binaryDigits.substring(4); //removing OpCode
	}
	
}
