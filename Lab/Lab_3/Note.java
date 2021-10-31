package CS203Course.Lab.Lab_3;

public class Note extends Contact{

    protected String note;

    public Note(){
        super();
        note = "Write something reminder here";
    }
    public Note(String note){
        super();
        this.note = note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
    @Override
    public String toString(){
        return super.toString() +" " + getNote();
    }
}
