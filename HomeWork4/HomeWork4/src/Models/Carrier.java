package Models;

import java.util.ArrayList;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private long cardNumber;
    private List<Integer> zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;

        zones = new ArrayList<Integer>();
        zones.add(e:0);
        zones.add(e:1);
    }
    public long getCardNumber(){
       return cardNumber;
    }

    public int getId() {
      return id;
    }
}
