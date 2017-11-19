package Innlevering_2.server.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Class for retrieving clientinput
 *
 * @author Jesper Dahl Ellingsen
 */
public class ClientInput
{
    private DataInputStream input;

    /**
     * Initialises the inputstream
     *
     * @param conn Connection to the client
     * @throws IOException
     */
    public ClientInput(Socket conn) throws IOException
    {
        input = new DataInputStream(conn.getInputStream());
    }

    /**
     * Retrieves the message from the client
     *
     * @return The message from the client
     * @throws IOException
     */
    public String getMessage() throws IOException
    {
        return input.readUTF();
    }

    /**
     * Closes the inputstream
     *
     * @throws IOException
     */
    public void close() throws IOException
    {
        input.close();
    }
}
