
/**
 * The Seat class is apart of the Cinema Booking System project.
 *
 * @author James Hopkins
 * @version 11-3-2017
 */
public class Seat
{
    private Customer customer;
    private int seatNumber;
    
    /**
     * This method finds the number of a seat.
     * 
     * @param seatNumber Number of particular seat.
     */
    public Seat(int seatNumber)
    {
        this.seatNumber = seatNumber;
    }
    
    /**
     * This method determines if a seat is reserved or not by a customer.
     * 
     * @return if the seat is reserved or not.
     */
    public boolean isReserved()
    {
        
        return false;
    }
    
    /**
     * This method finds the Seat number of a Seat.
     * 
     * @return the seat number of a seat.
     */
    public int getSeatNumber()
    {
        
        return seatNumber;
    }
    
    /**
     * This method is used to reserve a seat by a Customer.
     * 
     * @param customer Customer reserving that seat
     */
    public void reserve(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * This method finds the Customer who reserved the seat.
     * 
     * @return the customer who made the reservation
     */
    public Customer getCustomer()
    {
        
        return null;
    }
    
    /**
     * This method cancels a reservation made by the customer.
     */
    public void cancelReservation()
    {
        
    }
}
