package control;

import model.Player;
import model.Story;
import view.Painting;

public class StoryController {

    private Story story;
    private Painting painting;
    private Player player;
    private String [] Orte;
    private String [] Texte;
    private String [] Moeglichkeitentexte;
    private String [] Auswahlmoeglichkeiten;


    public StoryController(Player pl, Story story){
        player=pl;
        this.story=story;
    }
    /**
     * Update des Text sowie choice labels je nach Position des Spielers
     *
     */


    public void updateSentencesAndChoices() {
        String [][] input =story.getSentencesAndChoices(player.getPosition());
        Orte =new String [story.getMaxOrte()];
        Texte =new String [story.getMaxTexte()];
        Moeglichkeitentexte = new String [story.getMaxMoeglichkeitentexte()];
        Auswahlmoeglichkeiten = new String [story.getMaxAuswahlmoeglichkeiten()];
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j].contains("Ort")){
                   Orte=addObjectToArray(Orte,input[0][j]);
                }
                if (input[i][j].contains("Text")){
                    Texte=addObjectToArray(Texte,input[0][j]);
                }
                if (input[i][j].contains("Möglichkeitentext")){
                    Moeglichkeitentexte=addObjectToArray(Moeglichkeitentexte,input[0][j]);
                }
                if (input[i][j].contains("Auswahl")){
                    Auswahlmoeglichkeiten= addObjectToArray(Auswahlmoeglichkeiten,input[0][j]);
                }
            }
        }
        Orte=removeEmptyArraySlots(Orte);
        Texte=removeEmptyArraySlots(Texte);
        Moeglichkeitentexte=removeEmptyArraySlots(Moeglichkeitentexte);
        Auswahlmoeglichkeiten=removeEmptyArraySlots(Auswahlmoeglichkeiten);
        for (int i = 0; i < Texte.length; i++) {
             painting.setText(Texte[i]);
        }
        for (int i = 0; i < Moeglichkeitentexte.length; i++) {
             painting.setChoiceText(Moeglichkeitentexte[i]);
        }
        if (arrayIsEmpty(Moeglichkeitentexte)){
            painting.setChoiceText("");
        }
    }
    /**
     * Überprüfung der von dem Spieler angegeben Auswahl mit hilfe der Storyklasse.
     * Wenn die Auswahl mit einer der gespeicherten Auswahlen übereinstimmt wird
     * die position des Spielers dementsprechend geändert und updateSentencesAndChoices
     * aufgerufen.
     */


    public void checkAnswer(){

            String[][] input = story.getSentencesAndChoices(player.getPosition());
            Orte = new String[story.getMaxOrte()];
            Auswahlmoeglichkeiten = new String[story.getMaxAuswahlmoeglichkeiten()];

         for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j].contains("Ort")){
                    Orte=addObjectToArray(Orte,input[0][j]);
                }

                if (input[i][j].contains("Auswahl")){
                    Auswahlmoeglichkeiten= addObjectToArray(Auswahlmoeglichkeiten,input[0][j]);
                }
            }
        }
            Orte=removeEmptyArraySlots(Orte);
            Auswahlmoeglichkeiten=removeEmptyArraySlots(Auswahlmoeglichkeiten);

            boolean found = false;
            int foundAt = 0;
            for (int i = 0; i < Auswahlmoeglichkeiten.length && !found; i++) {
                if (Auswahlmoeglichkeiten[i].equals(painting.getChoice())) {
                    found = true;
                    foundAt = i;

                }
            }
            if (found) {
                player.setPosition(Orte[foundAt]);
                this.updateSentencesAndChoices();
            }
        }


    /**
     * Setzen des Paintings.
     * @param   paint Painting Objekt
     */

    public void setPainting(Painting paint){
        painting=paint;
    }

    /**
     * Rückgabe des Paintings.
     * @return  Painting Objekt
     */

    public Painting getPainting() {
        return painting;
    }

    /**
     * Hinzufügen des Übergebenen String Objektes zum übergebenen String
     * Array an der ersten freien Stelle von links.
     * @return  Entweder das übergebene String Array das mit dem übergebenen
     * String Objekt gefüllt wurde oder ein "Error" Array falls kein
     * Platz mehr vorhanden ist.
     */

    private String []addObjectToArray(String [] input,String object){
        boolean foundSpace=false;
        for (int i=0;i<input.length && !foundSpace;i++) {
            if (input[i]== null){
                input[i]=object;
                foundSpace=true;
            }
        }
        if (foundSpace){
            return input;
        }else{
            return new String [] {"Kein freier Platz im Array"};
        }
    }

    /**
     * Überprüfung ob ein String Array mit Inhalt gefüllt ist.
     * @return Wenn das String Array leer ist true.
     * Wenn das String Array mindestens einen gefüllten Platz hat false.
     */
    private boolean arrayIsEmpty(String[] array) {
        boolean found=false;
        for(int i=0;i<array.length && !found;i++){
        if (array[i]!=null){
            found=true;
        }
        }
        if (found){
        return false;
        }
        else {
        return true;
        }
    }
    /**
     * Entfernen von leeren Array Plätzen des übergebenen String Arrays.
     * @return Von leeren Array Plätzen befreites übergebenes Array.
     */
    private String [] removeEmptyArraySlots(String [] input){
        int emptySlots=0;
        for (int i=0;i<input.length;i++) {
            if (input[i]== null){
                emptySlots++;
            }
        }
        String [] output=new String[input.length-emptySlots];
        for (int i=0;i<output.length;i++) {
            output[i]=input[i];
        }
        return output;
    }

}
