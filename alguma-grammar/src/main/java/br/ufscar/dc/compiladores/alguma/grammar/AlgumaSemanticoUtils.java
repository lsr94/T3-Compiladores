package br.ufscar.dc.compiladores.alguma.grammar;

import br.ufscar.dc.compiladores.alguma.grammar.TabelaDeSimbolos;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class AlgumaSemanticoUtils {
    // Lista que armazenará os erros identificados pelo analisador
    public static List<String> errosSemanticos = new ArrayList<>();
    
    // Método para adicionar os erros identificados na lista criada anteriormente
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Erro %d:%d - %s", linha, coluna, mensagem));
    }
    
    // Função que verifica o tipo da variável em relação a uma 'Expressão Aritmética'
    public static TabelaDeSimbolos.AlgumaGrammar verificarTipo(TabelaDeSimbolos tabela, AlgumaGrammarParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.AlgumaGrammar tipoRetorno = null;
        for (var ta : ctx.termo()) {
            TabelaDeSimbolos.AlgumaGrammar aux = verificarTipo(tabela, ta);
            if (tipoRetorno == null) {
                tipoRetorno = aux;
            } else if (tipoRetorno != aux && aux != TabelaDeSimbolos.AlgumaGrammar.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                tipoRetorno = TabelaDeSimbolos.AlgumaGrammar.INVALIDO;
            }
        }

        return tipoRetorno;
    }

    // Função que verifica o tipo da variável em relação a um 'Termo Aritmético'
    public static TabelaDeSimbolos.AlgumaGrammar verificarTipo(TabelaDeSimbolos tabela, AlgumaGrammarParser.TermoContext ctx) {
        TabelaDeSimbolos.AlgumaGrammar tipoRetorno = null;

        for (var fa : ctx.fator()) {
            TabelaDeSimbolos.AlgumaGrammar aux = verificarTipo(tabela, fa);

            if (tipoRetorno == null) {
                tipoRetorno = aux;
            } else if (tipoRetorno != aux && aux != TabelaDeSimbolos.AlgumaGrammar.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                tipoRetorno = TabelaDeSimbolos.AlgumaGrammar.INVALIDO;
            }
        }
        return tipoRetorno;
    }

    // Função que verifica o tipo da variável em relação a um 'Fator Aritmético'
    public static TabelaDeSimbolos.AlgumaGrammar verificarTipo(TabelaDeSimbolos tabela, AlgumaGrammarParser.FatorContext ctx) {
        if (ctx.NUM_INT() != null)
            return TabelaDeSimbolos.AlgumaGrammar.INTEIRO;

        if (ctx.NUM_REAL() != null)
            return TabelaDeSimbolos.AlgumaGrammar.REAL;

        if (ctx.IDENT() != null) {
            String nomeVar = ctx.IDENT().getText();
            if (!tabela.existe(nomeVar)) {
                adicionarErroSemantico(ctx.IDENT().getSymbol(), "Variável " + nomeVar + " não foi declarada antes do uso");
                return TabelaDeSimbolos.AlgumaGrammar.INVALIDO;
            }
            return verificarTipo(tabela, nomeVar);
        }
        // Caso não seja nenhum dos tipos acima, só pode ser uma expressão entre parênteses
        return verificarTipo(tabela, ctx.Exp_aritmeticaContext());
    }
    
    public static TabelaDeSimbolos.AlgumaGrammar verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}