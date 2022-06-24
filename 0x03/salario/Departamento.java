public class Departamento {
    private double valorMeta;
    private double valorAtingidoMeta;

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public void setValorAtingidoMeta(double valorAtingidoMeta) {
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public Departamento(double valorMeta, double volorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = volorAtingidoMeta;
    }

    public boolean alcancouMeta(){
        if(this.valorAtingidoMeta >= this.valorMeta){
            return true;
        }
        return false;
    }
}
