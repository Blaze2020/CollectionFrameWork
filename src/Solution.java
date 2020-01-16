import java.util.Scanner;

public class Solution {
    private static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        Solution obj=new Solution();
        Document[] d=new Document[4];
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt();
            s.nextLine();
            String title=s.nextLine();
            String folderName=s.nextLine();
            int pages=s.nextInt();
            d[i]= new Document(id,title,folderName,pages);
        }
        Solution.docsWithOddPages(d);
        s.close();


    }

    private static void docsWithOddPages(Document[] d) {
        for(int i=0;i<d.length;i++)
        {
            if((d[i].pages%2)!=0)
            {
                System.out.println(d[i].id+" "+d[i].title+" "+d[i].folderName+" "
                +d[i].pages);
            }
        }

    }


}
class Document
{
    int id;
    String title;
    String folderName;
    int pages;
    Document(int id,String title,String folderName,int pages)
    {
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
