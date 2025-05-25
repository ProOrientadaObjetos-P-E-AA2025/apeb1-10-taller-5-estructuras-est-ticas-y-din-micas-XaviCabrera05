package sistema.anticorrupción;

public class SistemaJusticia {

    private CasoCorrupcion caso;

    public void ingresarCaso(CasoCorrupcion c) {
        this.caso = c;
    }

    public void verificarGravedad() {
        if (caso.getImplicados() > 5) {
            System.out.println("El caso \"" + caso.getNombreCaso() + "\" es super grave! Necesita investigacion urgente!");
        } else {
            System.out.println("El caso \"" + caso.getNombreCaso() + "\" puede ser manejado rapido.");
        }
    }
    
        
}