public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCredito(100);
        cliente.setNombre("Edison");
        cliente.setEdad(22);
        cliente.setTelefono("+593 123456");

        System.out.println("Nombre del cliente: "+cliente.getNombre()+"\n"+
                "Edad: "+cliente.getEdad()+"\n"+
                "Telefono: "+cliente.getTelefono()+"\n"+
                "Credito: "+cliente.getCredito()+"\n");

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(100);
        trabajador.setNombre("Mauricio");
        trabajador.setEdad(23);
        trabajador.setTelefono("+593 7891234");

        System.out.println("Nombre del trabajador: "+trabajador.getNombre()+"\n"+
                "Edad: "+trabajador.getEdad()+"\n"+
                "Telefono: "+trabajador.getTelefono()+"\n"+
                "Salario: "+trabajador.getSalario()+"\n");

    }
}

abstract class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}