package control;


import com.sun.tools.corba.se.idl.constExpr.Or;
import model.Player;
import model.Story;
import view.MainView;
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


    public void setPainting(Painting paint){
        painting=paint;
    }

    public Painting getPainting() {
        return painting;
    }

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
