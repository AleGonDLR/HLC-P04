/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class CalculosConFecha {

    public CalculosConFecha() {
    }
    
    public int CalcularEdad(String d, String m, String a)
    {
        
        Calendar fechaActual = Calendar.getInstance();
        
        int dia = Integer.parseInt(d);
        int mes = Integer.parseInt(m);
        int anio = Integer.parseInt(a);
        
        int edad = fechaActual.get(Calendar.YEAR) - anio;

        
        if( (((fechaActual.get(Calendar.MONTH) + 1) - mes) < 0)
            || ((((fechaActual.get(Calendar.MONTH) + 1) - mes) == 0) && ((fechaActual.get(Calendar.DAY_OF_MONTH) - dia)  < 0)) )                                
        {
            edad = edad - 1;
        }
        
        return edad;
        
    }
    
    public String CalcularSigno(String d, String m)
    {      
        String signo = null;
        int dia = Integer.parseInt(d);
        int mes = Integer.parseInt(m);
        
        switch(mes)
        {
            case 1:
                if(dia <= 20)
                {
                    signo = "Capricornio";
                }
                else
                {
                    signo = "Acuario";
                }
                break;
                
            case 2:
                if(dia <= 19)
                {
                    signo = "Acuario";
                }
                else
                {
                    signo = "Piscis";
                }
                break;
                
            case 3:
                if(dia <= 20)
                {
                    signo = "Piscis";
                }
                else
                {
                    signo = "Aries";
                }
                break;
                
            case 4:
                if(dia <= 20)
                {
                    signo = "Aries";
                }
                else
                {
                    signo = "Tauro";
                }
                break;
                
            case 5:
                if(dia <= 21)
                {
                    signo = "Tauro";
                }
                else
                {
                    signo = "Géminis";
                }
                break;
                
            case 6:
                if(dia <= 21)
                {
                    signo = "Géminis";
                }
                else
                {
                    signo = "Cáncer";
                }
                break;
                
            case 7:
                if(dia <= 22)
                {
                    signo = "Cáncer";
                }
                else
                {
                    signo = "Leo";
                }
                break;
                
            case 8:
                if(dia <= 22)
                {
                    signo = "Leo";
                }
                else
                {
                    signo = "Virgo";
                }
                break;
                
            case 9:
                if(dia <= 22)
                {
                    signo = "Virgo";
                }
                else
                {
                    signo = "Libra";
                }
                break;
                
            case 10:
                if(dia <= 22)
                {
                    signo = "Libra";
                }
                else
                {
                    signo = "Escorpio";
                }
                break;
                
            case 11:
                if(dia <= 22)
                {
                    signo = "Escorpio";
                }
                else
                {
                    signo = "Sagitario";
                }
                break;
            
            case 12:
                if(dia <= 21)
                {
                    signo = "Sagitario";
                }
                else
                {
                    signo = "Capricornio";
                }
                break;
        }               
        return signo;
    }
}
