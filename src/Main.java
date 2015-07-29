import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
  
        Arquivo arq = new Arquivo();
        File clientesCSV = new File ("C:\\Users\\Fabianne Palmejani\\Documents\\NetBeansProjects\\POO1_TRAB2\\testes\\01\\in\\clientes.csv");//arg01   
        arq.CriaClientes(clientesCSV);
        
        

    }
}
