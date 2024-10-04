package Hash_Tables.HashMap;

import java.util.*;

public class Itinerary_Journey_Path {
    //Creating the HashMap to store the ticket details in reverse order
    public static String getStar(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()){ //Key--> key, Value--> tick.get(key)
            revMap.put(tick.get(key), key);
        }
        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bangalore");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi","Goa");

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        String start = getStar(ticket);

        while(ticket.containsKey(start)){
            System.out.print(start + "->");
            start = ticket.get(start);
        }
        System.out.println(start);
    }
}
