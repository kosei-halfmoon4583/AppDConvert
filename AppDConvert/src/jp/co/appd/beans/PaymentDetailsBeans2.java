package jp.co.appd.beans;

/*------------------------------------------------------------------------*
 * Copyright (c) 2016 Softbank C&S MD Div, System Planning Office. 
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.x
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * Program Name:	PaymentDetailsBeans2 [ Payment Detaols テーブル（CSV）]
 * Contributors:	Naoshi WATANUKI - Initial API and implementation. -
 * Data Written :	2016.9.12 (Mon.)
 * Update Written: 	2016.9.26 (Mon.)
 * [AppDirect Payment Detail CSV]
 *-------------------------------------------------------------------------*/

public class PaymentDetailsBeans2 {
	/** 1.Invoice Id */
	public String invoiceID;
	/** 2.Payment Id */
	public String paymentID;
	/** 3.Transaction Id */
	public String transactionID;
	/** 4.Payment Date */
	public String paymentDate;
	/** 5.End User First Name */
	public String firstName;
	/** 6.End User Last Name */
	public String lastName;
	/** 7.End User Email */
	public String email;
	/** 8.End User Company Name */
	public String companyName;
	/** 9.End User Company ID */
	public String companyID;
	/** 10.End User Contact Id */
	public String contactID;
	/** 11.Order Id */
	public String orderID;
	/** 12.Order Created Date */
	public String orderCreatedDate;
	/** 13.Marketplace Name */
	public String marketplaceName;
	/** 14.Reseller Number */
	public String resellerNumber;
	/** 15.Reseller Order Number */
	public String resellerOrderNumber;
	/** 16.Reseller Company Name */
	public String resellerCompanyName;
	/** 17.Reseller Company ID */
	public String resellerCompanyID;
	/** 18.Reseller Contact Name */
	public String resellerContactName;
	/** 19.Reseller Contact ID */
	public String resellerContactID;
	/** 20.Reseller Email */
	public String resellerEmail;
	/** 21.Vendor Company Name */
	public String vendorCompanyName;
	/** 22.Vendor Company ID */
	public String vendorCompanyID;
	/** 23.Application Name */
	public String applicationName;
	/** 24.Application ID */
	public String applicationID;
	/** 25.Edition Name */
	public String editionName;
	/** 26.Edition ID */
	public String editionID;
	/** 27.Edition Code */
	public String editionCode;
	/** 28.Description */
	public String description;
	/** 29.Line Type */
	public String lineType;
	/** 30.Currency */
	public String currency;
	/** 31.MPN ID */
	public String mpnID;
	/** 32.Frequency */
	public String frequency;
	/** 33.Notes From Edition */
	public String notesFromEdition;
	/** 34.Notes From Order */
	public String notesFromOrder;
	/** 35.Amount */
	public String amount;
	/** 36.Period From */
	public String periodFrom;
	/** 37.Period To */
	public String periodTo;
	/** 38.MSRP */
	public String msrp;
	/** 39.Net Cost */
	public String netCost;
	/** 40.Total Net Cost */
	public String totalNetCost;
	/** 41.Wholesale Price */
	public String wholesalePrice;
	/** 42.Total Wholesale Price */
	public String totalWholesalePrice;
	/** 43.Sales Price */
	public String salesPrice;
	/** 44.Total Sales Price */
	public String totalSalesPrice;
	/** 45.Payment Method */
	public String paymentMethod;
	/** 46.Application Origin */
	public String applicationOrigin;
	/** 47.Total */
	public String total;
	/** 48.AppDirect Share */
	public String appDShare;
	/** 49.AppDirect % Share */
	public String appDPShare;
	/** 50.Channel Share */
	public String channelShare;
	/** 51.Channel % Share */
	public String channelPShare;
	/** 52.Vendor Share */
	public String vendorShare;
	/** 53.Vendor % Share */
	public String vendorPShare;
	/** 54.Reseller Share */
	public String resellerShare;
	/** 55.Reseller % Share */
	public String resellerPShare;
	/** 56.Payout Status */
	public String payoutStatus;
	/** 57.Payout ID */
	public String payoutID;
	/** 58.Result */
	public String result;
	/** 59.Auth Code */
	public String authCD;
		
