public class Departamento {
    private double valorMeta;
    private double volorAtingidoMeta;

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getVolorAtingidoMeta() {
        return volorAtingidoMeta;
    }

    public void setVolorAtingidoMeta(double volorAtingidoMeta) {
        this.volorAtingidoMeta = volorAtingidoMeta;
    }

    public Departamento(double valorMeta, double volorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.volorAtingidoMeta = volorAtingidoMeta;
    }

    public boolean alcancouMeta(){
        if(this.volorAtingidoMeta >= this.valorMeta){
            return true;
        }
        return false;
    }
}
