package domain;

public class Post {
    private int id;
    private int ownerId;
    private String image;
    private String description;
    private int views;
    private int data;
    private int time;

    private CommentsInfo commentsInfo;
    private Share share;
    private LikesInfo likesInfo;


    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public int getViews() {
        return views;
    }

    public int getData() {
        return data;
    }

    public int getTime() {
        return time;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public Share getShare() {
        return share;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }
}


