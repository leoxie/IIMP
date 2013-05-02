package com.leo.iimp.entity;

public class TradeJour {

	/* 流水 */
	public String serialNo;

	/* 发卡行编号 */
	public String cardBankNo;

	/* 接收方标识 */
	public String receiverID;

	/* 交易帐号 */
	public String tradeAccount;

	/* 收单行代号 */
	public String receiveBankNo;

	/* 转发机构 */
	public String transOrg;

	/* 代理方标识 */
	public String agentID;

	/* 系统参考号 */
	public String systemReferNo;

	/* 交易发生日 */
	public Integer tradeDate;

	/* 交易时间 */
	public Integer tradeTime;

	/* pos交易流水号 */
	public String posTradeserialNo;

	/* 交易金额 */
	public Double tradeAmount;

	/* 回扣率 */
	public Double discountRate;

	/* 交易类型信息码 */
	public String tradeTypeInfoNo;

	/* 处理码 */
	public String dealNo;

	/* 商户类型 */
	public String merchantType;

	/* 清算日 */
	public Integer settlementDate;

	/* pos机代号 */
	public String posNo;

	/* 商户代号 */
	public String merchantNo;

	/* 商户账号 */
	public String merchantAccount;

	/* 交易币别 */
	public String tradeCurrency;

	/* 清算金额 */
	public Double settlementAmount;

	/* 交易授权码 */
	public String tradeAuthNo;

	/* 交易类型识别 */
	public String tradeTypeID;

	/* 交易响应码 */
	public String responseNo;

	/* 商户名 */
	public String merchantName;

	/* 完成标记 */
	public String completeID;

	/* 银行应收服务费 */
	public Double bankServiceCharge;

	/* 商户应付服务费 */
	public Double merchantPayServiceCharge;

	/* 个人账户标识 */
	public String selfAccountID;
}
