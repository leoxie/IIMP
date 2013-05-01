package com.leo.iimp;

import java.util.List;

import com.leo.iimp.analyzer.TradeJourAnalyzer;
import com.leo.iimp.entity.TradeJour;

import junit.framework.TestCase;

public class TradeJourTestCase extends TestCase {

	public final void  testReadFile() {
		String path = this.getClass().getResource("").getPath()+"testOriData.data";
		List<TradeJour> tradeJours = TradeJourAnalyzer.getTradeJour(path);
		assertEquals(tradeJours.get(0).getSerialNo(), "000001");
		assertEquals(tradeJours.get(10).getSerialNo(), "000011");
		assertEquals(tradeJours.get(100).getSerialNo(), "000101");
	}
}
