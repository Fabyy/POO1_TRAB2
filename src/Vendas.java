
class Vendas {
    
    private int cod_cliente; //esse código só será preenchido se o modo for fiado, nos demais estará em vazio.
    private String data;
    private int cod_produto;
    private int qtdvendida;
    private String modopagamento; 

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public int getQtdvendida() {
        return qtdvendida;
    }

    public void setQtdvendida(int qtdvendida) {
        this.qtdvendida = qtdvendida;
    }

    public String getModopagamento() {
        return modopagamento;
    }

    public void setModopagamento(String modopagamento) {
        this.modopagamento = modopagamento;
    }
    
    
    
}
