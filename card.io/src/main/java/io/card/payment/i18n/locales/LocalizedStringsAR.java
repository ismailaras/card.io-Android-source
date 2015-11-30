package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.121072 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsAR implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<StringKey, String>();
    private static Map<String, String> mAdapted = new HashMap<String, String>();

    @Override
    public String getName() {
        return "ar";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsAR() {
        mDisplay.put(StringKey.CANCEL, "إلغاء");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express‏");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover‏");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB‏");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard‏");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa‏");
        mDisplay.put(StringKey.DONE, "تم");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV‏");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "الرمز البريدي");
        mDisplay.put(StringKey.ENTRY_CARDHOLDER_NAME, "اسم صاحب البطاقة");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "تاريخ انتهاء الصلاحية");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY‏");
        mDisplay.put(StringKey.SCAN_GUIDE, "امسك البطاقة هنا.\n ستمسح تلقائيا.");
        mDisplay.put(StringKey.KEYBOARD, "لوحة المفاتيح…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "رقم البطاقة");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "تفاصيل البطاقة");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "هذا الجهاز لا يمكنه استعمال الكاميرا لقراءة أرقام البطاقة.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "كاميرا الجهاز غير متاحة.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "الجهاز حدث به خطا غير متوقع عند فتح الكاميرا.");

        // no adapted_translations found
    }
}
