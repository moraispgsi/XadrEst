/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.XadrEst;

import pt.Xadrez.CorPeca;
import static pt.Xadrez.Direcao.*;
import pt.Xadrez.Movimento;
import pt.Xadrez.PecaXadrez;



/**
 *
 * @author Ricardo
 */
public class Torre extends PecaXadrez {

    /**
     * Representa uma Torre num jogo de xadrEst
     * @param corPeca cor da peça
     */
    public Torre(CorPeca corPeca)
    {
        super(  corPeca,
                new Movimento(LEFT,LEFT),
                new Movimento(RIGHT,RIGHT),
                new Movimento(TOP,TOP),
                new Movimento(BOTTOM,BOTTOM),
                new Movimento(LEFT),
                new Movimento(RIGHT),
                new Movimento(TOP),
                new Movimento(BOTTOM)
                );

    }
    
    /**
     * 
     * @return String com a sigla da peça
     */
    @Override
    public String desenhar() {
        
        return corPeca == CorPeca.BRANCA ? "T":"t";
        
    }
    
    /**
     * 
     * @return clone da peça
     * @throws CloneNotSupportedException 
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        super.clone();
        
        return new Torre(corPeca);
    }

    /**
     * 
     * @return nome da peça
     */
    @Override
    public String getNome() {
       return "Torre";
    }
}
