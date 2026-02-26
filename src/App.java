
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class App {

    private static logica lg = new logica();
    private static Usuario usuario = new Usuario();
    
    
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
           System.out.println("ingrese su nombre : ");
           usuario.setNombre(sc.nextLine());
           System.out.println("ingrese su correo :");
           usuario.setCorreo(sc.nextLine());
           
           lg.guardar(usuario);
           
           System.out.println(usuario.getMensaje());
           
           lg.listarUsuarios(usuario);
           
           for(Usuario us : usuario.getListaUsuario()){
               System.out.println(us);
           }
           
       }catch(IOException e){
           System.out.println(e.getMessage());
           for(Throwable sup : e.getSuppressed()){
               System.out.println(sup.getMessage());
           }
           
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    
}
