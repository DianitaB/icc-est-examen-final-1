package models;

import java.util.List;

public class Maquina {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public List<Integer> getCodigos() {
        return codigos;
    }
    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }
    public int getSubred() {
        return subred;
    }
    public void setSubred(int subred) {
        this.subred = subred;
    }
    public int getRiesgo() {
        return riesgo;
    }
    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }
    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
    }
   public int calcularSubred(){
      split("\\.");
    }
     
    public int calcularRiesgo (){
        int codigos = 0;
        int suma = 0;

        if (codigos == 0 && codigos / 5){
             codigos += suma;
          
    }

}
  

 


