
    import java.util.Date;
    import java.util.Objects;
    public class produit {
        Date date_ex;
        int identifier;
        String libelle;
        String marque;
        double prix;

        public produit() {

        }
        public  produit (int identifier,String libelle, String marque, double prix,Date d){
            this.identifier=identifier;
            this.libelle=libelle;
            this.marque=marque;
            this.prix=prix;
            this.date_ex=d;
        }

        public produit(int i, String lait, String delice, int i1) {
        }

        void affiche(){
            System.out.println("le idntifier "+ identifier+ " le libelle"+ " " +libelle+"le marque" + " "+marque+"le prix" +" "+prix+"la date est"+date_ex);
            System.out.println(date_ex);

        }
        public String toString() {
            return "identifier"+this.identifier+"libelle"+this.libelle+"marque"+this.marque+"prix"+this.prix;
        }
        public void setDate_ex(Date d){
            this.date_ex=d;
        }

        public String getLibelle() {
            return this.libelle;
        }

        public double getPrix(){
            return this.prix;
        }
        public int getIdentifier(){
            return this.identifier;
        }
        public boolean comparer1(produit prod ){
            return this.libelle==prod.libelle && this.getPrix()==prod.getPrix() && this.identifier== prod.identifier;
        }
        public boolean comparer2(produit prod1,produit prod2 ){
            return this.libelle==prod1.libelle && this.getPrix()==prod1.getPrix()&& this.identifier==prod1.identifier
                    || this.libelle== prod2.libelle && this.getPrix()==prod2.getPrix()&& this.identifier==prod2.identifier ;

        }
    }
