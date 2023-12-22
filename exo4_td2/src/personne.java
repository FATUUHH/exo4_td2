import java.text.SimpleDateFormat;
import java.util.Date;
public class personne {
     private String nom;
     private String prenom;
     private String matricule;
     private int age;
     private Date datenaissance;
     public  final int AC=2023;

     public personne(String nom,String prenom,String datenaissance){
          this.nom=nom;
          this.prenom=prenom;
          this.datenaissance=convertirDate(datenaissance);
          this.matricule=genererMatricule();
          this.age=calculerAge();

     }
     public String getNom(){
           return nom;
     }
     public void setNom(String nom){
          this.nom=nom;
     }
     public String getPrenom(){
          return prenom;
     }
     public void setPrenom(String prenom){
          this.prenom=prenom;
     }
     public String getMatricule(){
          return matricule;
     }
     public void setMatricule(String matricule){
          this.matricule=matricule;
     }
     public int getAge(){
          return age;
     }
     public void setAge(int age ){
          this.age=age;
     }

     public Date getDatenaissance() {
          return datenaissance;
     }
     public void setDatenaissance(Date datenaissance){
          this.datenaissance=datenaissance;
     }
     private String genererMatricule(){
          String matricule= "Mat" + prenom.charAt(0)+nom.charAt(0)+String.format("%04d",hashCode()%1000);
          return matricule;
     }
     public int calculerAge(){
          Date dateActuelle = new Date();
          SimpleDateFormat sdf = new
                  SimpleDateFormat("yyyy");
          int anneeNaissance=Integer.parseInt(sdf.format(dateActuelle));
          return anneActuelle-anneeNaissance;
     }
     private Date convertirDate(String dateCvr){
          try {
               SimpleDateFormat sdf = new
                       SimpleDateFormat("yyyy-MM-dd");
               return sdf.parse(dateCvr);
          }catch (Exception e){
               e.printStackTrace();
               return null;
          }
     }
}