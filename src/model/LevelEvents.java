package model;

public class LevelEvents {
private TextEvent [] textEvents;
private TextEventChoice [] textEventChoices;
private String levelAndChoices;

    public LevelEvents(String levelAndChoices) {
        this.levelAndChoices = levelAndChoices;
        this.createTextevents(this.levelAndChoices);
    }

    /**
     * Zuweisung von TextEvent Objekten und TextEventChoice Objekten in dementsprechende Arrays
     * je nach Level und Entscheidung
     *
     */
    private void createTextevents(String levelAndChoices) {
    switch (levelAndChoices){

        case "1" :
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum",new String[] {"a","b","c","d"});
            break;
        case "2,a":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 2a");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 2a",new String[] {"a","b","c","d"});
            break;
        case "2,b":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 2b");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 2b",new String[] {"a","b","c","d"});
            break;
        case "2,c":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 2c");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 2c",new String[] {"a","b","c","d"});
            break;
        case "2,d":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 2d");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 2d",new String[] {"a","b","c","d"});
            break;
        case "3,a":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 3a");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 3a",new String[] {"a","b","c","d"});
            break;
        case "3,b":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 3b");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 3b",new String[] {"a","b","c","d"});
            break;
        case "3,c":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 3c");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 3c",new String[] {"a","b","c","d"});
            break;
        case "3,d":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 3d");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 3d",new String[] {"a","b","c","d"});
            break;
        case "4,a":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 4a");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 4a",new String[] {"a","b","c","d"});
            break;
        case "4,b":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 4b");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 4b",new String[] {"a","b","c","d"});
            break;
        case "4,c":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 4c");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 4c",new String[] {"a","b","c","d"});
            break;
        case "4,d":
            textEvents= new TextEvent[1];
            textEventChoices= new TextEventChoice[1];

            textEvents[0]=new TextEvent("Lorem ipsum 4d");

            textEventChoices[0]=new TextEventChoice("Lorem ipsum 4d",new String[] {"a","b","c","d"});
            break;

        default:System.out.println("Falsche Level und/oder Choice Angabe!"); break;
    }

    }

    /**
     * Rückgabe eines zufälligen TextEvent Objektes
     * @return Zufälliges TextEvent Objekt
     */
    public TextEvent getRandomTextEvent(){
        int randomIndex=(int) (Math.random()*textEvents.length);
        return textEvents[randomIndex];
    }

    /**
     * Rückgabe eines zufälligen TextEventChoice Objektes
     * @return Zufälliges TextEventChoice Objekt
     */

    public TextEventChoice getRandomTextEventChoices(){
        int randomIndex=(int) (Math.random()*textEventChoices.length);
        return textEventChoices[randomIndex];
    }

}
