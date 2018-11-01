package model;
public class Story {

    // Ebene , Inhalt , Inhaltstyp
    private String sentences[][][] ;
    private int maxOrte;
    private int maxTexte;
    private int maxMoeglichkeitentexte;
    private int maxAuswahlmoeglichkeiten;
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
        sentences=new String[30][][];
        maxOrte=4;
        maxTexte=1;
        maxMoeglichkeitentexte=1;
        maxAuswahlmoeglichkeiten=4;
        // layer 1-1
        sentences[0]=new String [7][2];

        sentences[0][0][0]="1,1";
        sentences[0][1][0]="1,2a";
        sentences[0][2][0]="1,2b";
        sentences[0][3][0]="<html><font size='8'><body>My name is Wright Lecter... Or is it Mason Cain? It has been a while since I can clearly remember my name. Or my age. Or my parents faces. Or even what skin color I have. But that is not as important. I just woke up from another dreamless nightmare.<br>All there is around me is a wide dark gray room, I could probably hear my echo if I screamed, well first I have to remember how to speak. In front of me is a wooden door surrounded by pulsing darkness.<br> It is inviting me to enter, although staying here also feels rather comfortable. What should I do?";
        sentences[0][4][0]="<html><font size='8'><body><br>- Stay<br>- Enter</body></font></html>";
        sentences[0][5][0]="Stay";
        sentences[0][6][0]="Enter";

        sentences[0][1][1]="Ort 1";
        sentences[0][2][1]="Ort 2";
        sentences[0][3][1]="Text 1";
        sentences[0][4][1]="Möglichkeitentext 1";
        sentences[0][5][1]="Auswahl 1";
        sentences[0][6][1]="Auswahl 2";


        // layer 1-2a
        sentences[1]=new String [2][2];

        sentences[1][0][0]="1,2a";
        sentences[1][1][0]="<html><font size='8'><body>God has forbidden me to enter heaven or hell- Might as well stay here, where I feel like I exist.<br>GAME OVER";


        sentences[1][1][1]="Text 1";


        //layer 1-2b
        sentences[2]=new String [9][2];

        sentences[2][0][0]="1,2b";
        sentences[2][1][0]="1,3ba";
        sentences[2][2][0]="1,3bb";
        sentences[2][3][0]="1,3bc";
        sentences[2][4][0]="<html><font size='8'><body>I hold out my hand and grip the door open - It is warm. I go through the door and, by what I can only assume, I have entered a forest at midnight. Pitch dark. My feet prompt me to move forward and so I do. The forest doesn't hold anything special to it.<br> There are large wide trees, various types of bushes, hanging from the trees are orange eyeballs, dead insects and branches are laying everywhere. Nothing unusual.<br> Go to the left, it is safer Go to the right, I know something else is there.</font></body></html>";
        sentences[2][5][0]="<html><body><font size='8'>- Left<br>- Right<br>- Forward</body></html>";
        sentences[2][6][0]="Left";
        sentences[2][7][0]="Right";
        sentences[2][8][0]="Forward";

        sentences[2][1][1]="Ort 1";
        sentences[2][2][1]="Ort 2";
        sentences[2][3][1]="Ort 3";
        sentences[2][4][1]="Text 1";
        sentences[2][5][1]="Möglichkeitentext 1";
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
        sentences[3][5][0]="<html><body><font size='8'>I have lost myself in this forest. I hope I will find something worthwhile left for me. But there is nothing. Just trees and dead bugs everywhere. I just keep going forward. Just dead bugs and branches. It feels like I walked for hours in this direction.<br> Branches and a dead rat. Huh, something new. I get closer to the rat that is on the ground on top of a pile of centipede corpses. It is an ordinary rat. Filthy, hairy, smelly and rotting. At this point there are not many options for me now, right?<br> Please don't. You will get a tummy ache. I dare you to do that! You won't. You are not brave enough.</body></html>";
        sentences[3][6][0]="<html><body><font size='8'>- Eat rat<br>- Eat centipedes<br>- Eat eyeball<br>- Go on</body></html>";
        sentences[3][7][0]="Eat rat";
        sentences[3][8][0]="Eat centipedes";
        sentences[3][9][0]="Eat eyeball";
        sentences[3][10][0]="Go on";

