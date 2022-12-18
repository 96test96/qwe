
import java.util.Scanner;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(calc(input));
        }
            public static String calc(String input) throws Exception {
                int number1;
                int number2;
                String a;
                String[] variables = input.split("[/*+\\-]");
                if (variables.length != 2){
                    throw new Exception();
                }
                a = getOper(input);
                if(a.equals(null)){
                    throw new Exception();}
                String q = variables[0];
                String w = variables[1];
                boolean rom;
                if (q.equals(Roman.qwe(q)) && w.equals(Roman.qwe(w))) {
                    number1 = Roman.getRoman(q);
                    number2 = Roman.getRoman(w);
                    rom = true;
                }
                else if  (!w.equals(Roman.qwe(q)) && !w.equals(Roman.qwe(w))) {
                    number1 = Integer.parseInt(q);
                    number2 = Integer.parseInt(w);
                    rom = false;
                }
                    else {
                    throw new Exception();
                }

                if (number1 < 1 || number2 < 1) {
                    throw new Exception();}
                else if (number1 > 10 || number2 > 10) {
                    throw new Exception();}

                int result = getSum(number1,number2,a);
                String finish;
                if (rom == true){
                     finish = Roman.roman(result);
                     if (finish.equals("-"))
                         throw new Exception();
                }
                else{
                     finish = Integer.toString(result);
                }
                return finish;
                 }


            static String getOper(String input) {
                if (input.contains("+"))
                    return ("+");
                else if (input.contains("-"))
                    return ("-");
                else if (input.contains("/"))
                    return ("/");
                else if (input.contains("*"))
                    return ("*");
                else
             return null;
            }
    static int getSum (int i, int j, String input){
        switch (input) {
            case "+":
               int a = i + j;
                return a;
            case "-":
                int b = i - j;
                return b;
            case "/":
                int c = i / j;
                return c;
            case "*":
                int d = i * j;
                return d;
        }
        return -1;
    }

    }

    class Roman{
    static  String[] Array  = {
        "I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV",
                "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV",
                "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV",
                "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV",
                "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV",
                "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV",
                "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
                "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV",
                "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

   static String qwe (String input) {
       for (int z = 0; z < Array.length; z++) {
           if (input.equals(Array[z])){
               return Array[z] ;}

           }
 return null;
   }




    static int getRoman (String rom) {
        int j;
        for (int i = 0; i < Array.length; i++){
            if (rom.equals(Array[i])){
                j = i + 1;
                return j;
            }
        }
                return -1;
    }
        static String roman(int i){
               for (int j = 0; j < Array.length; j++) {
                  if(i-1 == j){
                      return Array[j];
                  }

        }



return null;
}}