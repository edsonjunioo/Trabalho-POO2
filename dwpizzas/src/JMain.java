import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edson
 */
public class JMain {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws SQLException {
        Scanner S = new Scanner(System.in);
        System.out.println("3) Consultar");
        String op = S.nextLine();
         
        if("3".equals(op)){
                try{
                    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/dw", "root", "root");
                    Statement stms = (Statement) con.createStatement();
                    String consulta;
                    consulta = "SELECT * FROM `dw`.`dw`";
                    stms.executeUpdate(consulta);
                }
                catch(Exception e){
                   e.printStackTrace(); 
                   System.out.println("Houve um erro:" + e.getMessage());
                }
            }
    }
        
        // TODO code application logic here
    }
    

