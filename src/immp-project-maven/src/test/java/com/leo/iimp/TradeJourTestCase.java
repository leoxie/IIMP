package com.leo.iimp;

import java.util.List;

import com.leo.iimp.analyzer.TradeJourAnalyzer;
import com.leo.iimp.entity.TradeJour;

import junit.framework.TestCase;

public class TradeJourTestCase extends TestCase {

	public final void  testReadFile() {
		String path = this.getClass().getResource("").getPath()+"testOriData.data";
		List<TradeJour> tradeJours = TradeJourAnalyzer.getTradeJour(path);
		
		//SerialNo
		assertEquals("000001",tradeJours.get(0).getSerialNo());
		assertEquals("000011",tradeJours.get(10).getSerialNo());
		assertEquals("000015",tradeJours.get(14).getSerialNo());
		
		//CardBankNo
		assertEquals("01045800",tradeJours.get(0).getCardBankNo());
		assertEquals("03080010",tradeJours.get(10).getCardBankNo());
		assertEquals("01035800",tradeJours.get(14).getCardBankNo());
		
		//receiverID
		assertEquals("01040000",tradeJours.get(0).getReceiverID());
		assertEquals("03085800",tradeJours.get(10).getReceiverID());
		assertEquals("01035800",tradeJours.get(14).getReceiverID());
		
		//tradeAccount
		assertEquals("6227534400816361   ",tradeJours.get(0).getTradeAccount());
		assertEquals("5187187006502560   ",tradeJours.get(10).getTradeAccount());
		assertEquals("6228480084978002917",tradeJours.get(14).getTradeAccount());
		
		//receiveBankNo
		assertEquals("04895910",tradeJours.get(0).getReceiveBankNo());
		assertEquals("04895910",tradeJours.get(10).getReceiveBankNo());
		assertEquals("04895910",tradeJours.get(14).getReceiveBankNo());
		
		//transOrg
		assertEquals("00155800",tradeJours.get(0).getTransOrg());
		assertEquals("00155800",tradeJours.get(10).getTransOrg());
		assertEquals("00155800",tradeJours.get(14).getTransOrg());
		
		//agentID
		assertEquals("04895910",tradeJours.get(0).getAgentID());
		assertEquals("04895910",tradeJours.get(10).getAgentID());
		assertEquals("04895910",tradeJours.get(14).getAgentID());
		
		//systemReferNo
		assertEquals("000001000018",tradeJours.get(0).getSystemReferNo());
		assertEquals("000001000291",tradeJours.get(10).getSystemReferNo());
		assertEquals("000001000032",tradeJours.get(14).getSystemReferNo());
		
		//tradeDate
		assertEquals(new Integer(20120921),tradeJours.get(0).getTradeDate());
		assertEquals(new Integer(20120921),tradeJours.get(10).getTradeDate());
		assertEquals(new Integer(20120921),tradeJours.get(14).getTradeDate());
	
		//tradeTime
		assertEquals(new Integer(20290400),tradeJours.get(0).getTradeTime());
		assertEquals(new Integer(12534900),tradeJours.get(10).getTradeTime());
		assertEquals(new Integer(13465600),tradeJours.get(14).getTradeTime());
		
		//posTradeserialNo
		assertEquals("027615",tradeJours.get(0).getPosTradeserialNo());
		assertEquals("194689",tradeJours.get(10).getPosTradeserialNo());
		assertEquals("312254",tradeJours.get(14).getPosTradeserialNo());
		
		//tradeAmount
		assertEquals(new Double(23126.0),tradeJours.get(0).getTradeAmount());
		assertEquals(new Double(4980.0),tradeJours.get(10).getTradeAmount());
		assertEquals(new Double(50.0),tradeJours.get(14).getTradeAmount());
		
		//discountRate
		assertEquals(new Double(0.005),tradeJours.get(0).getDiscountRate());
		assertEquals(new Double(0.005),tradeJours.get(10).getDiscountRate());
		assertEquals(new Double(0.01),tradeJours.get(14).getDiscountRate());
		
		//tradeTypeInfoNo
		assertEquals("02",tradeJours.get(0).getTradeTypeInfoNo());
		assertEquals("02",tradeJours.get(10).getTradeTypeInfoNo());
		assertEquals("02",tradeJours.get(14).getTradeTypeInfoNo());
		
		//dealNo
		assertEquals("000000",tradeJours.get(0).getDealNo());
		assertEquals("000000",tradeJours.get(10).getDealNo());
		assertEquals("000000",tradeJours.get(14).getDealNo());
		
		
		//merchantType
		assertEquals("4131",tradeJours.get(0).getMerchantType());
		assertEquals("4511",tradeJours.get(10).getMerchantType());
		assertEquals("4812",tradeJours.get(14).getMerchantType());
		
		//settlementDate
		assertEquals(new Integer(921),tradeJours.get(0).getSettlementDate());
		assertEquals(new Integer(921),tradeJours.get(10).getSettlementDate());
		assertEquals(new Integer(921),tradeJours.get(14).getSettlementDate());
		
		//posNo
		assertEquals("47295306",tradeJours.get(0).getPosNo());
		assertEquals("47281655",tradeJours.get(10).getPosNo());
		assertEquals("47259417",tradeJours.get(14).getPosNo());
		
		//merchantNo
		assertEquals("489440141310004",tradeJours.get(0).getMerchantNo());
		assertEquals("489440145110001",tradeJours.get(10).getMerchantNo());
		assertEquals("489440148120001",tradeJours.get(14).getMerchantNo());
		
		//merchantAccount
		assertEquals("960001403010063               ",tradeJours.get(0).getMerchantAccount());
		assertEquals("960001403010063               ",tradeJours.get(10).getMerchantAccount());
		assertEquals("960001403010063               ",tradeJours.get(14).getMerchantAccount());
		
		//tradeCurrency
		assertEquals("156",tradeJours.get(0).getTradeCurrency());
		assertEquals("156",tradeJours.get(10).getTradeCurrency());
		assertEquals("156",tradeJours.get(14).getTradeCurrency());
	}
}
