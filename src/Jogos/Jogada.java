/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogos;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author carlos
 */
public class Jogada 
{
    private  String valorTemporario="X";  
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private String resultado = "";
    private int contador = 0;
    private JButton[] botoes = new JButton[3];
    public Jogada()
    {
        
    }
    
    public void adicionarJogadores(Jogador jogador1, Jogador jogador2)
    {
        jogadores.add(jogador1);
        jogadores.add(jogador2);
    }
    
    public void botoesGanhadores(JButton[] botoes, String valorCelula)
    {
        if(!valorCelula.equals(""))
        {
            this.botoes = botoes;
        }
    }
    public void limpaArray()
    {
        if(jogadores.size() > 0)
        {
            jogadores.removeAll(jogadores);
        }
    }
        
    public void alternarJogada()
    {
       if( valorTemporario == "X")
       {
           valorTemporario = "O";
       }
       else if( valorTemporario == "O")
       {
           valorTemporario = "X";
       }
    }
    
    public void resetJogadas()
    {
        contador = 0; 
        valorTemporario="X";
    }
     
    public void analisaJogada(String[][] matriz, JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9)
    {
        contador +=1;        
        if(matriz[0][0] == matriz[0][1] && matriz[0][0] == matriz[0][2])
        {
            determinaGanhador(matriz[0][0]);
            JButton[] botoesTemp = {b1,b2,b3};
            botoesGanhadores(botoesTemp, matriz[0][0]);
        }
        if(matriz[1][0] == matriz[1][1] && matriz[1][0] == matriz[1][2])
        {           
            determinaGanhador(matriz[1][0]);
            JButton[] botoesTemp = {b4,b5,b6};
            botoesGanhadores(botoesTemp, matriz[1][0]);           
        } 
        if(matriz[2][0] == matriz[2][1] && matriz[2][0] == matriz[2][2])
        {          
            determinaGanhador(matriz[2][0]);
            JButton[] botoesTemp = {b7,b8,b9};
            botoesGanhadores(botoesTemp, matriz[2][0]);           
        } 
        if(matriz[0][0] == matriz[1][0] && matriz[0][0] == matriz[2][0])
        {
            determinaGanhador(matriz[1][0]);
            JButton[] botoesTemp = {b1,b4,b7};
            botoesGanhadores(botoesTemp, matriz[1][0]);            
        } 
        if(matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1])
        {
           determinaGanhador(matriz[1][1]);
            JButton[] botoesTemp = {b2,b5,b8};
            botoesGanhadores(botoesTemp, matriz[1][1]);           
        } 
        if(matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2])
        {
           determinaGanhador(matriz[1][2]);
            JButton[] botoesTemp = {b3,b6,b9};
            botoesGanhadores(botoesTemp, matriz[1][2]);           
        } 
        if(matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2])
        {
           determinaGanhador(matriz[1][1]);
            JButton[] botoesTemp = {b1,b5,b9};
            botoesGanhadores(botoesTemp, matriz[1][1]);           
        } 
        if(matriz[2][0] == matriz[1][1] && matriz[2][0] == matriz[0][2])
        {
           determinaGanhador(matriz[2][0]);
            JButton[] botoesTemp = {b3,b5,b7};
            botoesGanhadores(botoesTemp, matriz[2][0]);           
        }
        if(contador == 9){
            resultado = "Empate";            
        }
    }
     
    public void determinaGanhador(String caractere)
    {
        if(caractere.equalsIgnoreCase("X"))
        {
            resultado = jogadores.get(0).Obternome() + " Ganhou!";

        }
        else if(caractere.equalsIgnoreCase("O"))
        {
            resultado = jogadores.get(1).Obternome() + " Ganhou!";

        }
    }
    
    public String getValorTemporario()
     {
         return valorTemporario;
     }
    
    public ArrayList<Jogador> getJogadores()
     {
         return jogadores;
     }
    public void resetarResultado()
    {
        resultado="";
        
    }
    
   public String obterResultado()
   {
       return resultado;
   }
   
   public JButton[] obterBotoes()
   {
       return botoes;
   }
}
