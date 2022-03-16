package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    private static final String threeMultiple = "fizz";
    private static final String fiveMultiple = "buzz";

    public String fizzBuzz(Integer number) {

        if(isFizz(number) && isBuzz(number))
            return threeMultiple + " " + fiveMultiple;
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

}

