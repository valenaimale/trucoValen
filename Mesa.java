package logic;
import java.util.ArrayList;
public class Mesa {
    Jugador jugador1;
    Jugador jugador2;
    Mazo mazo;
    public Mesa(Jugador jugador1, Jugador jugador2,Mazo mazo) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.mazo=mazo;
    }
    public ArrayList<Carta> repartir(Jugador jugador1){
        mazo.mezclar();
        for (int i = 0; i < 3; i++) {
            if (!mazo.cartas.isEmpty()) {
                Carta cartaRemovida=mazo.cartas.remove(0);
                jugador1.cartasRepartidas.add(cartaRemovida);
            }
        }
        return jugador1.cartasRepartidas;
    }
    
    public int recibirCarta(Jugador jugador1){
        int pos=jugador1.cartaElegidaParaTirar();
        Carta cartaRecibida=jugador1.tirarCarta(pos);
        return cartaRecibida.posicion;
    }
    
    /*
    public int escucharEnvido(){
    
   
    }
    */

}
