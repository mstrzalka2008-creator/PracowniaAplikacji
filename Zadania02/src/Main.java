import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj liczbę: ");
    int liczba = scanner.nextInt();

    if (liczba % 3 == 0) {
        System.out.println("Liczba jest podzielna przez 3.");
    } else {
        System.out.println("Liczba nie jest podzielna przez 3.");
    }

    System.out.print("Podaj pierwszy bok: ");
    double a = scanner.nextDouble();
    System.out.print("Podaj drugi bok: ");
    double b = scanner.nextDouble();
    System.out.print("Podaj trzeci bok: ");
    double c = scanner.nextDouble();

    if (a + b > c && a + c > b && b + c > a) {
        System.out.println("Z podanych boków można zbudować trójkąt.");
    } else {
        System.out.println("Z podanych boków nie można zbudować trójkąta.");
    }

    
}
