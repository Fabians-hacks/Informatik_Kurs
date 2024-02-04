import org.w3c.dom.ls.LSOutput;

public class Spiel {
    Würfel würfel1 = new Würfel(6);


    public int addiereX_rekursiv(int x) {
        if(x == 0){
            return(0);

        }
        x = x-1;
        return(addiereX_rekursiv(x)+würfel1.würfeln());
    }

    public int addiereX_iterativ(int s){
        int f = 0;
        for(int i = 0; i<= s; i++){
            f = f + würfel1.würfeln();

        }
        return(f);
    }

    public int maxFinden_rekursiv(int x, int g){
        if(x == 0){return(g);}
        x = x-1;
        g = würfel1.würfeln();
        int h = maxFinden_rekursiv(x,g);
        if(h>= g){
            g = h;
        }
        return(g);
    }
    public int maxfinden_iterativ(int x){

        int n =0;
         for(int i = 0; i<= x; i++){
             int s = würfel1.würfeln();
             if(s>= n){n=s;};

         }
         return(n);
    }

    public int gibXErgebnisse_rekursiv(int x,String d){

        d = d + würfel1.würfeln();
        x = x -1;
        if(x == 0){return(Integer.parseInt(d));}
        return(gibXErgebnisse_rekursiv(x,d));

    }

    public int gibXErgebnisse_iterativ(int x){
        String d = "";
        for(int i = 1; i<= x; i++){
            d = d + würfel1.würfeln();


        }
        return(Integer.parseInt(d));
    }


}
