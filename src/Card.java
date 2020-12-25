public class Card {
    private int cardId;
    private String beginDay;
    private String endDay;
    private int bookCode;
    private Student student;
    public Card(int cardId, String beginDay, String endDay, int bookCode, Student student) {
        this.cardId = cardId;
        this.beginDay = beginDay;
        this.endDay = endDay;
        this.bookCode = bookCode;
        this.student = student;
    }

    public String getEndDay() {
        return endDay;
    }

    public int getStudentId(){
        return this.student.getStudentId();
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", beginDay='" + beginDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", bookCode=" + bookCode +
                ", student=" + student +
                '}';
    }
}
