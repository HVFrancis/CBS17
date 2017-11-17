import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 * The Theater class is part of the Cinema Book System project.
 * It represent a theater in which a movie is being shown. (Each
 * Show object gets its own copy of a Theater object.
 *
 * @author Howard Francis
 * @version 0.1
 */
public class Theater
{
    // instance variables 
    private List<Row> rows;

    /**
     * Constructor for objects of class Theater
     */
    public Theater()
    {
        rows = new ArrayList<Row>();
        addGenericRows();
    }

    private void addGenericRows()
    {
     for (int i = 0; i < 5; i++) {
         rows.add(new Row(i+1, 10));
     }
        
    }
    
    /**
     * Create a Theater object by knowing the number of rows
     * and the number of seats per row. This method assumes
     * every row has the same number of seats.
     * 
     * @param rows          the number of rows in the theater
     * @param seatsPerRow   the number of seats in each row
     */
    public Theater(int rows, int seatsPerRow)
    {
        for (int i = 0; i < rows; i++) {
            this.rows.add(new Row(i+1, seatsPerRow));
        }
    }
    
    /**
     * This method searches the theater for unreserved seats
     * and returns in the form of a map with index row number
     * and value a list of open seats in that row
     * 
     * @return a map of the free seats indexed by row number
     */
    public Map<Integer, List<Integer>> getFreeSeats()
    {
        Map<Integer, List<Integer>> freeSeats = new HashMap<>();
        for (Row row : rows) {
            freeSeats.put(row.getRowNumber(), row.getFreeSeats());
        }
        
        return freeSeats;
    }
    
    /**
     * Reserve a specific seat for a customer
     * 
     * @param rowNo     the row number of the seat being reserved
     * @param seatNo    the seat number of the seat being reserved
     * @param customer  the customer reserving the seat
     */
    public void reserveSeat(int rowNo, int seatNo, Customer customer)
    {
        
    }
    
    /**
     * Find seat listing for adjacent seats
     * 
     * @param number    the minimum number of adjacent seats to find
     * @return  a map indexed by each row number and having a value of the
     *          list of the lists of adjacent seats 
     */
    public Map <Integer, List<List<Integer>>> findAdjacentSeats(int number)
    {
        return null;
    }
    
    /**
     * Searches the theater for all seats reserved by a specific customer
     * 
     * @param customer  the customer who reserved the seats
     * @return a map with index row number and value a list 
     *         of seats in that row reserved by that customer
     */
    public Map<Integer, List<Integer>> findReservationByCustomer(Customer costomer)
    {
        return null;
    }
    
    /**
     * Cancel the reservation for a specfic seat in the theater
     * 
     * @param rowNo     the row number of the seat to cancel
     * @param seatNo    the seat number of the seat to cancel
     */
    public void cancelReservation(int rowNo, int seatNo)
    {
        
    }
    
    
    
    
    
    
    
    
}
