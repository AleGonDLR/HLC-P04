/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alego
 */
public class PersonajesFamosos {
    private String apellido;
    private GregorianCalendar fechaNacimiento;
    private String profesion;

    public PersonajesFamosos(String apellido, GregorianCalendar fechaNacimiento, String profesion) {
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getDiaFecha(){
        return ""+fechaNacimiento.get(Calendar.DAY_OF_MONTH);
    }
    
    public String getMesFecha(){
        return ""+(fechaNacimiento.get(Calendar.MONTH) + 1);
    }
    
    public String getAñoFecha(){
        return ""+(fechaNacimiento.get(Calendar.YEAR));
    }
    
    public String getFechaNacimientoString(){
        if(getDiaFecha().length() == 1 && getMesFecha().length() == 1)
        {
            String dia = "0" + getDiaFecha();
            String mes = "0" + getMesFecha();
            
            return (dia+"/"+mes+"/"+getAñoFecha());
        }
        else if(getDiaFecha().length() == 1)
        {
            String dia = "0" + getDiaFecha();
            
            return (dia+"/"+getMesFecha()+"/"+getAñoFecha());
        }
        else if(getMesFecha().length() == 1)
        {
            String mes = "0" + getMesFecha();
            
            return (getDiaFecha()+"/"+mes+"/"+getAñoFecha());
        }
        else
        {
            return (getDiaFecha()+"/"+getMesFecha()+"/"+getAñoFecha());
        }    
        
    }  

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
