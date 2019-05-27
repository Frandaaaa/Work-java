import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
    public static void main(String[] args) throws IOException {
        //��ȡ�༭�Ƽ�ҳ
        Document document=Jsoup.connect("https://www.zhihu.com/explore/recommendations")
                //ģ���������
                .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
                .get();
        //#zh-recommend-list-full > div > div:nth-child(1) > h2 > a
        Element main=document.getElementById("zh-recommend-list-full");
        Elements url=main.select("div").select("div:nth-child(1)")
                .select("h2").select("a[class=question_link]");
        for(Element question:url){
            //���href���ֵ������ҳ��ÿ����ע���������
            String URL=question.attr("abs:href");//abs:href д����Jsoup�ṩ�ķ�������ȡ����
            //������������ָ���ҳ��
            Document document2=Jsoup.connect(URL)//�����Ժ��ֽ�����ȡ
                    .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
                    .get();
            //���� #zh-recommend-list-full > div > div:nth-child(1) > h2 > a
            
            //Elements body = main2.select("div").select("main").select("div").select("div:nth-child(11)").select("div.QuestionHeader").select("div.QuestionHeader-content").select("div.QuestionHeader-main");
            
            //Elements body2 = main2.select("div").select("main").select("div");
            
            Elements title=document2.getElementsByClass("QuestionHeader-title").select("h1");
            //�������� div:nth-child(4) > div > div > div > span
            Elements detail=document2.getElementsByClass("RichText ztext").select("span");
            //�ش� div.ListShortcut > div > div.Card.AnswerCard > div > div > div.RichContent.RichContent--unescapable > div.RichContent-inner > span
            Elements answer=document2.getElementsByClass("RichText ztext CopyrightRichText-richText").select("p");
            System.out.println("\n"+"���ӣ�"+URL
                    +"\n"+"���⣺"+title.text()
                    +"\n"+"��������"+detail.text()
                    +"\n"+"�ش�"+answer.text());
        }   
    }
}