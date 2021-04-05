package lab9;

public class Model {
    public float calculate(long number1, long number2, String operator){
        switch(operator){
            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case "*":
                return number1*number2;
            case "/":
                if(number2 == 0)
                    return 0;
                return Math.floorDiv(number1, number2);//normal div create problem at parseLong
            default:
                return 0;
        }
    }
}
