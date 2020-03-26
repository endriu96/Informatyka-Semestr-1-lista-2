import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cw3 {
    public static void main(String[] args) {//a)
        Set<Integer> group1 = new HashSet<>();
        group1.add(1);
        group1.add(2);
        group1.add(3);
        group1.add(4);
        group1.add(5);
        group1.add(6);
        group1.add(7);
        group1.add(8);
        Set<Integer> group2 = new HashSet<>();
        group2.add(4);
        group2.add(3);
        group2.add(9);
        group2.add(0);
        group2.add(7);
        group2.add(-3);
        group2.add(8);

        System.out.println("Zbiór 1" + group1);
        System.out.println("Zbiór 2" + group2);
        //b)
        int count = 0;
        // iterator będzie zajmował się grupą 1
        Iterator<Integer> iterator = group1.iterator();
        // zaczynamy pętlę: jak długo iterator widzi kolejny element
        while (iterator.hasNext()) {
            //int to jest wartość, która pobiera dane z iteratora grupy 1
            int value = iterator.next();
            if (group2.contains(value)) {
                System.out.println(value + " ");
                count++;

            }

        }
        System.out.println("Count " + count);

        //c)suma zbiorów: tworzę nową grupę by mieć jedne wartości, ALE różną pamięći różne przeznaczenie; to zabezpiecza nową grupę przed modyfikacjami starych grup
        Set<Integer> group3 = new HashSet<>(group1);
        group3.addAll(group2);
        System.out.println("suma:" + group3);

        //część wspólna
        Set<Integer> group4 = new HashSet<>(group1);
        group4.retainAll(group2);
        System.out.println("Część wspólna:" + group4);

        //różnica zbiorów
        Set<Integer> group5 = new HashSet<>(group1);
        group5.removeAll(group2);
        System.out.println("Różnica zbiorów:" + group5);

        // Dopełnienie zbioru: wyrzucenie  z grupy 2 wspólnych elementów, czyli grupę 4

        group2.removeAll(group4);
        System.out.println("Dopełnienie zbioru:" + group2);
    }
}