        sentences[3][1][1]="Ort 1";
        sentences[3][2][1]="Ort 2";
        sentences[3][3][1]="Ort 3";
        sentences[3][4][1]="Ort 4";
        sentences[3][5][1]="Text 1";
        sentences[3][6][1]="Möglichkeitentext 1";
        sentences[3][7][1]="Auswahl 1";
        sentences[3][8][1]="Auswahl 2";
        sentences[3][9][1]="Auswahl 3";
        sentences[3][10][1]="Auswahl 4";

        //layer 1-4baa
        sentences[4]=new String [7][2];

        sentences[4][0][0]="1,4baa";
        sentences[4][1][0]="1,5baaa";
        sentences[4][2][0]="1,5baaa";
        sentences[4][3][0]="<html><body><font size='8'>I eat the dead decaying rat.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now. I continue my walk and head further into the forest. <br> Before I start to regret to have eaten a dead decaying rat I see a dime light from afar. – It is a towering humanoid being. <br> Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Its presences is… strangely welcoming. <br> It not human, nor anything I have ever seen, that I know for a certainty. Nevertheless, I want to get closer and closer to it. Hugging it. Like a moth drawn to light.</body></html>";
        sentences[4][4][0]="<html><body><font size='8'>- Go deeper<br>- Return</body></html>";
        sentences[4][5][0]="Go deeper";
        sentences[4][6][0]="Return";

        sentences[4][1][1]="Ort 1";
        sentences[4][2][1]="Ort 2";
        sentences[4][3][1]="Text 1";
        sentences[4][4][1]="Möglichkeitentext 1";
        sentences[4][5][1]="Auswahl 1";
        sentences[4][6][1]="Auswahl 2";

        //layer 1-4bab
        sentences[5]=new String [7][2];

        sentences[5][0][0]="1,4bab";
        sentences[5][1][0]="1,5baaa";
        sentences[5][2][0]="1,5baaa";
        sentences[5][3][0]="<html><body><font size='8'>I eat part of the pile of caterpillars that the dead rat was laying on.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now.</body></html>";
        sentences[5][4][0]="<html><body><font size='8'>- Go deeper<br>- Return</body></html>";
        sentences[5][5][0]="Go deeper";
        sentences[5][6][0]="Return";

        sentences[5][1][1]="Ort 1";
        sentences[5][2][1]="Ort 2";
        sentences[5][3][1]="Text 1";
        sentences[5][4][1]="Möglichkeitentext 1";
        sentences[5][5][1]="Auswahl 1";
        sentences[5][6][1]="Auswahl 2";

        //layer 1-4bac
        sentences[6]=new String [7][2];

        sentences[6][0][0]="1,4bac";
        sentences[6][1][0]="1,5baaa";
        sentences[6][2][0]="1,5baaa";
        sentences[6][3][0]="<html><body><font size='8'>I pick down an orange eyeball from a tree nearby. On closer exception they are more yellow than orange.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now.</body></html>";
        sentences[6][4][0]="<html><body><font size='8'>- Go deeper<br>- Return</body></html>";
        sentences[6][5][0]="Go deeper";
        sentences[6][6][0]="Return";

        sentences[6][1][1]="Ort 1";
        sentences[6][2][1]="Ort 2";
        sentences[6][3][1]="Text 1";
        sentences[6][4][1]="Möglichkeitentext 1";
        sentences[6][5][1]="Auswahl 1";
        sentences[6][6][1]="Auswahl 2";

        //layer 1-5baaa
        sentences[7]=new String [7][2];

        sentences[7][0][0]="1,5baaa";
        sentences[7][1][0]="1,4bba";
        sentences[7][2][0]="1,4bbb";
        sentences[7][3][0]="<html><body><font size='8'>I continue my walk and clear my way through the timber. Before I start to regret to have eaten I see a dime light from afar.It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness.<br> It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Therefore fear overcomes my mind and I start to run, farther and farther away .<br> Until I calm down a bit , but still I do not know what I should do now. Should I stay or should I run further into the woods.</body></html>";
        sentences[7][4][0]="<html><body><font size='8'>- Stay<br>- Run</body></html>";
        sentences[7][5][0]="Stay";
        sentences[7][6][0]="Run";

