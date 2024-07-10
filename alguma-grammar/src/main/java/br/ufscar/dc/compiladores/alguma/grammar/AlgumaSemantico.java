package br.ufscar.dc.compiladores.alguma.grammar;

import br.ufscar.dc.compiladores.alguma.grammar.TabelaDeSimbolos;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    TabelaDeSimbolos tabela;

    @Override
    public Void visitPrograma(AlgumaGrammarParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracoes(AlgumaGrammarParser.DeclaracoesContext ctx) {
        String nomeVar = ctx.VARIAVEL().getText();
        String strTipoVar = ctx.TIPO_VAR().getText();
        AlgumaGrammar tipoVar = AlgumaGrammar.INVALIDO;

        switch (strTipoVar) {
            case "INTEIRO":
                tipoVar = AlgumaGrammar.INTEIRO;
                break;
            case "REAL":
                tipoVar = AlgumaGrammar.REAL;
                break;
            case "BOOL":
                tipoVar = AlgumaGrammar.BOOL;
                break;
            case "LITERAL":
                tipoVar = AlgumaGrammar.LITERAL;
                break;
            default:
                tipoVar = AlgumaGrammar.INVALIDO;
                break;
        }

        // Verificar se o tipo da variável é INVÁLIDO (não irá ser declarada)
        if (tipoVar == AlgumaGrammar.INVALIDO)
            adicionarErroSemantico(tipoVar, "tipo " + strTipoVar + " não declarado");

        // Verificar os demais tipos de variáveis e se elas já foram declaradas
        if (tabela.existe(nomeVar)) {
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.VARIAVEL().getSymbol(), "Variável " + nomeVar + " já existe");
        } else {
            tabela.adicionar(nomeVar, tipoVar);
        }

        return super.visitDeclaracoes(ctx);
    }

    @Override
    public Void visitCmdAtribuicao(AlgumaGrammarParser.CmdAtribuicaoContext ctx) {
        AlgumaGrammar tipoExpressao = AlgumaSemanticoUtils.verificarTipo(tabela, ctx.Exp_aritmeticaContext());
        String nomeVar = ctx.VARIAVEL.getText();

        // Verifica, inicialmente, se o tipoExpressao é diferente do tipo INVÁLIDO
        if (tipoExpressao != AlgumaGrammar.INVALIDO) {
            // Caso seja, verifica se a variável não foi declarada => gera erro semântico
            if (!tabela.existe(nomeVar)) {
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.VARIAVEL().getSymbol(), "Variável " + nomeVar + " não foi declarada antes do uso");
            } else {
                // Caso tenha sido declarada, verifica qual o tipo da variável
                AlgumaGrammar tipoVariavel = AlgumaSemanticoUtils.verificarTipo(tabela, nomeVar);

                // Possibilidade de criar uma função para verificar compatibilidade entre real e inteiro
                /* A princípio deixe assim */

                if (tipoVariavel != tipoExpressao)
                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.VARIAVEL().getSymbol(), "Tipo da variável " + nomeVar + " não é compatível com o tipo da expressão");
            }
        }
        return super.visitCmdAtribuicao(ctx);
    }
}
