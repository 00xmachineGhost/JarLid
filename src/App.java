//Base GUI

public class App {

    //Attributes

    String testVariable;
    int ID;


    //Main Method
    public static void main(String[] args) {                            // Main-Funktion: wird grundsaetzlich als erstes ausgefuerht und ist auch das "Hauptprogramm"(Funktions Hoheit)
        
        App Jar = new App();

        Jar.setContentLabel("Applesauce");
        Jar.setContentID(25);

        System.out.println(Jar.testVariable + "," + Jar.ID);

    }


    //Methods
    
    public void setContentLabel(String nameLabel){

        this.testVariable = nameLabel;

    }

    public void getContentLabel(String nameLabel) {
        
        nameLabel = this.testVariable;

    }

    public void setContentID(int labelID){

        this.ID = labelID;

    }

    public void getContentID(int labelID) {
        
        labelID = this.ID;

    }



}