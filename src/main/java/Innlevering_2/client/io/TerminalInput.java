package Innlevering_2.client.io;

import java.util.Scanner;

public class TerminalInput
{
    private Scanner input;

    public TerminalInput()
    {
        input = new Scanner(System.in);
    }

    // Todo: input.nextLine()
    public int getTerminalInput()
    {
        return (input.hasNext()) ? input.nextInt() : null;
    }
}