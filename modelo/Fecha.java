package modelo;

public class Fecha
{
    //------------------
    //ATRIIBUTOS
    //------------------
    private int dia ;
    private int mes = 0;
    private int anio;

    //------------------
    //METODOS
    //------------------

    //metodo acceso

    //metodos SET
    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    } 

    //metodos get

    public int getAnio() 
    {
        return anio;
    }

    public int getDia() 
    {
        return dia;
    }

    public int getMes() 
    {
        return mes;
    }

    //metodo sobreescrito de la clase Object
    public String toString()
    {
        return dia + "/" + mes + "/" + anio ; 
    }

    //metodo sobreescrito de la clase Object
    public boolean equals(Object obj)
    {
        Fecha otra = (Fecha)obj;
        return(dia==otra.dia)&& (mes==otra.mes)&&(anio==otra.anio);
    }

    public void addDias(int d)
    {
        int sum = FechaToDias() + d;
        diasToFecha(sum);
    }

    private int FechaToDias()
    {
        return anio*360 + mes*30 + dia;
    }
    private void diasToFecha(int i)
    {
        anio = (int)(i/360);
    }
}
