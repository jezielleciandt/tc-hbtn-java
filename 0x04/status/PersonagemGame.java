public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        atualizaStatus(this.saudeAtual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tomarDano(int quantidadeDeDano){
        if(quantidadeDeDano>=saudeAtual){
            setSaudeAtual(0);
        }else{
            setSaudeAtual(saudeAtual-quantidadeDeDano);
        }
    }

    public void receberCura(int quantidadeDeCura){
       setSaudeAtual(saudeAtual+quantidadeDeCura);
        if(saudeAtual>100){
            setSaudeAtual(100);
        }
    }
    private void atualizaStatus(int saudeAtual){
        if(saudeAtual>0){
            setStatus("vivo");
        }else{
            setStatus("morto");
        }
    }
}
