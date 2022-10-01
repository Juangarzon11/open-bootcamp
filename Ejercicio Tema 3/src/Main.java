public class Main {

    public static void main(String[] args) {
        //Primera Parte
        int resultado = suma(25, 10, 5);
        System.out.println(resultado);


        //Segunda Parte
        Coche miCoche = new Coche();
        miCoche.AumentarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int valor1, int valor2, int valor3) {
        return valor1 + valor2 + valor3;
    }
}


class Coche {
    public int puertas = 2;

    public void AumentarPuerta() {
        this.puertas++;
    }
}