package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    private static final String threeMultiple = "fizz";
    private static final String fiveMultiple = "buzz";
    private static final String deluxeString = "deluxe";

    public String fizzBuzz(Integer number) {
        String result = null;
        if(isFizz(number) && isBuzz(number))
            result = threeMultiple + " " + fiveMultiple);
        if(isFizz(number))
            return threeMultiple;
        if(isBuzz(number))
            return fiveMultiple;

        return number.toString();
    }

    private boolean isFizz(Integer number){
        return (number.toString().contains("3") || number % 3 == 0);
    }

    private boolean isBuzz(Integer number){
        return (number.toString().contains("5") || number % 5 == 0);
    }

    private boolean isDeluxe(Integer number){
        boolean deluxe = false;
        while(number / 10 != 0){
            Integer digit = number % 10;
            if (digit == (number / 10) % 10) {
                number = number / 10;
                deluxe = true;
            }
            else{
                deluxe = false;
                break;
            }

        }
        return deluxe;
    }

}


