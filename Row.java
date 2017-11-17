import java.util.List;
import java.util.Map;
import java.util.ArrayList;
/**
 * Write a description of class Row here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Row
{
    private int SeatNo;
    private Customer customer;
    private int RowNo;
    private int seatsPerRow;
    private List<Seat> seats;

    /**
     * Constructor for objects of class Row
     */
    public Row(int RowNo, int seatsPerRow)
    {
       this.RowNo = RowNo;
       seats = new ArrayList<>();
       for (int i = 0; i < seatsPerRow; i++) {
           seats.add(new Seat(i+1));
       }
    }

    public List<Integer> getFreeSeats()
    {
        List<Integer> freeSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (!seat.isReserved()){
                freeSeats.add(seat.getSeatNumber());
            }
        }
        
        
        return freeSeats;
    }
    
    public int getRowNumber()
    {
        return RowNo;
    }
    
    public void reserveSeat(int SeatNo, Customer customer)
    {
        
    }
    
    public Map<Integer,List<List<Integer>>> findAdjacentSeats(int n)
    {
        return null;
    }
    
    public List<Integer> findReservationByCustomer()
    {
        return null;
    }
    
    public void cancelReservation(int SeatNo)
    {
        
    }
}
