package su.nightexpress.coinsengine.config;

import su.nightexpress.nightcore.core.CoreLang;
import su.nightexpress.nightcore.language.entry.LangString;
import su.nightexpress.nightcore.language.entry.LangText;

import static su.nightexpress.nightcore.util.text.tag.Tags.*;
import static su.nightexpress.coinsengine.Placeholders.*;

public class Lang extends CoreLang {

    public static final LangString COMMAND_ARGUMENT_NAME_CURRENCY = LangString.of("Command.Argument.Name.Currency", "currency");
    public static final LangString COMMAND_ARGUMENT_NAME_PAGE     = LangString.of("Command.Argument.Name.Page", "page");
    public static final LangString COMMAND_ARGUMENT_NAME_PLUGIN   = LangString.of("Command.Argument.Name.Plugin", "plugin");

    public static final LangString COMMAND_MIGRATE_DESC           = LangString.of("Command.Migrate.Desc", "Migrate data from other plugin(s).");
    public static final LangString COMMAND_RESET_DESC             = LangString.of("Command.Reset.Desc", "Reset player's balances.");
    public static final LangString COMMAND_WIPE_DESC              = LangString.of("Command.Wipe.Desc", "Reset currency for all users.");
    public static final LangString COMMAND_CURRENCY_ROOT_DESC     = LangString.of("Command.Currency.Root.Desc", CURRENCY_NAME + " commands.");
    public static final LangString COMMAND_CURRENCY_BALANCE_DESC  = LangString.of("Command.Currency.Balance.Desc", "View balance.");
    public static final LangString COMMAND_CURRENCY_GIVE_DESC     = LangString.of("Command.Currency.Give.Desc", "Add currency to a player.");
    public static final LangString COMMAND_CURRENCY_GIVE_ALL_DESC = LangString.of("Command.Currency.GiveAll.Desc", "Add currency to all online players.");
    public static final LangString COMMAND_CURRENCY_TAKE_DESC     = LangString.of("Command.Currency.Take.Desc", "Take player's currency.");
    public static final LangString COMMAND_CURRENCY_SET_DESC      = LangString.of("Command.Currency.Set.Desc", "Set player's currency balance.");
    public static final LangString COMMAND_CURRENCY_SEND_DESC     = LangString.of("Command.Currency.Send.Desc", "Transfer currency to a player.");
    public static final LangString COMMAND_CURRENCY_PAYMENTS_DESC = LangString.of("Command.Currency.Payments.Desc", "Toggle payments acception from other players.");
    public static final LangString COMMAND_CURRENCY_EXCHANGE_DESC = LangString.of("Command.Currency.Exchange.Desc", "Exchange currency.");
    public static final LangString COMMAND_CURRENCY_TOP_DESC      = LangString.of("Command.Currency.Top.Desc", "List of players with the most balance.");



    public static final LangText COMMAND_MIGRATE_ERROR_PLUGIN = LangText.of("Command.Migrate.Error.Plugin",
        LIGHT_GRAY.enclose("Plugin is not supported or installed!"));

    public static final LangText COMMAND_MIGRATE_START = LangText.of("Command.Migrate.Start",
        LIGHT_GRAY.enclose("Started data migration from the " + LIGHT_YELLOW.enclose(GENERIC_NAME) + "! This may take a while."));

    public static final LangText COMMAND_MIGRATE_DONE = LangText.of("Command.Migrate.Done",
        LIGHT_GRAY.enclose("Migrated data from the " + LIGHT_YELLOW.enclose(GENERIC_NAME) + "!"));



    public static final LangText COMMAND_RESET_DONE = LangText.of("Command.Reset.Done",
        LIGHT_GRAY.enclose("Reset all currency balances for " + LIGHT_YELLOW.enclose(PLAYER_NAME) + "!"));



    public static final LangText COMMAND_WIPE_START = LangText.of("Command.Wipe.Start",
        LIGHT_GRAY.enclose("Started currency data wipe for " + LIGHT_YELLOW.enclose(CURRENCY_NAME) + ". This may take a while..."));

    public static final LangText COMMAND_WIPE_FINISH = LangText.of("Command.Wipe.Finish",
        LIGHT_GRAY.enclose("Finished currency data wipe for " + LIGHT_YELLOW.enclose(CURRENCY_NAME) + "."));



