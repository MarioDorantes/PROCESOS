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
    String id_plan;
    String fechaInicio;
    String fechaFin;
    String fechasTemas;
    String temasCurso;
    String nombreActividades;
    String NRC;
    
    public PlanDeCurso () {}
    
    public PlanDeCurso (String id_plan, String fechaInicio, String fechaFin, String fechasTemas, String temasCurso, String nombreActividades, String NRC) {
        this.id_plan = id_plan;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechasTemas = fechasTemas;
        this.temasCurso = temasCurso;
        this.nombreActividades = nombreActividades;
        this.NRC = NRC;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getId_plan() {
        return id_plan;
    }

    public void setId_plan(String id_plan) {
        this.id_plan = id_plan;
    }

    public String getFechasTemas() {
        return fechasTemas;
    }

    public void setFechasTemas(String fechasTemas) {
        this.fechasTemas = fechasTemas;
    }

    public String getTemasCurso() {
        return temasCurso;
    }

    public void setTemasCurso(String temasCurso) {
        this.temasCurso = temasCurso;
    }

    public String getNombreActividades() {
        return nombreActividades;
    }

    public void setNombreActividades(String nombreActividades) {
        this.nombreActividades = nombreActividades;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }
    
    
    
    
    
}