        sentences[7][1][1]="Ort 1";
        sentences[7][2][1]="Ort 2";
        sentences[7][3][1]="Text 1";
        sentences[7][4][1]="Möglichkeitentext 1";
        sentences[7][5][1]="Auswahl 1";
        sentences[7][6][1]="Auswahl 2";

        //layer 1-3bb
        sentences[8]=new String [7][2];

        sentences[8][0][0]="1,3bb";
        sentences[8][1][0]="1,4bba";
        sentences[8][2][0]="1,4bbb";
        sentences[8][3][0]="<html><body><font size='8'>I feel uneasy. The forest is getting dimmer and dimmer. As I progress, I see less and lesser trees and less and lesser dead bugs.I notice that the temperature has lowered slightly, I am not freezing, and it is just a cold shiver.<br> Later on I am standing on an open flat grass field. I see a dime light from afar.It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes.<br> Otherwise it is wearing a white and black cloak.Therefore fear overcomes my mind and I start to run, farther and farther away . Until I calm down a bit , but still I do not know what I should do now.<br>Should I stay or should I run further into the woods.</body></html>";
        sentences[8][4][0]="<html><body><font size='8'>- Stay<br>- Run</body></html>";
        sentences[8][5][0]="Stay";
        sentences[8][6][0]="Run";

        sentences[8][1][1]="Ort 1";
        sentences[8][2][1]="Ort 2";
        sentences[8][3][1]="Text 1";
        sentences[8][4][1]="Möglichkeitentext 1";
        sentences[8][5][1]="Auswahl 1";
        sentences[8][6][1]="Auswahl 2";

        //layer 1-4bba
        sentences[9]=new String [5][2];
        sentences[9][0][0]="1,4bba";
        sentences[9][1][0]="2,1";
        sentences[9][2][0]="<html><body><font size='8'>After realizing that I can not escape my fate , I stop my pointless act and turn around. But the monster is not there anymore , there just stays a little girl with black hair and pale skin, who seems familiar to me.<br> She points at me , I think she wants me to follow her . Thus leads to the question what I should do now . Should I trust her or should I despair all alone in this dark and immane forest.<br> I decide to follow her and suddenly as I arrived at her latest location she vanishes. Being afraid of being alone again I started panicking and ran aimlessly around screaming for her until I fall into the abyss...</body></html>";
        sentences[9][3][0]="<html><body><font size='8'>Press Enter</body></html>";
        sentences[9][4][0]="";


        sentences[9][1][1]="Ort 1";
        sentences[9][2][1]="Text 1";
        sentences[9][3][1]="Möglichkeitentext 1";
        sentences[9][4][1]="Auswahl 1";

        //layer 1-4bbb
        sentences[10]=new String [5][2];
        sentences[10][0][0]="1,4bbb";
        sentences[10][1][0]="2,1";
        sentences[10][2][0]="<html><body><font size='8'>As I sprint farther in the direction of the timber I recognize being here before. Abruptly I stop spurting and turn around. Then I notice that the monster is not there anymore , there just stays a little girl with black hair and pale skin, who seems familiar to me.<br> She points at me , I think she wants me to follow her . Thus leads to the question what I should do now . Should I trust her or should I despair all alone in this dark and immane forest.<br> I decide to follow her and suddenly as I arrived at her latest location she vanishes.Being afraid of being alone again I started panicking and ran aimlessly around screaming for her until I fall into the abyss...</body></html> ";
        sentences[10][3][0]="<html><body><font size='8'>Press Enter</body></html>";
        sentences[10][4][0]="";


        sentences[10][1][1]="Ort 1";
        sentences[10][2][1]="Text 1";
        sentences[10][3][1]="Möglichkeitentext 1";
        sentences[10][4][1]="Auswahl 1";

        //layer 1-3bc
        sentences[11]=new String [9][2];

