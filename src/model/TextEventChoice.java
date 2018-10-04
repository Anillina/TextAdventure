package model;

public class TextEventChoice extends TextEvent {
    private String [] choices;
    public TextEventChoice(String text,String [] choices) {
        super(text);
        this.choices=choices;
    }

    /**
     * Rückgabe der Auswahlmöglichkeiten
     * @return Auswahlmöglichkeiten
     */
    public String[] getChoices() {
        return choices;
    }
}
