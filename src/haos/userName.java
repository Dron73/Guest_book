package haos;

public class userName {

    private int id;
    private String name;
    private String evaluation;
    private String comment;

    public userName() {
    }

    public userName(int id) {
	this.id = id;
    }

    public userName(int id, String name) {
	this.id = id;
	this.name = name;
    }

    public userName(String name, int id, String evaluation) {
	this.name = name;
	this.id = id;
	this.evaluation = evaluation;
    }

    public userName(int id, String name, String evaluation, String comment) {
	this.id = id;
	this.name = name;
	this.evaluation = evaluation;
	this.comment = comment;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEvaluation() {
	return evaluation;
    }

    public void setEvaluation(String evaluation) {
	this.evaluation = evaluation;
    }

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    public String toString() {
	return "<br>" + name + " " + evaluation + " " + comment + "</br>";
    }
}