        sentences[11][0][0]="1,3bc";
        sentences[11][1][0]="1,4bca";
        sentences[11][2][0]="1,4bcb";
        sentences[11][3][0]="1,3ba";
        sentences[11][4][0]="<html><body><font size='8'>I continue my way forward. In front of me are branches and eyeballs blocking my way that I have to push aside to get through the forest. I see, in the dims of darkness, piles of dead caterpillars. Just lying on the ground.<br> It would not be strange if it was just a few bug piles. But right here are fourth and more piles of dead bugs. I stand in silence and wonder for a few minutes. And then I continue my walk. Through the forest.<br> Pushing aside branches and eyeball, walking over piles, and progressing deeper and deeper into the forest. Pushing branches away- Two weeks, this is how long it feels like I have been wandering in this forest. <br>Unable to see the days, for darkness doesn't seem to shift. Not even a moon can be seen. I walk my next hundreds kilometer, but then I see the piles of caterpillars. How? I fell unconscious. I was awoken by the tiny blue light in front of me. <br>It is a small blue glowing flower. It typ is uncertain, its purpose is unclear, and its looks unusual.</body></html> ";
        sentences[11][5][0]="<html><body><font size='8'>- Keep<br>- Eat<br>- Ignore</body></html>";
        sentences[11][6][0]="Keep";
        sentences[11][7][0]="Eat";
        sentences[11][8][0]="Ignore";

        sentences[11][1][1]="Ort 1";
        sentences[11][2][1]="Ort 2";
        sentences[11][3][1]="Ort 3";
        sentences[11][4][1]="Text 1";
        sentences[11][5][1]="Möglichkeitentext 1";
        sentences[11][6][1]="Auswahl 1";
        sentences[11][7][1]="Auswahl 2";
        sentences[11][8][1]="Auswahl 3";

        //layer 1-4bca
        sentences[12]=new String [5][2];

        sentences[12][0][0]="1,4bca";
        sentences[12][1][0]="1,3ba";
        sentences[12][2][0]="<html><body><font size='8'>I plug it out of the ground and hold it in my hands. Then I have no other thing to do. I continue my march</body></html>";
        sentences[12][3][0]="<html><body><font size='8'>Press Enter</body></html>";
        sentences[12][4][0]="";

        sentences[12][1][1]="Ort 1";
        sentences[12][2][1]="Text 1";
        sentences[12][3][1]="Möglichkeitentext 1";
        sentences[12][4][1]="Auswahl 1";

        //layer 1-4bcb
        sentences[13]=new String [5][2];

        sentences[13][0][0]="1,4bcb";
        sentences[13][1][0]="1,3ba";
        sentences[13][2][0]="<html><body><font size='8'>I plug it out of the ground and hold it in my hands. I then put the flower in my mouth and eat it. I am not hungry nor do I need the vitamins, if it has any, from the flower. Yet I ate it and it tastes like nothing. And so I feel. With nothing better do to I continue the way.</body></html>";
        sentences[13][3][0]="<html><body><font size='8'>Press Enter</body></html>";
        sentences[13][4][0]="";

        sentences[13][1][1]="Ort 1";
        sentences[13][2][1]="Text 1";
        sentences[13][3][1]="Möglichkeitentext 1";
        sentences[13][4][1]="Auswahl 1";

        //layer 2-1
        sentences[14]=new String [7][2];

        sentences[14][0][0]="2,1";
        sentences[14][1][0]="2,2a";
        sentences[14][2][0]="2,2b";
        sentences[14][3][0]="<html><body><font size='8'>Initially it seemed like that I was falling endlessly.But luckily just after a short while I arrive at the end , it is dark. I can not see anymore ,not even my own hands.<br> I merely hear footsteps coming closer. I feel the girl approaching me.The footsteps changed, they turned into a screechy echoing tone. I thought that it would sound like of some monster with long , sharp nails , which scratched over the floor with its gigantic claws. Suddenly I start hearing a deep growling voice <br> that came from the direction of the echo. While the noise moved step for step closer I froze to death but as the sound and the heavy breathing appeared I decided to ...</body></html>";
        sentences[14][4][0]="<html><body><font size='8'>- Stay<br>- Run</body></html>";
        sentences[14][5][0]="Stay";
        sentences[14][6][0]="Run";

        sentences[14][1][1]="Ort 1";
        sentences[14][2][1]="Ort 2";
        sentences[14][3][1]="Text 1";
        sentences[14][4][1]="Möglichkeitentext 1";
        sentences[14][5][1]="Auswahl 1";
        sentences[14][6][1]="Auswahl 2";

        //layer 2-2a
        sentences[15]=new String [2][2];

        sentences[15][0][0]="2,2a";
        sentences[15][1][0]="<html><body><font size='8'>I decided to stay but after a short time I started panicking and hysterically attacked the monster . After many attempts of failing in trying to damage it , it attacked me and slashed open my neck. Now I am slowly fading into darkness<br>GAME OVER";

