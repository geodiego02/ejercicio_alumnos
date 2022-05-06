/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Diego
 */
public class Alumno {
    private String rut,nombreCompleto,docenteAsignado,asignatura,situacionFinal;
            private int asistencia;
            private double n1,n2,n3,porcentajeAsistencia,prom;
            
            public Alumno(String rut,String nombreCompleto,String docenteAsignado,String asignatura,int asistencia,double n1,double n2,double n3){
                this.rut=rut;
                this.nombreCompleto=nombreCompleto;
                this.asignatura=asignatura;
                this.asistencia=asistencia;
                this.docenteAsignado=docenteAsignado;
                this.n1=n1;
                this.n2=n2;
                this.n3=n3;
                
            }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocenteAsignado() {
        return docenteAsignado;
    }

    public void setDocenteAsignado(String docenteAsignado) {
        this.docenteAsignado = docenteAsignado;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getSituacionFinal() {
        return situacionFinal;
    }

    public void setSituacionFinal(String situacionFinal) {
        this.situacionFinal = situacionFinal;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getPorcentajeAsistencia() {
        return porcentajeAsistencia;
    }

    public void setPorcentajeAsistencia(double porcentajeAsistencia) {
        this.porcentajeAsistencia = porcentajeAsistencia;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
            
}
