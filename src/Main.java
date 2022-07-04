public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.nombre = "Pablo";
        cliente.edad = 20;
        cliente.tel = 375732227;
        cliente.credito = 60;

        System.out.println("Nombre: " + cliente.nombre +
                " Edad: "+cliente.edad+
                " Tel: " + cliente.tel +
                " Credito: " + cliente.credito);

    }
}

class Persona{
    int edad;
    String nombre;
    int tel;

}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    double salario;
}