        sentences[15][1][1]="Text 1";


        //layer 2-2b
        sentences[16]=new String [7][2];

        sentences[16][0][0]="2,2b";
        sentences[16][1][0]="2,3ba";
        sentences[16][2][0]="2,3bb";
        sentences[16][3][0]="<html><body><font size='8'>Immediately I started running ascending further into the darkness until the dark slowly vanishes and a room with a lot of corpses appeared in front of me, they are hanging from the ceiling and piled up so they'd make a fine piece of garbage.<br> Even though I am now in a lighted room it still is unknown whether I will survive this or not.<br>Should I hide in the pile of corpses or in the closet</body></html>";
        sentences[16][4][0]="<html><body><font size='8'>- Hide in corpses<br>- Hide in closet</body></html>";
        sentences[16][5][0]="Hide in corpses";
        sentences[16][6][0]="Hide in closet";

        sentences[16][1][1]="Ort 1";
        sentences[16][2][1]="Ort 2";
        sentences[16][3][1]="Text 1";
        sentences[16][4][1]="Möglichkeitentext 1";
        sentences[16][5][1]="Auswahl 1";
        sentences[16][6][1]="Auswahl 2";

        //layer 2-3ba
        sentences[17]=new String [2][2];

        sentences[17][0][0]="2,3ba";
        sentences[17][1][0]="<html><body><font size='8'>The Creature shows up and it seems like it is searching for me and after it checked the closet it comes closer to the pile of corpses , to me. Suddenly it rises his great claws and abruptly stabs the corpses and nearly hits me. After that it begins to <br> rapidly stab further into the pile and directly hits me. I started coughing blood as it claws pierced through my stomach, then it stops. It pulls me out of the corpses<br> and embraces me until my eyes slightly close bit by bit until im finally redeemed.<br> GAME OVER </body></html>";

        sentences[17][1][1]="Text 1";


        //layer 2-3bb
        sentences[18]=new String [5][2];

        sentences[18][0][0]="2,3bb";
        sentences[18][1][0]="3,1";
        sentences[18][2][0]="<html><body><font size='8'>I decided to hide in the closet after a while the beast shows up . It seems like it wants to check the closet and grabs in between the polls of the closet. Scared to death I chose to jump out of it and try to find something <br> to defense myself. Realizing that an axe was laying in the corner I sprinted and grabbed it. After I chopped her into pieces her blood came splashing out.Suddenly My vision began to distort<br> , my view slowly faded to black and then as it all became clear , I saw a women with blond hair . At the location where the monstrosity layed. In total shock I tried to bring my senses back together but utterly failed. However a little hand pushed me from behind and suddenly I fall again into the dark abyss...</body></html>";
        sentences[18][3][0]="<html><body><font size='8'>Press Enter</body></html>";
        sentences[18][4][0]="";


        sentences[18][1][1]="Ort 1";
        sentences[18][2][1]="Text 1";
        sentences[18][3][1]="Möglichkeitentext 1";
        sentences[18][4][1]="Auswahl 1";

        //layer 3-1
        sentences[19]=new String [7][2];

        sentences[19][0][0]="3,1";
        sentences[19][1][0]="3,2a";
        sentences[19][2][0]="3,2b";
        sentences[19][3][0]="<html><body><font size='8'>I do not quite understand what is happening and why it is . But it feels like a terrible endless nightmare that just continues until I will lose my mind.\n" +
                "Still being confused , I move forward and arrive at a corridor of many various pictures . It seems like family pictures , a family that seems relatively familiar . But I do not\n" +
                "remember where I have seen them . A young Boy with brown hair and an older man with black hair who appears to be his father . A little girl who seems younger than the boy and an older\n" +
                "women with blond hair... Wait , isn't that the one , who was laying on the floor , covered in blood. I , I did not kill her , the thing I killed was the monster and I .... I just\n" +
                "freed her from this thing. Yea ... It can not be that I would have killed her.\n" +
                "*Mason started to laugh hysterically\n" +
                "No way , would I kill someone and especially not a women , a mother of two children. What am I even talking about , isn't it just another nightmare of mine?\n" +
                "\n" +
                "I should definitely stop looking at these pictures and continue my way.</body></html>";
        sentences[19][4][0]="<html><body><font size='8'>- Go ahead<br>- Look at picture</body></html>";
        sentences[19][5][0]="Go ahead";
        sentences[19][6][0]="Look at picture";

