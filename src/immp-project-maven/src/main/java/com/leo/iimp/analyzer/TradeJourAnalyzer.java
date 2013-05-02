package com.leo.iimp.analyzer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.leo.iimp.entity.TradeJour;

/**
 * 文件解析器
 * 
 */
public class TradeJourAnalyzer {
	/**
	 * 解析文件
	 * 
	 * @param filePath
	 * @return 获取
	 */
	public static List<TradeJour> getTradeJour(String filePath) {
		List<TradeJour> tradeJours = new ArrayList<TradeJour>();
		TradeJourMapper mapper = new TradeJourMapper();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(filePath), "GBK"));
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				tradeJours.add(mapper.setValue(tempString));
			}
			reader.close();
		} catch (Exception e) {
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

class TradeJourMapper {

	private List<PropertyLocationPair> pairs;

	public TradeJourMapper() {
		initPropertyLocationPair();
	}

	private void initPropertyLocationPair() {
		pairs = new ArrayList<PropertyLocationPair>(30);
		pairs.add(new PropertyLocationPair("serialNo", 0, 6));
		pairs.add(new PropertyLocationPair("cardBankNo", 6, 14));
		pairs.add(new PropertyLocationPair("receiverID", 14, 22));
		pairs.add(new PropertyLocationPair("tradeAccount", 22, 41));
		pairs.add(new PropertyLocationPair("receiveBankNo", 41, 49));
		pairs.add(new PropertyLocationPair("transOrg", 49, 57));
		pairs.add(new PropertyLocationPair("agentID", 57, 65));
		pairs.add(new PropertyLocationPair("systemReferNo", 65, 77));
		pairs.add(new PropertyLocationPair("tradeDate", 77, 85));
		pairs.add(new PropertyLocationPair("tradeTime", 85, 93));
		pairs.add(new PropertyLocationPair("posTradeserialNo", 93, 99));
		pairs.add(new PropertyLocationPair("tradeAmount", 99, 111));
		pairs.add(new PropertyLocationPair("discountRate", 111, 115));
		pairs.add(new PropertyLocationPair("tradeTypeInfoNo", 115, 117));
		pairs.add(new PropertyLocationPair("dealNo", 117, 123));
		pairs.add(new PropertyLocationPair("merchantType", 123, 127));
		pairs.add(new PropertyLocationPair("settlementDate", 127, 131));
		pairs.add(new PropertyLocationPair("posNo", 131, 139));
		pairs.add(new PropertyLocationPair("merchantNo", 139, 154));
		pairs.add(new PropertyLocationPair("merchantAccount", 154, 184));
		pairs.add(new PropertyLocationPair("tradeCurrency", 184, 187));
		pairs.add(new PropertyLocationPair("settlementAmount", 187, 199));
		pairs.add(new PropertyLocationPair("tradeAuthNo", 201, 207));
		pairs.add(new PropertyLocationPair("tradeTypeID", 207, 210));
		pairs.add(new PropertyLocationPair("responseNo", 210, 212));
		pairs.add(new PropertyLocationPair("merchantName", 212, 222));
		pairs.add(new PropertyLocationPair("completeID", 240, 242));
		pairs.add(new PropertyLocationPair("bankServiceCharge", 242, 254));
		pairs.add(new PropertyLocationPair("merchantPayServiceCharge", 254, 266));
		pairs.add(new PropertyLocationPair("selfAccountID", 266, 267));
	}

	public TradeJour setValue(String line) throws Exception {
		TradeJour tradeJour = new TradeJour();
		for (PropertyLocationPair pair : pairs) {
			Field field = TradeJour.class.getDeclaredField(pair.getName());
			if (!field.getType().equals(String.class)) {
				field.set(
						tradeJour,
						field.getType()
								.getMethod("valueOf", String.class)
								.invoke(field.getType().getClass(),
										pair.getValue(line)));
			} else
				field.set(tradeJour, pair.getValue(line));
		}
		return tradeJour;
	}
}

class PropertyLocationPair {
	private String name;
	private int beginIndex;
	private int endIndex;

	public PropertyLocationPair(String name, int beginIndex, int endIndex) {
		this.name = name;
		this.beginIndex = beginIndex;
		this.endIndex = endIndex;
	}

	public String getValue(String line) {
		return line.substring(beginIndex, endIndex).trim();
	}

	public String getName() {
		return name;
	}

}
