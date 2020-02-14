package java_medium;

//A word nest is created by taking a starting word, and generating a new string by placing the word inside itself. This process is then repeated.
public class WordNest {

    public static void main(String[] args) {
        System.out.println(wordNest("engagement", "engenengagemengagemeengagementntentgagementagement"));
        System.out.println(wordNest("passage", "passpassageage"));
        System.out.println(wordNest("factory", "ffacfactofactfafactoryctoryoryrytoryactory"));
        System.out.println(wordNest("deny", "ddededdddenyenyenyenynynyeny"));
        System.out.println(wordNest("jinx", "jijijjijjijijjinxinxnxnxinxnxinxnxnx"));
        System.out.println(wordNest("deal", "dedddealealealal"));
        System.out.println(wordNest("paradox", "parparaparadoxdoxadox"));
        System.out.println(wordNest("meet", "mmememmeeteeteteteet"));
        System.out.println(wordNest("last", "lalastst"));
        System.out.println(wordNest("silence", "sisilsisilencelenceencelence"));
        System.out.println(wordNest("inflate", "inflate"));
        System.out.println(wordNest("ruin", "rurrurrrrrrururuinininuinuinuinuinuininuinin"));
        System.out.println(wordNest("dictate", "dictadicdidictdiddictadictadictateteteictatectateatectatetatete"));
        System.out.println(wordNest("caller", "callcacacalccallcacaccallerallerllerllererallerlerllerllerer"));
        System.out.println(wordNest("sweater", "sweatsweswsweatereateraterer"));
        System.out.println(wordNest("measure", "measumememeasumemmeasmmeasureeasureureeasureasurereasureasurere"));
    }

    /**
     * Given a starting word and the final word nest, return the depth of the word nest.
     */
    public static int wordNest(String word, String nest) {
        return nest.length() / word.length() - 1;
    }

}
