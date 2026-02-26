
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class logica {
    private Datos datos = null ;
    
    
    public void guardar(Usuario usuario) throws IOException{
        datos = new Datos("datos.txt");
        
        datos.setRegistro(usuario.getNombre()+ "," + usuario.getCorreo());
        
        usuario.setMensaje(datos.guardarRegistros());
    }
    
    public void listarUsuarios(Usuario usuario) throws IOException{
        datos = new Datos("datos.txt");
        datos.ListarUsuarios();
        
        for(String registro : datos.getListaRegistros()){
            
            String [] datos = registro.split(",");
            
            Usuario us = new Usuario(datos[0], datos[1]);
            
            usuario.addListaUsuario(us);
            
            
            
            
        }
    }
}
