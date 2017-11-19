package Innlevering_2.client.program;

import Innlevering_2.client.io.Client_IO_Controller;
import Innlevering_2.client.io.TerminalInput;

/**
 * The clients runtime
 *
 * @author Jesper Dahl Ellingsen
 */
public class ClientRuntime
{
    /**
     * Initialises the runtime, this means that the client waits for userinput, and sends the input to the server, until the input is "Exit"
     *
     * @param client The client to run
     */
    public ClientRuntime(ClientInit client)
    {
        Client_IO_Controller io = new Client_IO_Controller(client.getConnection());
        TerminalInput terminalInput = new TerminalInput();

        System.out.println(io.getMessage());

        while(true)
        {
            String answer = terminalInput.getTerminalInput();
            if(io.sendMessage(answer) == false)
            {
                terminalInput.close();
                break;
            }

            System.out.println(io.getMessage());
        }
    }
}