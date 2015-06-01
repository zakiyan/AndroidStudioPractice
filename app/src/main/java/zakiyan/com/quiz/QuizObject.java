package zakiyan.com.quiz;

public class QuizObject {

    private String objectname;
    private String groupname;

    QuizObject(String groupname){
        this.groupname = groupname;
    }

    QuizObject(String objectname,String groupname){
        this.objectname = objectname;
        this.groupname = groupname;
    }

    public String getObjectname() {
        return objectname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}
