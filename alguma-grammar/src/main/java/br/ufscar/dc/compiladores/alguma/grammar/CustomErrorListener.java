package br.ufscar.dc.compiladores.alguma.grammar;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class CustomErrorListener extends BaseErrorListener {
    public StringBuilder buffer;

    public CustomErrorListener(StringBuilder buffer){
        this.buffer=buffer;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e){
        
        //System.out.println(msg.split("'")[1]);    
        Token t = (Token) offendingSymbol;                    
        buffer.append("Linha " + line + ": erro sintatico proximo a "+t.getText()+"\nFim da compilacao\n");                     
        System.out.println(t.getText());
    }
    
}
