import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Spiel spiel1 = new Spiel();
        Würfel würfel2 = new Würfel(6);
        //System.out.println(würfel2.würfeln());
        //System.out.println(spiel1.addiereX_rekursiv(4));
        System.out.println(spiel1.maxFinden_rekursiv(4,0));
        System.out.println(spiel1.maxfinden_iterativ(5));
        System.out.println(spiel1.gibXErgebnisse_rekursiv(5,""));
        System.out.println(spiel1.gibXErgebnisse_iterativ(4));
    }
}
