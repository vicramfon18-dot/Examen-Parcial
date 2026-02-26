
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Usuario {
   

    
    private String nombre , correo;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    private String mensaje ;
    private ArrayList<Usuario>ListaUsuario ;

    public Usuario(String nombre ,  String correo){
        this.correo = correo;
        this.nombre = nombre;
    }

   
    public Usuario(){
        ListaUsuario = new ArrayList<>();
    }
 
   
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Usuario> getListaUsuario() {
        return ListaUsuario;
    }

    public void addListaUsuario(Usuario usuario) {
        this.ListaUsuario.add(usuario);
    }
    
    
 @Override 
   public String toString(){
       return "Nombre :" +this.nombre + " - correo:" +this.correo;
   }
}

