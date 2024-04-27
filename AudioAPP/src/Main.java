import com.oraclealura.formatos.Cancion;
import com.oraclealura.formatos.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cancion sober = new Cancion("Sober", "Tool", 305, false);
        sober.setAlbum("Undertow");

        String nombre_podcast;
        Podcast joeRogan_2137 = new Podcast("Joe Rogan Experience", "Joe Rogan", 173, 2137);
        joeRogan_2137.setDescripcion("Nuevo episodio");

        System.out.println(sober.getTotalMegusta());
    }
}