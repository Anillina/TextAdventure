package model;
public class Story {

    // Abschnitt , Wort
    private String sentences[][] ;

    /**
     * Konstruktor der Klasse Story
     */
    public Story(int layer){
        setSentencesAndChoices(layer);
    }

    /**
     * Nach einem Abschnitt hat man immer mehrere Auswahlmöglichkeiten
     * (Beispiel Abschnitt 1 sentences[0][0] -> Auswahlmöglichkeit sentences[1][0])
     * @param layer Gibt die Ebene an auf dem sich der Spieler/Mason befindet
     */

    public void setSentencesAndChoices(int layer){
        if (layer==1){
            sentences=new String[2][100];
            sentences[0][0]="My"; sentences[0][1]="name";sentences[0][2]="is"; sentences[0][3]="Wright";sentences[0][4]="Graham...";
            sentences[0][5]="Or";sentences[0][6]="is";sentences[0][7]="it";sentences[0][8]="Mason";sentences[0][9]="Cain?";
            sentences[0][10]="It";sentences[0][11]="has";sentences[0][12]="been";sentences[0][13]="a";sentences[0][14]="while";
            sentences[0][15]="since";sentences[0][16]="I";sentences[0][17]="can";sentences[0][18]="clearly";sentences[0][19]="remember";
            sentences[0][20]="my";sentences[0][21]="name,";sentences[0][22]="my";sentences[0][23]="age,";sentences[0][24]="or";
            sentences[0][25]="my";sentences[0][26]="even";sentences[0][27]="my";sentences[0][28]="parents";sentences[0][29]="faces";
            sentences[0][30]="I";sentences[0][31]="just";sentences[0][32]="woke";sentences[0][33]="up";sentences[0][34]="from";
            sentences[0][35]="from";sentences[0][36]="another";sentences[0][37]="dreamless";sentences[0][38]="nightmare.";sentences[0][39]="All";
            sentences[0][40]="there";sentences[0][41]="is";sentences[0][42]="around";sentences[0][43]="me,";sentences[0][44]="is";
            sentences[0][45]="a";sentences[0][46]="wide";sentences[0][47]="dark";sentences[0][48]="room.";sentences[0][49]="I";
            sentences[0][50]="could";sentences[0][51]="probably";sentences[0][52]="hear";sentences[0][53]="my";sentences[0][54]="echo";
            sentences[0][55]="if";sentences[0][56]="I";sentences[0][57]="screamed.";sentences[0][58]="But";sentences[0][59]="first";
            sentences[0][60]="of";sentences[0][61]="all";sentences[0][62]="I";sentences[0][63]="should";sentences[0][64]="remember";
            sentences[0][65]="how";sentences[0][66]="to";sentences[0][67]="speak.";sentences[0][68]="In";sentences[0][69]="front";
            sentences[0][70]="of";sentences[0][71]="me";sentences[0][72]="is.";sentences[0][73]="a";sentences[0][74]="wooden";
            sentences[0][75]="door";sentences[0][76]="surrounded";sentences[0][77]="by";sentences[0][78]="pulsing";sentences[0][79]="darkness";
            sentences[0][80]="It";sentences[0][81]="is";sentences[0][82]="inviting";sentences[0][83]="me";sentences[0][84]="to";
            sentences[0][85]="enter,";sentences[0][86]="although";sentences[0][87]="staying.";sentences[0][88]="here";sentences[0][89]="also";
            sentences[0][90]="feels";sentences[0][91]="rather";sentences[0][92]="comfortable.";sentences[0][93]="What";sentences[0][94]="should";
            sentences[0][95]="I";sentences[0][96]="I";sentences[0][97]="do?";
            sentences[0][98]="\nStay and bask in the abyss or enter the door and leave this grim world.";
            sentences[1][0]="enter";sentences[1][1]="stay";
        }
    }

    public String [][] getSentencesAndChoices(){
        return sentences;
    }
}
