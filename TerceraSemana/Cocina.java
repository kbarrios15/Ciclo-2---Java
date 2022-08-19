package semana.tres;

public abstract class Cocina {
    
    private String comida;
    private String utenciliosCocina;
    private String postres;
    private int costo;

    public Cocina(String comida, String utenciliosCocina, String postres, int costo) {
        this.comida = comida;
        this.utenciliosCocina = utenciliosCocina;
        this.postres = postres;
        this.costo = costo;
    }
    
    public Cocina() {

    }
    
    

    
    
    public void prepararArroz(){
        System.out.println("Preparando arroz general...");
    }
    
    public abstract void prepararPasta();

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getUtenciliosCocina() {
        return utenciliosCocina;
    }

    public void setUtenciliosCocina(String utenciliosCocina) {
        this.utenciliosCocina = utenciliosCocina;
    }

    public String getPostres() {
        return postres;
    }

    public void setPostres(String postres) {
        this.postres = postres;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Cocina{" + "comida=" + comida + ", utenciliosCocina=" + utenciliosCocina + ", postres=" + postres + ", costo=" + costo + '}';
    }
    
    
    
    
    
}