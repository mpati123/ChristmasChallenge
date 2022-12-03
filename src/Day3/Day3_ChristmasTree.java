package Day3;

public class Day3_ChristmasTree {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie choinkę.
     * Jeżeli potrafisz, nie wpisuj drzewka bezposrednio w printy - pokombinuj z pętlami.
     * Przygotuj funkcję przyjmującą wysokość choinki i wypisującą choinkę na ekranie.
     * Tak, żeby choinka wygenerowała się sama! Choinka może być po prostu trójkątem, albo być żłożona z kilku warstw. :)
     */

    public static void main(String[] args) {

        int height = 15;

        for (int i = 1; i <= height; i++) {
            drawSpace(i, height);
            drawTwig(i, '/');
            System.out.print("|");
            drawTwig(i, '\\');
            System.out.println("");
        }
    }

    public static int countDistanceFromBeggining(int i, int height) {
        return height - i;
    }

    public static void drawSpace(int i, int height) {
        for (int j = 0; j < countDistanceFromBeggining(i, height); j++) {
            System.out.print(" ");
        }
    }

    public static void drawTwig(int i, char twig) {
        for (int j = 0; j < i; j++) {
            System.out.print(twig);
        }
    }

}