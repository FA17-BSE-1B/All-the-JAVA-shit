import java.util.Scanner;

public class BaseConverter{
  public static void main(String[] args){
    //Declaration block
    String userInput;
    int base;
    boolean validity;
    Scanner input;
    //Initialization block
    input = new Scanner(System.in);
    //Working block
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
    //Declaration block
    int numLegnth;
    boolean validFlag;
    //Initialization block
    numLegnth = stringNum.length();
    validFlag = false;
    //Working block
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
      //System.out.println("Base 8");
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
      //System.out.println("Base 10");
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

    //Initialization block
    binary = "";
    binaryNum = "";

    //Working block
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
    //Declaration block
    int len;
    String octalNumber, num;
    //Initialization block
    octalNumber = "";
    num = "";
    len = 0;
    //Working block
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
    //Declaration block
    int remainder, len;
    String hexNumber, hex;

    //Initialization block
    hex = "";
    hexNumber = "";

    //Working block
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
    //Declaration block
    int numLength, decimalNum, power;
    String octalNum, hexNum;

    //Initialization block
    decimalNum = 0;
    power = 0;
    numLength = num.length();

    //Working block
    //Binary to decimal
    for (int i = numLength-1; i >= 0; i--){
      decimalNum += (num.charAt(i)- '0') * (int)Math.pow(2, power);
      power++;
    }
    //Decimal to Octal
    octalNum = decimalToOctal(decimalNum);
    //Decimal to hex
    hexNum = decimalToHex(decimalNum);

    //Priting out the obtained values
    System.out.println("Following are all the conversions for the binary number: " + num);
    System.out.println("==========================================================");
    System.out.println("Decimal: " + decimalNum);
    System.out.println("Octal: " + octalNum);
    System.out.println("Hex: " + hexNum);
    System.out.println("==========================================================");
    System.out.println();
  }

  public static void octalToOther(String num){
    //Declaration block
    String binaryNum, hexNum;
    int decimalNum;
    short numLength, exponent;
    //Initialization block
    decimalNum = 0;
    exponent = 0;
    numLength = (short)num.length();
    //Working block
    //Octal to decimal
    for (int i = numLength-1; i >= 0; i--){
      decimalNum += (num.charAt(i) - '0') * (int)(Math.pow(8, exponent));
      exponent++;
      }
      //Decimal to binary
    binaryNum = decimalToBinary(decimalNum)  ;
    //Decimal to hex
    hexNum = decimalToHex(decimalNum);

    //Display the converted values
    System.out.println("Following are all the conversions for the octal number: " + num);
    System.out.println("==========================================================");
    System.out.println("Binary: " + binaryNum);
    System.out.println("Decimal: " + decimalNum);
    System.out.println("Hex: " + hexNum);
    System.out.println("==========================================================");
    System.out.println();
  }

  public static void decimalToOther(String num){
    //Declaration block
    String binaryNum, octalNum, hexNum;
    int decimalNum;
    //Initialization block

    //Working block
    decimalNum = Integer.parseInt(num);
    //Decimal to binary
    binaryNum = decimalToBinary(decimalNum);
    //Decimal to octal
    octalNum = decimalToOctal(decimalNum);
    //Decimal to hex
    hexNum = decimalToHex(decimalNum);

    //Display the obtained results
    System.out.println("Following are all the conversions for the decimal number: " + num);
    System.out.println("==========================================================");
    System.out.println("Binary: " + binaryNum);
    System.out.println("Octal: " + octalNum);
    System.out.println("Hex: " + hexNum);
    System.out.println("==========================================================");
    System.out.println();
  }

  public static void hexToOther(String num){
    System.out.println("Work in progress");
  }
}
