import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        produit p1=new produit(1021,"Lait","Delice",800);
        produit p2=new produit(2510,"Yaourt","Vitalait",500);
        produit p3=new produit(3250,"Tomate","Sicam",1200);
        magasin MG1=new magasin(5000,"Bouzid",9);
        MG1.ajouter(p1);
        MG1.ajouter(p2);
        MG1.ajouter(p3);
        MG1.affmagasin();
        System.out.println("le nombre  du magasin est"+MG1.num);
        System.out.println(p1.comparer1(p2));
        System.out.println( p1.comparer2(p2,p3));


        magasin mg=new magasin(5001,"centre ville",20);
        magasin prix=new magasin(5100,"menzah 6",11);
        vendeur v1=new vendeur(6,"sabrine","sidibouzid",28);
        vendeur v2=new vendeur(6,"zakaria","sidibouzid",28);
        vendeur v3=new vendeur(6,"jamila","bizerte",28);
        responsable r1=new responsable(2,"nour","tunis",52,100);
        caissier c1=new caissier(5,"isra","klibeya",4,23);
        caissier c2=new caissier(6,"khouloud","fahes",5,22);


        mg.ajouteremployee(v1);
        mg.ajouteremployee(r1);
        mg.ajouteremployee(c1);
        mg.ajouteremployee(c2);
        prix.ajouteremployee(c1);
        prix.ajouteremployee(v1);
        prix.ajouteremployee(v2);
        prix.ajouteremployee(v3);
        prix.ajouteremployee(r1);
        prix.affiche_employee();
        mg.affiche_employee();
        prix.ajouter(p1);
        mg.ajouter(p1);




    }
}
