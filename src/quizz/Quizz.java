
package quizz;

import javax.swing.JOptionPane;


public class Quizz {

  
    public static void main(String[] args) {
        int menu = 0;
        int ponto = 0;

        do {
            String x = JOptionPane.showInputDialog(null, "1 - Bem vindo ao QUIZ sobre o Brasil . ☻  \n 2 - Sair");
            menu = Integer.parseInt(x);

            ponto = 0;

            if (menu == 1) {
                
                int res = 0;
                
                Object[] opcoes1 = {"São Paulo", "Minas Gerais", "Bahia", "Amazonas"};

                res = JOptionPane.showOptionDialog(null, "Qual a cidade mais populosa do Brasil? ", "Quiz", 0, 3, null, opcoes1, "");

                if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
            
                Object[] opcoes2 = {"Asia", "Ucrânia", " America do Sul", "Oceania"};

                res = JOptionPane.showOptionDialog(null, "O Brasil é localizado em qual continente?", "Quiz", 0, 3, null, opcoes2, "");

                if (res == 2) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }

                Object[] opcoes3 = {"Mario Covas", "Dom Pedro", "Jucelino Kubichek", "Pedro Alves Cabral"};

                res = JOptionPane.showOptionDialog(null, "Quem foi o descobridor do Brasil?", "Quiz", 0, 3, null, opcoes3, "");

                if (res == 3) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
                

                Object[] opcoes4 = {"São Paulo", "Rio de Janeiro", "Minas Gerais", "Brasilia"};

                res = JOptionPane.showOptionDialog(null, "Qual a capital do Brasil?", "Quiz", 0, 3, null, opcoes4, "");

                if (res == 3) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
                
               

                Object[] opcoes5 = {"30 de Dezembro de 1850", "07 de Setembro de 1822", "14 de julho de 1848", "22 de Abril de 1500"};

                res = JOptionPane.showOptionDialog(null, "Em que dia, mês e ano foi declarada a independência do Brasil?", "Quiz", 0, 3, null, opcoes5, "");

                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
                
                Object[] opcoes6 = {"Argentina", "Colombia", "Suriname", "Bolivia"};

                res = JOptionPane.showOptionDialog(null, "Qual desses países NÃO faz fronteira com o Brasil?", "Quiz", 0, 3, null, opcoes6, "");

                if (res == 2) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
  

                Object[] opcoes7 = {"Julho", "Agosto", "Setembro", "Outubro"};

                res = JOptionPane.showOptionDialog(null, "No Brasil em que mês ocorre as eleições?", "Quiz", 0, 3, null, opcoes7, "");

                if (res == 3) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
                

                Object[] opcoes8 = {"Indigenas", "Piratas ", " Europeus ", "Americanos"};

                res = JOptionPane.showOptionDialog(null, "Quem eram os primeiros habitantes do Brasil?", "Quiz", 0, 3, null, opcoes8, "");

                if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
                

                Object[] opcoes9 = {"26 estados", "27 estados ", "25 estados", "28 estados"};

                res = JOptionPane.showOptionDialog(null, "Quantos estados tem o Brasil (contando com Distrito Federal)?", "Quiz", 0, 3, null, opcoes9, "");

                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Certa! ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
                
                

                Object[] opcoes10 = {"Lula ", "Bolsonaro", "Marta ", "Dilma"};

                res = JOptionPane.showOptionDialog(null, "Quem é o atual presidente do Brasil", "Quiz", 0, 3, null, opcoes10, "");

                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Certa!");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Errada! ");
                }
                
                
                if (ponto <= 4){
                    JOptionPane.showMessageDialog(null,ponto + " Você não domina o assunto");
                } else if (ponto <= 6){
                    JOptionPane.showMessageDialog(null,ponto + " Você tem conhecimento sobre o assunto");
                } else if (ponto <= 9){
                    JOptionPane.showMessageDialog(null,ponto + " Quase um mestre");
                } else{
                    JOptionPane.showMessageDialog(null,ponto + " Parabéns você tem profundos conhecimentos sobre o assunto");
                }
                
            }

        } while (menu != 2);
        JOptionPane.showMessageDialog(null, "Saindo");
        
    }


        
    }
    

