import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        

        Arquivo arq = new Arquivo();
        
        try {
            
            new FileInputStream(args[0]);
            File clientesCSV = new File (args[0]);
            arq.CriaClientes(clientesCSV);

            new FileInputStream(args[1]);
            File fornecedoresCSV = new File (args[1]);   
            arq.CriaFornecedores(fornecedoresCSV);
            
            new FileInputStream(args[2]);
            File produtosCSV = new File (args[2]);
            arq.CriaProdutos(produtosCSV);
            
            new FileInputStream(args[3]);
            File comprasCSV = new File (args[3]);
            arq.CriaRegistroCompras(comprasCSV);
            
            new FileInputStream(args[4]);
            File vendasCSV = new File (args[4]);
            arq.CriaRegistroVendas(vendasCSV);
        
        }catch (FileNotFoundException e) {
            System.out.println ("ERRO DE I/O " + e);
        }
    }
}
        
