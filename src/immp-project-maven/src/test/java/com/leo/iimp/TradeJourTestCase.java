package com.leo.iimp;

import java.io.UnsupportedEncodingException;
import java.util.List;

import junit.framework.TestCase;

import com.leo.iimp.analyzer.TradeJourAnalyzer;
import com.leo.iimp.entity.TradeJour;

public class TradeJourTestCase extends TestCase {

	public final void testReadFile() throws UnsupportedEncodingException {
		String path = this.getClass().getResource("").getPath()
				+ "testOriData.data";
		List<TradeJour> tradeJours = TradeJourAnalyzer.getTradeJour(path);

		// SerialNo
		assertEquals("000001", tradeJours.get(0).serialNo);
		assertEquals("000011", tradeJours.get(10).serialNo);
		assertEquals("000015", tradeJours.get(14).serialNo);

		// CardBankNo
		assertEquals("01045800", tradeJours.get(0).cardBankNo);
		assertEquals("03080010", tradeJours.get(10).cardBankNo);
		assertEquals("01035800", tradeJours.get(14).cardBankNo);

		// receiverID
		assertEquals("01040000", tradeJours.get(0).receiverID);
		assertEquals("03085800", tradeJours.get(10).receiverID);
		assertEquals("01035800", tradeJours.get(14).receiverID);

		// tradeAccount
		assertEquals("6227534400816361", tradeJours.get(0).tradeAccount);
		assertEquals("5187187006502560", tradeJours.get(10).tradeAccount);
		assertEquals("6228480084978002917", tradeJours.get(14).tradeAccount);

		// receiveBankNo
		assertEquals("04895910", tradeJours.get(0).receiveBankNo);
		assertEquals("04895910", tradeJours.get(10).receiveBankNo);
		assertEquals("04895910", tradeJours.get(14).receiveBankNo);

		// transOrg
		assertEquals("00155800", tradeJours.get(0).transOrg);
		assertEquals("00155800", tradeJours.get(10).transOrg);
		assertEquals("00155800", tradeJours.get(14).transOrg);

		// agentID
		assertEquals("04895910", tradeJours.get(0).agentID);
		assertEquals("04895910", tradeJours.get(10).agentID);
		assertEquals("04895910", tradeJours.get(14).agentID);

		// systemReferNo
		assertEquals("000001000018", tradeJours.get(0).systemReferNo);
		assertEquals("000001000291", tradeJours.get(10).systemReferNo);
		assertEquals("000001000032", tradeJours.get(14).systemReferNo);

		// tradeDate
		assertEquals(new Integer(20120921), tradeJours.get(0).tradeDate);
		assertEquals(new Integer(20120921), tradeJours.get(10).tradeDate);
		assertEquals(new Integer(20120921), tradeJours.get(14).tradeDate);

		// tradeTime
		assertEquals(new Integer(20290400), tradeJours.get(0).tradeTime);
		assertEquals(new Integer(12534900), tradeJours.get(10).tradeTime);
		assertEquals(new Integer(13465600), tradeJours.get(14).tradeTime);

		// posTradeserialNo
		assertEquals("027615", tradeJours.get(0).posTradeserialNo);
		assertEquals("194689", tradeJours.get(10).posTradeserialNo);
		assertEquals("312254", tradeJours.get(14).posTradeserialNo);

		// tradeAmount
		assertEquals(new Double(2312600), tradeJours.get(0).tradeAmount);
		assertEquals(new Double(498000), tradeJours.get(10).tradeAmount);
		assertEquals(new Double(5000), tradeJours.get(14).tradeAmount);

		// discountRate
		assertEquals(new Double(50), tradeJours.get(0).discountRate);
		assertEquals(new Double(50), tradeJours.get(10).discountRate);
		assertEquals(new Double(100), tradeJours.get(14).discountRate);

		// tradeTypeInfoNo
		assertEquals("02", tradeJours.get(0).tradeTypeInfoNo);
		assertEquals("02", tradeJours.get(10).tradeTypeInfoNo);
		assertEquals("02", tradeJours.get(14).tradeTypeInfoNo);

		// dealNo
		assertEquals("000000", tradeJours.get(0).dealNo);
		assertEquals("000000", tradeJours.get(10).dealNo);
		assertEquals("000000", tradeJours.get(14).dealNo);

		// merchantType
		assertEquals("4131", tradeJours.get(0).merchantType);
		assertEquals("4511", tradeJours.get(10).merchantType);
		assertEquals("4812", tradeJours.get(14).merchantType);

		// settlementDate
		assertEquals(new Integer(921), tradeJours.get(0).settlementDate);
		assertEquals(new Integer(921), tradeJours.get(10).settlementDate);
		assertEquals(new Integer(921), tradeJours.get(14).settlementDate);

		// posNo
		assertEquals("47295306", tradeJours.get(0).posNo);
		assertEquals("47281655", tradeJours.get(10).posNo);
		assertEquals("47259417", tradeJours.get(14).posNo);

		// merchantNo
		assertEquals("489440141310004", tradeJours.get(0).merchantNo);
		assertEquals("489440145110001", tradeJours.get(10).merchantNo);
		assertEquals("489440148120001", tradeJours.get(14).merchantNo);

		// merchantAccount
		assertEquals("960001403010063", tradeJours.get(0).merchantAccount);
		assertEquals("960001403010063", tradeJours.get(10).merchantAccount);
		assertEquals("960001403010063", tradeJours.get(14).merchantAccount);

		// tradeCurrency
		assertEquals("156", tradeJours.get(0).tradeCurrency);
		assertEquals("156", tradeJours.get(10).tradeCurrency);
		assertEquals("156", tradeJours.get(14).tradeCurrency);

		// settlementAmount
		assertEquals(new Double(2312600.0), tradeJours.get(0).settlementAmount);
		assertEquals(new Double(498000.0), tradeJours.get(10).settlementAmount);
		assertEquals(new Double(5000.0), tradeJours.get(14).settlementAmount);

		// tradeAuthNo
		assertEquals("716053", tradeJours.get(0).tradeAuthNo);
		assertEquals("693141", tradeJours.get(10).tradeAuthNo);
		assertEquals("134724", tradeJours.get(14).tradeAuthNo);

		// tradeTypeID
		assertEquals("PER", tradeJours.get(0).tradeTypeID);
		assertEquals("PER", tradeJours.get(10).tradeTypeID);
		assertEquals("PER", tradeJours.get(14).tradeTypeID);

		// responseNo
		assertEquals("00", tradeJours.get(0).responseNo);
		assertEquals("00", tradeJours.get(10).responseNo);
		assertEquals("00", tradeJours.get(14).responseNo);

		// tradeAuthNo
		assertEquals("广州市白云区黄石鸿海", tradeJours.get(0).merchantName);
		assertEquals("广州市白云区黄石大成", tradeJours.get(10).merchantName);
		assertEquals("广州市天河区东棠终际", tradeJours.get(14).merchantName);
		assertEquals("广东祯服饰商行", tradeJours.get(39).merchantName);

		// completeID
		assertEquals("00", tradeJours.get(0).completeID);
		assertEquals("00", tradeJours.get(10).completeID);
		assertEquals("00", tradeJours.get(14).completeID);

		// bankServiceCharge
		assertEquals(new Double(2313), tradeJours.get(0).bankServiceCharge);
		assertEquals(new Double(498), tradeJours.get(10).bankServiceCharge);
		assertEquals(new Double(1), tradeJours.get(14).bankServiceCharge);

		// merchantPayServiceCharge
		assertEquals(new Double(11563),
				tradeJours.get(0).merchantPayServiceCharge);
		assertEquals(new Double(2490),
				tradeJours.get(10).merchantPayServiceCharge);
		assertEquals(new Double(50),
				tradeJours.get(14).merchantPayServiceCharge);

		// selfAccountID
		assertEquals("0", tradeJours.get(0).selfAccountID);
		assertEquals("0", tradeJours.get(10).selfAccountID);
		assertEquals("0", tradeJours.get(14).selfAccountID);

	}

	public static void main(String[] args) {
	}
}
