import java.util.ArrayList; //listy i kolekcje sa zawsze w bibliotece java.util.*
import java.util.List;

public class Collections {

    public static void main(String[] args) {
//todo tworzenie listy
        List<String> lista = new ArrayList<>();     //utworzenie listy
//todo dodawanie do listy
        lista.add("Jan");
        lista.add("Maciejus");
        lista.add("Helbertus");                     //dodawanie do listy
//todo wypisanie rozmiaru listy
        System.out.println("Rozmiar listy: " + lista.size());   //sprawdzenie rozmiaru listy

        lista.add("Anna");
        lista.add("Michalina");

        System.out.println("Rozmiar listy: " + lista.size());
//todo iterowanie po liście
        for (String imie : lista) {                    //przeiterowanie po liście
            System.out.println("Imie: " + imie);
        }
//todo usuwanie z listy
        lista.remove("Jan");            //usuniecie po nazwie
        lista.remove(0);             //usuniecie po indeksie
//----------------------------------------------------------------------
        System.out.println("\nRozmiar listy: " + lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Imie: " + lista.get(i));
        }
//----------------------------------------------------------------------
//todo pobieranie z listy + uodporninie na blad
        try {
            String imie = lista.get(92);         //pobranie z listy
            System.out.println("\nElement o indeksie 2: " + imie);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Poza listą!");
            e.printStackTrace();                 //wypisuje blad
        }


//todo usuwanie wszystkich elementow listy
        lista.clear();                      //usuwamy wszystkie elementy listy
        System.out.println("Rozmiar listy: " + lista.size());
    }
}
