package com.yomi_adt.bbx_2026_backend.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        super();

        // Register functions (Hibernate 6 style)
        this.registerFunction("lower", new StandardSQLFunction("lower", StandardBasicTypes.STRING));
        this.registerFunction("upper", new StandardSQLFunction("upper", StandardBasicTypes.STRING));
    }

    @Override
    public boolean supportsIdentityColumns() {
        return true;
    }

    @Override
    public boolean supportsTemporaryTables() {
        return true;
    }

    @Override
    public boolean supportsIfExistsBeforeTableName() {
        return true;
    }

    @Override
    public boolean supportsCascadeDelete() {
        return false;
    }
}
