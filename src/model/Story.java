package model;
public class Story {

    // Ebene , Inhalt , Inhaltstyp
    private String sentences[][][] ;

    /**
     * Konstruktor der Klasse Story
     * Aufruf der Methode "setSentencesAndChoices" bei Initalisierung
     */
    public Story(){
        setSentencesAndChoices();
    }

    /**
     * Erstellung von Datenspeicher mithilfe von dreidimensionalen Array "sentences"
     * wobei in der ersten Dimension die Ebene, in der zweiten der Inhalt dieser Ebene und
     * in der dritten der Typ des Inhalts gespeichert wird
     */

    private void setSentencesAndChoices() {
        sentences=new String[13][][];
        // layer 1-1
        sentences[0]=new String [6][2];

        sentences[0][0][0]="1";
        sentences[0][1][0]="2a";
        sentences[0][2][0]="2b";
        sentences[0][3][0]="My name is Alexa Peterwood... Or is it Jenny Anderson? It has been a while since I can clearly remember my name. Or my age. Or my parents faces. Or even what skin color I have. But that is not as important. I just woke up from another dreamless nightmare. All there is around me is a wide dark gray room, I could probably hear my echo if I screamed, well first I have to remember how to speak. In front of me is a wooden door surrounded by pulsing darkness. It is inviting me to enter, although staying here also feels rather comfortable. What should I do? ";
        sentences[0][4][0]="Open and enter the door";
        sentences[0][5][0]="Lay down and stay where you are";

        sentences[0][1][1]="Ort 1";
        sentences[0][2][1]="Ort 2";
        sentences[0][3][1]="Text 1";
        sentences[0][4][1]="Auswahl 1";
        sentences[0][5][1]="Auswahl 2";

        // layer 1-2a
        sentences[1]=new String [3][2];

        sentences[1][0][0]="2a";
        sentences[1][1][0]="God has forbidden me to enter heaven or hell- Might as well stay here, where I feel like I exist.";
        sentences[1][2][0]="Game Over";

        sentences[1][1][1]="Text 1";
        sentences[1][2][1]="Anweisung 1";

        //layer 1-2b
        sentences[2]=new String [8][2];

        sentences[2][0][0]="2b";
        sentences[2][1][0]="3ba";
        sentences[2][2][0]="3bb";
        sentences[2][3][0]="3bc";
        sentences[2][4][0]="I hold out my hand and grip the door open - It is warm. I go through the door and, by what I can only assume, I have entered a forest at midnight. Pitch dark. My feet prompt me to move forward and so I do. The forest doesn’t hold anything special to it. There are large wide trees, various types of bushes, hanging from the trees are orange eyeballs, dead insects and branches are laying everywhere. Nothing unusual.\n" +
                "Go to the left, it is safer… Go to the right, I know something else is there.";
        sentences[2][5][0]="Go to the left";
        sentences[2][6][0]="Go to the right";
        sentences[2][7][0]="Move forward";

        sentences[2][1][1]="Ort 1";
        sentences[2][2][1]="Ort 2";
        sentences[2][3][1]="Ort 3";
        sentences[2][4][1]="Text 1";
        sentences[2][5][1]="Auswahl 1";
        sentences[2][6][1]="Auswahl 2";
        sentences[2][7][1]="Auswahl 3";

        //layer 1-3ba
        sentences[3]=new String [10][2];

        sentences[3][0][0]="3ba";
        sentences[3][1][0]="4baa";
        sentences[3][2][0]="4bab";
        sentences[3][3][0]="4bac";
        sentences[3][4][0]="4bad";
        sentences[3][5][0]="I have lost myself in this forest. I hope I will find something worthwhile left for me. But there is nothing. Just trees and dead bugs everywhere. I just keep going forward. Just dead bugs and branches. It feels like I walked for hours in this direction. Branches and a dead rat. Huh, something new. I get closer to the rat that is on the ground on top of a pile of caterpillar corpses. It’s an ordinary rat. Filthy, hairy, smelly and rotting. At this point there are not many options for me now, right?\n" +
                "Please don’t. You will get a tummy ache. I dare you to do that! You won’t. You are not brave enough.";
        sentences[3][6][0]="Eat the rat";
        sentences[3][7][0]="Eat some caterpillars";
        sentences[3][8][0]="Eat an eyeball";
        sentences[3][9][0]="Go on";

        sentences[3][1][1]="Ort 1";
        sentences[3][2][1]="Ort 2";
        sentences[3][3][1]="Ort 3";
        sentences[3][4][1]="Ort 4";
        sentences[3][5][1]="Text 1";
        sentences[3][6][1]="Auswahl 1";
        sentences[3][7][1]="Auswahl 2";
        sentences[3][8][1]="Auswahl 3";
        sentences[3][9][1]="Auswahl 4";

        //layer 1-4baa
        sentences[4]=new String [3][2];

        sentences[4][0][0]="4baa";
        sentences[4][1][0]="I eat the dead decaying rat.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now. I continue my walk and head further into the forest. Before I start to regret to have eaten a dead decaying rat I see a dime light from afar. – It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Its presences is… strangely welcoming. It not human, nor anything I have ever seen, that I know for a certainty. Nevertheless, I want to get closer and closer to it. Hugging it. Like a moth drawn to light.";
        sentences[4][2][0]="Next layer";

        sentences[4][1][1]="Text 1";
        sentences[4][2][1]="Anweisung 1";

        //layer 1-4bab
        sentences[5]=new String [3][2];

        sentences[5][0][0]="4bab";
        sentences[5][1][0]="I eat part of the pile of caterpillars that the dead rat was laying on.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now. I continue my walk and head further into the forest. Before I start to regret to have eaten some caterpillars I see a dime light from afar. – It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Its presences is… strangely welcoming. It not human, nor anything I have ever seen, that I know for a certainty. Nevertheless, I want to get closer and closer to it. Hugging it. Like a moth drawn to light.";
        sentences[5][2][0]="Next layer";

        sentences[5][1][1]="Text 1";
        sentences[5][2][1]="Anweisung 1";

        //layer 1-4bac
        sentences[6]=new String [3][2];

        sentences[6][0][0]="4bac";
        sentences[6][1][0]="I pick down an orange eyeball from a tree nearby. On closer exception they are more yellow than orange.Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now. I continue my walk and head further into the forest. Before I start to regret to have eaten an eyeball I see a dime light from afar. – It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Its presences is… strangely welcoming. It not human, nor anything I have ever seen, that I know for a certainty. Nevertheless, I want to get closer and closer to it. Hugging it. Like a moth drawn to light.";
        sentences[6][2][0]="Next layer";

        sentences[6][1][1]="Text 1";
        sentences[6][2][1]="Anweisung 1";

        //layer 1-4bad
        sentences[7]=new String [3][2];

        sentences[7][0][0]="4bad";
        sentences[7][1][0]="I decide otherwise. I eat nothing. I continue my walk and head further into the forest.I see a dime light from afar. – It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Its presences is… strangely welcoming. It not human, nor anything I have ever seen, that I know for a certainty. Nevertheless, I want to get closer and closer to it. Hugging it. Like a moth drawn to light.";
        sentences[7][2][0]="Next layer";

        sentences[7][1][1]="Text 1";
        sentences[7][2][1]="Anweisung 1";

        //layer 1-3bb
        sentences[8]=new String [8][2];

        sentences[8][0][0]="3bb";
        sentences[8][1][0]="3ba";
        sentences[8][2][0]="3ba";
        sentences[8][3][0]="3bc";
        sentences[8][4][0]="I feel uneasy. The forest is getting dimmer and dimmer. As I progress, I see less and lesser trees and less and lesser dead bugs… I notice that the temperature has lowered slightly, I am not freezing, and it’s just a cold shiver. Later on I am standing on an open flat grass field.";
        sentences[8][5][0]="Go to the left";
        sentences[8][6][0]="Go to the right";
        sentences[8][7][0]="Move forward";

        sentences[8][1][1]="Ort 1";
        sentences[8][2][1]="Ort 2";
        sentences[8][3][1]="Ort 3";
        sentences[8][4][1]="Text 1";
        sentences[8][5][1]="Auswahl 1";
        sentences[8][6][1]="Auswahl 2";
        sentences[8][7][1]="Auswahl 3";

        //layer 1-3bc
        sentences[9]=new String [8][2];

        sentences[9][0][0]="3bc";
        sentences[9][1][0]="4bcb";
        sentences[9][2][0]="4bcc";
        sentences[9][3][0]="4bca";
        sentences[9][4][0]="I continue my way forward. In front of me are branches and eyeballs blocking my way that I have to push aside to get through the forest. I see, in the dims of darkness, piles of dead caterpillars. Just lying on the ground. It would not be strange if it was just a few bug piles. But right here are fourth and more piles of dead bugs. I stand in silence and wonder for a few minutes. And then I continue my walk. Through the forest. Pushing aside branches and eyeball, walking over piles, and progressing deeper and deeper into the forest. Pushing branches away- Two weeks, this is how long it feels like I have been wandering in this forest. Unable to see the days, for darkness doesn’t seem to shift. Not even a moon can be seen. I walk my next hundreds kilometer, but then I see the piles of caterpillars. How? I – I fell unconscious. I was awoken by the tiny blue light in front of me. It’s a small blue glowing flower. It typ is uncertaint, its purpose is unclear, and its looks are unusual.";
        sentences[9][5][0]="Keep it";
        sentences[9][6][0]="Eat it";
        sentences[9][7][0]="Ignore it";

        sentences[9][1][1]="Ort 1";
        sentences[9][2][1]="Ort 2";
        sentences[9][3][1]="Ort 3";
        sentences[9][4][1]="Text 1";
        sentences[9][5][1]="Auswahl 1";
        sentences[9][6][1]="Auswahl 2";
        sentences[9][7][1]="Auswahl 3";
        //layer 1-4bca
        sentences[10]=new String [2][2];

        sentences[10][0][0]="4bca";
        sentences[10][1][0]="3ba";

        sentences[10][1][1]="Ort 1";

        //layer 1-4bcb
        sentences[11]=new String [3][2];

        sentences[11][0][0]="4bcb";
        sentences[11][1][0]="3ba";
        sentences[11][2][0]="I plug it out of the ground and hold it in my hands. Then I have no other thing to do. I continue my march";

        sentences[11][1][1]="Ort 1";
        sentences[11][2][1]="Text 1";

        //layer 1-4bcc
        sentences[12]=new String [3][2];

        sentences[12][0][0]="4bcc";
        sentences[12][1][0]="3ba";
        sentences[12][2][0]="I plug it out of the ground and hold it in my hands. I then put the flower in my mouth and eat it. I am not hungry nor do I need the vitamins, if it has any, from the flower. Yet I ate it and it tastes like nothing. And so I feel. With nothing better do to I continue the way.";

        sentences[12][1][1]="Ort 1";
        sentences[12][2][1]="Text 1";
    }

    /**
     * Aufruf von gespeicherten Daten im dreidimensionalen Array "sentences"
     * je nach der übergegenen Position des Spielers durch den Parameter "position".
     * Dann Rückgabe von den der Position entsprechenden Daten durch das zweidimensionale
     * Array "output"
     * @param position Position des Spielers in der Story
     */


    public String [] [] getSentencesAndChoices(String position){
        boolean found=false;
        int foundAt=0;
        for (int i = 0; i < sentences.length && !found; i++) {
            if(sentences[i][0][0].equals(position)){
                found=true;
                foundAt=i;
            }
        }
        if(found){
            String [][] output=new String [2][sentences[foundAt].length-1];
            for (int i = 1; i < sentences[foundAt].length; i++) {
                for (int j = 0; j < sentences[foundAt][i].length; j++) {
                    output[j][i-1]=sentences[foundAt][i][j];
                }
            }
            return output;
        }else{
            String [][] output={new String []{"Position des Spielers nicht korrekt angegeben!"}};
            return output;
        }

    }
}
