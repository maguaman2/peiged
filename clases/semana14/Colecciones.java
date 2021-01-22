import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        //veectores
        String[] nombres =new String[3];

        //coleccion tipo List
        List lista;
        lista =  new ArrayList();

        lista.add("Juan");
        lista.add("Jose");
        lista.add("Luis");
        lista.add("Luis");
        lista.add("Luis2");
        lista.add("Luis3");
        lista.add("Luis4");

        //for mejorado
        for (Object nombre :lista) {
           //System.out.println( ( (String) nombre));
        }

        //coleccion tipo Set
        Set listaSet;
        listaSet =  new HashSet();

        listaSet.add("Juan");
        listaSet.add("Jose");
        listaSet.add("Luis");
        listaSet.add("Luis");
        listaSet.add("Luis2");
        listaSet.add("Luis3");
        listaSet.add("Luis4");

        //for mejorado
        for (Object nombre :listaSet) {
            //System.out.println( ( (String) nombre));
        }

        Persona p1 = new Persona();
        p1.setId(1);
        p1.setNombre("Juan persona");

        Persona p2 = new Persona();
        p2.setId(2);
        p2.setNombre("Jose persona");

        List listaPersonas = new ArrayList();
        listaPersonas.add(p1);
        listaPersonas.add(p2);

        //for mejorado
        for (Object p :listaPersonas) {
            System.out.println( ((Persona)p).getNombre() +" "+ ((Persona)p).getId());
        }

    }
}
