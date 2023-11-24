public class employee {
    protected int id;
    protected String nom;
    protected String adrs;
    protected int nb;

    public employee(int id, String nom, String adrs, int nb){
        this.id=id;
        this.adrs=adrs;
        this.nb=nb;
        this.nom=nom;
    }
    void afficheE(){
        System.out.println(nom+""+id+""+adrs);     }

}

