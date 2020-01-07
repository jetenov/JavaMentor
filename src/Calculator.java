
public class Calculator {
    public void Calc(String s) {
        int a, b, res;
        boolean numType = false;
        String[] mas = s.split(" ");
        try {
            a = Integer.parseInt(mas[0]);
            b = Integer.parseInt(mas[2]);
        } catch (NumberFormatException e) {
            a = convertToDec(mas[0]);
            b = convertToDec(mas[2]);
            numType = true;
        }
        if ((a > 0 && a < 11) && (b > 0 && b < 11)) {
            if (mas[1].equals("+"))
                res =  a + b;
            else if (mas[1].equals("-"))
                res =  a - b;
            else if (mas[1].equals("*"))
                res =  a * b;
            else if (mas[1].equals("/"))
                res =  a / b;
            else
                throw new ArithmeticException();
        }
        else
            throw new IllegalArgumentException();
        if (numType)
            System.out.println(convertToRom(res));
        else
            System.out.println(res);
    }

    public int convertToDec(String s) {
        int i;
        switch (s) {
            case "I":
                i = 1;
            break;
            case "II":
                i = 2;
            break;
            case "III":
                i =  3;
            break;
            case "IV":
                i =  4;
            break;
            case "V":
                i =  5;
            break;
            case "VI":
                i =  6;
            break;
            case "VII":
                i =  7;
            break;
            case "VIII":
                i =  8;
            break;
            case "IX":
                i =  9;
            break;
            case "X":
                i =  10;
            break;
            default:
                throw new IllegalArgumentException();
        }
        return i;
    }


    public String convertToRom(int n) {
        int[] arabNums = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romNums = {"M", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String str = "";

        for (int i = 0; i < arabNums.length; i++) {
            while (n >= arabNums[i]) {
                str += romNums[i];
                n -= arabNums[i];
            }
        }
        return str;
    }
}
