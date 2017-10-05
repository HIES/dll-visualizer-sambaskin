import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author (your name)
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        //Define credentials
        final String API_KEY = "INSERT_API_KEY_HERE";
        final String USER_ID = "INSERT_USER_ID_HERE";
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        //Define the objects to be added to your DLL
        

        //Build the head 
        DLelement head = null;
        
        //Create the rest of the Nodes/DLelements and link them to form a DLL
        
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}