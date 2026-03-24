public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Książka: '" + tytul + "', Autor: " + autor + ", Strony: " + liczbaStron + ", Czy dostępna: " + dostepna);
    }

    public void wypozycz() {
        dostepna = false;
    }

    public void zwroc() {
        dostepna = true;
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}