
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Cw2 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Tomek");
        list1.add("Zosia");
        list1.add("Magda");
        list1.add("Wojtek");
        list1.add("Andrzej");
        list1.add("Kasia");
        list1.add("Laura");
        list1.add("Melania");
        list1.add( "Sylwester");
        list1.add("Przemek");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.addAll(list1);
        // wyślwietl całą listę
		for(int i = 0 ; i < list1.size(); i++) {
		System.out.println(list1.get(i));

}
        // b) wyświetl pierwsze trzy imiona
		for(int i = 0 ; i < 3; i++) {
		System.out.println(list1.get(i));
	}

        //b)wyświetl ostatnie trzy imiona
	for(int i = 7 ; i < list1.size(); i++) {
		System.out.println(list1.get(i));

	}

        //c)dodaj imię w miejsce 5
		list1.add(5, "Kamila");

        // wyświetl w dodatkowym imieniem
	//for(int i = 0 ; i < list1.size(); i++) {
	//	System.out.println(list1.get(i));

	//}

	//d) usuwanie pierwszych trzech i ostatnich trzech imion
	list1.remove(9);
		list1.remove(8);
	list1.remove(7);

	list1.remove(0);
		list1.remove(0);
		list1.remove(0);

		System.out.println(list1);

        //e)stworzenie dodatkowej listy i połączenie list razem
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Jędrzej");
        list2.add("Asia");
        list2.add("Magda");
        list2.add("Krysia");
        list2.add("Andrzej");
        list2.add("Adrian");

		list2.addAll(list3);
		System.out.println(list2);

        //f)Sortowanie rosnąco
        Collections.sort(list2);
        System.out.println(list2);

        //sortowanie malejąco
        Collections.reverse(list2);
        System.out.println(list2);

    }


}
