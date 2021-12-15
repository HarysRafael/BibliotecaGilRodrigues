package br.ete.util;

public class Corretores {

    public static String converterParaJava(String data) {

        return data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);
    }

    public static String converterParaSql(String data) {

        return data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);
    }

    public static boolean converterBooleanParaJava(String booleano) {
        if (booleano.equals("0")) {
            return false;
        } else {
            return true;
        }
    }

}
