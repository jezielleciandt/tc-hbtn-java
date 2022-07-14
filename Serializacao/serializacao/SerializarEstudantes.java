import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class SerializarEstudantes<T> {

    private final String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        List<Estudante> listaEstudantes = new ArrayList<>(estudantes);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listaEstudantes);
            oos.close();
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar(){
        List<Estudante> estudantes;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            estudantes = (List<Estudante>)ois.readObject();
            ois.close();
            return estudantes;
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Nao foi possivel desserializar");
        }
        return null;
    }
}
