package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag136Exerc15 {

    public static void main(String[] args) {

        int i, preco, custoEst = 0, imp = 0, precoFinal = 0, adicional = 0, maiorP = 0, menorP = 0, totImp = 0, qtB = 0, qtdN = 0, qtdC = 0;
        String refri = "";
        String categ = "";

        for (i = 1; i < 12; i++) {

            preco = Integer.parseInt(JOptionPane.showInputDialog("Entre com o preço:"));
            refri = JOptionPane.showInputDialog("Precisa de refrigeraçao? 's' (Sim) 'n' (Nao)");
            categ = JOptionPane.showInputDialog("Informe a categoria:\n   A - Alimentaçao, L - Limpeza e V - Vestuario");

            if (preco <= 20) {

                if (categ.equals("a")) {
                    custoEst = 2;
                    if (categ.equals("l")) {
                        custoEst = 3;
                    }
                    if (categ.equals("v")) {
                        custoEst = 4;
                    }
                }
                if (preco > 20 && preco <= 50) {
                    if (refri.equals("s")) {
                        custoEst = 6;
                    } else {
                        custoEst = 0;
                    }
                    if (preco > 50) {
                        if (refri.equals("s")) {
                            if (categ.equals("a")) {
                                custoEst = 5;
                            }
                            if (categ.equals("l")) {
                                custoEst = 2;
                            }
                            if (categ.equals("v")) {
                                custoEst = 4;
                            } else {
                                if (categ.equals("a") || categ.equals("v")) {
                                    custoEst = 0;
                                    if (categ.equals("l")) {
                                        custoEst = 1;
                                    }
                                }
                                if (!categ.equals("a") && !refri.equals("s")) {
                                    imp = (preco * 2) / 100;
                                } else {
                                    imp = (preco * 4) / 100;
                                    precoFinal = preco + custoEst + imp;
                                    JOptionPane.showMessageDialog(null, "Custo est: " + custoEst
                                            + "\nImp: " + imp
                                            + "\nPreco final: " + precoFinal);
                                    if (precoFinal <= 20) {
                                        qtB = qtB + 1;
                                        JOptionPane.showMessageDialog(null, "Classificaçao barato.", "Guanaabara", 2);
                                    }
                                    if (precoFinal > 20 && precoFinal <= 100) {
                                        qtdN = qtdN + 1;
                                        JOptionPane.showMessageDialog(null, "Classificaçao normal.", "Guanaabara", 2);
                                    }
                                    if (precoFinal > 100) {
                                        qtdC = qtdC + 1;
                                        JOptionPane.showMessageDialog(null, "Classificaçao caro.", "Guanaabara", 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        adicional = adicional + custoEst + imp;
        totImp = totImp = imp;
        if (i == 1) {
            maiorP = precoFinal;
            menorP = precoFinal;
        } else {
            if (precoFinal > maiorP) {
                maiorP = precoFinal;
                if (precoFinal < menorP) {
                    menorP = precoFinal;
                }
            }
        }
        adicional = adicional / 12;
        JOptionPane.showMessageDialog(null, "Adicional: " + adicional
                + "\nMaiorP: " + maiorP
                + "\nMenorP: " + menorP
                + "\nTotImp: " + totImp
                + "\nQtd B: " + qtB
                + "\nQtd N: " + qtdN
                + "\nQtd C: " + qtdC);
    }
}
