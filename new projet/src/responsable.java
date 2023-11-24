public class responsable extends employee{
    float p;
    public responsable(int id,String nom,String adrs,int nb,int p){
        super(id,nom,adrs,nb);
        this.p=p;
        System.out.println(" les primes:"+this.p);

    }
    public float getPrime(){
        return p;}

    public void setPrime(float p){
        this.p= p;}
    public String toString(){
        return super.toString()+"Responsable{"+"prime"+p+"}";}
    public float calculerSalaire(){

        return nb>100? ((160*10)+nb-160*10*0.2f):(160*10);
    }
}
