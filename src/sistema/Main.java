package sistema;

import modelo.Coatic;
import vistas.Principal;

public class Main {

    public static void main(String[] args) {
        Coatic c = (Coatic) Coatic.getPersistencia().buscar(Coatic.class, 1L);
        if (c == null) {
            c = new Coatic(1L, "Red CoaTIC");
        }
        Principal ventana = new Principal(c);
        ventana.setVisible(true);
    }
}
