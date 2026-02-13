package day10_revision;

public class BitwiseOperator {

    /* public static void main(String[] args) {
        int A = 10; // 1010 in binary
        int B = 3;  // 0011 in binary
        int Y;
        Y = A & B; // Output: 2 (0010 in binary)
        System.out.println(Y); // Output: 2 (0010 in binary)
        Y = A | B; // Output: 11 (1011 in binary)
        System.out.println(Y); // Output: 11 (1011 in binary)
        Y = A ^ B; // Output: 9 (1001 in binary)
        System.out.println(Y); // Output: 9 (1001 in binary)
       //  Y = ~A;    // Output: -11 (in binary: ...11110101)
        System.out.println(Y); // Output: -11 (in binary: ...11110101)
        Y = A << 2; // Output: 40 (101000 in binary)    
 //

    }
    
}
 */

public static void main(String[] args) {
  int A = 20;
  int B =60;
  int Y;
  Y = A & B; // Output: 4 (00000100 in binary)
  System.out.println(Y);
  Y = A | B; // Output: 76 (01001100 in binary)
  System.out.println(Y);
  Y = A ^ B; // Output: 72 (01001000 in binary)

  System.out.println(Y);
  Y = ~A;    // Output: -21 (in binary: ...11101011)
  System.out.println(Y);
  Y = A << 2; // Output: 80 (01010000 in binary)
}
 