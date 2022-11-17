package Theatre;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if(theatre.reserveSeat("D12"))
            System.out.println("Please pay for D12");
        else
            System.out.println("Seat is already reserved");

        if(theatre.reserveSeat("D12"))
            System.out.println("Please pay for D12");
        else
            System.out.println("Seat is already reserved");

        if(theatre.reserveSeat("B13"))
            System.out.println("Please pay for B13");
        else
            System.out.println("Seat is already reserved");

        List<Theatre.Seat> reverseSeats = new ArrayList<Theatre.Seat>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }
    public static void printList(List<Theatre.Seat> seats){
        for(Theatre.Seat seat : seats)
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        System.out.println();
        System.out.println("========================================");
    }

}
