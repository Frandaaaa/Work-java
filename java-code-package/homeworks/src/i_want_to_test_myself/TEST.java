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

public class TEST {
	@Test
	public void test() {
		
		//ʹ�ô���IP��ַ:�е㲻�ȶ���
		//HttpHost proxy = new HttpHost("111.177.161.89",9999);
		
		//ѡ��Ŀ����ַ������ʱ��
		HttpGet httpGet = new HttpGet("http://sports.sina.com.cn/");
		httpGet.setConfig(RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).build());
		
		//ģ�������
		//httpGet.setHeader("User-Agent",
        //        "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");

		//����ʵ��
		CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
		
		//��ʼ����Ӧ
        String responseStr = "";
        //�쳣������
        try {
        	httpClient = HttpClientBuilder.create().build();
        	//����
        	HttpClientContext context = HttpClientContext.create();
        	//
        	response = httpClient.execute(httpGet,context);
        	//��ȡ��Ӧ״̬
        	int state = response.getStatusLine().getStatusCode();
        	if (state != 200)
        		responseStr = "";
        	
        	
        	//ִ��GET
        	HttpEntity entity = response.getEntity();
        	if(entity != null)
        		responseStr = EntityUtils.toString(entity, "utf-8");
        		//ע���е���վ����utf-8�ַ���,����ʵ��
        	
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	try {
        		if(response != null)
        			response.close();//����
        		if(httpClient != null)
        			httpClient.close();
        	} catch (Exception ex) {
        		ex.printStackTrace();
        	}
        }
        
        if(responseStr != null)
        	return;
        
 
/*�����ȡ��������Ϣ============================================================================*/
        Document document = Jsoup.parse(responseStr);
        
        //������Ϣ��һ������ָ����ǩ���ݣ���Ҫָ��
        List<Element> elements = document.getElementsByAttributeValue("class", "ty-card-tt");
		
        elements.forEach(element -> {
        	//�������ƥ��ڵ���Ϣ
        	for(Element e : element.getElementsByTag("a")) {
        		//�ڿ���̨�������
                System.out.print(e.text() + "(��ַ): ");
                System.out.println(e.attr("href"));
        	}
        });
	}
}
