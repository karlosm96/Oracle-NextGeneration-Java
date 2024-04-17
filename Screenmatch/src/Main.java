import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula("Matrix", "05-21-1999",
                                        136, true,
                                         "Lana Wachowski, Lilly Wachowski");

        Pelicula matrix2 = new Pelicula("Matrix", "05-21-1999",
                                        136, true,
                                        "Lana Wachowski, Lilly Wachowski");

        //matrix.evalua(10);
        //matrix.evalua(6);

        //FiltroRecomendacion filtroDeRecomendacion = new FiltroRecomendacion();
        //filtroDeRecomendacion.filtrado(matrix2);

        Serie shogun = new Serie("Shogun", "02-27-2024",
                                600, true, 1,
                                10, 60);

        Episodio shogun_1x1 = new Episodio(1, "Anjib", 1, shogun);
        shogun_1x1.setTotalVisualizaciones(300);
        shogun.evalua(9.5);
        shogun.evalua(9.3);

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrado(shogun_1x1);

    }
}