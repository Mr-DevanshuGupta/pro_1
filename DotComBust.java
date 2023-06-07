import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

// public class SimpleDotComTestDrive {
//     public static void main(String[] args) {

//         int numOfGuesses = 0;
//         GameHelper helper = new GameHelper();
//         SimpleDotCom dot = new SimpleDotCom();
//         int randomNum = (int) (Math.random() * 5);
//         int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
//         dot.setLocationCells(locations);

//         boolean isAlive = true;

//         while (isAlive == true) {
//             String guess = helper.getUserInput("enter a number");
//             String result = dot.checkYourself(guess);
//             numOfGuesses++;
//             if (result.equals("kill")) {
//                 isAlive = false;
//                 System.out.println("You took " + numOfGuesses + "guesses");
//             }
//         }
//         String userGuess = "2";
//         String result = dot.checkYourself(userGuess);
//     }

// }

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms. ");
        System.out.println("Pets.com , eTOys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number ofguesses.");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (int x = 0; x < dotComsList.size(); x++) {
            result = dotComsList.get(x).checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(x);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");

        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }

    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}

class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";

            } else {
                result = "hit";
            }
        }
        return result;
    }
}

class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();

            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comsize) {
        ArrayList<String> alphaCells = new ArrayList<String>();

        String temp = null;
        int[] coords = new int[comsize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }

        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);

            int x = 0;
            success = true;
            while (success && x < comsize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        success = false;

                    }
                    if (x > 0 && (location % gridLength == 0)) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;

        while (x < comsize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }

        return alphaCells;
    }
}
