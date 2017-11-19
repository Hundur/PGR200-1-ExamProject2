package Innlevering_2.server.io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Class for sending messages to the client
 *
 * @author Jesper Dahl Ellingsen
 */
public class Output
{
    private DataOutputStream output;

    /**
     * Initialises the outputstream
     *
     * @param conn The connection to the client
     * @throws IOException
     */
    public Output(Socket conn) throws IOException
    {
        output = new DataOutputStream(conn.getOutputStream());
        output.flush();
    }

    /**
     * Sends a message to the client
     *
     * @param message Message to be sent
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException
    {
        output.writeUTF(message);
        output.flush();
    }

    /**
     * Closes the outpustream
     *
     * @throws IOException
     */
    public void close() throws IOException
    {
        output.close();
    }
}