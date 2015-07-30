
public class Fisica extends Cliente {
    private String cpf;

    public Fisica(){
        super.tipo = 'F';
    }    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    


}
