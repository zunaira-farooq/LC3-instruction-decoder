# 🔡 LC-3 Instruction Decoder

This project implements a **high-level Java program** that converts machine code of an LC-3 instruction (in hexadecimal format) into a human-readable LC-3 assembly instruction.

---

## 📌 Description

The program takes a hexadecimal LC-3 machine code as input and outputs the corresponding assembly instruction. It decodes the instruction by identifying the opcode and its operands, converting it to a readable LC-3 assembly format.

**Example Interaction**

```
Input:  Enter the machine code of an LC-3 instruction: 0x1042  
Output: The assembly instruction is ADD R0, R1, R2  

Input:  Enter the machine code of an LC-3 instruction: 0xE2FF  
Output: The assembly instruction is LEA R1, 0xFF
```

---

## ⚙️ Implementation

* **Language:** Java
* Each LC-3 instruction type is implemented using a separate Java class (e.g., `AddDecoder`, `LeaDecoder`, etc.)
* The main program parses the machine code, identifies the opcode, and delegates decoding to the appropriate class.
* Supports modular, extensible decoding logic for easy addition of more LC-3 instructions.

---

## 🛠 How to Run

1️⃣ Compile the Java files:

```bash
javac -d bin src/*.java
```

2️⃣ Run the program:

```bash
java -cp bin Main
```

3️⃣ Enter machine code when prompted (hexadecimal format, e.g. `0x1042`).

---

## ✅ Features

* Converts LC-3 hexadecimal machine code to human-readable assembly.
* Supports multiple LC-3 instructions (e.g., `ADD`, `LEA`).
* Clean, modular design with one class per instruction decoder.


