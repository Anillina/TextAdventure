package model;
public class Story {

    // Ebene , Inhalt , Inhaltstyp
    private String[][][] sentences;

    /**
     * Konstruktor der Klasse Story
     * Aufruf der Methode "setSentencesAndChoices" bei Initalisierung
     */
    public Story(){
        setSentencesAndChoices();
    }

    private void setSentencesAndChoices() {
        sentences=new String[1][14][];
        // layer 0-0
        sentences[0][0]=new String[4];

        sentences[0][0][0]="<html><body>My name is Wright Lecter... Or is it Mason Cain? It has been a while since I can clearly remember my name. Or my age. Or my parents faces. Or even what skin color I have. But that is not as important. I just woke up from another dreamless nightmare.<br>All there is around me is a wide dark gray room, I could probably hear my echo if I screamed, well first I have to remember how to speak. In front of me is a wooden door surrounded by pulsing darkness.<br> It is inviting me to enter, although staying here also feels rather comfortable. What should I do? </body></html>";
        sentences[0][0][1]="stay";//1
        sentences[0][0][2]="enter";
        sentences[0][0][3]="<html><body><br>Stay<br>Enter</body></html>";//2

        // layer 0-1
        sentences[0][1]=new String[1];

        sentences[0][1][0]="God has forbidden me to enter heaven or hell- Might as well stay here, where I feel like I exist. Game over!!!!!!!111!!1!11!!";

        //layer 0-2
        sentences[0][2]=new String[5];

        sentences[0][2][0]="<html><body>I hold out my hand and grip the door open - It is warm. I go through the door and, by what I can only assume, I have entered a forest at midnight. Pitch dark. My feet prompt me to move forward and so I do. The forest doesn’t hold anything special to it.<br> There are large wide trees, various types of bushes, hanging from the trees are orange eyeballs, dead insects and branches are laying everywhere. Nothing unusual.<br> Go to the left, it is safer… Go to the right, I know something else is there.</body></html>";
        sentences[0][2][1]="left";//3
        sentences[0][2][2]="right";//4
        sentences[0][2][3]="forward";//5
        sentences[0][2][4]="<html><body>Left<br>Right<br>Forward</body></html>";

        //layer 0-3 left
        sentences[0][3]=new String[6];

        sentences[0][3][0]="<html><body>I have lost myself in this forest. I hope I will find something worthwhile left for me. But there is nothing. Just trees and dead bugs everywhere. I just keep going forward. Just dead bugs and branches. It feels like I walked for hours in this direction.<br> Branches and a dead rat. Huh, something new. I get closer to the rat that is on the ground on top of a pile of centipede corpses. It’s an ordinary rat. Filthy, hairy, smelly and rotting. At this point there are not many options for me now, right?<br> Please don’t. You will get a tummy ache. I dare you to do that! You won’t. You are not brave enough.</body></html>";
        sentences[0][3][1]="eat rat";//6
        sentences[0][3][2]="eat centipedes";//7
        sentences[0][3][3]="eat eyeball";//8
        sentences[0][3][4]="Go on";//5
        sentences[0][3][5]="<html><body>Eat rat<br>Eat centipedes<br>Eat eyeball<br>Go on</body></html>";

        //layer 0-4 right
        sentences[0][4]=new String[4];

        sentences[0][4][0]="<html><body>I feel uneasy. The forest is getting dimmer and dimmer. As I progress, I see less and lesser trees and less and lesser dead bugs… I notice that the temperature has lowered slightly, I am not freezing, and it’s just a cold shiver.<br> Later on I am standing on an open flat grass field. I see a dime light from afar. – It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness. It is missing one of its hollow eyes.<br> Otherwise it is wearing a white and black cloak.Therefore fear overcomes my mind and I start to run, farther and farther away . Until I calm down a bit , but still I do not know what I should do now.<br>Should I stay or should I run further into the woods.</body></html>";
        sentences[0][4][1]="stay";//12
        sentences[0][4][2]="run ";//13
        sentences[0][4][3]="<html><body>Stay<br>Run</body></html>";

        //layer 0-5 move forward
        sentences[0][5]=new String[5];

        sentences[0][5][0]="<html><body>I continue my way forward. In front of me are branches and eyeballs blocking my way that I have to push aside to get through the forest. I see, in the dims of darkness, piles of dead caterpillars. Just lying on the ground.<br> It would not be strange if it was just a few bug piles. But right here are fourth and more piles of dead bugs. I stand in silence and wonder for a few minutes. And then I continue my walk. Through the forest.<br> Pushing aside branches and eyeball, walking over piles, and progressing deeper and deeper into the forest. Pushing branches away- Two weeks, this is how long it feels like I have been wandering in this forest. <br>Unable to see the days, for darkness doesn’t seem to shift. Not even a moon can be seen. I walk my next hundreds kilometer, but then I see the piles of caterpillars. How? I – I fell unconscious. I was awoken by the tiny blue light in front of me. <br>It’s a small blue glowing flower. It typ is uncertaint, its purpose is unclear, and its looks are unusual.</body></html> ";
        sentences[0][5][1]="keep";//09
        sentences[0][5][2]="eat";//Level 10
        sentences[0][5][3]="ignore";//3
        sentences[0][5][4]="<html><body>Keep<br>Eat<br>Ignore</body></html>";

        //layer 0-6
        sentences[0][6]=new String[4];

        sentences[0][6][0]="<html><body>I eat the dead decaying rat. I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now.</body></html> ";
        sentences[0][6][1]="go deeper";//11
        sentences[0][6][2]="return";//11
        sentences[0][6][3]="<html><body>Go deeper<br>Return</body></html>";

        //layer 0-7
        sentences[0][7]=new String[4];

        sentences[0][7][0]="<html><body> I eat part of the pile of caterpillars that the dead rat was laying on.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now.</body></html>";
        sentences[0][7][1]="go deeper";//11
        sentences[0][7][2]="return";//11
        sentences[0][7][3]="<html><body>Go deeper<br>Return</body></html>";


        //layer 0-8
        sentences[0][8]=new String[4];

        sentences[0][8][0]="<html><body>I pick down an orange eyeball from a tree nearby. On closer exception they are more yellow than orange.I put it all in my mouth and start chewing slowly. Black fluid is dripping out of my mouth as I crunch my meal down. I feel refreshed now.</body></html>";
        sentences[0][8][1]="go deeper";//11
        sentences[0][8][2]="return";//11
        sentences[0][8][3]="<html><body>Go deeper<br>Return</body></html>";


        //layer 0-9
        sentences[0][9]=new String[1];

        sentences[0][9][0]="I plug it out of the ground and hold it in my hands. Then I have no other thing to do. I continue my march";//Level 3

        //layer 0-10
        sentences[0][10]=new String[1];

        sentences[0][10][0]= "I plug it out of the ground and hold it in my hands. I then put the flower in my mouth and eat it. I am not hungry nor do I need the vitamins, if it has any, from the flower. Yet I ate it and it tastes like nothing. And so I feel. With nothing better do to I continue the way. "; //Level 3

        //layer 0-11 deeper in the forest
        sentences[0][11]=new String[4];

        sentences[0][11][0]="<html><body>I continue my walk and clear my way through the timber. Before I start to regret to have eaten I see a dime light from afar. – It is a towering humanoid being. Twice as tall as I am. A skin so white it is shining in the darkness.<br> It is missing one of its hollow eyes. Otherwise it is wearing a white and black cloak. Therefore fear overcomes my mind and I start to run, farther and farther away .<br> Until I calm down a bit , but still I do not know what I should do now. Should I stay or should I run further into the woods.</body></html>";
        sentences[0][11][1]="stay";//12
        sentences[0][11][2]="run";//13
        sentences[0][11][3]="<html><body>Stay<br>Run</body></html>";

        //layer 0-12 stay
        sentences[0][12]=new String[1];

        sentences[0][12][0]="<html><body>After realizing that I can not escape my fate , I stop my pointless act and turn around. But the monster is not there anymore , there just stays a little girl with black hair and pale skin, who seems familiar to me.<br> She points at me , I think she wants me to follow her . Thus leads to the question what I should do now . Should I trust her or should I despair all alone in this dark and immane forest.<br> I decide to follow her and suddenly as I arrived at her latest location she vanishes. Being afraid of being alone again I started panicking and ran aimlessly around screaming for her until I fall into the abyss.<br> Initially it seems like that I was falling endlessly. But luckily just after a short while I arrive at the end , it is dark. I can not see anymore , even my own hands. I merely hear footsteps coming closer. I feel the girl approaching me.</body></html>";


        //layer 0-13 run away
        sentences[0][13]=new String[1];

        sentences[0][13][0]="<html><body>As I sprint farther in the direction of the timber I recognize being here before. Abruptly I stop spurting and turn around. Then I notice that the monster is not there anymore , there just stays a little girl with black hair and pale skin, who seems familiar to me.<br> She points at me , I think she wants me to follow her . Thus leads to the question what I should do now . Should I trust her or should I despair all alone in this dark and immane forest.<br> I decide to follow her and suddenly as I arrived at her latest location she vanishes.Being afraid of being alone again I started panicking and ran aimlessly around screaming for her until I fall into the abyss.<br> Initially it seems like that I was falling endlessly.But luckily just after a short while I arrive at the end , it is dark. I can not see anymore , even my own hands.<br> I merely hear footsteps coming closer. I feel the girl approaching me.</body></html> ";

    }

    public String[][][] getSentences() {
        return sentences;
    }
}

