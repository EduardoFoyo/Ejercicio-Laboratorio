public class Alumno
{
   private String nombre;
   private int clave;    
   public Alumno(String nombre,int clave){
       this.nombre = nombre;
       this.clave = clave;
    }
   public String dimeNombre(){
       return this.nombre;
   }
   public int dimeClave(){
       return this.clave;
   }
   public String toString(){
       String aux = "Nombre Alumno: "+nombre+" Clave Alumno: "+clave;
       return aux;
   }
}