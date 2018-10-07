package view;

/**
 * Die Klasse Story besitzt alle für die Geschichte wichtigen Elemente, diese werden dann später von einem Controller
 * aufgerufen und den Models übertragen
 */

public class Story {

    //1=Auswahl , 2 =Satz , 3=Wort
    private String[][][] sentences;
    private String[][][] dialouge;
    private String[] choices;



    /**
     * Konstruktor der Klasse Story
     */
    public Story(){
        sentences=new String[1][1][10];
        //dialouge=new String[1][1][1];
        //choices=new String[1];
    }

    /**
     * sentences und choices ist ein 3 dimensionales Array , 1 Dimension gibt die Ebene an , 2 Dimension gibt die
     * Auswahlmöglichkeit an(0 ist es gibt keine Auswahlmöglichkeiten) , die 3 Dimension ist für den Satz
     * @param layer Gibt die Ebene an auf dem sich der Spieler/Mason befindet
     */
    /**
     * My name is Alexa Peterwood... Or is it Jenny Andersn? It has been a while since I can clearly remember my name. Or my age. Or my parents faces. Or even what skin color I have. But that is not as important. I just woke up from another dreamless nightmare. All there is around me is a wide dark gray room, I could probably hear my echo if I screamed, well first I have to remember how to speak. In front of me is a wooden door surrounded by pulsing darkness. It is inviting me to enter, although staying here also feels rather comfortable. What should I do?
     You should stay and bask in the abyss… It is a light of hope in this grim world. Enter it!
     * @param layer
     */

    public void setSentencesAndDialouge(int layer){
        if (layer==1){
            sentences[0][0][0]="My"; sentences[0][0][1]="name";sentences[0][0][2]="is"; sentences[0][0][3]="Wright";sentences[0][0][4]="Graham...";
            sentences[0][0][5]="Or";sentences[0][0][6]="is";sentences[0][0][7]="it";sentences[0][0][8]="Mason";sentences[0][0][9]="Cain?";
            //dialouge[0][0][0]="Wo bin ich hier?";
            //choices[0][0]="in Wald gehen";choices[0][1]="umdrehen";choices[0][2]="umschauen";

            //sentences[0][1][]
        }
    }

    public void setShownSentence(){
        double temp=System.currentTimeMillis();
        for(int i=0;i<sentences.length;i++) {
            for(int j=0;j<sentences[i].length;j++){
                for(int k=0;k<sentences[i][j].length;k++) {
                    if (temp >= 0.1) {
                       //gPH.setShownSentence(gPH.getShownSentence() + " " + sentences[i][j][k]);
                        temp=0;
                    }
                }
            }
        }
    }
}
