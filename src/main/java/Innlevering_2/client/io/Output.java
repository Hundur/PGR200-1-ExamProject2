package Innlevering_2.client.io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Class for handling the output to the server
 *
 * @Author Jesper Dahl Ellingsen
 */
public class Output
{
    private DataOutputStream output;

    /**
     * Creates the output class
     *
     * @param conn The connection to the server
     * @throws IOException
     */
    public Output(Socket conn) throws IOException
    {
        output = new DataOutputStream(conn.getOutputStream());
        output.flush();
    }

    /**
     * Sends a message to the server
     *
     * @param message The message to be sent to the server
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException
    {
        output.writeUTF(message);
        output.flush();
    }

    /**
     * Closes the output source
     *
     * @throws IOException
     */
    public void close() throws IOException
    {
        output.close();
    }
}