parser grammar AlgumaParser;

options { tokenVocab=AlgumaLexer; }

programa: 
    PALAVRA_CHAVE declaracao* corpo PALAVRA_CHAVE
    ;

declaracao: 
    ('constante' IDENT ':' tipo_base '=' valor_constante)
    | ('var' IDENT ':' tipo)
    // ... other declaration rules ...
    ;

tipo_base: 
    'inteiro'
    | 'real'
    | 'literal'
    | 'logico'
    ;

valor_constante: 
    NUM_INT
    | NUM_REAL
    | CADEIA
    | OP_LOG
    ;

tipo: 
    tipo_base
    | 'registro' IDENT? '{' declaracao* '}' 'fim_registro'
    | 'tipo' IDENT '=' tipo
    // ... other type rules ...
    ;

corpo: 
    comando+
    ;

comando: 
    atribuicao
    | estrutura_controle
    | IO_operacao
    // ... other command rules ...
    ;

atribuicao: 
    IDENT OP_ARIT? '<-' expressao
    ;

estrutura_controle: 
    'se' expressao 'entao' comando ('senao' comando)? 'fim_se'
    // ... other control structure rules ...
    ;

IO_operacao: 
    'leia' '(' IDENT ')'
    | 'escreva' '(' expressao ')'
    // ... other I/O operation rules ...
    ;

expressao: 
    termo (OP_ARIT termo)*
    ;

termo: 
    fator (OP_REL fator)*
    ;

fator: 
    NUM_INT
    | NUM_REAL
    | IDENT
    | '(' expressao ')'
    // ... other factor rules ...
    ;




// Operador coringa para detecção de erro
erro: 
    ERRO
    ;
