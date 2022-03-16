package patika.booksorting;

import java.time.LocalDate;

public class Book implements Comparable<Book> {

    private String name;
    private Integer pageNo;
    private String authorName;
    private LocalDate publish;

    public Book(String name, Integer pageNo, String authorName, LocalDate publish) {
        this.name = name;
        this.pageNo = pageNo;
        this.authorName = authorName;
        this.publish = publish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublish() {
        return publish;
    }

    public void setPublish(LocalDate publish) {
        this.publish = publish;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
