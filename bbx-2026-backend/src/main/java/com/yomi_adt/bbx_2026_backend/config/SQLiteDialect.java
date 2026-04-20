package com.yomi_adt.bbx_2026_backend.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.CommonFunctionFactory;
import org.hibernate.query.sqm.function.SqmFunctionRegistry;
import org.hibernate.boot.model.FunctionContributions;

public class SQLiteDialect extends Dialect {

    @Override
    public void initializeFunctionRegistry(FunctionContributions functionContributions) {
        super.initializeFunctionRegistry(functionContributions);

        CommonFunctionFactory f = new CommonFunctionFactory(functionContributions);

        f.lower();
        f.upper();
        f.length();
        f.concat();
    }

    @Override
    public boolean supportsLimit() {
        return true;
    }

    @Override
    public boolean supportsOffset() {
        return true;
    }

    @Override
    public boolean supportsInsertReturning() {
        return false;
    }
}
