public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 350, true);
        Ksiazka k2 = new Ksiazka("Hobbit", "J.R.R. Tolkien", 300, true);
        Ksiazka k3 = new Ksiazka("1984", "George Orwell", 280, true);

        k1.wypiszInfo();
        k1.wypozycz();
        System.out.println("Po wypożyczeniu:");
        k1.wypiszInfo();
    }
}
