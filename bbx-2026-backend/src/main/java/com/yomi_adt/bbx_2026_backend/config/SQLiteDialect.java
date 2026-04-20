package com.yomi_adt.bbx_2026_backend.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.CommonFunctionFactory;
import org.hibernate.engine.jdbc.dialect.spi.DialectResolutionInfo;
import org.hibernate.engine.jdbc.dialect.spi.DialectResolver;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        super();

        // Register common SQL functions
        CommonFunctionFactory functionFactory = new CommonFunctionFactory(this);
        functionFactory.lower();
        functionFactory.upper();
        functionFactory.length();
        functionFactory.concat();
    }

    @Override
    public boolean supportsInsertReturning() {
        return false;
    }

    @Override
    public boolean supportsValuesList() {
        return true;
    }

    @Override
    public boolean supportsLimit() {
        return true;
    }

    @Override
    public boolean supportsOffset() {
        return true;
    }
}
