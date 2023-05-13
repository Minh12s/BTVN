package baitapSlot12;

import java.util.ArrayList;

public class News  implements INews{
    int Id;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " +getTitle());
        System.out.println("PublishDate: "+getPublishDate());
        System.out.println("Author: " +getAuthor());
        System.out.println("Content: " +getContent());
        System.out.println("AverageRate: " +getAverageRate());


    }

}
