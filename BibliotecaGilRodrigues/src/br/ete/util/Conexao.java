package br.ete.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    
        private static Connection CONEXAO;
        private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/bibliotecagilrodrigues";
        private static final String USER = "root";
        private static final String PASS = "root";

        public static Connection getConnection() {

            try {
                if (CONEXAO == null) {

                    Class.forName(DRIVER);

                    CONEXAO = DriverManager.getConnection(URL, USER, PASS);
                }
                return CONEXAO;

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro no driver jdbc!");
                ex.printStackTrace();
                return null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados!");
                ex.printStackTrace();
                return null;
            }
        }
    }