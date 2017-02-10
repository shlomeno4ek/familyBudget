package ru.shlomeno4ek.familybudget.data;

import android.provider.BaseColumns;

/**
 * Created by шлома-сн on 08.02.2017.
 */

public final class FamilyBudget {

    private FamilyBudget() {
    };

    public static final class PurseEntry implements BaseColumns {
        public final static String TABLE_NAME = "purse";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_OWNER = "owner";
    }

    public static final class BudgetEntry implements BaseColumns {
        public final static String TABLE_NAME = "budget";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_IDPURSE = "idPurse";
        public final static String COLUMN_TYPE = "type";
        public final static String COLUMN_SUMM = "summ";
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_DATE = "date";

        public static final int TYPE_INCOME = 0;
        public static final int TYPE_EXPENSES = 1;
        public static final int TYPE_TRANSLATION = 2;
    }
}
