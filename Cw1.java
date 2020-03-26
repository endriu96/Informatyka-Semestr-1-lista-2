import java.util.*;

public class Cw1 {
    public static void main(String[] args) {
        //a)
        //utworzenie tablicy o nazwie imie przyjmujacej String
        String[] imiona= {"Tomek", "Zosia", "Magda","Wojtek", "Andrzej","Kasia", "Laura", "Melania", "Sylwester", "Przemek"};
        //tworze tablice o nazwie listaImion klasy String
        ArrayList<String> listaImion=new ArrayList<>();


        //b)
       for (String imie : imiona)
        listaImion.add(imie);
      String imie1= listaImion.get(0);
       String imie2=listaImion.get(1);
       String imie3=listaImion.get(2);
       String imie4=listaImion.get(7);
       String imie5=listaImion.get(8);
        String imie6=listaImion.get(9);

        System.out.println(imie1+imie2+imie3+imie4+imie5+imie6);

        //c)

        //listaImion.add(2,"Asia");
       // System.out.println(listaImion);
        //d)
        listaImion.remove(0);
        listaImion.remove(1);
        listaImion.remove(2);
        listaImion.remove(8);
            System.out.println(listaImion);

            //e)
        ArrayList<String> listaImion2=new ArrayList<>();

        listaImion2.add("Kamila");
        listaImion2.add("Magda");
        listaImion2.add("Siemik");
        listaImion2.add("Tomek");

        listaImion.addAll(listaImion2);
        System.out.println(listaImion);

        Collections.sort(listaImion);
        Collections.reverse(listaImion2);






    }
}