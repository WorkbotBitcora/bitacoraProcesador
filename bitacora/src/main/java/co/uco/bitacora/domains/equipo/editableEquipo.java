package co.uco.bitacora.domains.equipo;

public class editableEquipo {

    private long tipoEquipo;
    private String marca;

    public long getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(long tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
