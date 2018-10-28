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
        sentences=new String[19][][];
        // layer 1-1
        sentences[0]=new String [7][2];

        sentences[0][0][0]="1,1";
        sentences[0][1][0]="1,2a";
        sentences[0][2][0]="1,2b";
        sentences[0][3][0]="<html><font size='8'><body>My name is Wright Lecter... Or is it Mason Cain? It has been a while since I can clearly remember my name. Or my age. Or my parents faces. Or even what skin color I have. But that is not as important. I just woke up from another dreamless nightmare.<br>All there is around me is a wide dark gray room, I could probably hear my echo if I screamed, well first I have to remember how to speak. In front of me is a wooden door surrounded by pulsing darkness.<br> It is inviting me to enter, although staying here also feels rather comfortable. What should I do?";
        sentences[0][4][0]="<html><font size='8'><body><br>stay<br>enter</body></font></html>";
        sentences[0][5][0]="stay";
        sentences[0][6][0]="enter";

        sentences[0][1][1]="Ort 1";
        sentences[0][2][1]="Ort 2";
        sentences[0][3][1]="Text 1";
        sentences[0][4][1]="Auswahltext 1";
        sentences[0][5][1]="Auswahl 1";
        sentences[0][6][1]="Auswahl 2";


        // layer 1-2a
        sentences[1]=new String [3][2];

        sentences[1][0][0]="1,2a";
        sentences[1][1][0]="<html><font size='8'><body>God has forbidden me to enter heaven or hell- Might as well stay here, where I feel like I exist.";
        sentences[1][2][0]="Game Over";

        sentences[1][1][1]="Text 1";
        sentences[1][2][1]="Anweisung 1";

        //layer 1-2b
        sentences[2]=new String [9][2];

        sentences[2][0][0]="1,2b";
        sentences[2][1][0]="1,3ba";
        sentences[2][2][0]="1,3bb";
        sentences[2][3][0]="1,3bc";
        sentences[2][4][0]="<html><font size='8'><body>I hold out my hand and grip the door open - It is warm. I go through the door and, by what I can only assume, I have entered a forest at midnight. Pitch dark. My feet prompt me to move forward and so I do. The forest doesn't hold anything special to it.<br> There are large wide trees, various types of bushes, hanging from the trees are orange eyeballs, dead insects and branches are laying everywhere. Nothing unusual.<br> Go to the left, it is safer Go to the right, I know something else is there.</font></body></html>";
        sentences[2][5][0]="<html><body>left<br>right<br>forward</body></html>";
        sentences[2][6][0]="left";
        sentences[2][7][0]="right";
        sentences[2][8][0]="forward";

        sentences[2][1][1]="Ort 1";
        sentences[2][2][1]="Ort 2";
        sentences[2][3][1]="Ort 3";
        sentences[2][4][1]="Text 1";
        sentences[2][5][1]="Auswahltext 1";
        sentences[2][6][1]="Auswahl 1";
        sentences[2][7][1]="Auswahl 2";
        sentences[2][8][1]="Auswahl 3";

        //layer 1-3ba
        sentences[3]=new String [11][2];

        sentences[3][0][0]="1,3ba";
        sentences[3][1][0]="1,4baa";
        sentences[3][2][0]="1,4bab";
        sentences[3][3][0]="1,4bac";
        sentences[3][4][0]="1,3bc";
        sentences[3][5][0]="<html><body>I have lost myself in this forest. I hope I will find something worthwhile left for me. But there is nothing. Just trees and dead bugs everywhere. I just keep going forward. Just dead bugs and branches. It feels like I walked for hours in this direction.<br> Branches and a dead rat. Huh, something new. I get closer to the rat that is on the ground on top of a pile of centipede corpses. It is an ordinary rat. Filthy, hairy, smelly and rotting. At this point there are not many options for me now, right?<br> Please don't. You will get a tummy ache. I dare you to do that! You won't. You are not brave enough.</body></html>";
        sentences[3][6][0]="<html><body>Eat rat<br>Eat centipedes<br>Eat eyeball<br>Go on</body></html>";
        sentences[3][7][0]="Eat rat";
        sentences[3][8][0]="Eat centipedes";
        sentences[3][9][0]="Eat eyeball";
        sentences[3][10][0]="Go on";

        sentences[3][1][1]="Ort 1";
        sentences[3][2][1]="Ort 2";
        sentences[3][3][1]="Ort 3";
        sentences[3][4][1]="Ort 4";
        sentences[3][5][1]="Text 1";
        sentences[3][6][1]="Auswahltext 1";
        sentences[3][7][1]="Auswahl 1";
        sentences[3][8][1]="Auswahl 2";
        sentences[3][9][1]="Auswahl 3";
        sentences[3][10][1]="Auswahl 4";

        //layer 1-4baa
        sentences[4]=new String [7][2];

        sentences[4][0][0]="1,4baa";
        sentences[4][1][0]="1,5baaa";
        sentences[4][2][0]="1,5baaa";
        sentences[4][3][0]="I eat the dead decaying rat.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now. I continue my walk and head further into the forest. Before I start to regret to have eaten a dead decaying rat I see a dime light from afar. – It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Its presences is… strangely welcoming. It not human, nor anything I have ever seen, that I know for a certainty. Nevertheless, I want to get closer and closer to it. Hugging it. Like a moth drawn to light.";
        sentences[4][4][0]="<html><body>Go deeper<br>Return</body></html>";
        sentences[4][5][0]="Go deeper";
        sentences[4][6][0]="Return";

        sentences[4][1][1]="Ort 1";
        sentences[4][2][1]="Ort 2";
        sentences[4][3][1]="Text 1";
        sentences[4][4][1]="Auswahltext 1";
        sentences[4][5][1]="Auswahl 1";
        sentences[4][6][1]="Auswahl 2";

        //layer 1-4bab
        sentences[5]=new String [7][2];

        sentences[5][0][0]="1,4bab";
        sentences[5][1][0]="1,5baaa";
        sentences[5][2][0]="1,5baaa";
        sentences[5][3][0]="<html><body> I eat part of the pile of caterpillars that the dead rat was laying on.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now.</body></html>";
        sentences[5][4][0]="<html><body>Go deeper<br>Return</body></html>";
        sentences[5][5][0]="Go deeper";
        sentences[5][6][0]="Return";

        sentences[5][1][1]="Ort 1";
        sentences[5][2][1]="Ort 2";
        sentences[5][3][1]="Text 1";
        sentences[5][4][1]="Auswahltext 1";
        sentences[5][5][1]="Auswahl 1";
        sentences[5][6][1]="Auswahl 2";

        //layer 1-4bac
        sentences[6]=new String [7][2];

        sentences[6][0][0]="1,4bac";
        sentences[6][1][0]="1,5baaa";
        sentences[6][2][0]="1,5baaa";
        sentences[6][3][0]="<html><body>I pick down an orange eyeball from a tree nearby. On closer exception they are more yellow than orange.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now.</body></html>";
        sentences[6][4][0]="<html><body>Go deeper<br>Return</body></html>";
        sentences[6][5][0]="Go deeper";
        sentences[6][6][0]="Return";

        sentences[6][1][1]="Ort 1";
        sentences[6][2][1]="Ort 2";
        sentences[6][3][1]="Text 1";
        sentences[6][4][1]="Auswahltext 1";
        sentences[6][5][1]="Auswahl 1";
        sentences[6][6][1]="Auswahl 2";

        //layer 1-5baaa
        sentences[7]=new String [7][2];

        sentences[7][0][0]="1,5baaa";
        sentences[7][1][0]="1,4bba";
        sentences[7][2][0]="1,4bbb";
        sentences[7][3][0]="<html><body>I continue my walk and clear my way through the timber. Before I start to regret to have eaten I see a dime light from afar.It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness.<br> It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Therefore fear overcomes my mind and I start to run, farther and farther away .<br> Until I calm down a bit , but still I do not know what I should do now. Should I stay or should I run further into the woods.</body></html>";
        sentences[7][4][0]="<html><body>Stay<br>Run</body></html>";
        sentences[7][5][0]="Stay";
        sentences[7][6][0]="Run";

        sentences[7][1][1]="Ort 1";
        sentences[7][2][1]="Ort 2";
        sentences[7][3][1]="Text 1";
        sentences[7][4][1]="Auswahltext 1";
        sentences[7][5][1]="Auswahl 1";
        sentences[7][6][1]="Auswahl 2";

        //layer 1-3bb
        sentences[8]=new String [7][2];

        sentences[8][0][0]="1,3bb";
        sentences[8][1][0]="1,4bba";
        sentences[8][2][0]="1,4bbb";
        sentences[8][3][0]="<html><body>I feel uneasy. The forest is getting dimmer and dimmer. As I progress, I see less and lesser trees and less and lesser dead bugs.I notice that the temperature has lowered slightly, I am not freezing, and it is just a cold shiver.<br> Later on I am standing on an open flat grass field. I see a dime light from afar.It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes.<br> Otherwise it is wearing a white and black cloak.Therefore fear overcomes my mind and I start to run, farther and farther away . Until I calm down a bit , but still I do not know what I should do now.<br>Should I stay or should I run further into the woods.</body></html>";
        sentences[8][4][0]="<html><body>Stay<br>Run</body></html>";
        sentences[8][5][0]="Stay";
        sentences[8][6][0]="Run";

        sentences[8][1][1]="Ort 1";
        sentences[8][2][1]="Ort 2";
        sentences[8][3][1]="Text 1";
        sentences[8][4][1]="Auswahltext 1";
        sentences[8][5][1]="Auswahl 1";
        sentences[8][6][1]="Auswahl 2";

        //layer 1-4bba
        sentences[9]=new String [3][2];
        sentences[9][0][0]="1,4bba";
        sentences[9][1][0]="<html><body>After realizing that I can not escape my fate , I stop my pointless act and turn around. But the monster is not there anymore , there just stays a little girl with black hair and pale skin, who seems familiar to me.<br> She points at me , I think she wants me to follow her . Thus leads to the question what I should do now . Should I trust her or should I despair all alone in this dark and immane forest.<br> I decide to follow her and suddenly as I arrived at her latest location she vanishes. Being afraid of being alone again I started panicking and ran aimlessly around screaming for her until I fall into the abyss.<br> Initially it seems like that I was falling endlessly. But luckily just after a short while I arrive at the end , it is dark. I can not see anymore , even my own hands. I merely hear footsteps coming closer. I feel the girl approaching me.</body></html>";
        sentences[9][2][0]="Next Layer";

        sentences[9][1][1]="Text 1";
        sentences[9][2][1]="Anweisung 1";

        //layer 1-4bbb
        sentences[10]=new String [3][2];
        sentences[10][0][0]="1,4bbb";
        sentences[10][1][0]="<html><body>As I sprint farther in the direction of the timber I recognize being here before. Abruptly I stop spurting and turn around. Then I notice that the monster is not there anymore , there just stays a little girl with black hair and pale skin, who seems familiar to me.<br> She points at me , I think she wants me to follow her . Thus leads to the question what I should do now . Should I trust her or should I despair all alone in this dark and immane forest.<br> I decide to follow her and suddenly as I arrived at her latest location she vanishes.Being afraid of being alone again I started panicking and ran aimlessly around screaming for her until I fall into the abyss.<br> Initially it seems like that I was falling endlessly.But luckily just after a short while I arrive at the end , it is dark. I can not see anymore , even my own hands.<br> I merely hear footsteps coming closer. I feel the girl approaching me.</body></html> ";
        sentences[10][2][0]="Next Layer";

        sentences[10][1][1]="Text 1";
        sentences[10][2][1]="Anweisung 1";

        //layer 1-3bc
        sentences[11]=new String [9][2];

        sentences[11][0][0]="1,3bc";
        sentences[11][1][0]="1,4bca";
        sentences[11][2][0]="1,4bcb";
        sentences[11][3][0]="1,3ba";
        sentences[11][4][0]="<html><body>I continue my way forward. In front of me are branches and eyeballs blocking my way that I have to push aside to get through the forest. I see, in the dims of darkness, piles of dead caterpillars. Just lying on the ground.<br> It would not be strange if it was just a few bug piles. But right here are fourth and more piles of dead bugs. I stand in silence and wonder for a few minutes. And then I continue my walk. Through the forest.<br> Pushing aside branches and eyeball, walking over piles, and progressing deeper and deeper into the forest. Pushing branches away- Two weeks, this is how long it feels like I have been wandering in this forest. <br>Unable to see the days, for darkness doesn't seem to shift. Not even a moon can be seen. I walk my next hundreds kilometer, but then I see the piles of caterpillars. How? I fell unconscious. I was awoken by the tiny blue light in front of me. <br>It is a small blue glowing flower. It typ is uncertain, its purpose is unclear, and its looks unusual.</body></html> ";
        sentences[11][5][0]="<html><body>Keep<br>Eat<br>Ignore</body></html>";
        sentences[11][6][0]="Keep";
        sentences[11][7][0]="Eat";
        sentences[11][8][0]="Ignore";

        sentences[11][1][1]="Ort 1";
        sentences[11][2][1]="Ort 2";
        sentences[11][3][1]="Ort 3";
        sentences[11][4][1]="Text 1";
        sentences[11][5][1]="Auswahltext 1";
        sentences[11][6][1]="Auswahl 1";
        sentences[11][7][1]="Auswahl 2";
        sentences[11][8][1]="Auswahl 3";

        //layer 1-4bca
        sentences[12]=new String [3][2];

        sentences[12][0][0]="1,4bca";
        sentences[12][1][0]="1,3ba";
        sentences[12][2][0]="<html><body>I plug it out of the ground and hold it in my hands. Then I have no other thing to do. I continue my march</body></html>";

        sentences[12][1][1]="Ort 1";
        sentences[12][2][1]="Text 1";

        //layer 1-4bcb
        sentences[13]=new String [3][2];

        sentences[13][0][0]="1,4bcb";
        sentences[13][1][0]="1,3ba";
        sentences[13][2][0]="<html><body>I plug it out of the ground and hold it in my hands. I then put the flower in my mouth and eat it. I am not hungry nor do I need the vitamins, if it has any, from the flower. Yet I ate it and it tastes like nothing. And so I feel. With nothing better do to I continue the way.</body></html>";

        sentences[13][1][1]="Ort 1";
        sentences[13][2][1]="Text 1";

        //layer 2-1
        sentences[14]=new String [7][2];

        sentences[14][0][0]="2,1";
        sentences[14][1][0]="2,2a";
        sentences[14][2][0]="2,2b";
        sentences[14][3][0]="<html><body>As I finally arrived , the footsteps changed, they turned into a screechy echoing tone. I thought that it would sound like of some monster with long , sharp nails , which scratched over the floor with its gigantic claws. Suddenly I start hearing a deep growling voice <br> that came from the direction of the echo. While the noise moved step for step closer I froze to death but as the sound and the heavy breathing appeared I decided to ...</body></html>";
        sentences[14][4][0]="<html><body>Stay<br>Run</body></html>";
        sentences[14][5][0]="Stay";
        sentences[14][6][0]="Run";

        sentences[14][1][1]="Ort 1";
        sentences[14][2][1]="Ort 2";
        sentences[14][3][1]="Text 1";
        sentences[14][4][1]="Auswahltext 1";
        sentences[14][5][1]="Auswahl 1";
        sentences[14][6][1]="Auswahl 2";

        //layer 2-2a
        sentences[15]=new String [3][2];

        sentences[15][0][0]="2,2a";
        sentences[15][1][0]="<html><body>I decided to stay but after a short time I started panicking and hysterically attacked the monster . After many attempts of failing in trying to damage it , it attacked me and slashed open my neck. Now I am slowly fading into darkness";
        sentences[15][2][0]="Game Over";

        sentences[15][1][1]="Text 1";
        sentences[15][2][1]="Anweisung 1";

        //layer 2-2b
        sentences[16]=new String [7][2];

        sentences[16][0][0]="2,2b";
        sentences[16][1][0]="2,3ba";
        sentences[16][2][0]="2,3bb";
        sentences[16][3][0]="<html><body>Immediately I started running ascending further into the darkness until the dark slowly vanishes and a room with a lot of corpses appeared in front of me, they are hanging from the ceiling and piled up so they'd make a fine piece of garbage.<br> Even though I am now in a lighted room it still is unknown whether I will survive this or not.<br>Should I hide in the closet or in the pile of corpses</body></html>";
        sentences[16][4][0]="<html><body>Hide in corpses<br>Hide in closet</body></html>";
        sentences[16][5][0]="Hide in corpses";
        sentences[16][6][0]="Hide in closet";

        sentences[16][1][1]="Ort 1";
        sentences[16][2][1]="Ort 2";
        sentences[16][3][1]="Text 1";
        sentences[16][4][1]="Auswahltext 1";
        sentences[16][5][1]="Auswahl 1";
        sentences[16][6][1]="Auswahl 2";

        //layer 2-3ba
        sentences[17]=new String [3][2];

        sentences[17][0][0]="2,3ba";
        sentences[17][1][0]="<html><body>The Creature shows up and it seems like it is searching for me and after it checked the closet it comes closer to the pile of corpses , to me. Suddenly it rises his great claws and abruptly stabs the corpses and nearly hits me. After that it begins to <br> rapidly stab further into the pile and directly hits me. I started coughing blood as it claws pierced through my stomach, then it stops. It pulls me out of the corpses<br> and embraces me until my eyes slightly close bit by bit until im finally redeemed.</body></html>";
        sentences[17][2][0]="Game Over";

        sentences[17][1][1]="Text 1";
        sentences[17][2][1]="Anweisung 1";

        //layer 2-3bb
        sentences[18]=new String [3][2];

        sentences[18][0][0]="2,3bb";
        sentences[18][1][0]="<html><body> I decided to hide in the closet after a while the beast shows up . It seems like it wants to check the closet and grabs in between the polls of the closet. Scared to death I chose to jump out of it and try to find something <br> to defense myself. Realizing that an axe was laying in the corner I sprinted and grabbed it. After I chopped her into pieces her blood came splashing out.Suddenly My vision began to distort<br> , my view slowly faded to black and then as it all became clear , I saw a women with blond hair . At the location where the monstrosity layed. In total shock I tried to bring my senses back together but utterly failed. However a little hand pushed me from behind and suddenly I fall again into the dark abyss...</body></html>";
        sentences[18][2][0]="Next Layer";

        sentences[18][1][1]="Text 1";
        sentences[18][2][1]="Anweisung 1";
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

