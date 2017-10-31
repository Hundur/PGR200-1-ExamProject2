package EllJes16.io;

import java.util.Scanner;

public class TerminalInput
{
    private Scanner input;

    public TerminalInput()
    {
        input = new Scanner(System.in);
    }

    public int getTerminalInput()
    {
        return (input.hasNext()) ? input.nextInt() : null;
    }
}
