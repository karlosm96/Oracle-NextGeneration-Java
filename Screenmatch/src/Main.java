import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula("Matrix", "05-21-1999",
                                        136, true,
                                         "Lana Wachowski, Lilly Wachowski");

        matrix.evalua(10);
        matrix.evalua(6);

        Pelicula matrix2 = new Pelicula("Matrix", "05-21-1999",
                136, true,
                 "Lana Wachowski, Lilly Wachowski");

        System.out.println(matrix.getClasificacion());
    }
}