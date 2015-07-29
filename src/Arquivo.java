
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Arquivo {
   
    private Set <Cliente> ListaDeClientes = new HashSet();
    private Set <Fornecedor> ListaDeFornecedores = new HashSet();
    private Set <Produto> ListaDeProdutos = new HashSet();
    private Set <Compras> ListaDeCompras = new HashSet();
    private Set <Vendas> ListaDeVendas = new HashSet();

   //GETTERS
    public Set<Cliente> getListaDeClientes() {
        return ListaDeClientes;
    }

    public Set<Fornecedor> getListaDeFornecedores() {
        return ListaDeFornecedores;
    }

    public Set<Produto> getListaDeProdutos() {
        return ListaDeProdutos;
    }

    public Set<Compras> getListaDeCompras() {
        return ListaDeCompras;
    }

    public Set<Vendas> getListaDeVendas() {
        return ListaDeVendas;
    }

    
    //SETTERS

    public void setListaDeClientes(Set<Cliente> ListaDeClientes) {
        this.ListaDeClientes = ListaDeClientes;
    }

    public void setListaDeFornecedores(Set<Fornecedor> ListaDeFornecedores) {
        this.ListaDeFornecedores = ListaDeFornecedores;
    }

    public void setListaDeProdutos(Set<Produto> ListaDeProdutos) {
        this.ListaDeProdutos = ListaDeProdutos;
    }

    public void setListaDeCompras(Set<Compras> ListaDeCompras) {
        this.ListaDeCompras = ListaDeCompras;
    }

    public void setListaDeVendas(Set<Vendas> ListaDeVendas) {
        this.ListaDeVendas = ListaDeVendas;
    }
    
 
    //METODOS
    protected void CriaClientes(File f){
        
        
        try {
                   
            String linhasDoArquivo = new String();
            Scanner leitor = new Scanner (f);
            leitor.nextLine();
                int i=0;
            while (leitor.hasNext()){
            
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(";");
                
                
                if (valoresEntreVirgulas[5].charAt(0) == 'F'){
                    Cliente cliente = new Fisica ();
                    this.ListaDeClientes.add(cliente);
                }
                System.out.println (i);
                System.out.println(valoresEntreVirgulas[1]);
                i++;
            }
        }catch (FileNotFoundException e){
            System.out.println (e);
        }
    }
    
    protected Fornecedor CriaFornecedores(File f){
        return null;
    }
    
    protected Produto CriaProdutos(){
        return null;
    }
    
    protected Compras CriaRegistroCompras(){
        return null;
    }
    
    protected Vendas CriaRegistroVendas(){
        return null;
    }
    

}
