package domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private int groupsСanPost;

    // private int ownerId;
    // private int data;
    //private int time;
    // private String comment;
    //  private int likeComments;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getGroupsСanPost() {
        return groupsСanPost;
    }

    public void setGroupsСanPost(int groupsСanPost) {
        this.groupsСanPost = groupsСanPost;
    }
}
