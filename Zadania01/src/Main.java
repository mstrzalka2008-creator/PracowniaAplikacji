import java.util.Scanner;
void main() {
    IO.println(String.format("Hello and welcome!"));

    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    String imie = "Maciej";
    int rokUrodzenia = 2008;
    double liczba = 0.66;

    System.out.println("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj temperaturę w stopniach Celsjusza:");
    double stopnie = scanner.nextDouble();

    double fahrenheit = 1.8 * stopnie + 32.0;

    System.out.println("Temperatura w Fahrenheitach: " + fahrenheit);

    System.out.println("Podaj pierwszy bok:");
    double a = scanner.nextDouble();

    System.out.println("Podaj drugi bok:");
    double b = scanner.nextDouble();

    System.out.println("Podaj trzeci bok:");
    double c = scanner.nextDouble();

    System.out.println("Obwód trójkąta wynosi: " + (a + b + c));

    System.out.println("Podaj pierwsze słowo:");
    String pierwsze = scanner.next();

    System.out.println("Podaj drugie słowo:");
    String drugie = scanner.next();

    System.out.println("Podaj trzecie słowo:");
    String trzecie = scanner.next();

    System.out.println(trzecie + "," + drugie + "," + pierwsze);
}
