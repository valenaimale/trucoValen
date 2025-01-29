package logic;
import java.util.ArrayList;
public class Jugador {
    String nombre;
    ArrayList<Carta> cartasRepartidas;

    public Jugador(String nombre, ArrayList<Carta> cartasRepartidas) {
        this.nombre = nombre;
        this.cartasRepartidas = cartasRepartidas;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void mostrarCartasRepartidas() {
        if (cartasRepartidas.isEmpty()) {
            System.out.println("el jugador tiro todas las cartas.");
        } else {
            System.out.println("Cartas en mano:");
            for (Carta carta : cartasRepartidas) {
                System.out.println(carta);
            }
        }
    }
    /*
    public int tirarCarta(Carta carta){
        return carta.posicion;
    }
    */
}
