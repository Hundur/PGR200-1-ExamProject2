package Innlevering_2.client.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Class for retrieving serverinput
 *
 * @author Jesper Dahl Ellingsen
 */
public class ServerInput
{
    private DataInputStream input;

    /**
     * Created the serverinput class
     *
     * @param conn The connection to the server
     * @throws IOException
     */
    public ServerInput(Socket conn) throws IOException
    {
        input = new DataInputStream(conn.getInputStream());
    }

    /**
     * Retrives the message from the server
     *
     * @return The serverinput
     * @throws IOException
     */
    public String getMessage() throws IOException
    {
        return input.readUTF();
    }

    /**
     * Closes the servinput
     *
     * @throws IOException
     */
    public void close() throws IOException
    {
        input.close();
    }
}
