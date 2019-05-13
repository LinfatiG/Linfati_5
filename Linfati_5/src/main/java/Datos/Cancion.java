/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author gilio
 */
public class Cancion {

    private String nombre;
    private String album;
    private int anoLanzamiento;
    private int codigo;
    private String interprete;
    private String letra;

    public Cancion(String nombre , String album , int anoLanzamiento , String letra , String interprete , int codigo) {
        this.album = album;
        this.anoLanzamiento = anoLanzamiento;
        this.codigo = codigo;
        this.interprete = interprete;
        this.letra = letra;
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getAlbum() {
        return album;
    }
   
    public int getanoLanzamiento() {
        return anoLanzamiento;
    }
    
    public String getLetra() {
        return letra;
    }
    
    public String getInterprete() {
        return interprete;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public Cancion() {

    }

}
