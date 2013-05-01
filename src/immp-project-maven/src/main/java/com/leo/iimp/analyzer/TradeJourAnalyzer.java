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
	
	private static HashMap<String, TradeJourAnalyzer.PropertyLocationPair> propertyLocationPairs;
	
	static {
		TradeJourAnalyzer tradeJourAnalyzer = new TradeJourAnalyzer();
		propertyLocationPairs = new HashMap<String, TradeJourAnalyzer.PropertyLocationPair>();
		propertyLocationPairs.put("serialNo",tradeJourAnalyzer.new PropertyLocationPair(0,6));
		propertyLocationPairs.put("cardBankNo",tradeJourAnalyzer.new PropertyLocationPair(6,14));
		propertyLocationPairs.put("receiverID",tradeJourAnalyzer.new PropertyLocationPair(14,22));
		propertyLocationPairs.put("tradeAccount",tradeJourAnalyzer.new PropertyLocationPair(22,41));
		propertyLocationPairs.put("receiveBankNo",tradeJourAnalyzer.new PropertyLocationPair(41,49));
		propertyLocationPairs.put("transOrg",tradeJourAnalyzer.new PropertyLocationPair(49,57));
		propertyLocationPairs.put("agentID",tradeJourAnalyzer.new PropertyLocationPair(57,65));
		propertyLocationPairs.put("systemReferNo",tradeJourAnalyzer.new PropertyLocationPair(65,77));
		propertyLocationPairs.put("tradeDate",tradeJourAnalyzer.new PropertyLocationPair(77,85));
		propertyLocationPairs.put("tradeTime",tradeJourAnalyzer.new PropertyLocationPair(85,93));
		propertyLocationPairs.put("posTradeserialNo",tradeJourAnalyzer.new PropertyLocationPair(93,99));
		propertyLocationPairs.put("tradeAmount",tradeJourAnalyzer.new PropertyLocationPair(99,111));
		propertyLocationPairs.put("discountRate",tradeJourAnalyzer.new PropertyLocationPair(111,115));
		propertyLocationPairs.put("tradeTypeInfoNo",tradeJourAnalyzer.new PropertyLocationPair(115,117));
		propertyLocationPairs.put("dealNo",tradeJourAnalyzer.new PropertyLocationPair(117,123));
		propertyLocationPairs.put("merchantType",tradeJourAnalyzer.new PropertyLocationPair(123,127));
		propertyLocationPairs.put("settlementDate",tradeJourAnalyzer.new PropertyLocationPair(127,131));
		propertyLocationPairs.put("posNo",tradeJourAnalyzer.new PropertyLocationPair(131,139));
		propertyLocationPairs.put("merchantNo",tradeJourAnalyzer.new PropertyLocationPair(139,154));
		propertyLocationPairs.put("merchantAccount",tradeJourAnalyzer.new PropertyLocationPair(154,184));
		propertyLocationPairs.put("tradeCurrency",tradeJourAnalyzer.new PropertyLocationPair(184,187));
		
	}
	
	/**
	 * 解析行数据
	 * @param originalStr
	 * @param tradeJour
	 */
	private static void HandleTradeJour(String originalStr,TradeJour tradeJour){
		tradeJour.setSerialNo(originalStr.substring(propertyLocationPairs.get("serialNo").getBeginIndex(),propertyLocationPairs.get("serialNo").getEndIndex()));
		tradeJour.setCardBankNo(originalStr.substring(propertyLocationPairs.get("cardBankNo").getBeginIndex(),propertyLocationPairs.get("cardBankNo").getEndIndex()));
		tradeJour.setReceiverID(originalStr.substring(propertyLocationPairs.get("receiverID").getBeginIndex(),propertyLocationPairs.get("receiverID").getEndIndex()));
		
		tradeJour.setTradeAccount(originalStr.substring(propertyLocationPairs.get("tradeAccount").getBeginIndex(),propertyLocationPairs.get("tradeAccount").getEndIndex()));
		tradeJour.setReceiveBankNo(originalStr.substring(propertyLocationPairs.get("receiveBankNo").getBeginIndex(),propertyLocationPairs.get("receiveBankNo").getEndIndex()));
		tradeJour.setTransOrg(originalStr.substring(propertyLocationPairs.get("transOrg").getBeginIndex(),propertyLocationPairs.get("transOrg").getEndIndex()));
		
		tradeJour.setAgentID(originalStr.substring(propertyLocationPairs.get("agentID").getBeginIndex(),propertyLocationPairs.get("agentID").getEndIndex()));
		tradeJour.setSystemReferNo(originalStr.substring(propertyLocationPairs.get("systemReferNo").getBeginIndex(),propertyLocationPairs.get("systemReferNo").getEndIndex()));
		tradeJour.setTradeDate(Integer.parseInt(originalStr.substring(propertyLocationPairs.get("tradeDate").getBeginIndex(),propertyLocationPairs.get("tradeDate").getEndIndex())));
		
		tradeJour.setTradeTime(Integer.parseInt(originalStr.substring(propertyLocationPairs.get("tradeTime").getBeginIndex(),propertyLocationPairs.get("tradeTime").getEndIndex())));
		tradeJour.setPosTradeserialNo(originalStr.substring(propertyLocationPairs.get("posTradeserialNo").getBeginIndex(),propertyLocationPairs.get("posTradeserialNo").getEndIndex()));
		tradeJour.setTradeAmount(Double.parseDouble(originalStr.substring(propertyLocationPairs.get("tradeAmount").getBeginIndex(),propertyLocationPairs.get("tradeAmount").getEndIndex()))/100);
		
		tradeJour.setDiscountRate(Double.parseDouble(originalStr.substring(propertyLocationPairs.get("discountRate").getBeginIndex(),propertyLocationPairs.get("discountRate").getEndIndex()))/10000);
		tradeJour.setTradeTypeInfoNo(originalStr.substring(propertyLocationPairs.get("tradeTypeInfoNo").getBeginIndex(),propertyLocationPairs.get("tradeTypeInfoNo").getEndIndex()));
		tradeJour.setDealNo(originalStr.substring(propertyLocationPairs.get("dealNo").getBeginIndex(),propertyLocationPairs.get("dealNo").getEndIndex()));
	
		tradeJour.setMerchantType(originalStr.substring(propertyLocationPairs.get("merchantType").getBeginIndex(),propertyLocationPairs.get("merchantType").getEndIndex()));
		tradeJour.setSettlementDate(Integer.parseInt(originalStr.substring(propertyLocationPairs.get("settlementDate").getBeginIndex(),propertyLocationPairs.get("settlementDate").getEndIndex())));
		tradeJour.setPosNo(originalStr.substring(propertyLocationPairs.get("posNo").getBeginIndex(),propertyLocationPairs.get("posNo").getEndIndex()));
	
		tradeJour.setMerchantNo(originalStr.substring(propertyLocationPairs.get("merchantNo").getBeginIndex(),propertyLocationPairs.get("merchantNo").getEndIndex()));
		tradeJour.setMerchantAccount(originalStr.substring(propertyLocationPairs.get("merchantAccount").getBeginIndex(),propertyLocationPairs.get("merchantAccount").getEndIndex()));
		tradeJour.setTradeCurrency(originalStr.substring(propertyLocationPairs.get("tradeCurrency").getBeginIndex(),propertyLocationPairs.get("tradeCurrency").getEndIndex()));
	
		
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
