import java.util.Map;
import java.util.List;
/**
 * Write a description of class Show here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Show
{
    // instance variables - replace the example below with your own
    private String title;
    private Date date;
    private Time time;
    private Theater theater;

    /**
     * Constructor for objects of class Show
     */
    public Show()
    {
        theater = new Theater();
       
    }

    /**
     * 
     */
    public Map<Integer, List<Integer>> getFreeSeats()
    {
       return theater.getFreeSeats(); 
    }
    
    
    /**
     * 
     */
    public void reserveSeat(int rowNo, int seatNo, Customer customer)
    {
        theater.reserveSeat(rowNo, seatNo, customer);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
