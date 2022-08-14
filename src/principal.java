public class principal {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumarPuertas();

        System.out.println(miCoche.puertas);
    }
    static class coche{
        public int puertas = 4;

        public void sumarPuertas(){
            this.puertas++;
        }
    }
}
