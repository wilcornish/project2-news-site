import models.Article;
import models.Category;
import models.Journalist;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;


public class ArticleTest {

    Article article;
    models.Journalist journalist;
    Date date = new Date(118, 04, 01);


    @Before
    public void setup() {
        journalist = new Journalist("Dave Cornelius", "Dave Cornelius is a made up journalist", "@DCornelius", "DaveCornelius.jpg");
        article = new Article("Article Title", "Article summary", date, "Article content", journalist, "image.jpg", Category.POLITICS);
    }

    @Test
    public void getId() {
        assertEquals(0, article.getId());
    }

    @Test
    public void setId() {
        article.setId(1);
        assertEquals(1, article.getId());
    }

    @Test
    public void getTitle() {
        assertEquals("Article Title", article.getTitle());
    }

    @Test
    public void setTitle() {
        article.setTitle("New Title");
        assertEquals("New Title", article.getTitle());
    }

    @Test
    public void getSummary() {
        assertEquals("Article summary", article.getSummary());
    }

    @Test
    public void setSummary() {
        article.setSummary("New summary");
        assertEquals("New summary", article.getSummary());
    }

    @Test
    public void getDate() {
        assertEquals(date, article.getDate());
    }

    @Test
    public void setDate() {
        Date newDate = new Date(2018, 10, 17);
        article.setDate(newDate);
        assertEquals(newDate, article.getDate());

    }

    @Test
    public void getContent() {
        assertEquals("Article content", article.getContent());
    }

    @Test
    public void setContent() {
        article.setContent("New content");
        assertEquals("New content", article.getContent());
    }

    @Test
    public void getJournalist() {
        assertEquals(journalist, article.getJournalist());
    }

    @Test
    public void setJournalist() {
        Journalist journalist2 = new Journalist("John", "Bio", "Twitter", "picture.jpg");
        article.setJournalist(journalist2);
        assertEquals(journalist2, article.getJournalist());
    }

    @Test
    public void getImage() {
        assertEquals("image.jpg", article.getImage());
    }

    @Test
    public void setImage() {
        article.setImage("newimage.jpg");
        assertEquals("newimage.jpg", article.getImage());
    }

    @Test
    public void hasCategory(){
        assertEquals(Category.POLITICS, article.getCategory());
    }
}
