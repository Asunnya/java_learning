package q4;
/*4 -   Crie uma classe Data com as seguintes capacidades:
Gerar saída da data em múltiplos formatos, como: DD/MM/AAAA; Agosto 08, 2017; DDD AAAA;
Utilize construtores sobrecarregados para criar objetos Data inicializados com datas no formato definido em cima.
No primeiro caso, o construtor deve receber 3 valores inteiros.
No segundo caso, deve receber uma String e 2 valores inteiros.
No terceiro caso deve receber 2 valores inteiros, o primeiro representando o número de dias no ano.
Faça uma classe principal que implemente o método main que deverá instanciar 2 objetos de cada formato e depois imprimir cada um deles.
*/
public class Data {
    private String data;

    public Data(int dd, int mm, int aaaa) {
        this.data =  ""+dd+"/"+mm+"/"+aaaa;
    }
    public Data(String mes, int dd, int aaaa) {
        this.data = mes+" "+dd+", "+aaaa;
    }
    public Data(int ddd, int aaaa) {
        this.data = ""+ddd+" "+""+aaaa;
    }

    public String getData() {
        return this.data;
    }
}
