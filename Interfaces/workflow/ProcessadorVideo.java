import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal){
        this.canais.add(canal);
    }

    public void processar(Video video){
        for(CanalNotificacao canal: canais){
            canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));
        }
    }

}
