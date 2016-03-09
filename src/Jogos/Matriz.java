/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogos;

/**
 *
 * @author carlos
 */
public class Matriz 
{
    private String[][] matriz; 
    
    public Matriz()
    {
      matriz = new String [3][3];
      limparMatriz();
    }
    public String[][] getMatriz() 
    {
        return matriz;
    }
    
    public void limparMatriz()
    {
        matriz[0][0] = "";
        matriz[0][1] = "";
        matriz[0][2] = "";
        matriz[1][0] = "";
        matriz[1][1] = "";
        matriz[1][2] = "";
        matriz[2][0] = "";
        matriz[2][1] = "";
        matriz[2][2] = "";
    }

    
    
}
