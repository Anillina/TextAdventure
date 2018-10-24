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
        String help[][]=new String[10][2];
        for(int i=0;i<help.length;i++){
            help[i][0]=story.getSentencesAndChoices(String.valueOf(player.getLayer()))[i][0];
            help[i][1]=story.getSentencesAndChoices(String.valueOf(player.getLayer()))[i][1];
        }
        switch (player.getLevel()) {
            case 0:
                painting.setText(help[3][0]);
                painting.setText(help[4][0]);
                painting.setText(help[5][0]);
                if (help[4][0].equals(painting.getChoice())) {
                    player.setLevel(2);
                }
                if(help[5][0].equals(painting.getChoice())){
                    player.setLevel(1);
                }
                break;
            case 1:
                painting.setText(help[1][0]);
                painting.setText(help[2][0]);
                break;
            case 2:
                painting.setText(help[4][0]);
                painting.setText(help[5][0]);
                painting.setText(help[6][0]);
                painting.setText(help[7][0]);
                if (help[5][0].equals(painting.getChoice())) {
                    player.setLevel(3);
                }
                if(help[6][0].equals(painting.getChoice())){
                    player.setLevel(8);
                }
                if (help[7][0].equals(painting.getChoice())) {
                    player.setLevel(9);
                }
                break;
            case 3:
                painting.setText(help[5][0]);
                painting.setText(help[6][0]);
                painting.setText(help[7][0]);
                painting.setText(help[8][0]);
                painting.setText(help[9][0]);
                if (help[6][0].equals(painting.getChoice())) {
                    player.setLevel(4);
                }
                if(help[7][0].equals(painting.getChoice())){
                    player.setLevel(5);
                }
                if (help[8][0].equals(painting.getChoice())) {
                    player.setLevel(6);
                }
                if (help[9][0].equals(painting.getChoice())) {
                    player.setLevel(7);
                }
                break;
            case 4:
                painting.setText(help[1][0]);
                painting.setText(help[2][0]);
                player.setLayer(1);
                player.setLevel(0);
                break;
            case 5:
                painting.setText(help[1][0]);
                painting.setText(help[2][0]);
                player.setLayer(1);
                player.setLevel(0);
                break;
            case 6:
                painting.setText(help[1][0]);
                painting.setText(help[2][0]);
                player.setLayer(1);
                player.setLevel(0);
                break;
            case 7:
                painting.setText(help[1][0]);
                painting.setText(help[2][0]);
                player.setLayer(1);
                player.setLevel(0);
                break;
            case 8:
                painting.setText(help[4][0]);
                painting.setText(help[5][0]);
                painting.setText(help[6][0]);
                painting.setText(help[7][0]);
                if (help[5][0].equals(painting.getChoice())) {
                    player.setLevel(3);
                }
                if(help[6][0].equals(painting.getChoice())){
                    player.setLevel(3);
                }
                if (help[7][0].equals(painting.getChoice())) {
                    player.setLevel(9);
                }
                break;
            case 9:
                painting.setText(help[4][0]);
                painting.setText(help[5][0]);
                painting.setText(help[6][0]);
                painting.setText(help[7][0]);
                if (help[5][0].equals(painting.getChoice())) {
                    player.setLevel(11);
                }
                if(help[6][0].equals(painting.getChoice())){
                    player.setLevel(12);
                }
                if (help[7][0].equals(painting.getChoice())) {
                    player.setLevel(3);
                }
                break;
            case 11:
                painting.setText(help[2][0]);
                player.setLevel(3);
                break;
            case 12:
                painting.setText(help[2][0]);
                player.setLevel(3);
                break;
        }
    }
}
