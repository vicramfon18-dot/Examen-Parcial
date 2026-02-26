
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Datos {
    private String usuarioArchivo , registro;
    private ArrayList<String>listaRegistros;
    
    
    public Datos(String usuarioArchivo){
        this.usuarioArchivo = usuarioArchivo;
        this.listaRegistros = new ArrayList<>();
        
        
    }
    
    public String guardarRegistros() throws IOException{
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.usuarioArchivo,true))){
             
            bw.append(this.registro);
            bw.newLine();
        }
        
        return "mensaje se guardo de buena manera";
    }
    
    public void ListarUsuarios() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(this.usuarioArchivo))){
            
            while((this.registro = br.readLine())!=null){
                this.listaRegistros.add(registro);
            }
            
        }
    }

    public String getUsuarioArchivo() {
        return usuarioArchivo;
    }

    public void setUsuarioArchivo(String usuarioArchivo) {
        this.usuarioArchivo = usuarioArchivo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public ArrayList<String> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(String registro) {
        this.listaRegistros = listaRegistros;
    }
            
}
