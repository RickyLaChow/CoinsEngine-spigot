package su.nightexpress.coinsengine;

import org.jetbrains.annotations.NotNull;
import su.nightexpress.coinsengine.api.currency.Currency;
import su.nightexpress.nightcore.util.placeholder.PlaceholderList;

import java.util.function.UnaryOperator;

public class Placeholders extends su.nightexpress.nightcore.util.Placeholders {

    public static final String WIKI_URL          = "https://nightexpress.gitbook.io/coinsengine/";
    public static final String WIKI_PLACEHOLDERS = WIKI_URL + "utility/placeholders";
    public static final String WIKI_EXCHANGE     = WIKI_URL + "features/exchange-setup";

    public static final String GENERIC_NAME    = "%name%";
    public static final String GENERIC_BALANCE = "%balance%";
    public static final String GENERIC_AMOUNT  = "%amount%";
    public static final String GENERIC_CURRENT = "%current%";
    public static final String GENERIC_MAX     = "%max%";
    public static final String GENERIC_POS     = "%pos%";
    public static final String GENERIC_STATE   = "%state%";
    public static final String GENERIC_ENTRY   = "%entry%";

    public static final String CURRENCY_ID     = "%currency_id%";
    public static final String CURRENCY_NAME   = "%currency_name%";
    public static final String CURRENCY_SYMBOL = "%currency_symbol%";
    public static final String CURRENCY_PREFIX = "%currency_prefix%";
    //public static final String CURRENCY_SHORT_SYMBOL = "%currency_short_symbol%";

    public static final PlaceholderList<Currency> CURRENCY = new PlaceholderList<Currency>()
        .add(CURRENCY_ID, Currency::getId)
        .add(CURRENCY_NAME, Currency::getName)
        .add(CURRENCY_PREFIX, Currency::getPrefix)
        .add(CURRENCY_SYMBOL, Currency::getSymbol);

    @NotNull
    public static UnaryOperator<String> forCurrency(@NotNull Currency currency) {
        return CURRENCY.replacer(currency);
    }

//    @NotNull
//    public static PlaceholderMap forCurrency(@NotNull Currency currency) {
//        return new PlaceholderMap()
//            .add(Placeholders.CURRENCY_ID, currency::getId)
//            .add(Placeholders.CURRENCY_NAME, currency::getName)
//            .add(Placeholders.CURRENCY_SYMBOL, currency::getSymbol);
//    }
}
