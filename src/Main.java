public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setEdad(21);
        System.out.println(persona.getEdad());
    persona.setNombre("Oscar");
        System.out.println(persona.getNombre());
    persona.setTelefono(321251);
        System.out.println(persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}