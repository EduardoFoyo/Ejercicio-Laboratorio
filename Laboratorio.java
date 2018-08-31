import java.util.*;
public class Laboratorio
{
   private ArrayList<Alumno> alumnos;    
   public Laboratorio(){
       alumnos = new ArrayList<Alumno>();
   }
   public void inscribir(String labNombre,int labClave){
       Alumno alumno = new Alumno(labNombre,labClave);
   }
   public void darBaja(int claveBaja){
       for(int i=0;i<alumnos.size();i++){
           Alumno aux = alumnos.get(i);
           if(aux.dimeClave() == claveBaja){
               alumnos.remove(i);
           }
       }
   }
   public void imprimirLista(){
       for(int i=0;i<alumnos.size();i++){
           Alumno aux = alumnos.get(i);
           System.out.println("HOla");
           System.out.println(aux);
       }
   }
}
