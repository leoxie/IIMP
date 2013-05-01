package com.leo.iimp.entity;

/**
 * 交易流水
 * @author Administrator
 */
public class TradeJour {

	/* 流水 */
	private String serialNo;
	
	/*发卡行编号 */
	private String cardBankNo;

	/* 接收方标识 */
	private String receiverID;
	
	/* 交易帐号 */
	private String tradeAccount;
	
	/* 收单行代号 */
	private String receiveBankNo;
	
	/* 转发机构 */
	private String transOrg;

	/* 代理方标识 */
	private String agentID;
	
	/* 系统参考号 */
	private String systemReferNo;
	
	/* 交易发生日 */
	private Integer tradeDate;

	/* 交易时间 */
	private Integer tradeTime;

	/* pos交易流水号 */
	private String posTradeserialNo;

	/* 交易金额 */
	private double tradeAmount;

	/* 回扣率 */
	private double discountRate;

	/* 交易类型信息码 */
	private String tradeTypeInfoNo;

	/* 处理码 */
	private String dealNo;

	/* 商户类型 */
	private String merchantType;
	
	/* 清算日 */
	private Integer settlementDate; 
	
	/* pos机代号 */
	private String posNo; 

	/* 商户代号 */
	private String merchantNo;
	
	/* 商户账号 */
	private String merchantAccount;

	/* 交易币别 */
	private String tradeCurrency;

	/* 清算金额 */
	private double settlementAmount;
	
	/* 交易授权码 */
	private double tradeAuthNo;

	/* 交易类型识别 */
	private double tradeTypeID;
	
	/* 交易响应码 */
	private double responseNo;

	/* 商户名 */
	private String merchantName;
	
	/* 完成标记 */
	private String completeID;

	/* 银行应收服务费 */
	private double bankServiceCharge;

	/* 商户应付服务费 */
	private double merchantPayServiceCharge;

	/* 个人账户标识 */
	private double selfAccountID;

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
	public String getCardBankNo() {
		return cardBankNo;
	}

	public void setCardBankNo(String cardBankNo) {
		this.cardBankNo = cardBankNo;
	}

	public String getReceiverID() {
		return receiverID;
	}

	public void setReceiverID(String receiverID) {
		this.receiverID = receiverID;
	}

	public String getTradeAccount() {
		return tradeAccount;
	}

	public void setTradeAccount(String tradeAccount) {
		this.tradeAccount = tradeAccount;
	}

	public String getReceiveBankNo() {
		return receiveBankNo;
	}

	public void setReceiveBankNo(String receiveBankNo) {
		this.receiveBankNo = receiveBankNo;
	}

	public String getTransOrg() {
		return transOrg;
	}

	public void setTransOrg(String transOrg) {
		this.transOrg = transOrg;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

	public String getSystemReferNo() {
		return systemReferNo;
	}

	public void setSystemReferNo(String systemReferNo) {
		this.systemReferNo = systemReferNo;
	}

	public Integer getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Integer tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Integer getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Integer tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getPosTradeserialNo() {
		return posTradeserialNo;
	}

	public void setPosTradeserialNo(String posTradeserialNo) {
		this.posTradeserialNo = posTradeserialNo;
	}

	public double getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getTradeTypeInfoNo() {
		return tradeTypeInfoNo;
	}

	public void setTradeTypeInfoNo(String tradeTypeInfoNo) {
		this.tradeTypeInfoNo = tradeTypeInfoNo;
	}

	public String getDealNo() {
		return dealNo;
	}

	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}

	public String getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public Integer getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Integer settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getPosNo() {
		return posNo;
	}

	public void setPosNo(String posNo) {
		this.posNo = posNo;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantAccount() {
		return merchantAccount;
	}

	public void setMerchantAccount(String merchantAccount) {
		this.merchantAccount = merchantAccount;
	}

	public String getTradeCurrency() {
		return tradeCurrency;
	}

	public void setTradeCurrency(String tradeCurrency) {
		this.tradeCurrency = tradeCurrency;
	}

	public double getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(double settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public double getTradeAuthNo() {
		return tradeAuthNo;
	}

	public void setTradeAuthNo(double tradeAuthNo) {
		this.tradeAuthNo = tradeAuthNo;
	}

	public double getTradeTypeID() {
		return tradeTypeID;
	}

	public void setTradeTypeID(double tradeTypeID) {
		this.tradeTypeID = tradeTypeID;
	}

	public double getResponseNo() {
		return responseNo;
	}

	public void setResponseNo(double responseNo) {
		this.responseNo = responseNo;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getCompleteID() {
		return completeID;
	}

	public void setCompleteID(String completeID) {
		this.completeID = completeID;
	}

	public double getBankServiceCharge() {
		return bankServiceCharge;
	}

	public void setBankServiceCharge(double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

	public double getMerchantPayServiceCharge() {
		return merchantPayServiceCharge;
	}

	public void setMerchantPayServiceCharge(double merchantPayServiceCharge) {
		this.merchantPayServiceCharge = merchantPayServiceCharge;
	}

	public double getSelfAccountID() {
		return selfAccountID;
	}

	public void setSelfAccountID(double selfAccountID) {
		this.selfAccountID = selfAccountID;
	}
	
	
}
