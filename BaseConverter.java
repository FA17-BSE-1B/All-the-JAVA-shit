import java.util.Scanner;

public class BaseConverter{
  public static void main(String[] args){
    String userInput;
    int base;
    boolean validity;
    Scanner input;
    input = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter the number along with the base");
    System.out.print("Number: ");
    userInput = input.next();
    System.out.print("Base: ");
    base = input.nextInt();
    validity = validateNumber(userInput, base);
    if (validity == true){
      if (base == 2){
        binaryToOther(userInput);
      }
      else if (base == 8){
        octalToOther(userInput);
      }
      else if (base == 10){
        decimalToOther(userInput);
      }
      else if (base == 16){
        hexToOther(userInput);
      }
    }

  }
  public static boolean validateNumber(String stringNum, int base){
    int numLegnth;
    boolean validFlag;
    numLegnth = stringNum.length();
    validFlag = false;
    System.out.println();
    if (base == 2){
      for (int i = numLegnth-1; i >= 0; i--){
        if (stringNum.charAt(i) == '0'|| stringNum.charAt(i) == '1'){
          validFlag = true;
        }else{
          if (stringNum.charAt(i) < 'A' || stringNum.charAt(i) > 'F' && stringNum.charAt(i) < 'a' || stringNum.charAt(i) > 'f'){
            System.out.println("Invalid number");
          }else{
            System.out.println("Invalid number.\nBase and number do not match");
            System.out.println("Terminating program");
          }
          validFlag = false;
          break;
        }
      }
    }else if (base == 8){
      for (int i = numLegnth-1; i >= 0; i--){
        if (stringNum.charAt(i) >= '0' && stringNum.charAt(i) <= '7'){
          validFlag = true;
        }else{
          if (stringNum.charAt(i) < 'A' || stringNum.charAt(i) > 'F' && stringNum.charAt(i) < 'a' || stringNum.charAt(i) > 'f'){
            System.out.println("Invalid number");
          }else{
            System.out.println("Invalid number.\nBase and number do not match");
            System.out.println("Terminating program");
          }
          validFlag = false;
          break;
        }
      }
    }else if (base == 10){
      for (int i = numLegnth-1; i>= 0; i--){
        if (stringNum.charAt(i) >= '0' && stringNum.charAt(i) <= '9'){
          validFlag = true;
        }else{
          if (stringNum.charAt(i) < 'A' || stringNum.charAt(i) > 'F' && stringNum.charAt(i) < 'a' || stringNum.charAt(i) > 'f'){
            System.out.println("Invalid number");
          }else{
            System.out.println("Invalid number.\nBase and number do not match");
            System.out.println("Terminating program");
          }
          validFlag = false;
          break;
        }
      }
    }else if (base == 16){
      for (int i = numLegnth-1; i >= 0; i--){
        if ((stringNum.charAt(i) >= '0' && stringNum.charAt(i) <= '9') || (stringNum.charAt(i) >= 'A' && stringNum.charAt(i) <= 'F') || (stringNum.charAt(i) >= 'a' && stringNum.charAt(i) <= 'f')){
          validFlag = true;
        }else{
          if (stringNum.charAt(i) < 'A' || stringNum.charAt(i) > 'F' && stringNum.charAt(i) < 'a' || stringNum.charAt(i) > 'f'){
            System.out.println("Invalid number");
          }else{
            System.out.println("Invalid number.\nBase and number do not match");
            System.out.println("Terminating program");
          }
          validFlag = false;
          break;
        }
      }
    }
    else{
      System.out.println("Invalid base");
    }
    return validFlag;
  }

  public static String decimalToBinary(int decimalNum){
    //Declaration block
    String binaryNum, binary;
    int len;
    binary = "";
    binaryNum = "";
    while (decimalNum >= 1){
      binary += decimalNum % 2;
      decimalNum /= 2;
    }
    len = binary.length();
    for (int i = len-1; i >= 0; i--){
      binaryNum += binary.charAt(i);
    }
    return binaryNum;
  }

