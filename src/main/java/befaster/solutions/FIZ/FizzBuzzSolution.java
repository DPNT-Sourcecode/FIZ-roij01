package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    private static final String threeMultiple = "fizz";
    private static final String fiveMultiple = "buzz";
    private static final String deluxeString = "deluxe";
    private static final String fakeDeluxeString = "fake deluxe";

    public String fizzBuzz(Integer number) {
        String result = null;
        if(isFizz(number) && isBuzz(number))
            result = threeMultiple + " " + fiveMultiple;
        else if(isFizz(number))
            result = threeMultiple;
        else if(isBuzz(number))
            result = fiveMultiple;

        if(isDeluxe(number) && result != null && number % 2 == 0)
            result = result.concat(" " + deluxeString);
        else if(isDeluxe(number) && result != null && number % 2 != 0)
            result = result.concat(" " + fakeDeluxeString);

        else if(isDeluxe(number) && result == null && number % 2 == 0)
            result = deluxeString;
        else if(isDeluxe(number) && result == null && number % 2 != 0)
            result = fakeDeluxeString;

        if(result == null)
            return number.toString();
        return result;
    }

    private boolean isFizz(Integer number){
        return (number.toString().contains("3") || number % 3 == 0);
    }

    private boolean isBuzz(Integer number){
        return (number.toString().contains("5") || number % 5 == 0);
    }

    private boolean isDeluxe(Integer number){
        return (number.toString().contains("3") && number % 3 == 0) || (number.toString().contains("5") && number % 5 == 0);
    }

}


