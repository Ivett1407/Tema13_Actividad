import jdk.internal.org.objectweb.asm.util.Printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface CadenadeTexto {
    public void longitud();
}

interface CadenadeTexto2 {
    public void ordenAlfabetico();
}

class CadenasTexto {

    public String list;
}

public class Texto {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Karla");
        list.add("Angelica");
        list.add("Janeth");
        list.add("Samantha");
        list.add("Rogelio");
        list.add("Kevin");
        list.add("Liliana");
        list.add("Francisco");
        list.add("Jose Manuel");
        list.add("Ramiro");

        System.out.println("=======CADENAS DE TEXTO=======");
        System.out.println(list);

        CadenadeTexto a = new CadenadeTexto() {
            public void longitud() {

                System.out.println("\n===Por longitud utilizando Clase Anónima===");

                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
        };
        a.longitud();

        System.out.println("\n===Por longitud utilizando Lambda===");
        for (int i = 0; i < 1; i++) {
            list.forEach((n) -> System.out.println(list.size()));
        }

        System.out.println("\n===Por longitud utilizando Método de Referencia===");
        list.stream().forEach(System.out::println);


        CadenadeTexto2 b = new CadenadeTexto2() {
            public void ordenAlfabetico() {

                System.out.println("\n===Por Orden Alfabético utilizando Clase Anónima===");
                Collections.sort(list);

                for (String texto : list) {
                    System.out.println(texto);
                }
            }
        };
        b.ordenAlfabetico();

        System.out.println("\n===Por Orden Alfabético utilizando Lambda===");
        Collections.sort(list);
        list.forEach(x -> System.out.println(x.toString()));

        System.out.println("\n===Por Orden Alfabético utilizando Método de Referencia===");
        Collections.sort(list);
        list.stream().forEach(System.out::println);
    }
}