	public PaymentDetailsBeans2() {
		this.invoiceID	= "";
		this.paymentID	= "";
		this.transactionID	= "";
		this.paymentDate	= "";
		this.firstName	= "";
		this.lastName	= "";
		this.email	= "";
		this.companyName	= "";
		this.companyID	= "";
		this.contactID	= "";
		this.orderID	= "";
		this.orderCreatedDate	= "";
		this.marketplaceName	= "";
		this.resellerNumber	= "";
		this.resellerOrderNumber	= "";
		this.resellerCompanyName	= "";
		this.resellerCompanyID	= "";
		this.resellerContactName	= "";
		this.resellerContactID	= "";
		this.resellerEmail	= "";
		this.vendorCompanyName	= "";
		this.vendorCompanyID	= "";
		this.applicationName	= "";
		this.applicationID	= "";
		this.editionName	= "";
		this.editionID	= "";
		this.editionCode	= "";
		this.description	= "";
		this.lineType	= "";
		this.currency	= "";
		this.mpnID	= "";
		this.frequency	= "";
		this.notesFromEdition	= "";
		this.notesFromOrder	= "";
		this.amount	= "";
		this.periodFrom	= "";
		this.periodTo	= "";
		this.msrp	= "";
		this.netCost	= "";
		this.totalNetCost	= "";
		this.wholesalePrice	= "";
		this.totalWholesalePrice	= "";
		this.salesPrice	= "";
		this.totalSalesPrice	= "";
		this.paymentMethod	= "";
		this.applicationOrigin	= "";
		this.total	= "";
		this.appDShare	= "";
		this.appDPShare	= "";
		this.channelShare	= "";
		this.channelPShare	= "";
		this.vendorShare	= "";
		this.vendorPShare	= "";
		this.resellerShare	= "";
		this.resellerPShare	= "";
		this.payoutStatus	= "";
		this.payoutID	= "";
		this.result	= "";
		this.authCD	= "";
	}

	public String getInvoiceID() {
		return invoiceID;
	}

