
public class Juridica extends Pessoa {
    private String cnpj;
    private String insc_estadual;

    public Juridica (){
        super.tipo = 'J';
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInsc_estadual() {
        return insc_estadual;
    }

    public void setInsc_estadual(String insc_estadual) {
        this.insc_estadual = insc_estadual;
    }
    
    
}
