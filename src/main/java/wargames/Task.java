package wargames;public class Task {
package wargames;

public class Task {
    private String desc;
    private boolean isDone;

    public Task(String desc){
        this.desc = desc;
        this.isDone = false;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }

}
