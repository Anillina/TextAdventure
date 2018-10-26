package control;

import model.Being;
import model.Player;
import model.Story;
import view.Painting;

public class StoryController {

    private Story story;
    private Painting painting;
    private Being player;

    public StoryController(Player pl, Story story){
        player=pl;
        this.story=story;

    }

  public void checkAnswer() {
        if(player.getLayer()==1) {
            if(player.getLevel()==0) {
                painting.setText(story.getSentences()[0][0][0]);
                painting.setChoiceText(story.getSentences()[0][0][3]);
                if (story.getSentences()[0][0][1].equals(painting.getChoice())) {
                    player.setLevel(1);
                }
                if (story.getSentences()[0][0][2].equals(painting.getChoice())) {
                    player.setLevel(2);
                }
            }
              if(player.getLevel()==1) {
                  painting.setText(story.getSentences()[0][1][0]);
              }
                /*case 2:
                    painting.setText(story.getSentences()[0][2][0]);
                    System.out.println("Miau?");
                    painting.setChoiceText(story.getSentences()[0][2][4]);
                    if (story.getSentences()[0][2][1].equals(painting.getChoice())) {
                        player.setLevel(3);
                    }
                    if (story.getSentences()[0][2][2].equals(painting.getChoice())) {
                        player.setLevel(4);
                    }
                    if (story.getSentences()[0][2][3].equals(painting.getChoice())) {
                        player.setLevel(5);
                    }
                    break;
                case 3:
                    painting.setText(story.getSentences()[0][3][0]);
                    painting.setChoiceText(story.getSentences()[0][3][5]);
                    if (story.getSentences()[0][3][1].equals(painting.getChoice())) {
                        player.setLevel(6);
                    }
                    if (story.getSentences()[0][3][2].equals(painting.getChoice())) {
                        player.setLevel(7);
                    }
                    if (story.getSentences()[0][3][3].equals(painting.getChoice())) {
                        player.setLevel(8);
                    }
                    if (story.getSentences()[0][3][4].equals(painting.getChoice())) {
                        player.setLevel(5);
                    }
                    break;
                case 4:
                    painting.setText(story.getSentences()[0][4][0]);
                    painting.setChoiceText(story.getSentences()[0][4][3]);
                    if (story.getSentences()[0][4][1].equals(painting.getChoice())) {
                        player.setLevel(12);
                    }
                    if (story.getSentences()[0][4][2].equals(painting.getChoice())) {
                        player.setLevel(13);
                    }
                    break;
                case 5:
                    painting.setText(story.getSentences()[0][5][0]);
                    painting.setChoiceText(story.getSentences()[0][5][4]);
                    if (story.getSentences()[0][5][1].equals(painting.getChoice())) {
                        player.setLevel(9);
                    }
                    if (story.getSentences()[0][5][2].equals(painting.getChoice())) {
                        player.setLevel(10);
                    }
                    if (story.getSentences()[0][5][3].equals(painting.getChoice())) {
                        player.setLevel(3);
                    }
                    break;
                case 6:
                    painting.setText(story.getSentences()[0][6][0]);
                    painting.setChoiceText(story.getSentences()[0][6][3]);
                    if (story.getSentences()[0][6][1].equals(painting.getChoice())) {
                        player.setLevel(11);
                    }
                    if (story.getSentences()[0][6][2].equals(painting.getChoice())) {
                        player.setLevel(11);
                    }
                    break;
                case 7:
                    painting.setText(story.getSentences()[0][7][0]);
                    painting.setChoiceText(story.getSentences()[0][7][3]);
                    if (story.getSentences()[0][7][1].equals(painting.getChoice())) {
                        player.setLevel(11);
                    }
                    if (story.getSentences()[0][7][2].equals(painting.getChoice())) {
                        player.setLevel(11);
                    }
                    break;
                case 8:
                    painting.setText(story.getSentences()[0][8][0]);
                    painting.setChoiceText(story.getSentences()[0][8][3]);
                    if (story.getSentences()[0][8][1].equals(painting.getChoice())) {
                        player.setLevel(11);
                    }
                    if (story.getSentences()[0][8][2].equals(painting.getChoice())) {
                        player.setLevel(11);
                    }
                    break;
                case 9:
                    painting.setText(story.getSentences()[0][9][0]);
                    player.setLevel(3);
                    break;
                case 10:
                    painting.setText(story.getSentences()[0][10][0]);
                    player.setLevel(3);
                    break;
                case 11:
                    painting.setText(story.getSentences()[0][11][0]);
                    painting.setChoiceText(story.getSentences()[0][11][3]);
                    if (story.getSentences()[0][11][1].equals(painting.getChoice())) {
                        player.setLevel(12);
                    }
                    if (story.getSentences()[0][11][2].equals(painting.getChoice())) {
                        player.setLevel(13);
                    }
                    break;
                case 12:
                    painting.setText(story.getSentences()[0][12][0]);
                    player.setLevel(0);
                    player.setLayer(1);
                    break;
                case 13:
                    painting.setText(story.getSentences()[0][13][0]);
                    player.setLevel(0);
                    player.setLayer(1);
                    break;*/
            }

    }

    public void setPainting(Painting paint){
        painting=paint;
    }

    public Painting getPainting() {
        return painting;
    }
}
