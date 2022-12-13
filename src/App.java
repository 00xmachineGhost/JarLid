//Base GUI

public class App {

    //Attributes

    private String labelName;
    private int ID;


    //Main Method
    public static void main(String[] args) {                            // Main-Funktion: wird grundsaetzlich als erstes ausgefuerht und ist auch das "Hauptprogramm"(Funktions Hoheit)
        
        App Jar = new App();

        Jar.setContentLabel("Applesauce");
        Jar.setContentID(25);

        Jar.getContentLabel(null);                              //Wird momentan  nicht benötigt
        Jar.getContentID(0);                                      //Wird momentan  nicht benötigt

        System.out.println(Jar.labelName + "," + Jar.ID);

    }


    //Methods
    
    private void setContentLabel(String nameLabel){

        this.labelName = nameLabel;

    }

    private void getContentLabel(String nameLabel) {
        
        nameLabel = this.labelName;

    }

    private void setContentID(int labelID){

        this.ID = labelID;

    }

    private void getContentID(int labelID) {
        
        labelID = this.ID;

    }



}