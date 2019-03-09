public class news {

    private int newsId;
    private String title;
    private String content;

    public news(int newsId, String title, String content) {
        this.newsId = newsId;
        this.title = title;
        this.content = content;
    }

    public news(){}

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
