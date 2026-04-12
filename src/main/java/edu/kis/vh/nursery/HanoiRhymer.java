package edu.kis.vh.nursery;

/**
 * Klasa pilnuje by nie kłaść większych elementów na mniejszych
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * metoda mówi ile liczb zostało już odrzuconych
     * @return - liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * metoda sprawdza czy stos nie jest pusty i nowa liczba większa od poprzedniej
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
