package M04_Capitals;

import java.util.HashSet;
import java.util.*;

public class Capitals
{
    public static int tries = 0;

    public static String[][] statesAndCapitals = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" },
            { "Arizona", "Phoenix" }, { "Arkansas", "Little Rock" }, { "California", "Sacramento" },
            { "Colorado", "Denver" }, { "Connecticut", "Hartford" }, { "Delaware", "Dover" },
            { "Florida", "Tallahassee" }, { "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" },
            { "Illinois", "Springfield" }, { "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" },
            { "Kansas", "Topeka" }, { "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" },
            { "Maryland", "Annapolis" }, { "Massachusetts", "Boston" }, { "Michigan", "Lansing" },
            { "Minnesota", "St. Paul" }, { "Mississippi", "Jackson" }, { "Missouri", "Jefferson City" },
            { "Montana", "Helena" }, { "Nebraska", "Lincoln" }, { "Nevada", "Carson City" },
            { "New Hampshire", "Concord" }, { "New Jersey", "Trenton" }, { "New Mexico", "Santa Fe" },
            { "New York", "Albany" }, { "North Carolina", "Raleigh" }, { "North Dakota", "Bismarck" },
            { "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" }, { "Oregon", "Salem" },
            { "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
            { "South Dakota", "Pierre" }, { "Tennessee", "Nashville" }, { "Texas", "Austin" },
            { "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" }, { "Virginia", "Richmond" },
            { "Washington", "Olympia" }, { "West Virginia", "Charleston" }, { "Wisconsin", "Madison" },
            { "Wyoming", "Cheyenne" } };

    public static int getQuestion(int count, Scanner scanner, Set<Integer> used)
    {
        Random random = new Random();

        int rand = random.nextInt(50);// get a random state

        while (used.contains(rand))// check if we already did this state
            rand = random.nextInt(50);// if so, roll the random again

        // !gotta insert used into set
        used.add(rand);
        System.out.println("What is the capital of " + statesAndCapitals[rand][0] + "?");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase(statesAndCapitals[rand][1]))
        {
            System.out.println("Your answer is correct");
            count++;
        } else
        {
            System.out.println("The correct answer should be " + statesAndCapitals[rand][1]);
        }
        tries++;

        return count;

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> used = new HashSet<>();

        int count = 0;
        while (tries < 50)
        {
            count = getQuestion(count, scanner, used);
            System.out.println("The correct count is " + count);
        }
        scanner.close();
    }
}
