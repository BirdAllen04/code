import java.util.*;
import java.util.Collections;

public class ExterminationGame {
    
    private LinkedList list;

    /**Construct an empty queue that uses a linked list */
    public ExterminationGame() {
        list = new LinkedList();
    }


    public void add(Object o) //add to end of queue/List.
    {
        list.addLast(o);
    }


    public void display() {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public void shuffle() {
        Collections.shuffle(list);

    }

    public void play() 
    {
        LinkedList playerList = new LinkedList();
        playerList = list;
        Random rn = new Random();
        int num = 0;
        for (int i = 1; i <= playerList.size(); i++) 
        {
            num = rn.nextInt() - 1;
            Collections.shuffle(playerList);    
            playerList.remove(num);
        }
    }
}
