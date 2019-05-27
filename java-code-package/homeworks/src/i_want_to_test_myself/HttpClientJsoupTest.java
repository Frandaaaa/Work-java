import org.apache.http.HttpEntity;
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

import org.junit.Test;

import java.util.List;

/**
 * HttpClient & Jsoup libruary test class
 *
 * Created by xuyh at 2017/11/6 15:28.
 */
public class HttpClientJsoupTest {
    @Test
    public void test() {
            //ͨ��httpClient��ȡ��ҳ��Ӧ,�����ص���Ӧ����Ϊ���ı�
        HttpGet httpGet = new HttpGet("http://sports.sina.com.cn/");
        httpGet.setConfig(RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).build());
        
        
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;

        String responseStr = "";
        try {
            httpClient = HttpClientBuilder.create().build();
            HttpClientContext context = HttpClientContext.create();
            response = httpClient.execute(httpGet, context);
            int state = response.getStatusLine().getStatusCode();
            if (state != 200)
                responseStr = "";
            
            
            HttpEntity entity = response.getEntity();
            if (entity != null)
                responseStr = EntityUtils.toString(entity, "utf-8");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null)
                    response.close();
                if (httpClient != null)
                    httpClient.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (responseStr == null)
            return;

        //���������Ĵ��ı���Jsoup����ת����Document�ĵ������в���
        
        Document document = Jsoup.parse(responseStr);
        
        List<Element> elements = document.getElementsByAttributeValue("class", "ty-card-tt");
        
        elements.forEach(element -> {
            for (Element e : element.getElementsByTag("a")) {
                System.out.print(e.text() + "(��ַ): ");
                System.out.println(e.attr("href"));
            }
        });
    }
}
