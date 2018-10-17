package control;

import model.Being;
import model.Story;
import view.Painting;

public class StoryController {

    Story story;
    Painting painting;
    Being player;

    public StoryController(){}

    public void checkAnswer(){
        if(story.getSentencesAndChoices()[1][0].equals(painting.getChoice())){
            player.setLayer(player.getLayer()+1);
        }
        if(story.getSentencesAndChoices()[1][1].equals(painting.getChoice())){
            //end panel oder so einfügen?????
        }
    }

    public void updateText(){
        String[] help = new String[100];
        for (int i =0;i<help.length;i++){
            help[i]=story.getSentencesAndChoices()[0][i];
            painting.setLabelText(help[i]);
            System.out.println(help[i]);
        }
    }
}
