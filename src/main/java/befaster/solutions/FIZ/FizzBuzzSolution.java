package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    private static final String threeMultiple = "fizz";
    private static final String fiveMultiple = "buzz";

    public String fizzBuzz(Integer number) {

        if(number % 3 == 0 && number % 5 == 0)
            return threeMultiple + " " + fiveMultiple;
        if(number % 3 == 0)
            return threeMultiple;
        if(number % 5 == 0)
            return fiveMultiple;

        return number.toString();
    }

}

