package com.wenjing.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SendHttpRequest {
    public static void main(String[] args) throws Exception {
        String httpUrl = "https://api.restful-api.dev/objects";
        String data = doGet2(httpUrl);
        List<Product> products = getProducts(data);
        System.out.println(products);
    }

    public static List<Product> getProducts(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Product> products = null;
        try {
            products = objectMapper.readValue(jsonString, ArrayList.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static String doGet2(String httpUrl) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(httpUrl);
        CloseableHttpResponse response = httpclient.execute(httpget);
        String result;
        try {
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity);
            EntityUtils.consume(entity);
            System.out.println(result);
        } finally {
            response.close();
        }
        return result;
    }


    public static String doPost1(String httpUrl) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(httpUrl);

        BasicNameValuePair basicNameValuePair = new BasicNameValuePair("a", "A");
        UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(Arrays.asList(basicNameValuePair));
        httpPost.setEntity(urlEncodedFormEntity);

        CloseableHttpResponse response = httpclient.execute(httpPost);
        String result;
        try {
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity);
            EntityUtils.consume(entity);
            System.out.println(result);
        } finally {
            response.close();
        }
        return result;
    }

    public static String doGet1(String httpUrl) {
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        StringBuffer result = new StringBuffer();
        try {
            URL url = new URL(httpUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(15000);
            connection.connect();
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                if (null != is) {
                    br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    String temp = null;
                    while (null != (temp = br.readLine())) {
                        result.append(temp);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            connection.disconnect();
        }
        return result.toString();
    }

}
