public class Tarea {

    private int id;
    private String desc;
    private String nombre;
    
    Tarea(int id, String nombre, String desc){
        this.id = id;
        this.nombre = nombre;
        this.desc = desc;
    }    

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getAll(){
        return this.id + " - " + this.nombre + ": " + this.desc;
    }
}
