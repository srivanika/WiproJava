package collections.miniproject3;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {

        if (c1.getSymbol() == c2.getSymbol())
            return 0;

        return Character.compare(c1.getSymbol(), c2.getSymbol());
    }
}