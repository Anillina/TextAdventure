package model;
public class Story {

    //1=Auswahl , 2 =Satz , 3=Wort
    private String sentences[][] ;




    /**
     * Konstruktor der Klasse Story
     */
    public Story(int layer){
        setSentencesAndChoices(layer);

    }

    /**
     * sentencesAndChoices ist ein 3 dimensionales Array , 1 Dimension ist für den Satz zuständig , 2 Dimension gibt die
     * Auswahlmöglichkeit an
     * @param layer Gibt die Ebene an auf dem sich der Spieler/Mason befindet
     */
    /**
     * My name is Alexa Peterwood... Or is it Jenny Andersn? It has been a while since I can clearly remember my name. Or my age. Or my parents faces. Or even what skin color I have. But that is not as important. I just woke up from another dreamless nightmare. All there is around me is a wide dark gray room, I could probably hear my echo if I screamed, well first I have to remember how to speak. In front of me is a wooden door surrounded by pulsing darkness. It is inviting me to enter, although staying here also feels rather comfortable. What should I do?
     You should stay and bask in the abyss… It is a light of hope in this grim world. Enter it!
     * @param layer
     */

    public void setSentencesAndChoices(int layer){
        if (layer==1){
            sentences=new String[2][10];
            sentences[0][0]="My"; sentences[0][1]="name";sentences[0][2]="is"; sentences[0][3]="Wright";sentences[0][4]="Graham...";
            sentences[0][5]="Or";sentences[0][6]="is";sentences[0][7]="it";sentences[0][8]="Mason";sentences[0][9]="Cain?";

            sentences[1][0]="go into Forest";sentences[1][1]="turn around";sentences[1][2]="look around";

        }
    }

    public String [][] getSentencesAndChoices(){
        return sentences;
    }
}
