public class Main {
    public static void main(String[] args) {
        // Zostawiamy książkę z poprzedniego zadania
        Ksiazka k1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 350, true);

        // Tworzymy czytelnika z Zadania 2
        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 101);

        // Testujemy czytelnika
        c1.wypiszDane();
        System.out.println("Symulujemy wypożyczenie...");
        c1.zwiekszLiczbeWypozyczen();
        c1.wypiszDane();
    }
}