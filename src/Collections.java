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
            //e.printStackTrace();                 //wypisuje blad
        }


//todo usuwanie wszystkich elementow listy
        lista.clear();                      //usuwamy wszystkie elementy listy
        System.out.println("Rozmiar listy: " + lista.size());
//---------------------------------------------------------------------
//todo Zad1 - utworzenie listy i obiektow klasy User. Nastepnie dodanie obiektow do listy people
        System.out.println("\n\nZad. 1:\n");
        List<User> people = new ArrayList<>();

        User user_1 = new User("Anna", "Bajtowa", 99);
        User user_2 = new User("Michal", "Bit", 69);
        User user_3 = new User("Cyber", "Marian", 29);

        people.add(user_1);
        people.add(user_2);
        people.add(user_3);

        for (User ludziki: people){
            System.out.println(ludziki.getName() + " " + ludziki.getLastName() + " " + ludziki.getAge());
        }

        System.out.println();

        for (int i = 0; i < people.size(); i ++){
            System.out.println(people.get(i).getName() + " " + people.get(i).getLastName() + " " + people.get(i).getAge());
        }
    }
}
