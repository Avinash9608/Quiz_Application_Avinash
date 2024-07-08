
package techquizapp.pojo;

public class Exam {

    public Exam() {
    }

    public Exam(String examId, String language, int totalQuestion) {
        this.examId = examId;
        this.language = language;
        this.totalQuestion = totalQuestion;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }
  private String examId;
  private String language;
  private int totalQuestion;
}
