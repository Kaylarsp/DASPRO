public class gameNode15 {
    int pointId;
    String question;
    String answer;
    int nextPointId;
    gameNode15 next;

    public gameNode15(int pointId, String question, String answer, int nextPointId, gameNode15 next) {
        this.pointId = pointId;
        this.question = question;
        this.answer = answer;
        this.nextPointId = nextPointId;
        this.next = next;
    }
}