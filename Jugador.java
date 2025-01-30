package logic;
import java.util.ArrayList;
import java.util.Scanner;
public class Jugador {
    String nombre;
    ArrayList<Carta> cartasRepartidas;
    int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
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
    public void cantarEnvido(){
        System.out.println("escriba que desea cantar con la primer letra de la palabra con mayuscula, por ejemplo: Falta Envido");
        
    }
    public Carta tirarCarta(int posCarta){
        Carta cartaTirada=cartasRepartidas.remove(posCarta);
        return cartaTirada;
    }
    public int cartaElegidaParaTirar(){
        System.out.println("Que carta desea tirar?");
        System.out.println("----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la opcion deseada(en numero)");
        int cartaElegida=scanner.nextInt();
        while(cartaElegida>2 || cartaElegida<0){
            System.out.println("Ingrese 0,1 o 2 por favor");
            System.out.println("vuelva a ingresar la carta");
            cartaElegida=scanner.nextInt();
        }
        return cartaElegida;
    }
      public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