	public String getPaymentID() {
		return paymentID;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyID() {
		return companyID;
	}

	public String getContactID() {
		return contactID;
	}

	public String getOrderID() {
		return orderID;
	}

	public String getOrderCreatedDate() {
		return orderCreatedDate;
	}

	public String getMarketplaceName() {
		return marketplaceName;
	}

	public String getResellerNumber() {
		return resellerNumber;
	}

	public String getResellerOrderNumber() {
		return resellerOrderNumber;
	}

	public String getResellerCompanyName() {
		return resellerCompanyName;
	}

	public String getResellerCompanyID() {
		return resellerCompanyID;
	}

	public String getResellerContactName() {
		return resellerContactName;
	}

	public String getResellerContactID() {
		return resellerContactID;
	}

	public String getResellerEmail() {
		return resellerEmail;
	}

	public String getVendorCompanyName() {
		return vendorCompanyName;
	}

	public String getVendorCompanyID() {
		return vendorCompanyID;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public String getApplicationID() {
		return applicationID;
	}

	public String getEditionName() {
		return editionName;
	}

	public String getEditionID() {
		return editionID;
	}

	public String getEditionCode() {
		return editionCode;
	}

	public String getDescription() {
		return description;
	}

	public String getLineType() {
		return lineType;
	}

	public String getCurrency() {
		return currency;
	}

	public String getMpnID() {
		return mpnID;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getNotesFromEdition() {
		return notesFromEdition;
	}

	public String getNotesFromOrder() {
		return notesFromOrder;
	}

	public String getAmount() {
		return amount;
	}

	public String getPeriodFrom() {
		return periodFrom;
	}

	public String getPeriodTo() {
		return periodTo;
	}

	public String getMsrp() {
		return msrp;
	}

	public String getNetCost() {
		return netCost;
	}

	public String getTotalNetCost() {
		return totalNetCost;
	}

	public String getWholesalePrice() {
		return wholesalePrice;
	}

	public String getTotalWholesalePrice() {
		return totalWholesalePrice;
	}

	public String getSalesPrice() {
		return salesPrice;
	}

	public String getTotalSalesPrice() {
		return totalSalesPrice;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getApplicationOrigin() {
		return applicationOrigin;
	}

	public String getTotal() {
		return total;
	}

	public String getAppDShare() {
		return appDShare;
	}

	public String getAppDPShare() {
		return appDPShare;
	}

	public String getChannelShare() {
		return channelShare;
	}

	public String getChannelPShare() {
		return channelPShare;
	}

	public String getVendorShare() {
		return vendorShare;
	}

	public String getVendorPShare() {
		return vendorPShare;
	}

	public String getResellerShare() {
		return resellerShare;
	}

	public String getResellerPShare() {
		return resellerPShare;
	}

	public String getPayoutStatus() {
		return payoutStatus;
	}

	public String getPayoutID() {
		return payoutID;
	}

	public String getResult() {
		return result;
	}

	public String getAuthCD() {
		return authCD;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public void setOrderCreatedDate(String orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}

	public void setMarketplaceName(String marketplaceName) {
		this.marketplaceName = marketplaceName;
	}

	public void setResellerNumber(String resellerNumber) {
		this.resellerNumber = resellerNumber;
	}

	public void setResellerOrderNumber(String resellerOrderNumber) {
		this.resellerOrderNumber = resellerOrderNumber;
	}

	public void setResellerCompanyName(String resellerCompanyName) {
		this.resellerCompanyName = resellerCompanyName;
	}

	public void setResellerCompanyID(String resellerCompanyID) {
		this.resellerCompanyID = resellerCompanyID;
	}

	public void setResellerContactName(String resellerContactName) {
		this.resellerContactName = resellerContactName;
	}

	public void setResellerContactID(String resellerContactID) {
		this.resellerContactID = resellerContactID;
	}

	public void setResellerEmail(String resellerEmail) {
		this.resellerEmail = resellerEmail;
	}

	public void setVendorCompanyName(String vendorCompanyName) {
		this.vendorCompanyName = vendorCompanyName;
	}

	public void setVendorCompanyID(String vendorCompanyID) {
		this.vendorCompanyID = vendorCompanyID;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public void setEditionName(String editionName) {
		this.editionName = editionName;
	}

	public void setEditionID(String editionID) {
		this.editionID = editionID;
	}

	public void setEditionCode(String editionCode) {
		this.editionCode = editionCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setMpnID(String mpnID) {
		this.mpnID = mpnID;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public void setNotesFromEdition(String notesFromEdition) {
		this.notesFromEdition = notesFromEdition;
	}

	public void setNotesFromOrder(String notesFromOrder) {
		this.notesFromOrder = notesFromOrder;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setPeriodFrom(String periodFrom) {
		this.periodFrom = periodFrom;
	}

	public void setPeriodTo(String periodTo) {
		this.periodTo = periodTo;
	}

	public void setMsrp(String msrp) {
		this.msrp = msrp;
	}

	public void setNetCost(String netCost) {
		this.netCost = netCost;
	}

	public void setTotalNetCost(String totalNetCost) {
		this.totalNetCost = totalNetCost;
	}

	public void setWholesalePrice(String wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public void setTotalWholesalePrice(String totalWholesalePrice) {
		this.totalWholesalePrice = totalWholesalePrice;
	}

	public void setSalesPrice(String salesPrice) {
		this.salesPrice = salesPrice;
	}

	public void setTotalSalesPrice(String totalSalesPrice) {
		this.totalSalesPrice = totalSalesPrice;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setApplicationOrigin(String applicationOrigin) {
		this.applicationOrigin = applicationOrigin;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public void setAppDShare(String appDShare) {
		this.appDShare = appDShare;
	}

	public void setAppDPShare(String appDPShare) {
		this.appDPShare = appDPShare;
	}

	public void setChannelShare(String channelShare) {
		this.channelShare = channelShare;
	}

	public void setChannelPShare(String channelPShare) {
		this.channelPShare = channelPShare;
	}

	public void setVendorShare(String vendorShare) {
		this.vendorShare = vendorShare;
	}

	public void setVendorPShare(String vendorPShare) {
		this.vendorPShare = vendorPShare;
	}

	public void setResellerShare(String resellerShare) {
		this.resellerShare = resellerShare;
	}

	public void setResellerPShare(String resellerPShare) {
		this.resellerPShare = resellerPShare;
	}

	public void setPayoutStatus(String payoutStatus) {
		this.payoutStatus = payoutStatus;
	}

	public void setPayoutID(String payoutID) {
		this.payoutID = payoutID;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setAuthCD(String authCD) {
		this.authCD = authCD;
	}
}
