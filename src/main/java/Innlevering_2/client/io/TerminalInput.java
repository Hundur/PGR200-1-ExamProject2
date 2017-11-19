package Innlevering_2.client.io;

import java.util.Scanner;

/**
 * Class to retrieve input from the terminal
 *
 * @author Jesper Dahl Ellingsen
 */
public class TerminalInput
{
    private Scanner input;

    /**
     * Creates a scanner
     */
    public TerminalInput()
    {
        input = new Scanner(System.in);
    }

    /**
     * Gets the user input from the terminal
     *
     * @return Returns the user input
     */
    public String getTerminalInput() { return (input.hasNext()) ? input.nextLine() : null; }

    /**
     * Closes the scanner
     */
    public void close()
    {
        input.close();
    }
}
