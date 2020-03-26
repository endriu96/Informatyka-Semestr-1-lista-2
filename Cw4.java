
import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Random;
        import java.util.Scanner;
        import java.util.Iterator;
        import java.util.Map;



public class Cw4{
    public static void main(String[] args)
    {

        // tworzymy listę liczb, które wygenerujemy
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        // tworzymy obiekt, który będzie losować
        Random random = new Random();

        System.out.print("podaj zakres: ");
        //wprowadzamy zakres
        int zakres= scanner.nextInt();
        System.out.print("podaj ilość liczb: ");
        int x = scanner.nextInt();
        // wprowadzamy liczby, x - ile liczb chcę miec wygenerowanych
        for(int i = 0 ; i < x; i ++ ) {
            // dodaje kolejne liczby to puli do momentu, kiedy są mniejsze od x
            list.add(random.nextInt(zakres));
        }

        //iterator pobiera listę
        Iterator<Integer> iterator = list.iterator();
        // jak długi jest kolejny element
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");

        // definujemy mapę, która ma zliczać liczbę elementów, mapa<Integer = klucz, integer = wartość>
        Map<Integer,Integer> newMap = new HashMap<>();

        for(int i = 0 ; i < list.size() ; i ++) {

            // z mapy pobieramy klucz i, którego wrtością będzie j
            Integer j = newMap.get(list.get(i));
            newMap.put(list.get(i), (j == null) ? 1 : j +1);

        }

        for (Map.Entry<Integer, Integer> val : newMap.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "wystepuje"
                    + ": " + val.getValue() + " razy");




        }

    }

}