    public static final LangText COMMAND_CURRENCY_GIVE_DONE = LangText.of("Command.Currency.Give.Done",
        LIGHT_GRAY.enclose("Added " + LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + " to " + LIGHT_YELLOW.enclose(PLAYER_NAME) + "'s balance. New balance: " + LIGHT_YELLOW.enclose(GENERIC_BALANCE) + "."));

    public static final LangText COMMAND_CURRENCY_GIVE_NOTIFY = LangText.of("Command.Currency.Give.Notify",
        LIGHT_GRAY.enclose(LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + " has been added to your account!"));



    public static final LangText COMMAND_CURRENCY_GIVE_ALL_DONE = LangText.of("Command.Currency.GiveAll.Done",
        LIGHT_GRAY.enclose("Added " + LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + " to " + LIGHT_YELLOW.enclose("All Online") + " players.")
    );



    public static final LangText COMMAND_CURRENCY_TAKE_DONE = LangText.of("Command.Currency.Take.Done",
        LIGHT_GRAY.enclose("Taken " + LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + " from " + LIGHT_YELLOW.enclose(PLAYER_NAME) + "'s balance. New balance: " + LIGHT_YELLOW.enclose(GENERIC_BALANCE) + "."));

    public static final LangText COMMAND_CURRENCY_TAKE_NOTIFY = LangText.of("Command.Currency.Take.Notify",
        LIGHT_GRAY.enclose(LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + " has been taken from your account!"));



    public static final LangText COMMAND_CURRENCY_SET_DONE = LangText.of("Command.Currency.Set.Done",
        LIGHT_GRAY.enclose("Set " + LIGHT_YELLOW.enclose(PLAYER_NAME) + "'s " + LIGHT_YELLOW.enclose(CURRENCY_NAME) + " balance to " + LIGHT_YELLOW.enclose(GENERIC_BALANCE) + "."));

    public static final LangText COMMAND_CURRENCY_SET_NOTIFY = LangText.of("Command.Currency.Set.Notify",
        LIGHT_GRAY.enclose("Your " + LIGHT_YELLOW.enclose(CURRENCY_NAME) + " balance has been set to " + LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + "."));



    public static final LangText COMMAND_CURRENCY_SEND_ERROR_NOT_ENOUGH = LangText.of("Command.Currency.Send.Error.NotEnough",
        LIGHT_GRAY.enclose("You don't have enough " + LIGHT_RED.enclose(CURRENCY_NAME) + "!"));

    public static final LangText COMMAND_CURRENCY_SEND_ERROR_TOO_LOW = LangText.of("Command.Currency.Send.Error.TooLow",
        LIGHT_GRAY.enclose("You can not send smaller than " + LIGHT_RED.enclose(GENERIC_AMOUNT) + "!"));

    public static final LangText COMMAND_CURRENCY_SEND_ERROR_NO_PAYMENTS = LangText.of("Command.Currency.Send.Error.NoPayments",
        LIGHT_GRAY.enclose(LIGHT_RED.enclose(PLAYER_NAME) + " does not accept " + LIGHT_RED.enclose(CURRENCY_NAME) + "!"));

    public static final LangText COMMAND_CURRENCY_SEND_DONE_SENDER = LangText.of("Command.Currency.Send.Done.Sender",
        LIGHT_GRAY.enclose("You sent " + LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + " to " + LIGHT_YELLOW.enclose(PLAYER_NAME) + "!"));

    public static final LangText COMMAND_CURRENCY_SEND_DONE_NOTIFY = LangText.of("Command.Currency.Send.Done.Notify",
        LIGHT_GRAY.enclose("You received " + LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + " from " + LIGHT_YELLOW.enclose(PLAYER_NAME) + "!"));



    public static final LangText COMMAND_CURRENCY_PAYMENTS_TOGGLE = LangText.of("Command.Currency.Payments.Toggle",
        LIGHT_GRAY.enclose(LIGHT_YELLOW.enclose(CURRENCY_NAME) + " payments acception: " + LIGHT_YELLOW.enclose(GENERIC_STATE) + "."));

