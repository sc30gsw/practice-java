package com.example.demo.sec10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WeatherForecastServer {

	static String[] weathers = {"晴れ", "曇り", "雨", "晴れのち曇り", "晴れのち雨", "曇りのち晴れ"};
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			while(true) {
				Socket socket = serverSocket.accept();
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				String weather = getWeatherForecast();
				writer.println(weather);
				writer.close();
				System.out.println("[" + weather + "] の予報を送りました");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	static String getWeatherForecast() {
		return weathers[(int) (Math.random() * weathers.length)];
	}
}