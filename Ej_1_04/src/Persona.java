public class Persona {

    //variables de instancia (porque le pertenecen a la clase -> atributos que le pertenecen a la clase)
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private int edad;
    private float estatura;
    private float peso;
    private String profesion;

    //constructor por defecto
    public Persona() {}

    //
    public Persona (String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    //constructor parametrizado
    public Persona(String nombre, String apellido, int edad, float estatura, float peso, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    // Metodos getter y setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public float getEstatura() {
        return estatura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }


    public void CalcularEdad(int anio_nacimiento) {
        edad =  2025 - anio_nacimiento;
    }




    //metodo de instancia -> le pertenece a la clase Persona
    public float calcularIMC(float peso, float altura){ //parametros, no relacionados con variables
        return (peso/(altura*altura));
    }

    public void Imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
        System.out.println("Profesion: " + profesion);

    }

    public void imprimirIMC(){
        System.out.println("IMC: " + calcularIMC(peso, estatura));
    }


}