    public static final LangText COMMAND_CURRENCY_PAYMENTS_TARGET = LangText.of("Command.Currency.Payments.Target",
        LIGHT_GRAY.enclose(LIGHT_YELLOW.enclose(CURRENCY_NAME) + " payments acception for " + LIGHT_YELLOW.enclose(PLAYER_NAME) + ": " + LIGHT_YELLOW.enclose(GENERIC_STATE) + "."));



    public static final LangText COMMAND_CURRENCY_TOP_LIST = LangText.of("Command.Currency.Top.List",
        TAG_NO_PREFIX,
        " ",
        CYAN.enclose(BOLD.enclose(CURRENCY_NAME + " Top:")),
        " ",
        GENERIC_ENTRY,
        " ",
        LIGHT_GRAY.enclose("Page " + CYAN.enclose(GENERIC_CURRENT) + " of " + CYAN.enclose(GENERIC_MAX) + "."),
        " "
    );

    public static final LangString COMMAND_CURRENCY_TOP_ENTRY = LangString.of("Command.Currency.Top.Entry",
        CYAN.enclose(GENERIC_POS + ". " + GRAY.enclose(PLAYER_NAME + ": ") + GENERIC_BALANCE)
    );



    public static final LangText CURRENCY_BALANCE_DISPLAY_OWN = LangText.of("Currency.Balance.Display.Own",
        LIGHT_GRAY.enclose("Balance: " + LIGHT_YELLOW.enclose(GENERIC_BALANCE) + "."));

    public static final LangText CURRENCY_BALANCE_DISPLAY_OTHERS = LangText.of("Currency.Balance.Display.Others",
        LIGHT_GRAY.enclose(LIGHT_YELLOW.enclose(PLAYER_NAME) + "'s balance: " + LIGHT_YELLOW.enclose(GENERIC_BALANCE) + "."));



    public static final LangText CURRENCY_EXCHANGE_ERROR_DISABLED = LangText.of("Currency.Exchange.Error.Disabled",
        LIGHT_GRAY.enclose(LIGHT_RED.enclose(CURRENCY_NAME) + " can not be exchanged!"));

    public static final LangText CURRENCY_EXCHANGE_ERROR_NO_RATE = LangText.of("Currency.Exchange.Error.NoRate",
        LIGHT_GRAY.enclose(LIGHT_RED.enclose(CURRENCY_NAME) + " can not be exchanged for " + LIGHT_RED.enclose(GENERIC_NAME) + "!"));

    public static final LangText CURRENCY_EXCHANGE_ERROR_LOW_AMOUNT = LangText.of("Currency.Exchange.Error.LowAmount",
        LIGHT_GRAY.enclose(LIGHT_RED.enclose(CURRENCY_NAME) + " amount is too low for exchange!"));

    public static final LangText CURRENCY_EXCHANGE_ERROR_LIMIT_EXCEED = LangText.of("Currency.Exchange.Error.LimitExceed",
        LIGHT_GRAY.enclose("You could get " + LIGHT_RED.enclose(GENERIC_AMOUNT) + ", but you can't hold more than " + LIGHT_RED.enclose(GENERIC_MAX) + " total!"));

    public static final LangText CURRENCY_EXCHANGE_ERROR_LOW_BALANCE = LangText.of("Currency.Exchange.Error.LowBalance",
        LIGHT_GRAY.enclose("You don't have " + LIGHT_RED.enclose(GENERIC_AMOUNT) + " for exchange!"));

    public static final LangText CURRENCY_EXCHANGE_SUCCESS = LangText.of("Currency.Exchange.Success",
        LIGHT_GRAY.enclose("You exchanged " + LIGHT_YELLOW.enclose(GENERIC_BALANCE) + " for " + LIGHT_YELLOW.enclose(GENERIC_AMOUNT) + "!"));


    public static final LangString ECONOMY_ERROR_INVALID_PLAYER = LangString.of("VaultEconomy.Error.InvalidPlayer", "Player not found.");

    public static final LangString ECONOMY_ERROR_INSUFFICIENT_FUNDS = LangString.of("VaultEconomy.Error.InsufficientFunds", "Insufficient Funds!");


    public static final LangText ERROR_COMMAND_ARGUMENT_INVALID_CURRENCY = LangText.of("Currency.Error.Invalid",
        LIGHT_GRAY.enclose(LIGHT_RED.enclose(GENERIC_VALUE) + " is not a valid currency!"));
}
