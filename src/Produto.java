
class Produto {
    protected int cod;
    protected String descricao;
    protected int estoque_min;
    protected int qtdestoque;
    protected double vrcusto;
    protected int percentual_lucro = 25; //deve ser inteiro conforme especificação do trabalho
    protected double vrvenda;
    
    protected void CalcularValorVenda (){
        percentual_lucro = percentual_lucro/100;
        vrvenda = vrcusto * (1.0 + percentual_lucro);
    }
}
