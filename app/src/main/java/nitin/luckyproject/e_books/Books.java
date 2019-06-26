package nitin.luckyproject.e_books;

public class Books
{
    String title;
    String authors;
    String publishingDate;
    String subtitle;
    String url;

    public Books(String title,  String authors, String publishingDate, String url) {
        this.title = title;
        this.authors = authors;
        this.publishingDate = publishingDate;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(String publishedDate) {
        this.publishingDate = publishedDate;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String publisher) {
        this.subtitle = publisher;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
