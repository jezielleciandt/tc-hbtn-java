public class Empregado {
    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){

            return departamento.alcancouMeta() ? this.salarioFixo*0.1 : 0.0;

    }

    public double calcularSalarioTotal(Departamento departamento){

            return departamento.alcancouMeta() ? calcularBonus(departamento) + getSalarioFixo() : getSalarioFixo();

    }
}
