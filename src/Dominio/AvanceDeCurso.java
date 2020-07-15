package Dominio;

import java.util.Date;


public class AvanceDeCurso {
    String actividadesPorRealizar;
    String actividadesRealizadas;
    String fechaDelAvance;
    String porcentajeDeAvance;
    String temasAbordados;
    String temasPorAbordar;
    String id_plan;
    
    public AvanceDeCurso(){}

    public AvanceDeCurso(String actividadesPorRealizar, String actividadesRealizadas, String fechaDelAvance, String porcentajeDeAvance, String temasAbordados, String temasPorAbordar, String id_plan) {
        this.actividadesPorRealizar = actividadesPorRealizar;
        this.actividadesRealizadas = actividadesRealizadas;
        this.fechaDelAvance = fechaDelAvance;
        this.porcentajeDeAvance = porcentajeDeAvance;
        this.temasAbordados = temasAbordados;
        this.temasPorAbordar = temasPorAbordar;
        this.id_plan = id_plan;
    }

    public String getActividadesPorRealizar() {
        return actividadesPorRealizar;
    }

    public void setActividadesPorRealizar(String actividadesPorRealizar) {
        this.actividadesPorRealizar = actividadesPorRealizar;
    }

    public String getActividadesRealizadas() {
        return actividadesRealizadas;
    }

    public void setActividadesRealizadas(String actividadesRealizadas) {
        this.actividadesRealizadas = actividadesRealizadas;
    }

    public String getFechaDelAvance() {
        return fechaDelAvance;
    }

    public void setFechaDelAvance(String fechaDelAvance) {
        this.fechaDelAvance = fechaDelAvance;
    }

    public String getPorcentajeDeAvance() {
        return porcentajeDeAvance;
    }

    public void setPorcentajeDeAvance(String porcentajeDeAvance) {
        this.porcentajeDeAvance = porcentajeDeAvance;
    }

    public String getTemasAbordados() {
        return temasAbordados;
    }

    public void setTemasAbordados(String temasAbordados) {
        this.temasAbordados = temasAbordados;
    }

    public String getTemasPorAbordar() {
        return temasPorAbordar;
    }

    public void setTemasPorAbordar(String temasPorAbordar) {
        this.temasPorAbordar = temasPorAbordar;
    }

    public String getId_plan() {
        return id_plan;
    }

    public void setId_plan(String id_plan) {
        this.id_plan = id_plan;
    }
    
    
    
    
    
}
