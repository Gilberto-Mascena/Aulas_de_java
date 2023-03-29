import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Gilberto Silva");
        list.add("Deise Silva");
        list.add("Gabrielle Silva");

        for (String nome : list) {
            System.out.println(nome);
        }

    }

}
