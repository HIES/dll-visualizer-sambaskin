import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @Sam Baskin  
 */
public class DLLVisualizer
{
    public static void main(String[] args) throws Exception{


        final String API_KEY = "421641178565";
        final String USER_ID = "samebasket";
        
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);


        Track song1 = new Track("Danger Zone", "Kenny Loggins");
        Track song2 = new Track("Ragu commercial jingle", "Mr. Glaze");
        Track song3 = new Track("A jar of ragu being opened (10 hour version)", "Ezalg Rm");
        Track song4 = new Track("The Beautiful Steppe", "Batzorig Vaanchig");

        DLelement head = new DLelement(song1.toString(),song1);
        DLelement rag1 = new DLelement(song2.toString(),song2);
        DLelement rag2 = new DLelement(song3.toString(),song3);
        DLelement mong = new DLelement(song4.toString(),song4);
        
        head.setNext(rag1);
        rag1.setNext(rag2);
        rag1.setPrev(head);  
        rag2.setNext(mong);
        rag2.setPrev(rag1);
        mong.setPrev(rag2);
        
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}
