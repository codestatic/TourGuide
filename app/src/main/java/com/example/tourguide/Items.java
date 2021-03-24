package com.example.tourguide;

public class Items {

    private static final String NO_TEXT_PROVIDED = String.valueOf(-1);

    private String mItemsTitle;

    private String mItemsSummary;

    private int mItemsBeach;

    private String mAddressPhone = NO_TEXT_PROVIDED;

    public Items(String itemsTitle, String itemsSummary, int itemsBeach) {
        mItemsTitle = itemsTitle;
        mItemsSummary = itemsSummary;
        mItemsBeach = itemsBeach;
    }

    public Items(String itemsTitle, String itemsSummary, int itemsBeach, String addressPhone) {
        mItemsTitle = itemsTitle;
        mItemsSummary = itemsSummary;
        mItemsBeach = itemsBeach;
        mAddressPhone = addressPhone;
    }

    public String getItemsTitle() {
        return mItemsTitle;
    }

    public String getItemsSummary() {
        return mItemsSummary;
    }

    public int getItemsBeach() {
        return mItemsBeach;
    }

    public String getAddressPhone() {
        return mAddressPhone;
    }

    public boolean hasText() {
        return mAddressPhone != NO_TEXT_PROVIDED;
    }

}

