public class Main {
    public static void main(String[] args) {
        System.out.println("La suma es: "+SumaParametros(1,2,3));

        Coche coche1 = new Coche(0);
        coche1.agregarPuertas(4);
        System.out.println("El coche tiene: "+coche1.getPuertas()+" puertas");
    }

    public static int SumaParametros(int a, int b, int c ){
        return a+b+c;
    }
}

class Coche {
    private int puertas;

    public Coche( int puertas){
        this.puertas=puertas;
    }

    public void agregarPuertas(int a){
        puertas+=a;
    }

    public int getPuertas(){
        return puertas;
    }
}