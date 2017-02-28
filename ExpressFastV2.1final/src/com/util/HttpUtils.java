package com.util;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class HttpUtils {

	public static byte[] getDataFromNetWork(String baseUrl) {
		try {
			URL url = new URL(baseUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			int responseCode = connection.getResponseCode();
	
			if (responseCode == HttpURLConnection.HTTP_OK) {
				InputStream inputStream = connection.getInputStream();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] bs = new byte[1024];
				int len = 0;
				while ((len = inputStream.read(bs)) != -1) {
					baos.write(bs, 0, len);
				}
				return baos.toByteArray();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getJsonFromNetWork(String baseUrl) {
		byte[] data = getDataFromNetWork(baseUrl);
		if (data != null && data.length > 0) {
			return new String(data);
		}
		return null;
	}
}
