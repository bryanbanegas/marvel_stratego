/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banegas_Bryan_Prueba_1;

import java.util.ArrayList;

/**
 *
 * @author adalb
 */
public class Usuario {

    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    //ATRIBUTOS
    private String contraseña;
    private String usuario;
    private int cantidadHeroes;
    private int cantidadVillanos;
    private int puntos;

    public Usuario(String nombre, String contraseña, int puntos, int cantidadHeroes, int cantidadVillanos) {
        this.usuario = nombre;
        this.contraseña = contraseña;
        
        
        puntos=0;
        cantidadHeroes=0;
        cantidadVillanos=0;
    }

    public int setPuntos(int puntos) {

        this.puntos = puntos;
        return puntos;
    }

    public int getPuntos() {
        return this.puntos;
    }


    public String getnombre() {
        return usuario;
    }

    public String getcontra() {

        return this.contraseña;

    }

    public void setcontra(String contra) {

        this.contraseña = contra;

    }

    public void setnombre(String nameingre) {

        this.usuario = nameingre;

    }
    
    public int setHeroes(int cantidadHeroes){
      this.cantidadHeroes = cantidadHeroes;
        return cantidadHeroes;
      
    }
    
    public int setVillanos(int cantidadVillanos){
      this.cantidadVillanos = cantidadVillanos;
      return cantidadVillanos;
    }
    
    public int getHeroes(){
      return cantidadHeroes;
      
    }
    
    public int getVillanos(){
      return cantidadVillanos;
      
    }
    

    @Override
    //Para que me lo imprima bonito sin ese codigo hash
    public String toString() {
        return "Usuario{nombre='" + usuario + "', contraseña='" + contraseña + "'}";
    }

}
