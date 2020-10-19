package tr.edu.mu.ceng.mad.listviewexample;

public class Animal {
    String type;
    int pictureId;

    public Animal(String type, int pictureId) {
        this.type = type;
        this.pictureId = pictureId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
