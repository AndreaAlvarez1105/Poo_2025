

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Andrea", "Alvarez", 18, 160, 55,"Ingeniera");

        persona1.setNombre("Pamela");
        persona1.setApellido("López");
        persona1.setEstatura(160);
        persona1.setPeso(55);
        persona1.CalcularEdad(2005);

        persona1.Imprimir();



        }
    }
