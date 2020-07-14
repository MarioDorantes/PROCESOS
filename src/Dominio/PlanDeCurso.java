/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author gabrielflores
 */
public class PlanDeCurso {
    int id_plan;
    Date fechaInicio;
    Date fechaFin;
    String nombreCurso;
    String listaTemas;
    String listaActividades;
    int numeroActividades;
    
    public PlanDeCurso () {}

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNumeroActividades() {
        return numeroActividades;
    }

    public void setNumeroActividades(int numeroActividades) {
        this.numeroActividades = numeroActividades;
    }

    public String getListaTemas() {
        return listaTemas;
    }

    public void setListaTemas(String listaTemas) {
        this.listaTemas = listaTemas;
    }

    public String getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(String listaActividades) {
        this.listaActividades = listaActividades;
    }

    public int getId_plan() {
        return id_plan;
    }

    public void setId_plan(int id_plan) {
        this.id_plan = id_plan;
    }
    
    
    
}
