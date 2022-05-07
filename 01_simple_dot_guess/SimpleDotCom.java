import java.util.ArrayList;
public class SimpleDotCom {
    private ArrayList<Integer> locationCells;

    // int[] locationCells;
    // int numOfHits = 0;

    public void setLocationCells (ArrayList<Integer> locs) {
        locationCells.add(locs);
    }

    public String checkYouself(String userInput) {
        // int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0 ) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
    //     for (int cell : locationCells) {
    //         if (guess == cell) {
    //             result = "hit";
    //             numOfHits++;
    //             break;
    //         } // end if
    //     } // end for
    // if (numOfHits == locationCells.length) {
    //     result = "kill";
    // } // end if
    // System.out.println(result);
    return result;
    }
}

