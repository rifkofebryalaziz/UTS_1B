import java.util.ArrayList;

public class UAS1B{
    private String UserID;
    private String UserNameUnique;
    private String Post;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserNameUnique() {
        return UserNameUnique;
    }

    public void setUserNameUnique(String userNameUnique) {
        UserNameUnique = userNameUnique;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public static void main(String[] args) {
        int jumPost = 4;
        //Scanner sc = new Scanner(System.in);
        UAS1B user1 =  new UAS1B();
        user1.setUserID("001");
        user1.setUserNameUnique("dbgb4a");
        user1.setPost("Debby Gibson");
        ArrayList<String> myPost =  new ArrayList<>();
        for(int index=0; index<jumPost;index++){
            //myPost.add(sc.nextline());
        }
        //user1.setPosted(myPost);
        //System.out.println("Total Posted : " + user1.ShowNumberOfPost());

    }
    //public static void main(String[] args) {

    }
}
