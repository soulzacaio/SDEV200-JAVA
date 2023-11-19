package M04_GROUPINGS;

import java.util.*;
import java.io.IOException;
import java.nio.file.*;

public class BracketChecker
{

    public static final String brackets = "()[]{}";

    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("No file provided. Provide file name as a cmd line argument.");
            System.exit(1);
        }

        String readFile = args[0];
        System.out.println("Scanning file: " + readFile);

        Stack<Character> bracketData = new Stack<>();

        try
        {
            bracketData = getBrackets(args[0]);// fill up stack

            System.out.println(processData(bracketData));// check for proper setup
        } catch (IOException err)
        {
            System.out.println(err.getMessage());
        }
    }

    public static Stack<Character> getBrackets(String file) throws IOException
    {
        Stack<Character> loadedStack = new Stack<>();// stack to load up brackets
        Path path = Paths.get(file);// get file path

        List<String> wholeFile = Files.readAllLines(path); // populate a List with all lines in the whole file

        for (String line : wholeFile)// for each item in the List<String>
        {
            for (char c : line.toCharArray())// for each char in said line
            {
                if (brackets.contains(String.valueOf(c)))// check if char is in the target
                {
                    loadedStack.push(c);// if so, push it to stack
                }
            }
        }
        return loadedStack;
    }

    public static boolean checkPair(char c1, char c2)
    {
        boolean isPair = false;
        if (c1 == '{' && c2 == '}')
            isPair = true;
        else if (c1 == '[' && c2 == ']')
            isPair = true;
        else if (c1 == '(' && c2 == ')')
            isPair = true;
        return isPair;
    }

    public static String processData(Stack<Character> bracketData)
    {
        String failedTest = "The file has incorrect brackets setup";
        String successfulTest = "The file has proper brackets setup";
        String output = "";

        Stack<Character> backTrack = new Stack<>();// stack to add brackets read from bracketData

        int totalChars = bracketData.size();
        if (totalChars % 2 != 0)// check if theres an even number of brackets, otherwise we know its off
            return failedTest;
        else if (totalChars == 0)
            return successfulTest;

        while (bracketData.size() != 0)
        {
            if (backTrack.size() == 0)// if theres nothing on the backTrack
            {
                // check to see if matching pair is in brackerData
                char currentBracket = bracketData.pop();
                if (checkPair(bracketData.peek(), currentBracket))
                    bracketData.pop();
                else
                    backTrack.push(currentBracket);
            } else // in the case we have something in the backTrack to compare to bracketData
            {
                if (checkPair(bracketData.peek(), backTrack.peek()))// check whether they are a pair
                {
                    bracketData.pop();// if so, pop both
                    backTrack.pop();
                } else// if they are not a pair, add bracketData last item to backTrack
                {
                    backTrack.push(bracketData.pop());
                }
            }
        }

        if (bracketData.size() != 0 && backTrack.size() != 0)
            output = failedTest;
        else
            output = successfulTest;

        return output;
    }

}
