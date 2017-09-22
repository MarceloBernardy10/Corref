package model;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe usada para modelar os sintagmas que sÃ£o agrupados nas cadeias.
 *
 * @author Vinicius <vinicius.s.sesti@gmail.com>
 */
public class Sintagma implements Serializable
{

    public String textName;
    public String sn;
    public int sentenca;
    public ArrayList<Word> words;
    public int set;
    public int snID;
    public String nucleo;
    public String lemma;
    public String genero;
    public String numero;
    public int globalID;
    public Color cor;
    public String categoriaSemantica;
    //starttoken e endtoken: tokens DO TEXTO onde o sintagma começa/termina
    public int startToken;
    public int endToken;
    //startchar e endchar: caractere do TEXTO onde o sintagma começa/termina
    public int startChar;
    public int endChar;

    public Sintagma(String textName, String sn, int sentenca, ArrayList<Word> words, int set, int snID, String nucleo, String lemma, boolean prop, String genero, String numero, boolean nucleoPronome, String groupedBy, boolean shallow, ArrayList<Integer> paiDe, int filhoDe, String categoriaSemantica)
    {
        this.textName = textName;
        this.sn = sn;
        this.sentenca = sentenca;
        this.words = words;
        this.set = set;
        this.snID = snID;
        this.nucleo = nucleo;
        this.lemma = lemma;
        this.genero = genero;
        this.numero = numero;

        this.globalID=0;
        this.categoriaSemantica = categoriaSemantica;
    }
    public Color getCor(){
        return cor;
    }
    @Override
    public String toString()
    {
        return sn;
    }

}
