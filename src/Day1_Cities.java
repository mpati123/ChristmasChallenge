import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Day1_Cities {

    /**
     * Wyzwanie Świąteczne @wswieciekodu
     * Dzień 1
     * Mikołaj musi odwiedzić 3 miasta o współrzędnych (1,1), (4,5), (11,5) w podanej kolejności.
     * Mikołaj startuje z punktu(1,1) spod stacji paliw ;)
     * Na 10 jednostek odległości jego sanie zużywają 20 litrów magicznego paliwa.
     * Ile paliwa potrzebuje na całą trasę? Do policzenia przygotuj odpowiedni kod.
     * Obliczony wynik wypisz na ekranie.
     *
     * Oblicz w kodzie dystans miedzy miastami, a nastepnie policz niezbedną ilosc paliwa.
     * Do obliczenia dystansu przygotuj odpowiednią funkcję.
     * Do obliczeń matematycznych użyj funkcji z biblioteki Twojego jezyka.
     */

    public static void main(String[] args) {

        Places petrolStation = new Places(1, 1);
        Places firstPlace = new Places(4, 5);
        Places secondPlace = new Places(11, 5);

        double distance = 0;
        double neededPetrol = 0.0;

        distance = calculateDistance(petrolStation, firstPlace);
        distance += calculateDistance(firstPlace, secondPlace);
        neededPetrol = calculatePetrol(distance);

        System.out.println("Dystans Mikołaja do przebycia do ostatniego miejsca: " + distance);
        System.out.println("Ilość benzyny którą potrzebuje zatankować aby dotrzeć do ostatniego miejsca: " + neededPetrol);

        distance += calculateDistance(secondPlace, petrolStation);
        neededPetrol = calculatePetrol(distance);

        System.out.println("Dystans Mikołaja do przebycia wraz z powrotem do bazy: " + distance);
        System.out.println("Ilość benzyny którą potrzebuje zatankować aby objechać wszystko i wrócić do bazy: " + neededPetrol);
    }

    private static double calculateDistance(Places initialPlace, Places finalPlace) {
        double xDistance = abs(initialPlace.getX() - finalPlace.getX());
        double yDistance = abs(initialPlace.getY() - finalPlace.getY());
        return sqrt((xDistance * xDistance) + (yDistance * yDistance));
    }

    private static double calculatePetrol(double distance) {
        return 2 * distance;
    }
}