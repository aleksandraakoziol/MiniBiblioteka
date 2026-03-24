public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka(10);
        Ksiazka k1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 350, true);
        Ksiazka k2 = new Ksiazka("Hobbit", "J.R.R. Tolkien", 300, true);
        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);

        Czytelnik czytelnik = new Czytelnik("Jan", "Kowalski", 101);

        System.out.println("\n--- STAN POCZĄTKOWY ---");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n--- AKCJA: WYPOŻYCZENIE ---");
        biblioteka.wypozyczKsiazke("Hobbit", czytelnik);
        czytelnik.wypiszDane();

        System.out.println("\n--- PO WYPOŻYCZENIU (Hobbit powinien zniknąć) ---");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n--- AKCJA: ZWROT ---");
        biblioteka.zwrocKsiazke("Hobbit", czytelnik);
        czytelnik.wypiszDane();

        System.out.println("\n--- STAN KOŃCOWY (Hobbit znowu dostępny) ---");
        biblioteka.wypiszDostepneKsiazki();
    }
}