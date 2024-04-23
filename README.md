# T2-Construcao-Compiladores

individual:
java -jar D:\Documentos\UFSCar\Compiladores-2024.1\T2-Construcao-Compiladores\alguma-grammar\target\alguma-grammar-1.0-SNAPSHOT-jar-with-dependencies.jar D:\Documentos\UFSCar\Compiladores-2024.1\casos-de-teste\2.casos_teste_t2\entrada\4-algoritmo_2-2_apostila_LA_1_erro_linha_10.txt D:\Documentos\UFSCar\Compiladores-2024.1\T2-Construcao-Compiladores\saida.txt


corretor:

java -jar D:\Documentos\UFSCar\Compiladores-2024.1\T2-Construcao-Compiladores\alguma-grammar\compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar D:\Documentos\UFSCar\Compiladores-2024.1\T2-Construcao-Compiladores\alguma-grammar\target\alguma-grammar-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc temp D:\Documentos\UFSCar\Compiladores-2024.1\casos-de-teste "769701, 791003" t1