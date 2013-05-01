package com.leo.iimp.analyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.leo.iimp.entity.TradeJour;

/**
 * 文件解析器
 * @author Administrator
 */
public class TradeJourAnalyzer {

	public class PropertyLocationPair{
		private int beginIndex;
		private int endIndex;
		
		public PropertyLocationPair(int beginIndex,int endIndex){
			this.beginIndex = beginIndex;
			this.endIndex = endIndex;
		}

		public int getBeginIndex() {
			return beginIndex;
		}

		public void setBeginIndex(int beginIndex) {
			this.beginIndex = beginIndex;
		}

		public int getEndIndex() {
			return endIndex;
		}

		public void setEndIndex(int endIndex) {
			this.endIndex = endIndex;
		}
		
	};
	
	
	static {
		TradeJourAnalyzer tradeJourAnalyzer = new TradeJourAnalyzer();
		HashMap<String, TradeJourAnalyzer.PropertyLocationPair> propertyLocationPairs = new HashMap<String, TradeJourAnalyzer.PropertyLocationPair>();
		propertyLocationPairs.put("SerialNo",tradeJourAnalyzer.new PropertyLocationPair(0,0));
	}
	
	/**
	 * 解析行数据
	 * @param originalStr
	 * @param tradeJour
	 */
	private static void HandleTradeJour(String originalStr,TradeJour tradeJour){
		tradeJour.setSerialNo(originalStr.substring(0,6));
		tradeJour.setReceiverID(originalStr.substring(7,6));
	}
	
	/**
	 * 解析文件
	 * @param filePath
	 * @return 获取
	 */
	public static List<TradeJour> getTradeJour(String filePath){
		List<TradeJour> tradeJours = new ArrayList<TradeJour>();
		File file = new File(filePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            TradeJour  tradeJour = null;
            while ((tempString = reader.readLine()) != null) {
            	 tradeJour = new TradeJour();
            	 HandleTradeJour(tempString,tradeJour);
            	 tradeJours.add(tradeJour);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return tradeJours;
	}
	
}
