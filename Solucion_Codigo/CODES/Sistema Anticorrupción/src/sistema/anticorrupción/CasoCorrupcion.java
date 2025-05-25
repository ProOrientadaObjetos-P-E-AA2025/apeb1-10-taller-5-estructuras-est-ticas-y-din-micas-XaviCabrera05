
package sistema.anticorrupción;
public class CasoCorrupcion {
    private String nombreCaso;
    private int implicados;

    public CasoCorrupcion(String nom, int imp) {
        this.nombreCaso = nom;
        this.implicados = imp;
    }

    public int getImplicados() {
        return implicados;
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public String toString() {
        return "Caso: " + nombreCaso + ", Implicados: " + implicados;
    }
}
