import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGatos {

    public static void main(String[] args) {

    List<Gato> gatos = new ArrayList<>(){{
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 12, "amarelo"));

    }};
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\tOrdem  Aleatória\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\tOrdem  Natural\t--");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\tOrdem  de Idade\t--");
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);
        System.out.println();

        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\tOrdem  de cor\t--");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\tOrdem  de Nome/Cor/Idade\t--");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
        System.out.println();

    }

}
