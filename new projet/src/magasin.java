public class magasin {
    public int id;
    public String adresse;
    public int capacite = 50;
    produit[] tab = new produit[capacite];
    public int num = 0;
    employee[] ensemble_employee=new employee[20];
    int nombre_employee;

    public magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
    }

    public magasin() {
    }
    public void affmagasin() {
        System.out.println(this.id);
        System.out.println(this.adresse);
        System.out.println(this.capacite);
        for (int i = 0; i < num; i++) {
            System.out.println(tab[i].getLibelle());
            System.out.println(tab[i].getPrix());
        }
    }

    public void ajouter(produit p) {
        if (num < capacite) {
            tab[num] = p;
            num++;
        } else {
            System.out.println("La quantité a dépassé la quantité maximale de produits.");
        }

    }
    public boolean ajouteremployee(employee e){
        if(nombre_employee<20){
            ensemble_employee[nombre_employee]=e;
            nombre_employee++;
            return true;
        }
        return false;
    }
    public void affiche_employee(){
        for(int i=0;i<ensemble_employee.length;i++){
            if(ensemble_employee[i]!=null) {
                ensemble_employee[i].afficheE();
            }}
    }
}