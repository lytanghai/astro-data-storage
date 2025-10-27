package com.astro_data_storage.dto.request;

public class CreateUserAssetRequest {
    private String chatId;
    private String symbol;
    private String exchangeName;
    private Double amount;
    private Double convertedAmount;
    private String buyAt;

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(Double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public String getBuyAt() {
        return buyAt;
    }

    public void setBuyAt(String buyAt) {
        this.buyAt = buyAt;
    }
}
