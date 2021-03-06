package estosepone.pojo;
// Generated 12/10/2013 18:56:35 by Hibernate Tools 3.2.1.GA



/**
 * Lugar generated by hbm2java
 */
public class Lugar  implements java.io.Serializable {


     private int idLugar;
     private String nombre;
     private String descripcion;
     private String direccion;
     private String telefono;
     private String foto;

    public Lugar() {
    }

	
    public Lugar(int idLugar, String nombre, String direccion) {
        this.idLugar = idLugar;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Lugar(int idLugar, String nombre, String descripcion, String direccion, String telefono, String foto) {
       this.idLugar = idLugar;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.direccion = direccion;
       this.telefono = telefono;
       this.foto = foto;
    }
   
    public int getIdLugar() {
        return this.idLugar;
    }
    
    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }




}


