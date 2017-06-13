package ru.evotor.framework.core.action.event.receipt.receipt_edited;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class ReceiptClearedEvent extends ReceiptEvent {
    public static final String BROADCAST_ACTION_SELL_RECEIPT_CLEARED = "evotor.intent.action.receipt.sell.CLEARED";
    public static final String BROADCAST_ACTION_PAYBACK_RECEIPT_CLEARED = "evotor.intent.action.receipt.payback.CLEARED";

    public ReceiptClearedEvent(@Nullable String receiptUuid) {
        super(receiptUuid);
    }

    private ReceiptClearedEvent(@NonNull Bundle extras) {
        super(extras);
    }

    @Nullable
    public static ReceiptClearedEvent create(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new ReceiptClearedEvent(bundle);
    }
}