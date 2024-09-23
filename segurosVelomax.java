
package condicionales;

import java.util.Scanner;

public class segurosVelomax {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        //variables
        double tarifa, descuento=0;
        int pago,total;
        int cilindraje;
        String dia, mes,dia1, mesF;
        int tamanio=0;
        //hola
        //entradas  
        String tipoVehiculo= teclado.nextLine().toUpperCase();
        Long avaluoVehiculo= teclado.nextLong();
        String fecha= teclado.next();
        String cedula= teclado.next(); 
        //variables para comparar la fecha con la cedula
        dia=fecha.substring(0,2);
        dia1=cedula.substring(0,2);
        mes=fecha.substring(3,5);
        tamanio= cedula.length();
        mesF= cedula.substring(tamanio-2);
        //System.out.println("dia:" + dia + "dia1" + dia1+"mes" + mes+"mesf" +mesF);
        //condicionales
        switch(tipoVehiculo){
            case "VEHICULOS PARTICULARES":
                
                if(dia.equals(dia1) && mes.equals(mesF)){
                   descuento=10;}
                
                  if(avaluoVehiculo<=39051000 && avaluoVehiculo>=0){
                    tarifa=1.5;  
                   } else if(avaluoVehiculo>39051000 && avaluoVehiculo<=87866000){
                    tarifa=2.5;
                   } else{
                    tarifa=3.5;
                   }
                  break;
            case "MOTOCICLETAS":
                cilindraje= teclado.nextInt();
                if(dia.equals(dia1) && mes.equals(mesF)){
                descuento=5;
                } if(cilindraje<125&&cilindraje>=0){
                   tarifa=0.8;
                } else{
                   tarifa=1.5;
                }
                 break;
            case "VEHICULOS PUBLICOS":
                if(dia.equals(dia1) && mes.equals(mesF)){
                   descuento=7;}
                   tarifa=0.5;
                  break;
           default:
                  System.out.println("ERROR al digitar los datos");
            return;    
          }
        
                   pago= (int)(avaluoVehiculo*tarifa/100);
                   //condicional para saber si hay o no descuento
                   if(descuento>0){
                     descuento=pago*descuento/100;
                       }
                    total=(int)(pago-descuento);
                    System.out.println("El valor por pagar es: " + total);
                    
    }
}
