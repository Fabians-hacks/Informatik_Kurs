import java.util.Random;
public class Würfel {
    int seiten;
    public Würfel(int pSeiten){
        seiten = pSeiten;

    }
    public int getSeiten(){return(seiten);}
    public int würfeln(){
        Random ran = new Random();
        return(ran.nextInt(seiten)+1);
    }
}


