
class Produto {
    private int cod;
    private String descricao;
    private int estoque_min;
    private int estoque_atual;
    private Double vrcusto;
    private int percentual_lucro; //deve ser inteiro conforme especificação do trabalho
    private double vrvenda;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque_min() {
        return estoque_min;
    }

    public void setEstoque_min(int estoque_min) {
        this.estoque_min = estoque_min;
    }

    public int getEstoque_atual() {
        return estoque_atual;
    }

    public void setEstoque_atual(int estoque_atual) {
        this.estoque_atual = estoque_atual;
    }

    public double getVrcusto() {
        return vrcusto;
    }

    public void setVrcusto(Double vrcusto) {
        this.vrcusto = vrcusto;
    }

    public int getPercentual_lucro() {
        return percentual_lucro;
    }

    public void setPercentual_lucro(int percentual_lucro) {
        this.percentual_lucro = percentual_lucro;
    }

    public double getVrvenda() {
        return vrvenda;
    }

    public void setVrvenda(double vrvenda) {
        this.vrvenda = vrvenda;
    }



 
    
    
    //METODOS
  
    protected void CalcularValorVenda (){
        percentual_lucro = percentual_lucro/100;
        vrvenda = vrcusto * (1.0 + percentual_lucro);
    }
}
