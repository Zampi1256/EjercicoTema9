public class Main {
    public static void main(String[] args) {

        //If
        int numeroIf = 16;

        if (numeroIf > 0) {
            System.out.println("Positivo");
        } else if (numeroIf < 0) {
            System.out.println("Negativo");
        }else {
            System.out.println("Cero");
        }

        //While
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Do-While
        int numeroWhile1 = 2;
        do {
            numeroWhile1++;
            System.out.println(numeroWhile1);
        }while (numeroWhile1 < 3);

        //For
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch
        String estacion="Otoño";
        switch (estacion) {
            case "Verano":
                System.out.println("Usted esta en verano");
                break;
            case "Primavera":
                System.out.println("Usted esta en primavera");
                break;
            case "Otoño":
                System.out.println("Usted esta en otoño");
                break;
            case "Invierno":
                System.out.println("Usted esta en invierno");
                break;
            default:
                System.out.println("Usted no esta en ninguna estacion");
                break;
        }
    }
}