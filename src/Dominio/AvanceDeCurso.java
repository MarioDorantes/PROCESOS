package Dominio;

import java.util.Date;


public class AvanceDeCurso {
    String actividadesPorRealizar;
    String actividadesRealizadas;
    Date fechaDelAvance;
    int porcentajeDeAvance;
    String temasAbordados;
    String temasPorAbordar;
    
    public AvanceDeCurso(){}

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

    public Date getFechaDelAvance() {
        return fechaDelAvance;
    }

    public void setFechaDelAvance(Date fechaDelAvance) {
        this.fechaDelAvance = fechaDelAvance;
    }

    public int getPorcentajeDeAvance() {
        return porcentajeDeAvance;
    }

    public void setPorcentajeDeAvance(int porcentajeDeAvance) {
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
    
    
    
}
