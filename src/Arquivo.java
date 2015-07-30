
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Arquivo {
   
    private HashMap<Integer, Pessoa> listaDeClientes;
    private HashMap<Integer, Fornecedor> listaDeFornecedores;
    private HashMap<Integer, Produto> listaDeProdutos;
    private HashMap<Integer, Compras> listaDeCompras;
    private HashMap<String, Vendas> listaDeVendas;

    //GETTERS
   

    
    //SETTERS

    
 
    //METODOS
    protected void CriaClientes(File f){
        
        try {
                   
            String linhasDoArquivo;
            Scanner leitor = new Scanner (f);
            leitor.nextLine();
            System.out.println("======================= CLIENTES ====================================");
            while (leitor.hasNext()){
                int i = 0;
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(";");
                
                
                if (valoresEntreVirgulas[5].charAt(0) == 'F'){
                    Fisica cliente = new Fisica ();
                    cliente.codigo = Integer.parseInt (valoresEntreVirgulas[i]);
                    cliente.nome = valoresEntreVirgulas[i+1];
                    cliente.endereco = valoresEntreVirgulas[i+2];
                    cliente.telefone = valoresEntreVirgulas[i+3];
                    cliente.setData(valoresEntreVirgulas[i+4]);
                    cliente.setCpf(valoresEntreVirgulas[i+6]);
                    
                    //listaDeClientes.put(cliente.codigo, cliente);                 

                    System.out.println("codigo: " + cliente.codigo);
                    System.out.println("nome: " + cliente.nome);
                    System.out.println("endereço: " + cliente.endereco);
                    System.out.println("telefone: " + cliente.telefone);
                    System.out.println("data de cadastro: " + cliente.getData());
                    System.out.println("tipo: " + cliente.tipo);
                    System.out.println("cpf: " + cliente.getCpf());
                }
              
                if (valoresEntreVirgulas[5].charAt(0) == 'J'){
                    Juridica cliente = new Juridica ();
                    cliente.codigo = Integer.parseInt (valoresEntreVirgulas[i]);
                    cliente.nome = valoresEntreVirgulas[i+1];
                    cliente.endereco = valoresEntreVirgulas[i+2];
                    cliente.telefone = valoresEntreVirgulas[i+3];
                    cliente.setCnpj(valoresEntreVirgulas[i+6]);
                    cliente.setInsc_estadual(valoresEntreVirgulas[i+7]);
                    
                    //listaDeClientes.put(cliente.codigo, cliente); 
                    
                    System.out.println("codigo: " + cliente.codigo);
                    System.out.println("nome: " + cliente.nome);
                    System.out.println("endereço: " + cliente.endereco);
                    System.out.println("telefone: " + cliente.telefone);
                    System.out.println("tipo: " + cliente.tipo);
                    System.out.println("cnpj: " + cliente.getCnpj());
                    System.out.println("ie: " + cliente.getInsc_estadual());
                    
                }
                System.out.println();
            }
        }catch (FileNotFoundException e){
            System.out.println (e);
        }
    }
    
    protected void CriaFornecedores(File f){
        
        try {
                   
            String linhasDoArquivo;
            Scanner leitor = new Scanner (f);
            leitor.nextLine(); //desconsidera a primeira linha do arquivo, no caso a linha de cabeçalho da tabela.
            
            System.out.println("======================= FORNECEDORES ====================================");
            while (leitor.hasNext()){
                int i = 0;
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(";");

                Fornecedor fornecedor = new Fornecedor ();
                    fornecedor.codigo = Integer.parseInt (valoresEntreVirgulas[i]);
                    fornecedor.nome = valoresEntreVirgulas[i+1];
                    fornecedor.endereco = valoresEntreVirgulas[i+2];
                    fornecedor.telefone = valoresEntreVirgulas[i+3];
                    fornecedor.setCnpj(valoresEntreVirgulas[i+4]);
                    fornecedor.setContato(valoresEntreVirgulas[i+5]);
                    
                    //listaDeFornecedores.put(fornecedor.codigo, fornecedor); 

                    System.out.println("codigo: " + fornecedor.codigo);
                    System.out.println("nome: " + fornecedor.nome);
                    System.out.println("endereço: " + fornecedor.endereco);
                    System.out.println("telefone: " + fornecedor.telefone);
                    System.out.println("tipo: " + fornecedor.tipo);
                    System.out.println("cnpj: " + fornecedor.getCnpj());
                    System.out.println("contato: " + fornecedor.getContato());
                    System.out.println();
                }         
        }catch (FileNotFoundException e){
            System.out.println (e);
        }
        
    }
    
    protected void CriaProdutos(File f){
            
        try {
                   
            String linhasDoArquivo;
            Scanner leitor = new Scanner (f);
            leitor.nextLine(); //desconsidera a primeira linha do arquivo, no caso a linha de cabeçalho da tabela.
            
            System.out.println("======================= PRODUTOS ====================================");
            while (leitor.hasNext()){
                int i = 0;
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(";");

                Produto produto = new Produto ();
                
                produto.setCod(Integer.parseInt (valoresEntreVirgulas[i])); 
                produto.setDescricao(valoresEntreVirgulas[i+1]);
                produto.setEstoque_min(Integer.parseInt (valoresEntreVirgulas[i+2]));
                produto.setEstoque_atual(Integer.parseInt (valoresEntreVirgulas[i+3]));
                
                //substituição da vírgula do valor da string por um ponto para resolver problema de conversão
                String s = valoresEntreVirgulas[i+4];
                s = s.replaceAll(",","."); 
                produto.setVrcusto(Double.parseDouble(s));  
                
                produto.setPercentual_lucro(Integer.parseInt(valoresEntreVirgulas[i+5]));
                

                //listaDeProdutos.put(produto.getCod(), produto); 


                System.out.println("codigo: " + produto.getCod());
                System.out.println("descrição: " + produto.getDescricao());
                System.out.println("estoque minimo: " + produto.getEstoque_min());
                System.out.println("estoque atual: " + produto.getEstoque_atual());
                System.out.println("valor de custo: " + produto.getVrcusto());
                System.out.println("% de lucro: " + produto.getPercentual_lucro());
                System.out.println();
                }         
        }catch (FileNotFoundException e){
            System.out.println (e);
        }
    }
    
    protected void CriaRegistroCompras(File f){
        
        try {
                   
            String linhasDoArquivo;
            Scanner leitor = new Scanner (f);
            leitor.nextLine(); //desconsidera a primeira linha do arquivo, no caso a linha de cabeçalho da tabela.
            
            System.out.println("======================= REGISTRO DE COMPRAS ====================================");
            while (leitor.hasNext()){
                int i = 0;
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(";");

                Compras compra = new Compras ();
                
                compra.setNf(Integer.parseInt (valoresEntreVirgulas[i])); 
                compra.setCod_fornecedor(Integer.parseInt (valoresEntreVirgulas[i+1]));
                compra.setData(valoresEntreVirgulas[i+2]);
                compra.setCod_produto(Integer.parseInt (valoresEntreVirgulas[i+3]));               
                compra.setQuant(Integer.parseInt(valoresEntreVirgulas[i+4]));
                

                //listaDeCompras.put(compra.getNf(), compra); 

                System.out.println("NF: " + compra.getNf());
                System.out.println("Fornecedor: " + compra.getCod_fornecedor());
                System.out.println("Data da Compra: " + compra.getData());
                System.out.println("Produto: " + compra.getCod_produto());
                System.out.println("qtd: " + compra.getQuant());
                System.out.println();
                }         
        }catch (FileNotFoundException e){
            System.out.println (e);
        }
    }
    
    protected void CriaRegistroVendas(File f){
        
        try {
                   
            String linhasDoArquivo;
            Scanner leitor = new Scanner (f);
            leitor.nextLine(); //desconsidera a primeira linha do arquivo, no caso a linha de cabeçalho da tabela.
            
            System.out.println("======================= REGISTRO DE VENDAS ====================================");
            while (leitor.hasNext()){
                int i = 0;
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(";");

                Vendas venda = new Vendas ();
                
                //Registra as vendas Fiadas
                if (valoresEntreVirgulas[4].charAt(0) == 'F'){
                    venda.setCod_cliente(Integer.parseInt (valoresEntreVirgulas[i])); 
                }
                
                venda.setData(valoresEntreVirgulas[i+1]);
                venda.setCod_produto(Integer.parseInt (valoresEntreVirgulas[i+2])); 
                venda.setQtdvendida(Integer.parseInt (valoresEntreVirgulas[i+3]));
                venda.setModopagamento(valoresEntreVirgulas[i+4]);
                  
                //listaDeVendas.put(venda.getModopagamento(),venda); 
                 
                System.out.println("cod cliente: " + venda.getCod_cliente());
                System.out.println("Data da venda: " + venda.getData());
                System.out.println("Produto: " + venda.getCod_produto());
                System.out.println("qtd: " + venda.getQtdvendida());
                System.out.println("modo pagamento: " + venda.getModopagamento());
                System.out.println();
                }
        
        
        }catch (FileNotFoundException e){
            System.out.println (e);
        }
    }
}