  public static String decimalToOctal(int decimalNum){
    int len;
    String octalNumber, num;
    octalNumber = "";
    num = "";
    len = 0;
    while (decimalNum >= 1){
      num += (decimalNum % 8);
      decimalNum /= 8;
    }
    len = num.length();
    for (int i = len-1; i >= 0; i--){
      octalNumber += num.charAt(i);
    }
    return octalNumber;
  }

  public static String decimalToHex(int decimalNum){
    int remainder, len;
    String hexNumber, hex;
    hex = "";
    hexNumber = "";
    while (decimalNum >= 16){
      remainder = decimalNum % 16;
      if (remainder > 9){
        hex += (char)('A' + (remainder - 10));
      }else{
        hex += remainder;
      }
      decimalNum /= 16;
    }
    if (decimalNum > 9){
      hex += (char)('A' + (decimalNum - 10));
    }else{
      hex += decimalNum;
    }
    len = hex.length();
    for (int i = len-1; i >= 0; i--){
      hexNumber += hex.charAt(i);
    }
    return hexNumber;
  }

  public static void binaryToOther(String num){
    int numLength, decimalNum, power;
    String octalNum, hexNum;
    decimalNum = 0;
    power = 0;
    numLength = num.length();
    for (int i = numLength-1; i >= 0; i--){
      decimalNum += (num.charAt(i)- '0') * (int)Math.pow(2, power);
      power++;
    }
    octalNum = decimalToOctal(decimalNum);
    hexNum = decimalToHex(decimalNum);

    System.out.println("Following are all the conversions for the binary number: " + num);
    System.out.println("==========================================================");
    System.out.println("Decimal: " + decimalNum);
    System.out.println("Octal: " + octalNum);
    System.out.println("Hex: " + hexNum);
    System.out.println("==========================================================");
    System.out.println();
  }

  public static void octalToOther(String num){
    String binaryNum, hexNum;
    int decimalNum;
    short numLength, exponent;
    decimalNum = 0;
    exponent = 0;
    numLength = (short)num.length();
    for (int i = numLength-1; i >= 0; i--){
      decimalNum += (num.charAt(i) - '0') * (int)(Math.pow(8, exponent));
      exponent++;
      }
    binaryNum = decimalToBinary(decimalNum)  ;
    hexNum = decimalToHex(decimalNum);
    System.out.println("Following are all the conversions for the octal number: " + num);
    System.out.println("==========================================================");
    System.out.println("Binary: " + binaryNum);
    System.out.println("Decimal: " + decimalNum);
    System.out.println("Hex: " + hexNum);
    System.out.println("==========================================================");
    System.out.println();
  }

  public static void decimalToOther(String num){
    String binaryNum, octalNum, hexNum;
    int decimalNum;
    decimalNum = Integer.parseInt(num);
    binaryNum = decimalToBinary(decimalNum);
    octalNum = decimalToOctal(decimalNum);
    hexNum = decimalToHex(decimalNum);
    System.out.println("Following are all the conversions for the decimal number: " + num);
    System.out.println("==========================================================");
    System.out.println("Binary: " + binaryNum);
    System.out.println("Octal: " + octalNum);
    System.out.println("Hex: " + hexNum);
    System.out.println("==========================================================");
    System.out.println();
  }
  public static void hexToOther(String num){
    int numLength, exponent, decimalNum, digit;
    String binaryNum, octalNum;
    numLength = num.length();
    decimalNum = 0;
    exponent = 0;
    for (int i = numLength-1; i >= 0; i--){
        digit = (char)num.charAt(i);
        if ((char)digit >= 'A'){
          digit = (10 + (digit - 'A'));
        }else{
          digit -= (char)'0';
        }
        decimalNum += (digit * (int)Math.pow(16, exponent));
        exponent++;
    }
    binaryNum = decimalToBinary(decimalNum);
    octalNum = decimalToOctal(decimalNum);
    System.out.println("Following are all the conversions for the decimal number: " + num);
    System.out.println("==========================================================");
    System.out.println("Binary: " + binaryNum);
    System.out.println("Octal: " + octalNum);
    System.out.println("Decimal: " + decimalNum);
    System.out.println("==========================================================");
    System.out.println();


  }
}