        sentences[19][1][1]="Ort 1";
        sentences[19][2][1]="Ort 2";
        sentences[19][3][1]="Text 1";
        sentences[19][4][1]="Möglichkeitentext 1";
        sentences[19][5][1]="Auswahl 1";
        sentences[19][6][1]="Auswahl 2";

        //layer 3-2a
        sentences[20]=new String [7][2];

        sentences[20][0][0]="3,2a";
        sentences[20][1][0]="3,3aa";
        sentences[20][2][0]="3,3ab";
        sentences[20][3][0]="<html><body><font size='8'>As I go further through the corridor and bypass every picture , a strong urge to look at them overcomes me. Even though I try my hardest to avoid them , it does not matter .                                   \n" +
                "After walking trough the corridor , which looks like it is endless. I give in and glance a second time. \n" +
                "Am I blind ?! How could I miss such an important detail , this child is the girl I have seen in the forest before.\n" +
                "*Mason hears a soft voice and turns around\n" +
                ">Who are you and what are you doing here?< Questions I wanted to ask at the first time I have seen her >You don't remember me?<\n" +
                ">Why should I remember you , I have never met you. Who are these people on the pictures , where is your family? I am trying to get closer to her but as I take a step further she takes one in the opposite way\n" +
                ">My family is right here , right in front of me , I don't have anyone else and never will.< And again , she vanishes suddenly >Hey , don't you dare to disappear now!<\n" +
                "But she did and left me alone thinking\n" +
                "I think I should continue my journey and try to get out of this hell.</body></html>";
        sentences[20][4][0]="<html><body><font size='8'>- Think<br>- Continue</body></html>";
        sentences[20][5][0]="Think";
        sentences[20][6][0]="Continue";

        sentences[20][1][1]="Ort 1";
        sentences[20][2][1]="Ort 2";
        sentences[20][3][1]="Text 1";
        sentences[20][4][1]="Möglichkeitentext 1";
        sentences[20][5][1]="Auswahl 1";
        sentences[20][6][1]="Auswahl 2";

        //layer 3-3aa
        sentences[21]=new String [7][2];

        sentences[21][0][0]="3,3aa";
        sentences[21][1][0]="3,4aaa";
        sentences[21][2][0]="3,4aab";
        sentences[21][3][0]="<html><body><font size='8'>What did she mean . I don't understand it  like I have never seen her before beside that one time in the forest . She should not even be here , I am definitely having a nightmare \n" +
                "again. I....  But I don't remember anything , and it does not feel like dreaming , it feels some kind of equal but still not the same. When did I even fall asleep , I can't remember.\n" +
                "The same as I can't remember my name , nor my family , nor why I am even here. Even though I don't know anything about myself it can't be that she is a part of my family. It just can't be\n" +
                "But what if it is true , I just don't want this anymore .Can somebody please help me , I just want to know what his happening. I don't want to go further and I don't want to think .\n" +
                "I don't know what I should do anymore...</body></html>";
        sentences[21][4][0]="<html><body><font size='8'>- Return<br>- Rest</body></html>";
        sentences[21][5][0]="Return";
        sentences[21][6][0]="Rest";

        sentences[21][1][1]="Ort 1";
        sentences[21][2][1]="Ort 2";
        sentences[21][3][1]="Text 1";
        sentences[21][4][1]="Möglichkeitentext 1";
        sentences[21][5][1]="Auswahl 1";
        sentences[21][6][1]="Auswahl 2";

        //layer 3-4aaa
        sentences[22]=new String [2][2];

        sentences[22][0][0]="3,4aaa";
        sentences[22][1][0]="<html><body><font size='8'>I decide to return to the beginning of the corridor , so I turn around and walk back. The only thing I want now is going home and just walking through this corridor won't bring me back.\n" +
                "After I arrived I tried to climb up the hole where I have fallen down but even though I have tried my best to climb it up again I fail. All my dreams, feelings, memories shatter\n" +
                "until I finally lose all hope in myself. I feel nothing , but why does this hurt so much , I don't understand , I always thought feeling absolutely nothing would be the best\n" +
                "of all the things I have felt. The punches of my father and the thousands of times my mother screamed at me. I thought that it would be better feeling nothing than feeling anything at all.\n" +
                "But I was wrong , so wrong.I just want to die , I don't want this anymore , please just kill me , kill me. Why am I even begging , no one will help me except myself...\n" +
                "*Mason scratches his throat open\n" +
                "I did not know that dying could be that redeeming.<br>THE END</body></html>";

