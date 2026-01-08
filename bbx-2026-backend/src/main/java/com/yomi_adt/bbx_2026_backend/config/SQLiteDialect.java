package com.yomi_adt.bbx_2026_backend.config;

import org.hibernate.dialect.Dialect;
import java.sql.Types;

public class SQLiteDialect extends Dialect {
    public SQLiteDialect() {
        registerColumnType(Types.INTEGER, "integer");
        registerColumnType(Types.VARCHAR, "text");
        registerColumnType(Types.BLOB, "blob");
        registerColumnType(Types.REAL, "real");
        registerColumnType(Types.FLOAT, "float");
        registerColumnType(Types.DOUBLE, "double");
    }

    @Override
    public boolean supportsIdentityColumns() {
        return true;
    }
}
