
    public class vendeur extends employee{
        int tauxv;

        public vendeur(int id, String nom, String adrs, int nb) {
            super(id, nom, adrs, nb);
            this.tauxv=tauxv;
            System.out.println("les taux vendeuse:"+this.tauxv);}
        public void setTV(int tauxv){
            this.tauxv=tauxv;
        }
        public int calculerSalaire(){
            return tauxv*450;
        }

    }
