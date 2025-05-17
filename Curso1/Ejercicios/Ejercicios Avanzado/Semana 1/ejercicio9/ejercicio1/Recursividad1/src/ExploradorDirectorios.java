import java.util.ArrayList;
import java.util.List;

public class ExploradorDirectorios extends Directorios {

    public void recorrerDirectorios(Directorios directorio, String indentacion) {

        if (directorio == null) {
            return;
        }

        
        System.out.println(indentacion + "📁 " + directorio.getNombre());


        for (String archivo : directorio.getArchivos()) {
            System.out.println(indentacion + "   📄 " + archivo);
        }

        if (directorio.getSubDirectorios() != null) {
            for (Directorios subDir : directorio.getSubDirectorios()) {
                recorrerDirectorios(subDir, indentacion + "   ");
            }
        }
    }


}
