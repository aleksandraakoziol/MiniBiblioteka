public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;
    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Błąd: Biblioteka jest już pełna!");
        }
    }
    public void wypiszDostepneKsiazki() {
        System.out.println("--- Dostępne książki w bibliotece ---");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna() == true) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }
    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna() == true) {
                licznik++;
            }
        }
        return licznik;
    }
}