import java.util.ArrayList;
import java.util.Scanner;

public class NPN {
    /*
     A program to test Normal Polish Notation formulas

     Has the ability to handle  +, -, x and /

     e.g. + 75 125 would result in 200
          x + 10 10 2 = (x (+ 10 10) 2) = (10 + 10) * 2 = 40

    */
    public void NPN(){
    }



    public static int integerNPN(){
        ArrayList<String> formula = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Control + D to calculate the formula");
        System.out.println("Type formula in Polish Notation. I.e. '+ * 10 10 2' = 200:");

        //Convert String to ArrayList
        while (scanner.hasNext()){
            formula.add(scanner.next());
        }

        //Calculates formula
        int result = 0;
        for (int i = formula.size() - 1 ; i >= 0 ; i--) {
            //for (int i = formula.size() - 1 ; i >= 0 ; i--){

            switch (formula.get(i)){
                case "-":
                    result =  Integer.parseInt(formula.get(i+1)) - Integer.parseInt(formula.get(i+2));
                    formula.remove(i+2);
                    formula.remove(i+1);
                    formula.set(i, String.valueOf(result));
                    break;
                case "+":
                    result =  Integer.parseInt(formula.get(i+1)) + Integer.parseInt(formula.get(i+2));
                    formula.remove(i+2);
                    formula.remove(i+1);
                    formula.set(i, String.valueOf(result));
                    break;
                case "x":
                    result =  Integer.parseInt(formula.get(i+1)) * Integer.parseInt(formula.get(i+2));
                    formula.remove(i+2);
                    formula.remove(i+1);
                    formula.set(i, String.valueOf(result));
                    break;
                case "/":
                    result =  Integer.parseInt(formula.get(i+1)) / Integer.parseInt(formula.get(i+2));
                    formula.remove(i+2);
                    formula.remove(i+1);
                    formula.set(i, String.valueOf(result));
                    break;
                default:
                    break;
            }
        }
        return Integer.parseInt(formula.get(0));



    }




}
