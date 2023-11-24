public class caissier extends employee{
    int numero;
    public caissier(int id,String nom,String adrs,int nb,int numero){
        super(id,nom,adrs,nb);
        this.numero=numero;
        System.out.println("les numero:"+this.numero);}
    public float calculerSalaire(){
        return nb>180? (nb*5+(nb-180)*5.75f):(nb*5);
    }

}