        sentences[22][1][1]="Text 1";

        //layer 3-4aab
        sentences[23]=new String [2][2];

        sentences[23][0][0]="3,4aab";
        sentences[23][1][0]="<html><body><font size='8'>I should just take a short break and forget about anything . Forget about the current and hopeless situation , forget about the things that I have done and forget about the girl.\n" +
                "*Mason falls asleep the corridor turns black\n" +
                "Oh , I fell asleep. Weird it is dark now.\n" +
                "*He hears a creepy laugh of a child\n" +
                "What the hell is this?< Don't come near me . Fuck off you cunt. After all this I don't want to get killed by a little girl.> I started running but she was faster , she was not running.\n" +
                "More like dashing , to the forward-left and then to the right, her distorted image hunted me. I won't escape her . <I don't want to die , please don't touch me! > She presses me against\n" +
                "the floor and starts to stab me , again and again until I lose consciousness and finally end up dying .<br>THE END</body></html>";

        sentences[23][1][1]="Text 1";

        //layer 3-3ab
        sentences[24]=new String [7][2];

        sentences[24][0][0]="3,3ab";
        sentences[24][1][0]="3,4aab";
        sentences[24][2][0]="3,4aba";
        sentences[24][3][0]="<html><body><font size='8'>I decide to make my way forward. Even though I try my best, it is unnecessary , I am not achieving any progress . It looks like I don't even move by an inch. The pictures are the same and the corridor too\n" +
                "Here is no more except my despaired self. I just hate this , what did I do to deserve this, like I always tried to help everyone... wait that is not true. I don't know the reason\n" +
                "I just kind of feel it. Why am I even moving forward then I am not even accomplishing anything. \n" +
                "I should rest here and just give up or else I will lose my mind..</body></html>";
        sentences[24][4][0]="<html><body><font size='8'>- Rest<br>- Dont rest</body></html>";
        sentences[24][5][0]="Rest";
        sentences[24][6][0]="Dont rest";

        sentences[24][1][1]="Ort 1";
        sentences[24][2][1]="Ort 2";
        sentences[24][3][1]="Text 1";
        sentences[24][4][1]="Möglichkeitentext 1";
        sentences[24][5][1]="Auswahl 1";
        sentences[24][6][1]="Auswahl 2";

        //layer 3-4aba
        sentences[25]=new String [5][2];

        sentences[25][0][0]="3,4aba";
        sentences[25][1][0]="3,4aab";
        sentences[25][2][0]="<html><body><font size='8'>I decide not to rest . I try to keep moving but my body feels so tired. Suddenly I lost all tension in my bones and fall and lose consciousness.</body></html>";
        sentences[25][3][0]="<html><body><font size='8'>Press Enter</body></html>";
        sentences[25][4][0]="";

        sentences[25][1][1]="Ort 1";
        sentences[25][2][1]="Text 1";
        sentences[25][3][1]="Möglichkeitentext 1";
        sentences[25][4][1]="Auswahl 1";

        //layer 3-2b
        sentences[26]=new String [7][2];

        sentences[26][0][0]="3,2b";
        sentences[26][1][0]="3,3ba";
        sentences[26][2][0]="3,3bb";
        sentences[26][3][0]="<html><body><font size='8'>As I take a second peek at the picture my head starts to hurt , it implies that I start to remember some important detail . But after I hear footsteps and turn around to look where these are coming from\n" +
                "I recognize the girl that is in front of me , first of all , I have seen her in the forest and second of all it is the girl from the picture. I wanted to ask her so many question but did not\n" +
                "know where to begin and just tried to get next to her. However , as I moved towards her she vanished with a smile.\n" +
                "*Mason starts crying\n" +
                "Why am I crying , why am I so sad . I don't know her but still it feels like she is one of my closest friends to who I slowly lose connection. This feeling is killing me , it fills me with\n" +
                "despair. The same feeling I have felt when my parents hurted her and I just stood beside them and did nothing. Wait...What the hell am I talking about\n" +
                "I should just forget about it</body></html>";
        sentences[26][4][0]="<html><body><font size='8'>- Dont forget<br>- Forget</body></html>";
        sentences[26][5][0]="Dont forget";
        sentences[26][6][0]="Forget";

