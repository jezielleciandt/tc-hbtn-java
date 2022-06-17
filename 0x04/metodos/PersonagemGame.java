public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void tomarDano(int quantidadeDeDano){
        if(quantidadeDeDano>=saudeAtual){
            this.saudeAtual=0;
        }else{
            this.saudeAtual-= quantidadeDeDano;
        }
    }

    public void receberCura(int quantidadeDeCura){
        this.saudeAtual+= quantidadeDeCura;
        if(saudeAtual>100){
            this.saudeAtual=100;
        }
    }
}
