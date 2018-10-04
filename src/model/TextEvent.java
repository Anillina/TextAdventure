package model;

public class TextEvent {
  private String text;

    public TextEvent(String text) {
        this.text = text;
    }
    /**
     * Rückgabe des Textes
     * @return Text
     */
    public String getText() {
        return text;
    }
}