        sentences[26][1][1]="Ort 1";
        sentences[26][2][1]="Ort 2";
        sentences[26][3][1]="Text 1";
        sentences[26][4][1]="Möglichkeitentext 1";
        sentences[26][5][1]="Auswahl 1";
        sentences[26][6][1]="Auswahl 2";

        //layer 3-3ba
        sentences[27]=new String [7][2];

        sentences[27][0][0]="3,3ba";
        sentences[27][1][0]="3,4baa";
        sentences[27][2][0]="3,3bb";
        sentences[27][3][0]="<html><body><font size='8'>It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .\n" +
                "It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .\n" +
                "It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .\n" +
                "It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .\n" +
                "It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .It hurts .</body></html>";
        sentences[27][4][0]="<html><body><font size='8'>- Continue<br>- Stop</body></html>";
        sentences[27][5][0]="Continue";
        sentences[27][6][0]="Stop";

        sentences[27][1][1]="Ort 1";
        sentences[27][2][1]="Ort 2";
        sentences[27][3][1]="Text 1";
        sentences[27][4][1]="Möglichkeitentext 1";
        sentences[27][5][1]="Auswahl 1";
        sentences[27][6][1]="Auswahl 2";

        //layer 3-4baa
        sentences[28]=new String [2][2];

        sentences[28][0][0]="3,4baa";
        sentences[28][1][0]="<html><body><font size='8'>Why did I kill my mother?\n" +
                "Why did I betray my father?\n" +
                "Why did I deceive my sister?\n" +
                "Why am I even living , I do not deserve life. Just because of me she is nearly dead, the only family that I have left and why the fuck did I forget about her.\n" +
                "How did it even came to this? All I did was just trying to help them . I just wanted to cure my sister I wanted her to forgive me for all my sins , my pride of not regretting what I have done,\n" +
                "my greed to deceive my parents so I could get everything I wanted , my lust to achieve all their love but still being envious of other children's life , which is the 4th of my sins.\n" +
                "My sin to steal all her food because my parents did not care if she starved , and still I felt wrath , wrath for my mother and father that they tormented her. And finally , my last\n" +
                "sin , sloth, being to lazy to help my sister even though I freed her after all but not in a good way. I killed my mother and accused my father of doing it . We lived alone since when.\n" +
                "But now she is ill, and the only thing I could do was to help the scientist find a cure and take their latest drugs.She is probably already dead, like I am dead inside.\n" +
                "I won't escape this hell.<br>THE END</body></html>";

        sentences[28][1][1]="Text 1";

        //layer 3-3bb
        sentences[29]=new String [5][2];

        sentences[29][0][0]="3,3bb";
        sentences[29][1][0]="3,4aab";
        sentences[29][2][0]="<html><body><font size='8'>Why should It even matter if I think about it more . Everything here is just absurd I never had such a weird and confusing nightmare . The only thing that I should do now is \n" +
                "to rest. I feel exhausted , I need a break from all of this madness.</body></html>";
        sentences[29][3][0]="<html><body><font size='8'>- Rest</body></html>";
        sentences[29][4][0]="Rest";


        sentences[29][1][1]="Ort 1";
        sentences[29][2][1]="Text 1";
        sentences[29][3][1]="Möglichkeitentext 1";
        sentences[29][4][1]="Auswahl 1";

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

    /**
     * Rückgabe von der maximalen Anazl an Orten,Texten,Möglichkeitentexten sowie Auswahlmölichkeiten.
     * @return Maximale Anzahl von Orten,Texten,Möglichkeitentexten sowie Auswahlmölichkeiten.
     */
    public int getMaxOrte() {
        return maxOrte;
    }

    public int getMaxTexte() {
        return maxTexte;
    }

    public int getMaxMoeglichkeitentexte() {
        return maxMoeglichkeitentexte;
    }

    public int getMaxAuswahlmoeglichkeiten() {
        return maxAuswahlmoeglichkeiten;
    }
}

